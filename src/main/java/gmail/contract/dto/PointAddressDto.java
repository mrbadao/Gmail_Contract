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
public class PointAddressDto {
	private long pointId;
	private long locationId;
	private String pointAddress;
	private Date createdDate;
	private Date lastUpdated;

	public long getPointId() {
		return pointId;
	}

	public void setPointId(long pointId) {
		this.pointId = pointId;
	}

	public long getLocationId() {
		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public String getPointAddress() {
		return pointAddress;
	}

	public void setPointAddress(String pointAddress) {
		this.pointAddress = pointAddress;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		PointAddressDto that = (PointAddressDto) o;

		if (pointId != that.pointId) return false;
		if (locationId != that.locationId) return false;
		if (pointAddress != null ? !pointAddress.equals(that.pointAddress) : that.pointAddress != null) return false;
		if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
		return !(lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null);

	}

	@Override
	public int hashCode() {
		int result = (int) (pointId ^ (pointId >>> 32));
		result = 31 * result + (int) (locationId ^ (locationId >>> 32));
		result = 31 * result + (pointAddress != null ? pointAddress.hashCode() : 0);
		result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
		result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "PointAddressDto{" +
				"pointId=" + pointId +
				", locationId=" + locationId +
				", pointAddress='" + pointAddress + '\'' +
				", createdDate=" + createdDate +
				", lastUpdated=" + lastUpdated +
				'}';
	}
}
