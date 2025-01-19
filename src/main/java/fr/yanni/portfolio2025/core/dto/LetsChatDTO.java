package fr.yanni.portfolio2025.core.dto;



/**
 * Represents a construction quote entity.
 */

public class LetsChatDTO {
	/** Unique ID of a construction quote. */
	
	private Short id;

	
	public Short getId() {
		return id;
	}


	public void setId(Short id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	private String name;

	private String email;

	
	private String message;


	public LetsChatDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public LetsChatDTO(Short id, String name, String email, String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.message = message;
	}
	
}

