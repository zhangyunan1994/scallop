package com.dormouse.scallop.alibaba.client;///**
// *
// */
//package com.sparrow.sdk.alibaba.client;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collection;
//
//import com.sparrow.sdk.alibaba.client.entity.AuthorizationToken;
//import com.sparrow.sdk.alibaba.client.entity.AuthorizationTokenStore;
//import com.sparrow.sdk.alibaba.client.entity.DefaultAuthorizationTokenStore;
//import com.sparrow.sdk.alibaba.client.exception.OceanException;
//import com.sparrow.sdk.alibaba.client.http.InvokeContext;
//import com.sparrow.sdk.alibaba.client.http.platform.HttpURLConnectionClient;
//import com.sparrow.sdk.alibaba.client.serialize.SerializerListener;
//import com.sparrow.sdk.alibaba.client.http.AbstractHttpClient;
//import com.sparrow.sdk.alibaba.client.http.DefaultHttpResponseBuilder;
//import com.sparrow.sdk.alibaba.client.http.HttpResponseBuilder;
//import com.sparrow.sdk.alibaba.client.policy.ClientPolicy;
//import com.sparrow.sdk.alibaba.client.policy.RequestPolicy;
//import com.sparrow.sdk.alibaba.client.serialize.DeSerializerListener;
//import com.sparrow.sdk.alibaba.client.serialize.SerializerProvider;
//
///**
// * @author hongbang.hb
// *
// */
//public class SyncAPIClient {
//
//	private AbstractHttpClient httpClient;
//	private ClientPolicy clientPolicy;
//	private AuthorizationTokenStore authorizationTokenStore;
//
//	public SyncAPIClient(ClientPolicy clientPolicy, SerializerProvider serializerProvider) {
//		this(clientPolicy, serializerProvider, new DefaultAuthorizationTokenStore());
//	}
//
//	public SyncAPIClient(ClientPolicy clientPolicy, SerializerProvider serializerProvider,
//			AuthorizationTokenStore authorizationTokenStore) {
//		super();
//		this.clientPolicy = clientPolicy;
//		this.authorizationTokenStore = authorizationTokenStore;
//		HttpResponseBuilder httpResponseBuilder = new DefaultHttpResponseBuilder(clientPolicy, serializerProvider);
//		httpClient = new HttpURLConnectionClient(serializerProvider, httpResponseBuilder);
//	}
//
//	public <T> T send(Request request, Class<T> resultType, RequestPolicy policy) throws OceanException {
//		return null;
//	}
//
//	public <T> T send(Request request, Class<T> resultType, RequestPolicy policy,
//                      Collection<SerializerListener> serializerListners, Collection<DeSerializerListener> deSerializerListners)
//			throws OceanException {
//		InvokeContext invokeContext = new InvokeContext();
//		invokeContext.setPolicy(policy);
//		invokeContext.setRequest(request);
//		invokeContext.setResultType(resultType);
//		try {
//			httpClient.request(invokeContext, clientPolicy, serializerListners, deSerializerListners);
//			if (invokeContext.getResponse().getException() != null) {
//				Throwable responseException = invokeContext.getResponse().getException();
//				if (responseException instanceof OceanException) {
//					throw (OceanException) responseException;
//				} else {
//					throw new OceanException(responseException);
//				}
//			}
//			return (T) invokeContext.getResponse().getResult();
//		} catch (IOException e) {
//			throw new OceanException(e);
//		}
//	}
//
//	public void start() {
//	}
//
//	public void shutdown() {
//	}
//
//	public AuthorizationToken getToken(String code) throws OceanException {
//
//		Request request = new Request("system.oauth2", "getToken");
//		request.addAddtionalParams("code", code);
//		request.addAddtionalParams("grant_type", "authorization_code");
//		request.addAddtionalParams("need_refresh_token", true);
//		request.addAddtionalParams("client_id", clientPolicy.getAppKey());
//		request.addAddtionalParams("client_secret", clientPolicy.getSigningKey());
//		request.addAddtionalParams("redirect_uri", "default");
//		RequestPolicy oauthPolicy = RequestPolicy.getAuthPolicy();
//
//		return this.send(request, AuthorizationToken.class, oauthPolicy, new ArrayList<SerializerListener>(),
//				new ArrayList<DeSerializerListener>());
//	}
//
//	public AuthorizationToken refreshToken(String refreshToken) throws OceanException {
//		Request request = new Request("system.oauth2", "getToken");
//		request.addAddtionalParams("refreshToken", refreshToken);
//		request.addAddtionalParams("grant_type", "refresh_token");
//		request.addAddtionalParams("client_id", clientPolicy.getAppKey());
//		request.addAddtionalParams("client_secret", clientPolicy.getSigningKey());
//		RequestPolicy oauthPolicy = RequestPolicy.getAuthPolicy();
//		return this.send(request, AuthorizationToken.class, oauthPolicy, new ArrayList<SerializerListener>(),
//				new ArrayList<DeSerializerListener>());
//	}
//
//}
