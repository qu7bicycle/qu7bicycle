package com.rightsallocate.common;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GetEntityClassUtil {

	public static void main(String[] args) {
		
	}
	
	@SuppressWarnings("rawtypes")
	public static Class getEntityClass(Class c) {
		Type type = c.getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			Type[] parameterizedTypes = ((ParameterizedType) type)
					.getActualTypeArguments();
			return  (Class) parameterizedTypes[0];
		} else {
			return Object.class;
		}
	}
}
