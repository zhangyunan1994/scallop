/**
 * 
 */
package com.dormouse.scallop.alibaba.client.serialize;

/**
 * @author hongbang.hb
 *
 */
public interface DeSerializerListener {

	public void onResponseDeSerialized(String response);

	public void onResponseExceptioned(String response);

}
