/**
 * 
 */
package com.dormouse.scallop.alibaba.client.imp.serialize;

import com.sparrow.sdk.alibaba.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public class HttpRequestSerializer extends AbstractParamRequestSerializer {
	public String supportedContentType() {
		return Protocol.http.name();
	}

	@Override
	protected String processNestedParameter(Object value) {
		throw new RuntimeException(
				"The param protocol does not support Nested parameters.");
	}
}
