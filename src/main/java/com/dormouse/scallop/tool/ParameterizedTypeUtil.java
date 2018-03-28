/**
 * 
 */
package com.dormouse.scallop.tool;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;

/**
 * @author hongbang.hb
 *
 */
public class ParameterizedTypeUtil {
	private static HashMap<Class, Type[]> parameterizedTypesCache = new HashMap<Class, Type[]>();

	public static Type[] getGenericTypes(Class beanClass) {

		if (beanClass == null) {
			throw new IllegalArgumentException("No bean class specified");
		}

		Type[] types = parameterizedTypesCache.get(beanClass);
		if (types != null) {
			return types;
		}

		Type[] myGenericClass = beanClass.getGenericInterfaces();
		if (myGenericClass == null || myGenericClass.length == 0) {
			types = null;
		} else {
			ParameterizedType pt = ((ParameterizedType) myGenericClass[0]);
			types = pt.getActualTypeArguments();
		}

		parameterizedTypesCache.put(beanClass, types);
		return (types);

	}

	public static Type[] getGenericTypes(Object bean) {
		if (bean == null) {
			throw new IllegalArgumentException("No bean specified");
		}
		return getGenericTypes(bean.getClass());
	}

}
