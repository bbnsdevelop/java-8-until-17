package br.com.bbnsdevelop.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.stream.Stream;


public class Http2ClientSyncDemo {
	
	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient http = HttpClient.newHttpClient();
		
		URI uri = new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities");
				
		HttpRequest request = HttpRequest.newBuilder(uri).GET().build();		
		
		HttpResponse<Stream<String>> response = http.send(request, BodyHandlers.ofLines());
		
		
		System.out.println(response.statusCode());
		Stream<String> body = response.body();
		
		body.forEach( a -> System.out.println(a));
		
		
		System.out.println("-".repeat(40));
		BodyPublisher bodyPublisher = BodyPublishers.ofString("{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"title\": \"string\",\r\n"
				+ "  \"dueDate\": \"2022-01-06T18:46:37.804Z\",\r\n"
				+ "  \"completed\": true\r\n"
				+ "}");
		
		request = HttpRequest.newBuilder(uri).POST(bodyPublisher).header("Content-Type","application/json").build();
		response = http.send(request, BodyHandlers.ofLines());				
		System.out.println(response.statusCode());
		body = response.body();		
		body.forEach( a -> System.out.println(a));
		
	}

}
