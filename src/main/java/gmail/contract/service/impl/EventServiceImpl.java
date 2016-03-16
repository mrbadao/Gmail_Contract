/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.service.impl;

import gmail.contract.dao.EventMapper;
import gmail.contract.dto.EventDto;
import gmail.contract.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Service
public class EventServiceImpl implements EventService {
	@Autowired
	private EventMapper eventMapper;

	@Override
	public EventDto getEventById(long eventID) {
		return eventMapper.findEventById(eventID);
	}

	@Override
	public int createEvent(EventDto eventDto) {
		return eventMapper.insertEvent(eventDto);
	}

	@Override
	public List<String> getYearHaveEvent() {
		return eventMapper.getYearHaveEvent();
	}

	@Override
	public List<String> getMonthsHaveEventByYear(String year) {
		return eventMapper.getMonthsHaveEventByYear(year);
	}

	@Override
	public List<EventDto> getEventsByYearMonth(String year, String month) {
		return eventMapper.getEventsByYearMonth(year, month);
	}
}
