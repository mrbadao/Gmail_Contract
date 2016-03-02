/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.util;

import org.apache.log4j.Logger;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by hieunc on 26/02/2016.
 *
 * @Description:
 */
public class ClassUtil {
	final static Logger log = Logger.getLogger(ClassUtil.class);

	public static String parseClassMethodName(Method method, String pattern) {
		final String methodName = method.getName();
		if (methodName.startsWith(pattern)) {
			final int patternLen = pattern.length();
			return new StringBuilder(methodName.length() - patternLen).
					append(Character.toLowerCase(methodName.charAt(patternLen))).
					append(methodName.substring(patternLen + 1)).toString();
		}
		return null;
	}

	public static Object invokeMethod(Object obj, Method method, Object... args) {
		try {
			return method.invoke(obj, args);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			log.error("Failed to invoke " + obj.getClass() + "." + method.getName() + "args" + args.toString());
			return null;
		}
	}
}
