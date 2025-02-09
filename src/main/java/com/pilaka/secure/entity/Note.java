package com.pilaka.secure.entity;

import java.util.Set;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="note")
//@Data 
@Getter
@Setter
@ToString
public class Note {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Lob
	private String content;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private String ownerUserName;
	/**
	 * @return the ownerUserName
	 */
	public String getOwnerUserName() {
		return ownerUserName;
	}
	/**
	 * @param ownerUserName the ownerUserName to set
	 */
	public void setOwnerUserName(String ownerUserName) {
		this.ownerUserName = ownerUserName;
	}
	
	
	

}
