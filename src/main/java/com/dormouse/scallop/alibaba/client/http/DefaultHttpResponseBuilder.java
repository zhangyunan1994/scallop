package com.dormouse.scallop.alibaba.client.http;///**
// * Project: ocean.client.java.basic
// *
// * File Created at 2011-11-28
// * $Id: DefaultHttpResponseBuilder.java 412998 2015-05-22 06:37:04Z hongbang.hb $
// *
// * Copyright 2008 Alibaba.com Croporation Limited.
// * All rights reserved.
// *
// * This software is the confidential and proprietary information of
// * Alibaba Company. ("Confidential Information").  You shall not
// * disclose such Confidential Information and shall use it only in
// * accordance with the terms of the license agreement you entered into
// * with Alibaba.com.
// */
//package com.sparrow.sdk.alibaba.client.http;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.text.ParseException;
//import java.util.Collection;
//import java.util.zip.GZIPInputStream;
//
//import com.sparrow.sdk.alibaba.client.entity.ResponseWrapper;
//import com.sparrow.sdk.alibaba.client.policy.ClientPolicy;
//import com.sparrow.sdk.alibaba.client.policy.Protocol;
//import com.sparrow.sdk.alibaba.client.serialize.DeSerializer;
//import com.sparrow.sdk.alibaba.client.serialize.DeSerializerListener;
//import com.sparrow.sdk.alibaba.client.util.LoggerHelper;
//import com.sparrow.sdk.alibaba.client.Response;
//import com.sparrow.sdk.alibaba.client.serialize.SerializerProvider;
//
///**
// *
// * @author hongbang.hb
// *
// */
//public class DefaultHttpResponseBuilder implements HttpResponseBuilder {
//	private static final String HEADER_NAME_CONTENT_ENCODING = "Content-Encoding";
//	protected static final String CONTENT_ENCODING_GZIP = "gzip";
//	private static final String HEADER_NAME_CONTENT_TYPE = "Content-Type";
//	private static final String HEADER_FLAG_CONTENT_TYPE_CHARSET = ";charset=";
//	private static final int HEADER_FLAG_LENGTH_CONTENT_TYPE_CHARSET = HEADER_FLAG_CONTENT_TYPE_CHARSET.length();
//	protected ClientPolicy clientPolicy;
//	private SerializerProvider serializerProvider;
//
//	public DefaultHttpResponseBuilder(ClientPolicy clientPolicy, SerializerProvider serializerProvider) {
//		super();
//		this.clientPolicy = clientPolicy;
//		this.serializerProvider = serializerProvider;
//	}
//
//	protected <T> T parseBody(InputStream istream, Class<T> resultType, InvokeContext invokeContext,
//			Collection<DeSerializerListener> deSerializerListners) throws IOException, ParseException {
//		Protocol protocol = invokeContext.getPolicy().getResponseProtocol();
//		if (protocol == null) {
//			protocol = invokeContext.getPolicy().getRequestProtocol();
//		}
//		DeSerializer deSerializer = serializerProvider.getDeSerializer(protocol.name());
//		for (DeSerializerListener srializerListener : deSerializerListners) {
//			deSerializer.registeDeSerializerListener(srializerListener);
//		}
//		ResponseWrapper<T> responseWrapper = deSerializer.deSerialize(istream, resultType, invokeContext.getResponse()
//				.getCharset());
//		invokeContext.setResponseWrapper(responseWrapper);
//		return responseWrapper.getResult();
//	}
//
//	protected Throwable buildException(InputStream istream, int statusCode, InvokeContext invokeContext,
//			Collection<DeSerializerListener> deSerializerListners) throws IOException, ParseException {
//		Protocol protocol = invokeContext.getPolicy().getResponseProtocol();
//		if (protocol == null) {
//			protocol = invokeContext.getPolicy().getRequestProtocol();
//		}
//		DeSerializer deSerializer = serializerProvider.getDeSerializer(protocol.name());
//		if (deSerializer == null) {
//			throw new RuntimeException("The Protocol[" + protocol.name()
//					+ "] is not supported when parse the response.");
//		}
//		for (DeSerializerListener srializerListener : deSerializerListners) {
//			deSerializer.registeDeSerializerListener(srializerListener);
//		}
//		Throwable rhrowable = deSerializer
//				.buildException(istream, statusCode, invokeContext.getResponse().getCharset());
//		return rhrowable;
//	}
//
//	public Response buildResponse(InputStream istream, int httpCode, String contentEncoding, String contentType,
//			InvokeContext invokeContext, Collection<DeSerializerListener> deSerializerListners) {
//		LoggerHelper.getClientLogger().finer("--Start init Response--");
//		final Response response = new Response();
//		invokeContext.setResponse(response);
//		response.setStatusCode(httpCode);
//		if (contentEncoding != null) {
//			response.setEncoding(contentEncoding);
//		}
//		if (contentType == null) {
//			response.setException(new IllegalStateException("response need content type"));
//		} else {
//			String charset = HttpSupport.parseResponseCharset(invokeContext.getPolicy(), contentType);
//			response.setCharset(charset);
//		}
//		try {
//			if (CONTENT_ENCODING_GZIP.equalsIgnoreCase(response.getEncoding())) {
//				LoggerHelper.getClientLogger().finer(" translate InputStream to GZIPInputStream ");
//				istream = new GZIPInputStream(istream);
//			}
//			LoggerHelper.getClientLogger().finer("Response status code :" + response.getStatusCode());
//			if (response.getStatusCode() >= 200 && response.getStatusCode() <= 299) {
//				Object result = parseBody(istream, invokeContext.getResultType(), invokeContext, deSerializerListners);
//				response.setResult(result);
//			} else {
//				Throwable exception = buildException(istream, response.getStatusCode(), invokeContext,
//						deSerializerListners);
//				response.setException(exception);
//			}
//		} catch (IOException e) {
//			response.setException(e);
//		} catch (RuntimeException e) {
//			response.setException(e);
//		} catch (ParseException e) {
//			response.setException(e);
//		}
//		return response;
//	}
//
//	public ClientPolicy getClientPolicy() {
//		return clientPolicy;
//	}
//
//}
