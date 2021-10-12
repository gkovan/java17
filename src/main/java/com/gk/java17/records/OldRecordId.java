package com.gk.java17.records;

import java.util.Objects;

public class OldRecordId {

	public OldRecordId(String id) {
		super();
		this.id = id;
	}

	private String id;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OldRecordId other = (OldRecordId) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "OldRecordId [id=" + id + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
