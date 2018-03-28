package com.dormouse.scallop.alibaba.client.http;///**
// *
// */
//package com.sparrow.sdk.alibaba.client.http;
//
//import java.io.IOException;
//import java.net.URL;
//import java.util.Collection;
//import java.util.Map;
//
//import com.sparrow.sdk.alibaba.client.policy.Protocol;
//import com.sparrow.sdk.alibaba.client.policy.RequestPolicy;
//import com.sparrow.sdk.alibaba.client.serialize.DeSerializerListener;
//import com.sparrow.sdk.alibaba.client.serialize.Serializer;
//import com.sparrow.sdk.alibaba.client.serialize.SerializerListener;
//import com.sparrow.sdk.alibaba.client.Response;
//import com.sparrow.sdk.alibaba.client.policy.ClientPolicy;
//import com.sparrow.sdk.alibaba.client.serialize.SerializerProvider;
//
///**
// * @author hongbang.hb
// *
// */
//public abstract class AbstractHttpClient {
//
//	private SerializerProvider serializerProvider;
//	private HttpResponseBuilder responseBuilder;
//
//	public AbstractHttpClient(SerializerProvider serializerProvider, HttpResponseBuilder responseBuilder) {
//		super();
//		this.serializerProvider = serializerProvider;
//		this.responseBuilder = responseBuilder;
//	}
//
//	public Response request(InvokeContext invokeContext, ClientPolicy clientPolicy,
//                            Collection<SerializerListener> serializerListners, Collection<DeSerializerListener> deSerializerListners)
//			throws IOException {
//		// create the path. The pass is used when signature the request.
//		StringBuilder protocolRequestPath = HttpSupport.getProtocolRequestPath(invokeContext, clientPolicy);
//		// generate the http parameters, include the system parameters.
//		Protocol protocol = invokeContext.getPolicy().getRequestProtocol();
//		Serializer serializer = serializerProvider.getSerializer(protocol.name());
//		for (SerializerListener serializerListener : serializerListners) {
//			serializer.registeSerializerListener(serializerListener);
//		}
//		Map<String, Object> parameters = HttpSupport.buildParams(serializer, invokeContext);
//		// signature the request
//		HttpSupport.signature(protocolRequestPath, parameters, invokeContext.getPolicy(), clientPolicy);
//
//		if (RequestPolicy.HttpMethodPolicy.GET.equals(invokeContext.getPolicy().getHttpMethod())) {
//			URL getURL = HttpSupport.buildGetRequestUrl(clientPolicy, invokeContext, parameters);
//			Response response = this.doGet(getURL, parameters, invokeContext, clientPolicy, deSerializerListners);
//			return response;
//		} else {
//			URL postURL = HttpSupport.buildPostRequestUrl(clientPolicy, invokeContext, parameters);
//			for (Map.Entry<String, Object> entry : parameters.entrySet()) {
//				Object inputValue = entry.getValue();
//				if (inputValue.getClass().isAssignableFrom(byte[].class)
//						|| inputValue.getClass().isAssignableFrom(Byte[].class)) {
//					return this.doMultipartPost(postURL, parameters, invokeContext, clientPolicy, deSerializerListners);
//				}
//			}
//			Response response = this.doPost(postURL, parameters, invokeContext, clientPolicy, deSerializerListners);
//			return response;
//		}
//	}
//
//	protected abstract Response doMultipartPost(URL url, Map<String, Object> parameters, InvokeContext invokeContext,
//			ClientPolicy clientPolicy, Collection<DeSerializerListener> deSerializerListners) throws IOException;
//
//	protected abstract Response doPost(URL url, Map<String, Object> parameters, InvokeContext invokeContext,
//			ClientPolicy clientPolicy, Collection<DeSerializerListener> deSerializerListners) throws IOException;
//
//	protected abstract Response doGet(URL url, Map<String, Object> parameters, InvokeContext invokeContext,
//			ClientPolicy clientPolicy, Collection<DeSerializerListener> deSerializerListners) throws IOException;
//
//	public SerializerProvider getSerializerProvider() {
//		return serializerProvider;
//	}
//
//	public HttpResponseBuilder getResponseBuilder() {
//		return responseBuilder;
//	}
//
//}
