package com.bean.retail;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location {
	@Id
	@Column(name="locnid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int locnId;
	@Column(name="name")
	private String locationName;
	public int getLocnId() {
		return locnId;
	}
	public void setLocnId(int locnId) {
		this.locnId = locnId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	@Override
	public String toString() {
		return "Location [locnId=" + locnId + ", locationName=" + locationName
				+ "]";
	}

}
