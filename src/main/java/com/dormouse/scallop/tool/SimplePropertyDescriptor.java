/**
 * 
 */
package com.dormouse.scallop.tool;

import java.lang.reflect.Method;

/**
 * @author hongbang.hb
 *
 */
public class SimplePropertyDescriptor {

	private String name;
	private Method readMethod;
	private Class propertyType;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Method getReadMethod() {
		return readMethod;
	}

	public void setReadMethod(Method readMethod) {
		this.readMethod = readMethod;
	}

	public Class getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(Class propertyType) {
		this.propertyType = propertyType;
	}

}
