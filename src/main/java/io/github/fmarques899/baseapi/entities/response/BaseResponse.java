package io.github.fmarques899.baseapi.entities.response;

public class BaseResponse {

	private Object headers;
	private Object data;
	private Object messages;

	public Object getHeaders() {
		return headers;
	}

	public void setHeaders(Object headers) {
		this.headers = headers;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getMessages() {
		return messages;
	}

	public void setMessages(Object messages) {
		this.messages = messages;
	}

}
