package rainbow.example.domain;

import java.util.Date;

/**
 * Loginuser entity. @author MyEclipse Persistence Tools
 */

public class Loginuser implements java.io.Serializable {

	// Fields

	private Integer id;
	private Date date;
	private String username;

	// Constructors

	/** default constructor */
	public Loginuser() {
	}

	/** full constructor */
	public Loginuser(Date date, String username) {
		this.date = date;
		this.username = username;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}