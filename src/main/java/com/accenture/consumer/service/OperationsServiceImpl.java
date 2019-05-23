package com.accenture.consumer.service;

import org.apache.camel.util.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.accenture.proxy.error.service.ServiceException;

@Service
public class OperationsServiceImpl implements OperationsService {
	
	private static final Logger log = LoggerFactory.getLogger(OperationsServiceImpl.class);

	@Override
	public JsonObject add(JsonObject payload) {
		JsonObject result = new JsonObject();
		int a = payload.getInteger("a");
		int b = payload.getInteger("b");
		log.debug("Incoming call: add");
		result.put("result", a+b);
		return result;
	}

	@Override
	public JsonObject multiply(JsonObject payload) {
		JsonObject result = new JsonObject();
		int a = payload.getInteger("a");
		int b = payload.getInteger("b");
		log.debug("Incoming call: multiply");
		result.put("result", a*b);
		return result;
	}

	@Override
	public JsonObject divide(JsonObject payload) throws ServiceException {
		JsonObject result = new JsonObject();
		int a = payload.getInteger("a");
		int b = payload.getInteger("b");
		log.debug("Incoming call: divide");
		if(b <= 0)
			throw new ServiceException(5432, "Aritmethic exception: divide by zero");
		
		result.put("result", a/b);
		return result;
	}

	@Override
	public JsonObject extract(JsonObject payload) {
		JsonObject result = new JsonObject();
		int a = payload.getInteger("a");
		int b = payload.getInteger("b");
		log.debug("Incoming call: extract");
		result.put("result", a-b);
		return result;
	}

}
