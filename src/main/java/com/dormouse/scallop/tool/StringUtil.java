package com.dormouse.scallop.tool;

import org.apache.commons.lang3.StringUtils;


/**
 * The type String util.
 *
 * @author yunan.zhang
 * @version 0.0.1
 */
public class StringUtil {

    /**
     * Gets first not null string.
     *
     * @param params the params
     * @return the first not null string
     */
    public static String getFirstNotNullString(String ...params) {
        for (String param : params) {
            if (StringUtils.isNotBlank(param)) {
                return param;
            }
        }
        return null;
    }

}
