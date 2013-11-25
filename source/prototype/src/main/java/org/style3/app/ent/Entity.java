package org.style3.app.ent;

import java.util.Date;

import org.style3.app.anno.Field;


public class Entity {

	private Long id;
	@Field (label="compnr")
	private Integer comp_nr;
	private Boolean active;
	private Boolean valid;
	private Date lastUpdate;
	private String userid;

	public Entity(Long id, Integer comp_nr) {
		this.id = id;
		this.comp_nr = comp_nr;
		active = true;
		valid = true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getComp_nr() {
		return comp_nr;
	}

	public void setComp_nr(Integer comp_nr) {
		this.comp_nr = comp_nr;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
	
	
	
}
