/**
 * 
 */
package com.dormouse.scallop.alibaba.client.imp.serialize;

import com.dormouse.scallop.alibaba.client.serialize.Serializer;
import com.dormouse.scallop.alibaba.client.serialize.SerializerListener;
import com.dormouse.scallop.tool.DateUtil;
import com.dormouse.scallop.tool.DefaultPropertyUtils;
import com.dormouse.scallop.tool.GenericsUtil;
import com.dormouse.scallop.tool.SimplePropertyDescriptor;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author hongbang.hb
 *
 */
public abstract class AbstractParamRequestSerializer implements Serializer {

	private Map<Class<? extends SerializerListener>, SerializerListener> listnerList = new LinkedHashMap<Class<? extends SerializerListener>, SerializerListener>();

	abstract protected String processNestedParameter(Object value);

	public Map<String, Object> serialize(Object serializer) {
		if(serializer==null){
			return new LinkedHashMap<String, Object>();
		}
		Map<String, Object> params = new LinkedHashMap<String, Object>();
		SimplePropertyDescriptor[] propertyDescriptors = DefaultPropertyUtils.getPropertyDescriptors(serializer.getClass());

		for (SimplePropertyDescriptor propertyDescriptor : propertyDescriptors) {
			String name = propertyDescriptor.getName();
			if (name.equals("class")) {
				continue;
			}
			try {
				Method method = propertyDescriptor.getReadMethod();
				if (method == null) {
					// 对于Boolean的返回值，也许API生成的isXXX方法，补救一下
					if (Boolean.class.isAssignableFrom(propertyDescriptor.getPropertyType())) {
						Method booleanMethod = null;
						try {
							booleanMethod = serializer.getClass().getMethod("is" + GenericsUtil.capitalize(name));
						} catch (NoSuchMethodException e) {
						} catch (SecurityException e) {
						}
						method = booleanMethod;
					}
				}
				if (method == null) {
					throw new RuntimeException("Could not parse the property[" + name + "] of "
							+ serializer.getClass().getSimpleName());
				}
				Object value = method.invoke(serializer);

				if (value != null) {
					Class<?> valueType = value.getClass();
					String valueStr;
					if (valueType.isPrimitive() || CharSequence.class.isAssignableFrom(valueType)
							|| Number.class.isAssignableFrom(valueType) || Boolean.class.equals(valueType)
							|| Character.class.equals(valueType)) {
						valueStr = value.toString();
					} else if (Date.class.isAssignableFrom(valueType)) {
						valueStr = DateUtil.format((Date) value);
					} else {
						valueStr = processNestedParameter(value);
						// valueStr = JsonSerializeHelper.object2json(value);
					}
					params.put(name, valueStr);
				}

			} catch (InvocationTargetException e) {
				throw new IllegalArgumentException("illegal argument " + name + ", error:" + e.getMessage(), e);
			} catch (IllegalAccessException e) {
				throw new IllegalArgumentException("illegal argument " + name + ", error:" + e.getMessage(), e);
			} catch (IllegalArgumentException e) {
				throw new IllegalArgumentException("illegal argument " + name + ", error:" + e.getMessage(), e);
			}
		}
		for (SerializerListener serializerListener : listnerList.values()) {
			serializerListener.onRequestSerialized(params);
		}
		return params;
	}

	public void registeSerializerListener(SerializerListener listner) {
		if (!listnerList.containsKey(listner.getClass())) {
			listnerList.put(listner.getClass(), listner);
		}

	}

}
