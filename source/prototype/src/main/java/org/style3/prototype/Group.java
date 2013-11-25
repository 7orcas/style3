package org.style3.prototype;

import org.style3.app.anno.Field;
import org.style3.app.ent.Entity;


public class Group extends Entity{

	@Field (label="code") 
	public String code;
	
	@Field (label="desc")
	private String desx;
	
	@Field (label="lang", export=false)
	private String lng;
	
	public Group(Long id) {
		super(id, 1);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesx() {
		return desx;
	}

	public void setDesx(String desx) {
		this.desx = desx;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	
		
}
