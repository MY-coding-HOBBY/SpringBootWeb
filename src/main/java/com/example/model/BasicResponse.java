package com.example.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

//use lombok later
public class BasicResponse {

	private int code;
	private String data;
	private String message;
	private boolean success;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
