package br.com.bbnsdevelop.v2_examples.builder;

public class HttpClient {

	private String method;
	private String url;
	private String userName;
	private String passowrd;
	private String headers;
	private String body;

	public HttpClient(HttpClientBuilder builder) {
		this.method = builder.method;
		this.url = builder.url;
		this.userName = builder.userName;
		this.passowrd = builder.passowrd;
		this.headers = builder.headers;
		this.body = builder.body;
	}
	
	
	public static class HttpClientBuilder{
		
		private String method;
		private String url;
		private String userName;
		private String passowrd;
		private String headers;
		private String body;

		
		public HttpClientBuilder method(String method) {
			this.method = method;
			return this;			
		}
		
		public HttpClientBuilder url(String url) {
			this.url = url;
			return this;			
		}
		
		public HttpClientBuilder secure(String userName, String passowrd) {
			this.userName = userName;
			this.passowrd = passowrd;
			return this;			
		}
		
		public HttpClientBuilder headers(String headers) {
			this.headers = headers;
			return this;			
		}
		
		public HttpClientBuilder body(String body) {
			this.body = body;
			return this;			
		}
		
		public HttpClient build() {
			return new HttpClient(this);
		}
		
	}
	
	

	public String getMethod() {
		return method;
	}


	public String getUrl() {
		return url;
	}


	public String getUserName() {
		return userName;
	}


	public String getPassowrd() {
		return passowrd;
	}


	public String getHeaders() {
		return headers;
	}


	public String getBody() {
		return body;
	}


	@Override
	public String toString() {
		return "HttpClient [method=" + method + ", url=" + url + ", userName=" + userName + ", passowrd=" + passowrd
				+ ", headers=" + headers + ", body=" + body + "]";
	}
	
	
	

}
