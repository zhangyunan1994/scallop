/*
 * Copyright (c) 2018. author and authors.
 */

package com.dormouse.scallop.pinduoduo.domain;

import lombok.Data;

/**
 * 拼多多应用信息
 *
 * @author 张瑀楠 zyndev@gmail.com
 * @version 1.0.0
 */
@Data
public class ApplicationParam {

    private String clientId;
    private String clientSecret;

    public ApplicationParam(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }
}
