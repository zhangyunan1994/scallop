/**
 * 
 */
package com.dormouse.scallop.alibaba.client.imp.serialize;

import com.sparrow.sdk.alibaba.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public class ParamDeserializer extends JsonDeserializer {

	@Override
	public String supportedContentType() {
		return Protocol.param.name();
	}

}
