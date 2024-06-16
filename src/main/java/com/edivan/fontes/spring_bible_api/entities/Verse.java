package com.edivan.fontes.spring_bible_api.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "verse")
public class Verse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "version_id")
	private Long versionId;
	
	@Column(name = "testament_id")
	private Long testamentId;
	
	@Column(name = "book_id")
	private Long bookId;
	
	private Integer chapter;
	private Integer verse;	
	@Column(name = "text", length = 1024)
	private String text;
	
	public Verse() {
		
	}
	
	public Verse(Long id, Long versionId, Long testamentId, Long bookId, Integer chapter, Integer verse, String text) {
		super();
		this.id = id;
		this.versionId = versionId;
		this.testamentId = testamentId;
		this.bookId = bookId;
		this.chapter = chapter;
		this.verse = verse;
		this.text = text;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getVersionId() {
		return versionId;
	}

	public void setVersionId(Long versionId) {
		this.versionId = versionId;
	}

	public Long getTestamentId() {
		return testamentId;
	}

	public void setTestamentId(Long testamentId) {
		this.testamentId = testamentId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Integer getChapter() {
		return chapter;
	}

	public void setChapter(Integer chapter) {
		this.chapter = chapter;
	}

	public Integer getVerse() {
		return verse;
	}

	public void setVerse(Integer verse) {
		this.verse = verse;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
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
		Verse other = (Verse) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Verse [id=" + id + ", versionId=" + versionId + ", testamentId=" + testamentId + ", bookId=" + bookId
				+ ", chapter=" + chapter + ", verse=" + verse + ", text=" + text + "]";
	}
	
}
