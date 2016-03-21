package gmail.contract.dto;

/**
 * Created by hieunc on 21/03/2016.
 *
 * @Description:
 */
public class SearchEventsConditionDto {
	private String eventTitle;
	private int eventLocation;
	private int eventAddress;
	private String eventStartDate;
	private String eventEndDate;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		SearchEventsConditionDto that = (SearchEventsConditionDto) o;

		if (eventLocation != that.eventLocation) return false;
		if (eventAddress != that.eventAddress) return false;
		if (eventTitle != null ? !eventTitle.equals(that.eventTitle) : that.eventTitle != null) return false;
		if (eventStartDate != null ? !eventStartDate.equals(that.eventStartDate) : that.eventStartDate != null)
			return false;
		return !(eventEndDate != null ? !eventEndDate.equals(that.eventEndDate) : that.eventEndDate != null);

	}

	@Override
	public int hashCode() {
		int result = eventTitle != null ? eventTitle.hashCode() : 0;
		result = 31 * result + eventLocation;
		result = 31 * result + eventAddress;
		result = 31 * result + (eventStartDate != null ? eventStartDate.hashCode() : 0);
		result = 31 * result + (eventEndDate != null ? eventEndDate.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "SearchEventsConditionDto{" +
				"eventTitle='" + eventTitle + '\'' +
				", eventLocation=" + eventLocation +
				", eventAddress=" + eventAddress +
				", eventStartDate=" + eventStartDate +
				", eventEndDate=" + eventEndDate +
				'}';
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public int getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(int eventLocation) {
		this.eventLocation = eventLocation;
	}

	public int getEventAddress() {
		return eventAddress;
	}

	public void setEventAddress(int eventAddress) {
		this.eventAddress = eventAddress;
	}

	public String getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(String eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public String getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(String eventEndDate) {
		this.eventEndDate = eventEndDate;
	}
}
