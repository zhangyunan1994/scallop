package com.dormouse.sdk;

import com.sparrow.sdk.alibaba.constant.AliConstant;
import com.sparrow.component.util.CommonUtil;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.IOException;
import java.util.Map;
/**
 * Created by zhang yufei on 2017/8/20.
 */
/**
 * api调用的服务类
 */
public class ApiCallService {
    /**
     * 调用api测试
     * @param urlHead 请求的url到openapi的部分，如http://gw.open.1688.com/openapi/
     * @param urlPath protocol/version/namespace/name
     * @param appSecretKey 测试的app密钥，如果为空表示不需要签名
     * @param params api请求参数map。如果api需要用户授权访问，那么必须完成授权流程，params中必须包含access_token参数
     * @return json格式的调用结果
     */
    public static String callApiTest(String urlHead, String urlPath, String appSecretKey, Map<String,String> params){
        final HttpClient httpClient = new HttpClient();
        final PostMethod method = new PostMethod(urlHead + urlPath);
        method.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");

        if(params != null){
            for (Map.Entry<String,String> entry : params.entrySet()) {
                method.setParameter(entry.getKey(), entry.getValue());
            }
        }
        if(appSecretKey != null){
            method.setParameter("_aop_signature", CommonUtil.signatureWithParamsAndUrlPath(urlPath, params, appSecretKey));
        }
        String response = "";
        try{
            int status = httpClient.executeMethod(method);
            if(status >= 300 || status < 200){
                throw new RuntimeException("invoke api failed, urlPath:" + urlPath
                        + " status:" + status + " response:" + method.getResponseBodyAsString());
            }
            response = CommonUtil.parserResponse(method);
        } catch (HttpException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            method.releaseConnection();
        }
        return response;
    }

    public static String callApi( String urlPath, String appSecretKey, Map<String, String> params){
        urlPath = AliConstant.API_PROTOCOL + urlPath;
        final HttpClient httpClient = new HttpClient();
        final PostMethod method = new PostMethod(AliConstant.API_DOMAIN + urlPath);
        method.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");

        if(params != null){
            for (Map.Entry<String, String> entry : params.entrySet()) {
                method.setParameter(entry.getKey(), entry.getValue());
            }
        }
        if(appSecretKey != null){
            method.setParameter("_aop_signature", CommonUtil.signatureWithParamsAndUrlPath(urlPath, params, appSecretKey));
        }
        String response = "";
        try{
            int status = httpClient.executeMethod(method);
            if(status >= 300 || status < 200){
                throw new RuntimeException("invoke api failed, urlPath:" + urlPath
                        + " status:" + status + " response:" + method.getResponseBodyAsString());
            }
            response = CommonUtil.parserResponse(method);
        } catch (HttpException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            method.releaseConnection();
        }
        return response;
    }
}
