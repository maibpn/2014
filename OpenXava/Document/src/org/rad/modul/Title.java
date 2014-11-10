package org.rad.modul;

import javax.persistence.*;

@Entity
public class Title {
	@Id@Column
	private String text;
		
	@Column@Enumerated(EnumType.STRING)
	private Language language;
	
	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString(){ return text.toString();}
}
