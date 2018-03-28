/**
 * 
 */
package com.dormouse.scallop.alibaba.client;


import com.dormouse.scallop.alibaba.client.serialize.DeSerializerListener;
import com.dormouse.scallop.alibaba.client.serialize.SerializerListener;

/**
 * @author hongbang.hb
 *
 */
public interface SDKListener {
	
	public void register(SerializerListener serializerListener);

	public void register(DeSerializerListener deSerializerListener);
	
}
