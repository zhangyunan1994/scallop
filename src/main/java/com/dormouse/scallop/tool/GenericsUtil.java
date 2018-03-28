/**
 * Project: ocean.client.java.basic
 * 
 * File Created at 2011-10-27
 * $Id: GenericsUtil.java 407046 2015-04-14 07:16:20Z hongbang.hb $
 * 
 * Copyright 2008 Alibaba.com Croporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.dormouse.scallop.tool;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/**
 * GenericsUtil
 * 
 * @author yuming.wangym
 */
public final class GenericsUtil {

	private static final String CHARSET_NAME_UTF8 = "UTF-8";

	private GenericsUtil() {
	}

	public static Class<?> getInterfaceGenricType(Class<?> clazz,
			final Class<?> interfaceClass) {
		return getInterfaceGenricType(clazz, interfaceClass, 0);
	}

	public static Class<?> getTypeParameterClass(final Class<?> clazz,
			final String name) {
		final TypeVariable<?>[] types = clazz.getTypeParameters();
		if (types != null && types.length > 0) {
			for (int i = 0; i < types.length; i++) {
				if (name.equals(types[i].getName())) {
					final Type[] bounds;
					if (types[i] instanceof WildcardType) {
						bounds = ((WildcardType) types[i]).getLowerBounds();
					} else {
						bounds = types[i].getBounds();
					}
					if (bounds != null && bounds.length > 0) {
						if (bounds[0] instanceof Class) {
							return (Class<?>) bounds[0];
						} else if (bounds[0] instanceof TypeVariable) {
							return getTypeParameterClass(clazz,
									((TypeVariable<?>) bounds[0]).getName());
						}
					}
					return null;
				}
			}
		}
		return null;
	}

	public static Class<?> getInterfaceGenricType(final Class<?> clazz,
			final Class<?> interfaceClass, final int typeIndex) {
		final Type[] interfaceTypes = clazz.getGenericInterfaces();
		if (interfaceTypes != null && interfaceTypes.length > 0) {
			for (int i = 0; i < interfaceTypes.length; i++) {
				final Type interfaceType = interfaceTypes[i];
				if (interfaceType instanceof ParameterizedType) {
					if (interfaceClass
							.isAssignableFrom((Class<?>) ((ParameterizedType) interfaceType)
									.getRawType())) {
						final Type[] params = ((ParameterizedType) interfaceType)
								.getActualTypeArguments();
						final Class<?>[] types = new Class[params.length];
						for (int j = 0; j < params.length; j++) {
							if (params[i] instanceof Class) {
								types[i] = (Class<?>) params[i];
							} else if (params[i] instanceof WildcardType) {
								final Type[] lowerBounds = ((WildcardType) params[i])
										.getLowerBounds();
								if (lowerBounds != null
										&& lowerBounds.length > 0) {
									if (lowerBounds[0] instanceof Class) {
										types[i] = (Class<?>) lowerBounds[0];
									}
								}
							} else if (params[i] instanceof TypeVariable) {
								types[i] = getTypeParameterClass(clazz,
										((TypeVariable<?>) params[i]).getName());
							} else {
								types[i] = Object.class;
							}
						}
						if (typeIndex >= types.length || typeIndex < 0) {
							return null;
						}
						return types[typeIndex];
					}
				}
			}
		}
		return null;
	}

	public static Class<?> getMethodGenericReturnType(Method method,
			Class<?> rawType, int index) {
		Type returnType = method.getGenericReturnType();
		return getGenericType(returnType, rawType, index);
	}

	public static Class<?> getRawType(Type type) {
		if (type instanceof ParameterizedType) {
			ParameterizedType ptype = (ParameterizedType) type;
			return getRawType(ptype.getRawType());
		} else if (type instanceof Class) {
			return (Class<?>) type;
		}
		return null;
	}

	public static Class<?> getGenericType(Type type, Class<?> rawType, int index) {
		if (type instanceof ParameterizedType) {
			ParameterizedType ptype = (ParameterizedType) type;
			if (rawType.equals(ptype.getRawType())) {
				Type[] typeArguments = ptype.getActualTypeArguments();
				if (index >= typeArguments.length || index < 0) {
					throw new RuntimeException("index "
							+ (index < 0 ? " must large then 0"
									: "out of arguments count"));
				}
				return getRawType(typeArguments[index]);
			}
		}
		return null;
	}

	public static Class<?>[] getGenericType(Type type) {
		if (type instanceof ParameterizedType) {
			ParameterizedType ptype = (ParameterizedType) type;
			Type[] typeArguments = ptype.getActualTypeArguments();
			Class<?>[] types = new Class<?>[typeArguments.length];
			System.arraycopy(typeArguments, 0, types, 0, types.length);
			return types;
		}
		return null;
	}

	public static String encodeBase64Str(final byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		return toString(Base64.encodeBase64(bytes));
	}

	public static byte[] decodeBase64Str(final String str) {
		if (str == null) {
			return null;
		}
		try {
			return Base64.decodeBase64(toBytes(str));
		} catch (final RuntimeException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	private static String toString(final byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		try {
			return new String(bytes, CHARSET_NAME_UTF8);
		} catch (final UnsupportedEncodingException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	private static byte[] toBytes(final String str) {
		if (str == null) {
			return null;
		}
		try {
			return str.getBytes(CHARSET_NAME_UTF8);
		} catch (final UnsupportedEncodingException e) {
			throw new RuntimeException(e.getMessage(), e);
		}
	}

	public static boolean isBlank(String str) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(str.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

	public static String capitalize(String str) {
		int strLen;
		if (str == null || (strLen = str.length()) == 0) {
			return str;
		}
		return new StringBuffer(strLen)
				.append(Character.toTitleCase(str.charAt(0)))
				.append(str.substring(1)).toString();
	}

	public static boolean isNumeric(String str) {
		if (str == null) {
			return false;
		}
		int sz = str.length();
		for (int i = 0; i < sz; i++) {
			if (Character.isDigit(str.charAt(i)) == false) {
				return false;
			}
		}
		return true;
	}

}
