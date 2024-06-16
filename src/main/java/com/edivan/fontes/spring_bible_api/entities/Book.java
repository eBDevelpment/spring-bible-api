package com.edivan.fontes.spring_bible_api.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "testament_id")
	private Long testamentId;

	private String name;
	private String abbreviation;
	private Integer caps;

	public Book() {
	
	}

	public Book(Long id, Long testamentId, String name, String abbreviation, Integer caps) {
		super();
		this.id = id;
		this.testamentId = testamentId;
		this.name = name;
		this.abbreviation = abbreviation;
		this.caps = caps;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getTestamentId() {
		return testamentId;
	}

	public void setTestamentId(Long testamentId) {
		this.testamentId = testamentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Integer getCaps() {
		return caps;
	}

	public void setCaps(Integer caps) {
		this.caps = caps;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", testamentId=" + testamentId + ", name=" + name + ", abbreviation=" + abbreviation
				+ ", caps=" + caps + "]";
	}

}
