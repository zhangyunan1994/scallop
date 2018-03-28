/**
 * 
 */
package com.dormouse.scallop.tool;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @author hongbang.hb
 *
 */
public class DefaultPropertyUtils {

	private static HashMap<Class, SimplePropertyDescriptor[]> descriptorsCache = new HashMap<Class, SimplePropertyDescriptor[]>();

	public static SimplePropertyDescriptor[] getPropertyDescriptors(
			Class beanClass) {

		if (beanClass == null) {
			return new SimplePropertyDescriptor[0];
		}
		SimplePropertyDescriptor[] descriptors = null;
		descriptors = (SimplePropertyDescriptor[]) descriptorsCache
				.get(beanClass);
		if (descriptors != null) {
			return (descriptors);
		}
		Field[] fields = beanClass.getDeclaredFields();
		if (fields == null) {
			descriptors = new SimplePropertyDescriptor[0];

		} else {
			descriptors = new SimplePropertyDescriptor[fields.length];
			for (int i = 0; i < fields.length; i++) {
				Field field = fields[i];
				SimplePropertyDescriptor simplePropertyDescriptor = new SimplePropertyDescriptor();
				simplePropertyDescriptor.setName(field.getName());
				simplePropertyDescriptor.setPropertyType(field.getType());
				try {
					Method readMethod = beanClass.getMethod("get"
							+ GenericsUtil.capitalize(field.getName()));
					simplePropertyDescriptor.setReadMethod(readMethod);
				} catch (Exception ex) {
					// do nothing if readMethod is not support.
				}
				descriptors[i] = simplePropertyDescriptor;
			}
		}
		descriptorsCache.put(beanClass, descriptors);
		return (descriptors);

	}
}
