package com.tocarrot.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private int userId;
	private String userName;
	private String password;
	private int credits;
	private String lastIp;
	private Date lastVisit;
	
	public void setUserId( int userId )
	{
		this.userId = userId;
	}
	public int getUserId()
	{
		return this.userId;
	}
	
	public void setUserName( String userName )
	{
		this.userName = userName;
	}
	public String getUserName()
	{
		return this.userName;
	}
	
	public void setPassWord( String password )
	{
		this.password = password;
	}
	public String getPassword()
	{
		return this.password;
	}
	
	public void setCredits( int credits )
	{
		this.credits = credits;
	}
	public int getCredits()
	{
		return this.credits;
	}
	
	public void setLastIp( String lastIp )
	{
		this.lastIp = lastIp;
	}
	public String getLastIp()
	{
		return this.lastIp;
	}
	
	public void setLastVisit( Date lastVisit )
	{
		this.lastVisit = lastVisit;
	}
	public Date getLastVisit()
	{
		return this.lastVisit;
	}
}
