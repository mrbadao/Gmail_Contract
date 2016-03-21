/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.dto;

import java.util.Date;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public class UserDto {
	private int userId;
	private String loginEmail;
	private String loginPwd;
	private String fullName;
	private String firstName;
	private String smtpServer;
	private int smtpPort;
	private String imapServer;
	private int imapPort;
	private float timezone;
	private Date created;
	private Date last_update_date;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		UserDto userDto = (UserDto) o;

		if (userId != userDto.userId) return false;
		if (smtpPort != userDto.smtpPort) return false;
		if (imapPort != userDto.imapPort) return false;
		if (Float.compare(userDto.timezone, timezone) != 0) return false;
		if (loginEmail != null ? !loginEmail.equals(userDto.loginEmail) : userDto.loginEmail != null) return false;
		if (loginPwd != null ? !loginPwd.equals(userDto.loginPwd) : userDto.loginPwd != null) return false;
		if (fullName != null ? !fullName.equals(userDto.fullName) : userDto.fullName != null) return false;
		if (firstName != null ? !firstName.equals(userDto.firstName) : userDto.firstName != null) return false;
		if (smtpServer != null ? !smtpServer.equals(userDto.smtpServer) : userDto.smtpServer != null) return false;
		if (imapServer != null ? !imapServer.equals(userDto.imapServer) : userDto.imapServer != null) return false;
		if (created != null ? !created.equals(userDto.created) : userDto.created != null) return false;
		return !(last_update_date != null ? !last_update_date.equals(userDto.last_update_date) : userDto.last_update_date != null);

	}

	@Override
	public int hashCode() {
		int result = userId;
		result = 31 * result + (loginEmail != null ? loginEmail.hashCode() : 0);
		result = 31 * result + (loginPwd != null ? loginPwd.hashCode() : 0);
		result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (smtpServer != null ? smtpServer.hashCode() : 0);
		result = 31 * result + smtpPort;
		result = 31 * result + (imapServer != null ? imapServer.hashCode() : 0);
		result = 31 * result + imapPort;
		result = 31 * result + (timezone != +0.0f ? Float.floatToIntBits(timezone) : 0);
		result = 31 * result + (created != null ? created.hashCode() : 0);
		result = 31 * result + (last_update_date != null ? last_update_date.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "UserDto{" +
				"userId=" + userId +
				", loginEmail='" + loginEmail + '\'' +
				", loginPwd='" + loginPwd + '\'' +
				", fullName='" + fullName + '\'' +
				", firstName='" + firstName + '\'' +
				", smtpServer='" + smtpServer + '\'' +
				", smtpPort=" + smtpPort +
				", imapServer='" + imapServer + '\'' +
				", imapPort=" + imapPort +
				", timezone=" + timezone +
				", created=" + created +
				", last_update_date=" + last_update_date +
				'}';
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSmtpServer() {
		return smtpServer;
	}

	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}

	public int getSmtpPort() {
		return smtpPort;
	}

	public void setSmtpPort(int smtpPort) {
		this.smtpPort = smtpPort;
	}

	public String getImapServer() {
		return imapServer;
	}

	public void setImapServer(String imapServer) {
		this.imapServer = imapServer;
	}

	public int getImapPort() {
		return imapPort;
	}

	public void setImapPort(int imapPort) {
		this.imapPort = imapPort;
	}

	public float getTimezone() {
		return timezone;
	}

	public void setTimezone(float timezone) {
		this.timezone = timezone;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLast_update_date() {
		return last_update_date;
	}

	public void setLast_update_date(Date last_update_date) {
		this.last_update_date = last_update_date;
	}
}
