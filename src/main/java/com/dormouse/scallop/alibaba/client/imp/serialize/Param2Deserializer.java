/**
 * 
 */
package com.dormouse.scallop.alibaba.client.imp.serialize;

import com.sparrow.sdk.alibaba.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public class Param2Deserializer extends Json2Deserializer {

	@Override
	public String supportedContentType() {
		return Protocol.param2.name();
	}

}
