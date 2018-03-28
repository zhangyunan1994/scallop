package com.dormouse.scallop.alibaba.client;///**
// *
// */
//package com.sparrow.sdk.alibaba.client;
//
//
//import com.sparrow.sdk.alibaba.client.imp.serialize.*;
//import com.sparrow.sdk.alibaba.client.entity.AuthorizationTokenStore;
//import com.sparrow.sdk.alibaba.client.policy.ClientPolicy;
//import com.sparrow.sdk.alibaba.client.serialize.SerializerProvider;
//
///**
// * @author hongbang.hb
// *
// */
//public class AlibabaClientFactory {
//
//	protected SerializerProvider initSerializerProvider() {
//		SerializerProvider serializerProvider = new SerializerProvider();
//		serializerProvider.register(new Xml2Deserializer());
//		serializerProvider.register(new JsonDeserializer());
//		serializerProvider.register(new Json2Deserializer());
//		serializerProvider.register(new ParamDeserializer());
//		serializerProvider.register(new Param2Deserializer());
//
//		serializerProvider.register(new HttpRequestSerializer());
//		serializerProvider.register(new ParamRequestSerializer());
//		serializerProvider.register(new Param2RequestSerializer());
//		return serializerProvider;
//	}
//
//	public SyncAPIClient createAPIClient(ClientPolicy policy, AuthorizationTokenStore authorizationTokenStore) {
//
//		SerializerProvider serializerProvider = initSerializerProvider();
//
//		final SyncAPIClient syncAPIClient = new SyncAPIClient(policy, serializerProvider, authorizationTokenStore);
//		syncAPIClient.start();
//		Runtime.getRuntime().addShutdownHook(new Thread() {
//			public void run() {
//				if (syncAPIClient != null) {
//					syncAPIClient.shutdown();
//				}
//			}
//		});
//		return syncAPIClient;
//	}
//}