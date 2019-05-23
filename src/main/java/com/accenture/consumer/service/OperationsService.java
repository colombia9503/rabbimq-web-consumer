package com.accenture.consumer.service;

import org.apache.camel.util.json.JsonObject;

import com.accenture.proxy.service.ProxyService;

@ProxyService(serviceName = "operationsService", value = "rabbitmq")
public interface OperationsService {
	public JsonObject add(JsonObject payload) throws Exception;
	public JsonObject multiply(JsonObject payload) throws Exception;
	public JsonObject divide(JsonObject payload) throws Exception;
	public JsonObject extract(JsonObject payload) throws Exception;
}
