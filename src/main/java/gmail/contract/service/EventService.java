/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.service;

import gmail.contract.dto.DhtmlTreeDto;
import gmail.contract.dto.EventDto;
import gmail.contract.dto.SearchEventsConditionDto;

import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public interface EventService {
	public EventDto getEventById(long eventID);

	public int createEvent(EventDto eventDto);

	public List<String> getYearHaveEvent(SearchEventsConditionDto searchEventsConditionDto);

	public List<String> getMonthsHaveEventByYear(String year, SearchEventsConditionDto searchEventsConditionDto);

	public List<EventDto> getEventsByYearMonth(String year, String month, SearchEventsConditionDto searchEventsConditionDto);

	public DhtmlTreeDto getEventDhtmlxTree(SearchEventsConditionDto searchEventsConditionDto);

}
