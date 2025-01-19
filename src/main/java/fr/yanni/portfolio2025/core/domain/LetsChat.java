package fr.yanni.portfolio2025.core.domain;

import org.springframework.web.bind.annotation.CrossOrigin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a construction quote entity.
 */
@Entity
@Table(name = ("letschat"))
@CrossOrigin
public class LetsChat {
	/** Unique ID of a construction quote. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Short id;

	/** User ID of the user placing the construction quote. */
	@Column(name = "name")
	private String name;

	/** Date of the construction quote. */
	@Column(name = "email")
	private String email;

	/** Budget for the construction quote. */
	@Column(name = "message")
	private String message;

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

	public LetsChat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LetsChat(Short id, String name, String email, String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.message = message;
	}

	@Override
	public String toString() {
		return "LetsChat [id=" + id + ", name=" + name + ", email=" + email + ", message=" + message + "]";
	}
}

	