package com.lenovobox.result;

public class LBLoginError {
	private String type;
	private int state;
	private String code;
	private String message;
	private String request_id;

	public String getType() {
              if (type==null) {
                  return "";
              }
              else{
                  return type;
              }
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getCode() {
              if (code==null) {
                  return "";
              }
              else{
                  return code;
              }
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
              if (message==null) {
                  return "";
              }
              else{
                  return message;
              }
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
              if (request_id==null) {
                  return "";
              }
              else{
                  return request_id;
              }
	}

	public void setRequestId(String request_id) {
		this.request_id = request_id;
	}
}
