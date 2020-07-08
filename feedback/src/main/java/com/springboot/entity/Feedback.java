package com.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {
	
	@Id @GeneratedValue
	private int id;
	private String name;
//	@Column(name="organization")
	private String org;
	private String country;
	private String email;
//	@Column(name="professor")
	private String prof;
	private String rating;
	private String comments;
	
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", org=" + org + ", country=" + country + ", email=" + email
				+ ", prof=" + prof + ", rating=" + rating + ", comments=" + comments + "]";
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Feedback(String name, String org, String country, String email, String prof, String rating,
			String comments) {
		super();
		this.name = name;
		this.org = org;
		this.country = country;
		this.email = email;
		this.prof = prof;
		this.rating = rating;
		this.comments = comments;
	}
	
}
