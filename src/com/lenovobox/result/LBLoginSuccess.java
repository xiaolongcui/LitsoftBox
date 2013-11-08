package com.lenovobox.result;

public class LBLoginSuccess {
	private String location;
	private Object account_id;
	private String ctime;
	private String email;
	private boolean email_chk;
	private String mobile;
	private boolean mobile_chk;
	private String password_changeable;
	private String photo;
	private long quota;
	private int status;
	private String uid;
	private int used;
	private String user_name;
	private String user_slug;
	private String session_id;
	private Object AT;

	public String getLocation() {
              if (location==null) {
                  return "";
              }
              else{
                  return location;
              }
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Object getAccountId() {
		return account_id;
	}

	public void setAccountId(Object account_id) {
		this.account_id = account_id;
	}

	public String getCtime() {
              if (ctime==null) {
                  return "";
              }
              else{
                  return ctime;
              }
	}

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getEmail() {
              if (email==null) {
                  return "";
              }
              else{
                  return email;
              }
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean getEmailChk() {
		return email_chk;
	}

	public void setEmailChk(boolean email_chk) {
		this.email_chk = email_chk;
	}

	public String getMobile() {
              if (mobile==null) {
                  return "";
              }
              else{
                  return mobile;
              }
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public boolean getMobileChk() {
		return mobile_chk;
	}

	public void setMobileChk(boolean mobile_chk) {
		this.mobile_chk = mobile_chk;
	}

	public String getPasswordChangeable() {
              if (password_changeable==null) {
                  return "";
              }
              else{
                  return password_changeable;
              }
	}

	public void setPasswordChangeable(String password_changeable) {
		this.password_changeable = password_changeable;
	}

	public String getPhoto() {
              if (photo==null) {
                  return "";
              }
              else{
                  return photo;
              }
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public long getQuota() {
		return quota;
	}

	public void setQuota(long quota) {
		this.quota = quota;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUid() {
              if (uid==null) {
                  return "";
              }
              else{
                  return uid;
              }
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public int getUsed() {
		return used;
	}

	public void setUsed(int used) {
		this.used = used;
	}

	public String getUserName() {
              if (user_name==null) {
                  return "";
              }
              else{
                  return user_name;
              }
	}

	public void setUserName(String user_name) {
		this.user_name = user_name;
	}

	public String getUserSlug() {
              if (user_slug==null) {
                  return "";
              }
              else{
                  return user_slug;
              }
	}

	public void setUserSlug(String user_slug) {
		this.user_slug = user_slug;
	}

	public String getXLENOVOSESSID() {
              if (session_id==null) {
                  return "";
              }
              else{
                  return session_id;
              }
	}

	public void setXLENOVOSESSID(String session_id) {
		this.session_id = session_id;
	}

	public Object getAT() {
		return AT;
	}

	public void setAT(Object AT) {
		this.AT = AT;
	}
}
