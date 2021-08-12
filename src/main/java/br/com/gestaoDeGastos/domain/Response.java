package br.com.gestaoDeGastos.domain;

public class Response {
	
	private Long statusCode;
	private String message;
	private Object data;
	
	public Response(long statusCode, String message, Object data) {
		this.statusCode = statusCode;
		this.message = message;
		this.data = data;
	}

	public Long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}