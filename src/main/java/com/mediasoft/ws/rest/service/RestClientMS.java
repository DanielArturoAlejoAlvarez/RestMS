package com.mediasoft.ws.rest.service;

import com.mediasoft.ws.rest.vo.VOUser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

public class RestClientMS {
	
	public static void main(String[] args) {
		String urlRestService = "http://localhost:8080/RestMS/services/MediaSoft/validateUser";
		System.out.println("################ Invoke Rest Service: "+urlRestService);
		VOUser vo = new VOUser();
		vo.setUsername("Admin");
		vo.setPassword("Password");
		vo.setValid(false);
		
		ClientConfig clientConfig = new DefaultClientConfig();
		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		Client client = Client.create(clientConfig);
		WebResource webResource = client
				.resource(urlRestService);
		
		ClientResponse response = webResource.type("application/json")
				.post(ClientResponse.class, vo);
		vo = response.getEntity(VOUser.class);
		
		System.out.println("################ Response: [User: "+vo.getUsername()+"]");
		System.out.println("################ Response: [User is Valid: "+vo.isValid()+"]");
	}

}
