package damo.pojo;

import java.io.Serializable;

public class PunchClockBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userCode;
	private String businessData;
	private String closingTime;
	private String duration;

	public PunchClockBean() {
	}

	public PunchClockBean(String userCode, String businessData, String closingTime, String duration) {
		this.userCode = userCode;
		this.businessData = businessData;
		this.closingTime = closingTime;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "PunchClockBean [userCode=" + userCode + ", businessData=" + businessData + ", closingTime="
				+ closingTime + ", duration=" + duration + "]";
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getBusinessData() {
		return businessData;
	}

	public void setBusinessData(String businessData) {
		this.businessData = businessData;
	}

	public String getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(String closingTime) {
		this.closingTime = closingTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}