package com.bean.retail;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", rating=" + rating + ", locnId=" + location.getLocnId() + "]";
	}
	@Id
	@Column(name="userID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	@Column(name="userName")
	private String userName;
	@Column(name="rating")
	private int rating;
	@ManyToOne(cascade = CascadeType.ALL)
	private Location location;
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
