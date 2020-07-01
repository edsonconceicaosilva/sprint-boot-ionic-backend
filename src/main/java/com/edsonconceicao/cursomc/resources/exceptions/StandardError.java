package com.edsonconceicao.cursomc.resources.exceptions;

public class StandardError {
	private Integer status;
	private String msg;
	private Long timestamp;
	
	public StandardError()
	{
	
	}

	
	
	public StandardError(Integer status, String msg, Long timestamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timestamp = timestamp;
	}



	public StandardError(int status2, String message, long currentTimeMillis) {
		// TODO Auto-generated constructor stub
		super();
		this.status = status2;
		this.msg = message;
		this.timestamp = currentTimeMillis;		
	}



	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	
	
	
}
