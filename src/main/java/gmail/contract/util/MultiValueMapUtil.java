/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.util;

import org.apache.log4j.Logger;

import javax.ws.rs.core.MultivaluedMap;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by hieunc on 26/02/2016.
 *
 * @Description:
 */
public class MultiValueMapUtil {
	final static Logger log = Logger.getLogger(MultiValueMapUtil.class);

	public static <T> T convertToDto(Class<T> clazz, MultivaluedMap<String, String> inObject) {
		final T clazzInstance;
		try {
			clazzInstance = clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			log.error("Failed to convert " + clazz.getName() + "\n" + e);
			return null;
		}

		final Map<String, Method> clazzSetterMapper = new HashMap<String, Method>();
		for (final Method m : clazz.getMethods()) {
			final String methodName = ClassUtil.parseClassMethodName(m, "set");
			if (methodName != null && m.getParameterTypes().length == 1) {
				clazzSetterMapper.put(methodName, m);
			}
		}

		for (final String methodName : inObject.keySet()) {
			if (clazzSetterMapper.containsKey(methodName)) {
				final Method m = clazzSetterMapper.get(methodName);

				final Class<?>[] parameterTypes = m.getParameterTypes();

				Object v;
				try {
					v = formatParameter(m, parameterTypes[0], inObject.get(methodName));
					ClassUtil.invokeMethod(clazzInstance, m, v);
				} catch (Exception e) {
					log.error("Failed to invoke " + methodName);
				}
			}
		}

		return clazzInstance;
	}


	protected static Object formatParameter(Method m, Class<?> parameterType, List<String> list) {
//		if (parameterType.isArray()) {
//			final Class<?> inArrayType = parameterType.getComponentType();
//			return formatParameterArray(inArrayType, list);
//		} else if (parameterType == List.class) {
//			return formatParameterList(m, parameterType, list);
//		} else {
		return castInData(parameterType, (list != null && (!list.isEmpty())) ? list.get(0).toString() : null);
//		}
	}

	//
//	protected static <T> T[] formatParameterArray(Class<T> inArrayType, List<Object> list) {
//		@SuppressWarnings("unchecked")
//		final T[] ary = (T[]) Array.newInstance(inArrayType, list.size());
//		for (int i = 0; i < list.size(); i++) {
//			@SuppressWarnings("unchecked")
//			final T v = (T) castInData(inArrayType, list.get(i));
//			Array.set(ary, i, v);
//		}
//		return ary;
//	}
//
//	protected static Object formatParameterList(Method m, Class<?> parameterType, List<String> list) {
//		final Type[] tvs = m.getGenericParameterTypes();
//		final ArrayList<Object> al = new ArrayList<Object>(list.size());
//		if (tvs.length == 1) {
//			final ParameterizedType pt = (ParameterizedType) tvs[0];
//			final Type[] inTypes = pt.getActualTypeArguments();
//			if (inTypes.length == 1) {
//				for (final String s : list) {
//					if (inTypes[0] instanceof Class) {
//						al.add(castInData((Class<?>) inTypes[0], s));
//					} else {
//						al.add(s);
//					}
//				}
//			}
//		}
//		return al;
//	}
	public static Object castInData(Class<?> pt, String s) {
		if (pt == String.class) {
			if (s != null && s.trim().toLowerCase().equals("null")) {
				s = null;
			}
			return s;
		} else if (pt == Integer.TYPE || pt == Integer.class) {
			return Integer.parseInt(s);
		} else if (pt == Long.TYPE || pt == Long.class) {
			return Long.parseLong(s);
		} else if (pt == Byte.TYPE || pt == Byte.class) {
			return Byte.parseByte(s);
		} else if (pt == Short.TYPE || pt == Short.class) {
			return Short.parseShort(s);
		} else if (pt == Boolean.TYPE || pt == Boolean.class) {
			return Boolean.parseBoolean(s);
		} else if (pt == BigDecimal.class) {
			return StringUtil.isEmpty(s) ? null : new BigDecimal(s);
		} else if (Date.class.isAssignableFrom(pt)) {
			return StringUtil.isEmpty(s) ? null : StringUtil.parseDate(s);
		}
		return null;
	}
}
