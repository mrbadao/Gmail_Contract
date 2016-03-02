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
public class EventDto {
	private long eventId;
	private String eventTitle;
	private String eventDescription;
	private String eventDetail;
	private String eventLocation;
	private String eventAddress;
	private Date eventStartDate;
	private Date eventEndDate;
	private Date createdDate;
	private Date lastUpdate;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		EventDto eventDto = (EventDto) o;

		if (eventId != eventDto.eventId) return false;
		if (eventTitle != null ? !eventTitle.equals(eventDto.eventTitle) : eventDto.eventTitle != null) return false;
		if (eventDescription != null ? !eventDescription.equals(eventDto.eventDescription) : eventDto.eventDescription != null)
			return false;
		if (eventDetail != null ? !eventDetail.equals(eventDto.eventDetail) : eventDto.eventDetail != null)
			return false;
		if (eventStartDate != null ? !eventStartDate.equals(eventDto.eventStartDate) : eventDto.eventStartDate != null)
			return false;
		if (eventEndDate != null ? !eventEndDate.equals(eventDto.eventEndDate) : eventDto.eventEndDate != null)
			return false;
		if (eventLocation != null ? !eventLocation.equals(eventDto.eventLocation) : eventDto.eventLocation != null)
			return false;
		if (eventAddress != null ? !eventAddress.equals(eventDto.eventAddress) : eventDto.eventAddress != null)
			return false;
		if (createdDate != null ? !createdDate.equals(eventDto.createdDate) : eventDto.createdDate != null)
			return false;
		return !(lastUpdate != null ? !lastUpdate.equals(eventDto.lastUpdate) : eventDto.lastUpdate != null);

	}

	@Override
	public String toString() {
		return "EventDto{" +
				"eventId=" + eventId +
				", eventTitle='" + eventTitle + '\'' +
				", eventDescription='" + eventDescription + '\'' +
				", eventDetail='" + eventDetail + '\'' +
				", eventStartDate=" + eventStartDate +
				", eventEndDate=" + eventEndDate +
				", eventLocation='" + eventLocation + '\'' +
				", eventAddress='" + eventAddress + '\'' +
				", createdDate=" + createdDate +
				", lastUpdate=" + lastUpdate +
				'}';
	}

	@Override
	public int hashCode() {
		int result = (int) (eventId ^ (eventId >>> 32));
		result = 31 * result + (eventTitle != null ? eventTitle.hashCode() : 0);
		result = 31 * result + (eventDescription != null ? eventDescription.hashCode() : 0);
		result = 31 * result + (eventDetail != null ? eventDetail.hashCode() : 0);
		result = 31 * result + (eventStartDate != null ? eventStartDate.hashCode() : 0);
		result = 31 * result + (eventEndDate != null ? eventEndDate.hashCode() : 0);
		result = 31 * result + (eventLocation != null ? eventLocation.hashCode() : 0);
		result = 31 * result + (eventAddress != null ? eventAddress.hashCode() : 0);
		result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
		result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
		return result;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public String getEventDetail() {
		return eventDetail;
	}

	public void setEventDetail(String eventDetail) {
		this.eventDetail = eventDetail;
	}

	public Date getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(Date eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public Date getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(Date eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(String eventAddress) {
		this.eventAddress = eventAddress;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
