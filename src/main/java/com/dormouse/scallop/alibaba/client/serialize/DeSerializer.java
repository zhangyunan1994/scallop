/**
 * 
 */
package com.dormouse.scallop.alibaba.client.serialize;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

import com.sparrow.sdk.alibaba.client.entity.ResponseWrapper;
import com.sparrow.sdk.alibaba.client.policy.Protocol;

/**
 * @author hongbang.hb
 *
 */
public interface DeSerializer {

	/**
	 * 返回该反序列化接口支持的数据协议.
	 * 
	 * @see Protocol
	 * @return
	 */
	public String supportedContentType();

	/**
	 * 把istream反序列化为一个ResponseWrapper对象
	 * 
	 * @param istream
	 * @param resultType
	 * @param charSet
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	public <T> ResponseWrapper<T> deSerialize(InputStream istream, Class<T> resultType, String charSet)
			throws IOException, ParseException;

	/**
	 * 把istream反序列化为一个异常对象
	 * 
	 * @param inputStream
	 * @param statusCode
	 * @param charSet
	 * @return
	 * @throws IOException
	 * @throws ParseException
	 */
	public Throwable buildException(InputStream inputStream, int statusCode, String charSet) throws IOException,
			ParseException;

	/**
	 * 
	 * @param listner
	 */
	public void registeDeSerializerListener(DeSerializerListener listner);

}
