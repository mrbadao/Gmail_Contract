/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.util;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hieunc on 26/02/2016.
 *
 * @Description:
 */

public class StringUtil {
	private static final Pattern dataPatten = Pattern.compile("(\\d{4})/(\\d{1,2})/(\\d{1,2})(?: (\\d{1,2}):(\\d{1,2})(?::(\\d{1,2}))?)?");

	public static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	public static Date parseDate(String apiDateString) throws NumberFormatException, NullPointerException {
		return new Date(parseDateStringTimeInMilis(apiDateString));
	}

	public static long parseDateStringTimeInMilis(String apiDateTimeString) throws NumberFormatException, NullPointerException {
		if (apiDateTimeString == null) {
			throw new NullPointerException("parseDateStringTimeInMilis argument is null");
		}
		final Matcher m = dataPatten.matcher(apiDateTimeString);
		if (m.find()) {
			final int[] dds = new int[6];
			for (int i = 0; i < m.groupCount() && i < dds.length; i++) {
				final String s = m.group(i + 1);
				dds[i] = isEmpty(s) ? 0 : Integer.parseInt(s);//パターンは数字のみなのでエラーは発生しない想定
			}
			final Calendar cal = Calendar.getInstance();
			cal.clear();
			cal.set(dds[0], dds[1] - 1, dds[2], dds[3], dds[4], dds[5]);//月部分は-1が必要
			cal.set(Calendar.MILLISECOND, 0);
			return cal.getTimeInMillis();
		} else {
			throw new NumberFormatException("parseDateStringTimeInMilis format error::" + apiDateTimeString);
		}
	}
}
