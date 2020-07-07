package br.com.cvinicius.camunda;

import org.camunda.bpm.client.ExternalTaskClient;

public class ExternalClient {

	private static final String URL = "http://localhost:8100/engine-rest";
	
	private static final ExternalTaskClient CLIENT;
	
	static {
		
		CLIENT = ExternalTaskClient.create()
					.baseUrl(URL)
					.asyncResponseTimeout(10000)
					.build();
	}
	
	public static ExternalTaskClient getClient() {
		return CLIENT;
	}
}