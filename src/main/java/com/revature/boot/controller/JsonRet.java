package com.revature.boot.controller;

public class JsonRet {
private String message;

public JsonRet(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}


}
