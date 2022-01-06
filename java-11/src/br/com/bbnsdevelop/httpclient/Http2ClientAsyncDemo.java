package br.com.bbnsdevelop.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;


public class Http2ClientAsyncDemo {
	
	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {
		HttpClient http = HttpClient.newHttpClient();
		
		URI uri = new URI("http://fakerestapi.azurewebsites.net/api/v1/Activities");
				
		HttpRequest request = HttpRequest.newBuilder(uri).GET().build();		
		
		CompletableFuture<HttpResponse<Stream<String>>> response = http.sendAsync(request, BodyHandlers.ofLines());
		
		
		Stream<String> stream = response.thenApply(HttpResponse::body).get();
		
		
		stream.forEach( a -> System.out.println(a));
		
		
		
		
		
		
	}

}
