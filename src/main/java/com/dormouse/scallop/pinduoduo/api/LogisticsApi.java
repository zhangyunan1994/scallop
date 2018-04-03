/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.api;


import com.dormouse.scallop.pinduoduo.domain.Address;
import com.dormouse.scallop.pinduoduo.domain.ApplicationParam;
import com.dormouse.scallop.pinduoduo.domain.LogisticsCompany;

import java.util.List;

/**
 * @author 张瑀楠 zyndev@gmail.com
 * @version 0.0.1
 */
public class LogisticsApi {


    public List<Address> getAddress(ApplicationParam applicationParam) {
        return null;
    }

    public List<LogisticsCompany> getCompanies(ApplicationParam applicationParam) {
        return null;
    }

    public void sendOnline(ApplicationParam applicationParam, String accessToken, String orderSn, String logisticsId,
                           String trackingNumber) {

    }

}
