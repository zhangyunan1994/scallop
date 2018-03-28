/**
 * 
 */
package com.dormouse.scallop.alibaba.client;

import com.sparrow.sdk.alibaba.client.serialize.DeSerializerListener;
import com.sparrow.sdk.alibaba.client.serialize.SerializerListener;

/**
 * @author hongbang.hb
 *
 */
public interface SDKListener {
	
	public void register(SerializerListener serializerListener);

	public void register(DeSerializerListener deSerializerListener);
	
}
