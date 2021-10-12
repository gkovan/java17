package com.gk.java17.records;

import java.util.Objects;

public class OldDataRecord {

	public OldDataRecord(OldRecordId id, Long timeStamp, String data) {
		super();
		this.id = id;
		this.timeStamp = timeStamp;
		this.data = data;
	}
	private OldRecordId id;
	private Long timeStamp; 
	private String data;
	
	public OldRecordId getId() {
		return id;
	}
	public void setId(OldRecordId id) {
		this.id = id;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public int hashCode() {
		return Objects.hash(data, id, timeStamp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OldDataRecord other = (OldDataRecord) obj;
		return Objects.equals(data, other.data) && Objects.equals(id, other.id)
				&& Objects.equals(timeStamp, other.timeStamp);
	}
	@Override
	public String toString() {
		return "OldDataRecord [id=" + id + ", timeStamp=" + timeStamp + ", data=" + data + "]";
	}
}
