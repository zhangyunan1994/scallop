/**
 * 
 */
package com.dormouse.scallop.alibaba.client.serialize;

import java.util.Map;

/**
 * @author hongbang.hb
 *
 */
public interface SerializerListener {
	public void onRequestSerialized(Map<String, Object> serializedRequest);
}
