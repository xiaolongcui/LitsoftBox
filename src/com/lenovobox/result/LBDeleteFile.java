package com.lenovobox.result;

import java.util.List;

public class LBDeleteFile {
	private Object access_mode;
	private Object action;
	private int bytes;
	private Object client_mtime;
	private String creator;
	private Object delivery_code;
	private boolean has_more_version;
	private String hash;
	private boolean is_deleted;
	private boolean is_dir;
	private boolean is_shared;
	private String lpath;
	private String mime_type;
	private String modified;
	private String nsid;
	private String path;
	private String rev;
	private String seed;
	private String size;
	private boolean thumb_exist;

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

	public boolean getHasMoreVersion() {
		return has_more_version;
	}

	public void setHasMoreVersion(boolean has_more_version) {
		this.has_more_version = has_more_version;
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

	public boolean getIsShared() {
		return is_shared;
	}

	public void setIsShared(boolean is_shared) {
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

	public String getMimeType() {
              if (mime_type==null) {
                  return "";
              }
              else{
                  return mime_type;
              }
	}

	public void setMimeType(String mime_type) {
		this.mime_type = mime_type;
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

	public String getRev() {
              if (rev==null) {
                  return "";
              }
              else{
                  return rev;
              }
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

	public String getSeed() {
              if (seed==null) {
                  return "";
              }
              else{
                  return seed;
              }
	}

	public void setSeed(String seed) {
		this.seed = seed;
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

	public boolean getThumbExist() {
		return thumb_exist;
	}

	public void setThumbExist(boolean thumb_exist) {
		this.thumb_exist = thumb_exist;
	}
}
