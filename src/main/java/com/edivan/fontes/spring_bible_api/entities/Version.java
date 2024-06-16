package com.edivan.fontes.spring_bible_api.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "version")
public class Version implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String abbreviation;
	private Integer year;
	private String publisher;
	@Column(name = "number_of_verses")
	private Integer numberOfVerses;
	
	public Version() {
		
	}

	public Version(Long id, String name, String abbreviation, Integer year, String publisher, Integer numberOfVerse) {
		super();
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
		this.year = year;
		this.publisher = publisher;
		this.numberOfVerses = numberOfVerse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getNumberOfVerse() {
		return numberOfVerses;
	}

	public void setNumberOfVerse(Integer numberOfVerse) {
		this.numberOfVerses = numberOfVerse;
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
		Version other = (Version) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Version [id=" + id + ", name=" + name + ", abbreviation=" + abbreviation + ", year=" + year
				+ ", publisher=" + publisher + ", numberOfVerse=" + numberOfVerses + "]";
	}
	
}
