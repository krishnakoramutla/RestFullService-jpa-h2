package com.app.Exception;

import java.util.Date;

public class MyCustomExceptionResponse {
	private Date timeStamp;
	private String message;
	private String detais;
	public MyCustomExceptionResponse() {}
	public MyCustomExceptionResponse(Date timeStamp, String message, String detais) {
		this.timeStamp = timeStamp;
		this.message = message;
		this.detais = detais;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetais() {
		return detais;
	}
	public void setDetais(String detais) {
		this.detais = detais;
	}
	@Override
	public String toString() {
		return "MyCustomExceptionResponse [timeStamp=" + timeStamp + ", message=" + message + ", detais=" + detais
				+ "]";
	}
	
	

}
