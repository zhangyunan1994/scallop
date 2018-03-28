/**
 * 
 */
package com.dormouse.scallop.alibaba.client.serialize;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author hongbang.hb
 *
 */
public class SerializerProvider {

	private Map<String, Serializer> serializerStore = new LinkedHashMap<String, Serializer>();

	public Serializer getSerializer(String contentType) {
		return serializerStore.get(contentType);
	}

	public void register(Serializer serializer) {
		serializerStore.put(serializer.supportedContentType(), serializer);
	}

	private Map<String, DeSerializer> deSerializerStore = new LinkedHashMap<String, DeSerializer>();

	public DeSerializer getDeSerializer(String contentType) {
		return deSerializerStore.get(contentType);
	}

	public void register(DeSerializer deSerializer) {
		deSerializerStore.put(deSerializer.supportedContentType(), deSerializer);
	}
}
