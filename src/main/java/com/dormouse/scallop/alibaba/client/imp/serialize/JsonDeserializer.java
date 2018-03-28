/**
 * 
 */
package com.dormouse.scallop.alibaba.client.imp.serialize;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sparrow.sdk.alibaba.client.util.ExceptionParser;
import com.sparrow.sdk.alibaba.client.entity.ResponseStatus;
import com.sparrow.sdk.alibaba.client.entity.ResponseWrapper;
import com.sparrow.sdk.alibaba.client.policy.Protocol;
import com.sparrow.sdk.alibaba.client.serialize.DeSerializerListener;

/**
 * @author hongbang.hb
 *
 */
public class JsonDeserializer extends AbstractJsonDeserializer {

	public String supportedContentType() {
		return Protocol.json.name();
	}

	@Override
	public <T> ResponseWrapper<T> deSerialize(String content, Class<T> resultType) {
		ResponseWrapper<T> responseWrapper = new ResponseWrapper<T>();
		JSONObject rootJson = JSON.parseObject(content);

		responseWrapper.setInvokeStartTime(rootJson.getString("InvokeStartTime"));
		responseWrapper.setInvokeCostTime(rootJson.getLongValue("InvokeCostTime"));
		JSONObject statusJson = rootJson.getJSONObject("Status");
		ResponseStatus responseStatus = this.parseResult(statusJson, ResponseStatus.class);
		responseWrapper.setStatus(responseStatus);

		JSONArray jsonResponseArray = rootJson.getJSONArray("Responses");
		JSONObject jsonResponseObject = jsonResponseArray.getJSONObject(0);

		T result = this.parseResult(jsonResponseObject, resultType);
		responseWrapper.setResult(result);

		return responseWrapper;
	}

	@Override
	public Throwable buildException(String content, int statusCode) {
		Map result = JSON.parseObject(content, Map.class);
		return ExceptionParser.buildException4Json2(result);
	}

	public void registeDeSerializerListener(DeSerializerListener listner) {
		
	}
	
	

}
