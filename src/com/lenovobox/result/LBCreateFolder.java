package com.lenovobox.result;

public class LBCreateFolder {
	private Object access_mode;
	private Object action;
	private Object authable;
	private Object bytes;
	private Object client_mtime;
	private String creator;
	private Object delivery_code;
	private String hash;
	private boolean is_deleted;
	private boolean is_dir;
	private Object is_shared;
	private String lpath;
	private String modified;
	private String nsid;
	private String path;
	private String size;
	private Object team;
	private Object team_id;

	public Object getAccessMode() {
		return access_mode;
	}

	public void setAccessMode(Object access_mode) {
		this.access_mode = access_mode;
	}

	public Object getAction() {
		return action;
	}

	public void setAction(Object action) {
		this.action = action;
	}

	public Object getAuthable() {
		return authable;
	}

	public void setAuthable(Object authable) {
		this.authable = authable;
	}

	public Object getBytes() {
		return bytes;
	}

	public void setBytes(Object bytes) {
		this.bytes = bytes;
	}

	public Object getClientMtime() {
		return client_mtime;
	}

	public void setClientMtime(Object client_mtime) {
		this.client_mtime = client_mtime;
	}

	public String getCreator() {
              if (creator==null) {
                  return "";
              }
              else{
                  return creator;
              }
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Object getDeliveryCode() {
		return delivery_code;
	}

	public void setDeliveryCode(Object delivery_code) {
		this.delivery_code = delivery_code;
	}

	public String getHash() {
              if (hash==null) {
                  return "";
              }
              else{
                  return hash;
              }
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public boolean getIsDeleted() {
		return is_deleted;
	}

	public void setIsDeleted(boolean is_deleted) {
		this.is_deleted = is_deleted;
	}

	public boolean getIsDir() {
		return is_dir;
	}

	public void setIsDir(boolean is_dir) {
		this.is_dir = is_dir;
	}

	public Object getIsShared() {
		return is_shared;
	}

	public void setIsShared(Object is_shared) {
		this.is_shared = is_shared;
	}

	public String getLpath() {
              if (lpath==null) {
                  return "";
              }
              else{
                  return lpath;
              }
	}

	public void setLpath(String lpath) {
		this.lpath = lpath;
	}

	public String getModified() {
              if (modified==null) {
                  return "";
              }
              else{
                  return modified;
              }
	}

	public void setModified(String modified) {
		this.modified = modified;
	}

	public String getNsid() {
              if (nsid==null) {
                  return "";
              }
              else{
                  return nsid;
              }
	}

	public void setNsid(String nsid) {
		this.nsid = nsid;
	}

	public String getPath() {
              if (path==null) {
                  return "";
              }
              else{
                  return path;
              }
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSize() {
              if (size==null) {
                  return "";
              }
              else{
                  return size;
              }
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Object getTeam() {
		return team;
	}

	public void setTeam(Object team) {
		this.team = team;
	}

	public Object getTeamId() {
		return team_id;
	}

	public void setTeamId(Object team_id) {
		this.team_id = team_id;
	}
}
