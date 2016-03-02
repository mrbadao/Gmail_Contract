/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.service.impl;

import gmail.contract.dao.EventMapper;
import gmail.contract.dto.EventDto;
import gmail.contract.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
