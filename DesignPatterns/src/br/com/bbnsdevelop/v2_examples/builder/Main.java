package br.com.bbnsdevelop.v2_examples.builder;

public class Main {

	public static void main(String[] args) {

		HttpClient httpClient = new HttpClient.HttpClientBuilder()
				.method("POST").url("http://test.com").body("{}")
				.secure("", "").headers("Content-Type: application/json").build();
		
		System.out.println(httpClient);
	}

}
