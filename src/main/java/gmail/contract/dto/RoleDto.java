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
public class RoleDto {
	private int roleId;
	private String roleName;
	private String roleDescription;
	private Date created;
	private Date last_update_date;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		RoleDto roleDto = (RoleDto) o;

		if (roleId != roleDto.roleId) return false;
		if (roleName != null ? !roleName.equals(roleDto.roleName) : roleDto.roleName != null) return false;
		if (roleDescription != null ? !roleDescription.equals(roleDto.roleDescription) : roleDto.roleDescription != null)
			return false;
		if (created != null ? !created.equals(roleDto.created) : roleDto.created != null) return false;
		return !(last_update_date != null ? !last_update_date.equals(roleDto.last_update_date) : roleDto.last_update_date != null);

	}

	@Override
	public int hashCode() {
		int result = roleId;
		result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
		result = 31 * result + (roleDescription != null ? roleDescription.hashCode() : 0);
		result = 31 * result + (created != null ? created.hashCode() : 0);
		result = 31 * result + (last_update_date != null ? last_update_date.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "RoleDto{" +
				"roleId=" + roleId +
				", roleName='" + roleName + '\'' +
				", roleDescription='" + roleDescription + '\'' +
				", created=" + created +
				", last_update_date=" + last_update_date +
				'}';
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
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
