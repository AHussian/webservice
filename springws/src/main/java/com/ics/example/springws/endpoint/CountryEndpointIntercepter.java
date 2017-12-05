package com.ics.example.springws.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.endpoint.interceptor.EndpointInterceptorAdapter;

public class CountryEndpointIntercepter extends EndpointInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(CountryEndpointIntercepter.class);

	@Override
	public boolean handleRequest(MessageContext messageContext, Object endpoint) throws Exception {
		logger.info(messageContext.getRequest().toString());
		return true;
	}

	
	
}
