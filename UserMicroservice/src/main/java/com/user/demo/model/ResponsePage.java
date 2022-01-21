package com.user.demo.model;

public class ResponsePage {
	/**
	 * @see this class is representing data of message and their getter setter
	 * @author Vishal Bharti
	 * @since 03-Jan-2022
	 */
	private Messages message;
	private String description;

	public ResponsePage() {
		// TODO Auto-generated constructor stub
	}

	public ResponsePage(Messages message, String description) {
		super();
		this.message = message;
		this.description = description;
	}

	public Messages getMessage() {
		return message;
	}

	public void setMessage(Messages message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ResponsePage [message=" + message + ", description=" + description + "]";
	}

}
