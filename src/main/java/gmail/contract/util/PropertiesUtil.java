/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.util;

import java.util.Properties;

/**
 * Created by hieunc on 25/02/2016.
 *
 * @Description:
 */
public class PropertiesUtil {
	public static String getStringProp(Properties prop, String key) {
		if (prop.containsKey(key)) {
			return prop.getProperty(key);
		}
		return null;
	}
}
