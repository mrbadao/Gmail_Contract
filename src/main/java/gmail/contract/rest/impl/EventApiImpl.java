/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.rest.impl;

import gmail.contract.dto.DhtmlTreeDto;
import gmail.contract.dto.EventDto;
import gmail.contract.dto.SearchEventsConditionDto;
import gmail.contract.rest.EventApi;
import gmail.contract.service.EventService;
import gmail.contract.util.MultiValueMapUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MultivaluedMap;
import java.util.Date;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Component
public class EventApiImpl implements EventApi {
	static Logger log = Logger.getLogger(EventApiImpl.class);

	@Autowired
	private EventService eventService;

	@Override
	public EventDto getEvent(long eventId) {
		final EventDto eventDto = eventService.getEventById(eventId);
		return eventDto;
	}

	@Override
	public DhtmlTreeDto getDhtmlEventTree() {
		return eventService.getEventDhtmlxTree();
	}

	@Override
	public DhtmlTreeDto searchDhtmlEventTree(MultivaluedMap<String, String> formData) {
		log.info(formData);
		final SearchEventsConditionDto searchEventsConditionDto = MultiValueMapUtil.convertToDto(SearchEventsConditionDto.class, formData);
		log.info(searchEventsConditionDto);
		return null;
	}

	@Override
	public EventDto insertEvent(MultivaluedMap<String, String> frmEvent) {
		final EventDto eventDto = MultiValueMapUtil.convertToDto(EventDto.class, frmEvent);
		eventDto.setCreatedDate(new Date());
		eventDto.setLastUpdate(eventDto.getCreatedDate());
		eventService.createEvent(eventDto);
		return eventDto;
	}
}
