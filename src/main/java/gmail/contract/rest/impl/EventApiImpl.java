/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.rest.impl;

import gmail.contract.dto.DhtmlTreeDto;
import gmail.contract.dto.EventDto;
import gmail.contract.rest.EventApi;
import gmail.contract.service.EventService;
import gmail.contract.util.MultiValueMapUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MultivaluedMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Component
public class EventApiImpl implements EventApi {
	static Logger log = Logger.getLogger(EventApiImpl.class);
	static final List<String> EventUserList = Collections.unmodifiableList(Arrays.asList("user.png", "user.png", "user.png"));
	static final List<String> EventImgList = Collections.unmodifiableList(Arrays.asList("event.png", "event.png", "event.png"));
	static final List<String> MontYearImgList = Collections.unmodifiableList(Arrays.asList("folderOpen.gif", "folderOpen.gif", "folderOpen.gif"));
	static final List<String> EventEntryImgList = Collections.unmodifiableList(Arrays.asList("leaf.gif", "leaf.gif", "leaf.gif"));

	@Autowired
	private EventService eventService;

	@Override
	public EventDto getEvent(long eventId) {
		final EventDto eventDto = eventService.getEventById(eventId);
		return eventDto;
	}

	@Override
	public DhtmlTreeDto getDhtmlEventTree() {
		DhtmlTreeDto dhtmlTreeRootDto = new DhtmlTreeDto("0");
		DhtmlTreeDto dhtmlTreeUserDto = new DhtmlTreeDto("g_u_1", "Hiếu Nguyễn (hieunc@gmail.com)", EventUserList, 1);
		DhtmlTreeDto dhtmlTreeEventDto = new DhtmlTreeDto("u_1_e", "Sự kiện", EventImgList, 1);

		for (String year : eventService.getYearHaveEvent()) {
			final DhtmlTreeDto entryYearDto = new DhtmlTreeDto(year, year, MontYearImgList);
			for (String month : eventService.getMonthsHaveEventByYear(year)) {
				final DhtmlTreeDto entryMonthDto = new DhtmlTreeDto(year + "_" + month, "Tháng " + month, MontYearImgList);
				for (EventDto eventDto : eventService.getEventsByYearMonth(year, month)) {
					final DhtmlTreeDto entryDto = new DhtmlTreeDto("e_" + String.valueOf(eventDto.getEventId()), eventDto.getEventTitle(), EventEntryImgList);
					entryMonthDto.putChild(entryDto);
				}
				entryYearDto.putChild(entryMonthDto);
			}
			dhtmlTreeEventDto.putChild(entryYearDto);

		}

		dhtmlTreeUserDto.putChild(dhtmlTreeEventDto);
		dhtmlTreeRootDto.putChild(dhtmlTreeUserDto);
		return dhtmlTreeRootDto;
	}

	@Override
	public DhtmlTreeDto searchDhtmlEventTree(MultivaluedMap<String, String> formData) {
		log.info(formData);
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
