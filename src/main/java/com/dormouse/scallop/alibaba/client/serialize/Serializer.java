/**
 * 
 */
package com.dormouse.scallop.alibaba.client.serialize;

import com.sparrow.sdk.alibaba.client.policy.Protocol;

import java.util.Map;

/**
 * @author hongbang.hb
 *
 */
public interface Serializer {

	/**
	 * 返回该反序列化接口支持的数据协议.
	 * 
	 * @see Protocol
	 * @return
	 */
	public String supportedContentType();

	/**
	 * 序列化方法
	 * 
	 * @param serializer
	 * @return
	 */
	public Map<String, Object> serialize(Object serializer);

	/**
	 * 
	 * @param listner
	 */
	public void registeSerializerListener(SerializerListener listner);
}
