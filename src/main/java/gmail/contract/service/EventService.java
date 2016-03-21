/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.service;

import gmail.contract.dto.DhtmlTreeDto;
import gmail.contract.dto.EventDto;

import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public interface EventService {
	public EventDto getEventById(long eventID);

	public int createEvent(EventDto eventDto);

	public List<String> getYearHaveEvent();

	public List<String> getMonthsHaveEventByYear(String year);

	public List<EventDto> getEventsByYearMonth(String year, String month);

	public DhtmlTreeDto getEventDhtmlxTree();

}
