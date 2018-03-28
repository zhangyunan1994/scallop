/**
 * Project: ocean.client.java.basic
 * 
 * File Created at 2011-11-23
 * $Id: DateUtil.java 311300 2013-12-23 06:15:28Z yichun.wangyc $
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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Comment of DateUtil
 * @author jade
 *
 */
public final class DateUtil {
    public static final String DEFAULT_DATE_FORMAT_STR = "yyyyMMddHHmmssSSSZ";
    private static SimpleDateFormat DEFAULT_FORMAT = new SimpleDateFormat(DEFAULT_DATE_FORMAT_STR);
    
    public static String format(Date d) {
        return format(d, null);
    }
    
    public static String format(Date d, String pattern) {
        return format(d, pattern, null);
    }
    
    public static String format(Date d, String pattern, TimeZone timeZone) {
        if (d == null){
            return null;
        }
        final SimpleDateFormat format;
        if(pattern != null){
            format = new SimpleDateFormat(pattern);
        }else{
            format = (SimpleDateFormat)DEFAULT_FORMAT.clone();
        }
        if(timeZone != null){
            format.setTimeZone(timeZone);
        }
        return format.format(d);
    }

    public static Date parse(String str) throws ParseException{
        return parse(str, null);
    }
    
    public static Date parse(String source, String pattern) throws ParseException{
        return parse(source, pattern, null);
    }
    
    public static Date parse(String source, String pattern, TimeZone timeZone) throws ParseException{
        if (source == null){
            return null;
        }
        final SimpleDateFormat format;
        if(pattern != null){
            format = new SimpleDateFormat(pattern);
        }else{
            format = (SimpleDateFormat)DEFAULT_FORMAT.clone();
        }
        if(timeZone != null){
            format.setTimeZone(timeZone);
        }
        return format.parse(source);
    }
    
    private DateUtil(){};
}
