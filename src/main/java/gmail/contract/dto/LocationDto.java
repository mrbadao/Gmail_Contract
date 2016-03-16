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
public class LocationDto {
	private long locationId;
	private String locationName;
	private Date createdDate;
	private Date lastUpdated;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		LocationDto that = (LocationDto) o;

		if (locationId != that.locationId) return false;
		if (locationName != null ? !locationName.equals(that.locationName) : that.locationName != null) return false;
		if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
		return !(lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null);

	}

	@Override
	public int hashCode() {
		int result = (int) (locationId ^ (locationId >>> 32));
		result = 31 * result + (locationName != null ? locationName.hashCode() : 0);
		result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
		result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "LocationDto{" +
				"locationId=" + locationId +
				", locationName='" + locationName + '\'' +
				", createdDate=" + createdDate +
				", lastUpdated=" + lastUpdated +
				'}';
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
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

	public long getLocationId() {

		return locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}
}
