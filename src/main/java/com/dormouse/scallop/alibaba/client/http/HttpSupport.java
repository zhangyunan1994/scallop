package com.dormouse.scallop.alibaba.client.http;///**
// *
// */
//package com.sparrow.sdk.alibaba.client.http;
//
//import java.io.IOException;
//import java.net.URL;
//import java.net.URLEncoder;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//
//import com.sparrow.sdk.alibaba.client.Request;
//import com.sparrow.sdk.alibaba.client.policy.ClientPolicy;
//import com.sparrow.sdk.alibaba.client.policy.RequestPolicy;
//import com.sparrow.sdk.alibaba.client.serialize.Serializer;
//import com.sparrow.sdk.alibaba.util.DateUtil;
//import com.sparrow.sdk.alibaba.util.GenericsUtil;
//import com.sparrow.sdk.alibaba.util.SignatureUtil;
//
///**
// * @author hongbang.hb
// *
// */
//public final class HttpSupport {
//	public static final String METHOD_GET = "GET";
//	public static final String METHOD_POST = "POST";
//
//	public static final char QUERY_STRING_SEPARATOR = '?';
//	public static final char PARAMETER_SEPARATOR = '&';
//	public static final char NAME_VALUE_SEPARATOR = '=';
//
//	public static final String PARAM_NAME_SIGNATURE = "_aop_signature";
//	public static final String PARAM_NAME_TIMESTAMP = "_aop_timestamp";
//	public static final String PARAM_NAME_DATEPATTERN = "_aop_datePattern";
//	public static final String PARAM_NAME_RESPONSE_FORMAT = "_aop_responseFormat";
//	public static final String PARAM_NAME_ACCESS_TOKEY = "access_token";
//
//	public final static Map<String, String> buildHttpHeader(InvokeContext context, ClientPolicy clientPolicy) {
//		Map<String, String> header = new LinkedHashMap<String, String>();
//		header.put("Accept", "text/xml,text/javascript,application/json");
//		header.put("User-Agent", clientPolicy.getAgent());
//		return header;
//	}
//
//	/**
//	 *
//	 * @param requestPolicy
//	 * @return
//	 */
//	public final static StringBuilder getApiRequestPath(RequestPolicy requestPolicy) {
//		StringBuilder path = new StringBuilder();
//		if (requestPolicy.isAccessPrivateApi()) {
//			path.append("/api");
//		} else {
//			path.append("/openapi");
//		}
//		return path;
//	}
//
//	/**
//	 *
//	 * @param context
//	 * @param clientPolicy
//	 * @return
//	 */
//	public static StringBuilder getProtocolRequestPath(InvokeContext context, ClientPolicy clientPolicy) {
//		StringBuilder path = new StringBuilder();
//		path.append(context.getPolicy().getRequestProtocol().name()).append('/');
//		Request request = context.getRequest();
//		if (request.getApiId().getVersion() < 0) {
//			path.append(context.getPolicy().getDefaultApiVersion());
//		} else {
//			path.append(request.getApiId().getVersion());
//		}
//		path.append('/').append(request.getApiId().getNamespace()).append('/').append(request.getApiId().getName());
//		if (clientPolicy.getAppKey() != null) {
//			path.append('/').append(clientPolicy.getAppKey());
//		}
//		return path;
//	}
//
//	/**
//	 *
//	 * @param serializerProvider
//	 * @param context
//	 * @return
//	 */
//	public static Map<String, Object> buildParams(Serializer serializer, InvokeContext context) {
//		Map<String, Object> serializerMap = serializer.serialize(context.getRequest().getRequestEntity());
//
//		serializerMap.putAll(context.getRequest().getAddtionalParams());
//
//		RequestPolicy requestPolicy = context.getPolicy();
//		if (!requestPolicy.getRequestProtocol().equals(requestPolicy.getResponseProtocol())) {
//			serializerMap.put(PARAM_NAME_RESPONSE_FORMAT, requestPolicy.getResponseProtocol().name());
//		}
//		if(requestPolicy.isRequestSendTimestamp()){
//		    serializerMap.put(PARAM_NAME_TIMESTAMP, System.currentTimeMillis());
//		}
//
//		serializerMap.put(PARAM_NAME_DATEPATTERN, DateUtil.DEFAULT_DATE_FORMAT_STR);
//
//		return serializerMap;
//	}
//
//	/**
//	 * @param protocolRequestPath
//	 * @param parameters
//	 * @param requestPolicy
//	 * @param clientPolicy
//	 */
//	public static void signature(StringBuilder protocolRequestPath, Map<String, Object> parameters,
//			RequestPolicy requestPolicy, ClientPolicy clientPolicy) {
//		if (!requestPolicy.isUseSignture())
//			return;
//		if (GenericsUtil.isBlank(clientPolicy.getAppKey()) || clientPolicy.getSigningKey() == null) {
//			return;
//		}
//		byte[] sign = SignatureUtil.hmacSha1(protocolRequestPath.toString(), parameters, clientPolicy.getSigningKey());
//
//		String signedContent = SignatureUtil.encodeHexStr(sign);
//		parameters.put(PARAM_NAME_SIGNATURE, signedContent);
//
//	}
//
//	/**
//	 *
//	 * @param params
//	 * @param charset
//	 * @return
//	 * @throws IOException
//	 */
//	public static String buildQuery(Map<String, Object> params) throws IOException {
//		if (params == null || params.isEmpty()) {
//			return "";
//		}
//		StringBuilder query = new StringBuilder();
//		Set<Entry<String, Object>> entries = params.entrySet();
//		boolean hasParam = false;
//
//		for (Entry<String, Object> entry : entries) {
//			String name = entry.getKey();
//			Object value = entry.getValue();
//			if (value != null) {
//				if (hasParam) {
//					query.append("&");
//				} else {
//					hasParam = true;
//				}
//				query.append(name).append("=").append(URLEncoder.encode(String.valueOf(value), "utf-8"));
//			}
//		}
//
//		return query.toString();
//	}
//
//	public static URL buildGetRequestUrl(ClientPolicy clientPolicy, InvokeContext context, Map<String, Object> params)
//			throws IOException {
//		String protocol = "http";
//		String host = clientPolicy.getServerHost();
//		int port = clientPolicy.getHttpPort();
//		if (context.getPolicy().isUseHttps()) {
//			protocol = "https";
//			port = clientPolicy.getHttpsPort();
//		}
//		StringBuilder pathSB = getApiRequestPath(context.getPolicy());
//		StringBuilder proptolRequestPath = getProtocolRequestPath(context, clientPolicy);
//		pathSB.append("/").append(proptolRequestPath.toString());
//		String query = buildQuery(params);
//		if (!GenericsUtil.isBlank(query)) {
//			pathSB.append("?");
//			pathSB.append(query);
//		}
//		return new URL(protocol, host, port, pathSB.toString());
//
//	}
//
//	public static URL buildPostRequestUrl(ClientPolicy clientPolicy, InvokeContext context, Map<String, Object> params)
//			throws IOException {
//		String protocol = "http";
//		String host = clientPolicy.getServerHost();
//		int port = clientPolicy.getHttpPort();
//		if (context.getPolicy().isUseHttps()) {
//			protocol = "https";
//			port = clientPolicy.getHttpsPort();
//		}
//		StringBuilder pathSB = getApiRequestPath(context.getPolicy());
//		StringBuilder proptolRequestPath = getProtocolRequestPath(context, clientPolicy);
//		pathSB.append("/").append(proptolRequestPath.toString());
//
//		return new URL(protocol, host, port, pathSB.toString());
//
//	}
//
//	public static String parseResponseCharset(RequestPolicy requestPolicy, String ctype) {
//		String charset = requestPolicy.getContentCharset();
//
//		if (!GenericsUtil.isBlank(ctype)) {
//			String[] params = ctype.split(";");
//			for (String param : params) {
//				param = param.trim();
//				if (param.startsWith("charset")) {
//					String[] pair = param.split("=", 2);
//					if (pair.length == 2) {
//						if (!GenericsUtil.isBlank(pair[1])) {
//							charset = pair[1].trim();
//						}
//					}
//					break;
//				}
//			}
//		}
//		return charset;
//	}
//
//}
