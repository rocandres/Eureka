package com.caller.reponse;

import java.io.Serializable;

public class ResponseCda<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String status;
	private String code;
	private String message;
	private String port;
	private T data;
	
	public ResponseCda(String status, String code, String message,String port, T data) {
		this.status = status;
		this.code = code;
		this.message = message;
		this.data = data;
		this.port=port;
	}
	
	public ResponseCda(String status, String code, String message) {
		this.status = status;
		this.code = code;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
	
	

}
