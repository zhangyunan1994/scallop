package com.dormouse.scallop.tool;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * desc :
 * author: 张瑀楠
 * email : zyndev@gmail.com
 * date  : 2017/11/26 下午7:09
 * todo  :
 */
public class MapUtil {

    public static Map<String, String> removeAllNullValue(Map<String, String> params) {
        Map<String, String> result = new HashMap<>();
        for(Map.Entry<String, String> entry : params.entrySet()) {
            if(StringUtils.isNotBlank(entry.getValue())) {
                if(!entry.getValue().trim().equals("null")) {
                    result.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return result;
    }

}
