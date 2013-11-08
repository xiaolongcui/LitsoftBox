package com.lenovobox.result;

import java.util.List;

public class LBMetadata {
	private int access_mode;
	private String action;
	private Object authable;
	private int bytes;
	private Object client_mtime;
	private List<Content> content;
	private int content_size;
	private Object creator;
	private Object delivery_code;
	private String hash;
	private boolean is_dir;
	private boolean is_shared;
	private String modified;
	private String path;
	private String request_id;
	private String size;
	private Object team;
	private Object team_id;
	private int total_size;

	public int getAccessMode() {
		return access_mode;
	}

	public void setAccessMode(int access_mode) {
		this.access_mode = access_mode;
	}

	public String getAction() {
              if (action==null) {
                  return "";
              }
              else{
                  return action;
              }
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Object getAuthable() {
		return authable;
	}

	public void setAuthable(Object authable) {
		this.authable = authable;
	}

	public int getBytes() {
		return bytes;
	}

	public void setBytes(int bytes) {
		this.bytes = bytes;
	}

	public Object getClientMtime() {
		return client_mtime;
	}

	public void setClientMtime(Object client_mtime) {
		this.client_mtime = client_mtime;
	}

	public List<Content> getContent() {
		return content;
	}

	public void setContent(List<Content> content) {
		this.content = content;
	}

	public int getContentSize() {
		return content_size;
	}

	public void setContentSize(int content_size) {
		this.content_size = content_size;
	}

	public Object getCreator() {
		return creator;
	}

	public void setCreator(Object creator) {
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

	public boolean getIsDir() {
		return is_dir;
	}

	public void setIsDir(boolean is_dir) {
		this.is_dir = is_dir;
	}

	public boolean getIsShared() {
		return is_shared;
	}

	public void setIsShared(boolean is_shared) {
		this.is_shared = is_shared;
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

	public String getRequestId() {
              if (request_id==null) {
                  return "";
              }
              else{
                  return request_id;
              }
	}

	public void setRequestId(String request_id) {
		this.request_id = request_id;
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

	public int getTotalSize() {
		return total_size;
	}

	public void setTotalSize(int total_size) {
		this.total_size = total_size;
	}
}
