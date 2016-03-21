/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.service.impl;

import gmail.contract.dao.EventMapper;
import gmail.contract.dto.DhtmlTreeDto;
import gmail.contract.dto.EventDto;
import gmail.contract.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Service
public class EventServiceImpl implements EventService {
	static final List<String> EventUserList = Collections.unmodifiableList(Arrays.asList("user.png", "user.png", "user.png"));
	static final List<String> EventImgList = Collections.unmodifiableList(Arrays.asList("event.png", "event.png", "event.png"));
	static final List<String> MontYearImgList = Collections.unmodifiableList(Arrays.asList("folderOpen.gif", "folderOpen.gif", "folderOpen.gif"));
	static final List<String> EventEntryImgList = Collections.unmodifiableList(Arrays.asList("leaf.gif", "leaf.gif", "leaf.gif"));

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

	@Override
	public DhtmlTreeDto getEventDhtmlxTree() {
		DhtmlTreeDto dhtmlTreeRootDto = new DhtmlTreeDto("0");
		DhtmlTreeDto dhtmlTreeUserDto = new DhtmlTreeDto("g_u_1", "Hiếu Nguyễn (hieunc@gmail.com)", EventUserList, 1);
		DhtmlTreeDto dhtmlTreeEventDto = new DhtmlTreeDto("u_1_e", "Sự kiện", EventImgList, 1);

		for (String year : this.getYearHaveEvent()) {
			final DhtmlTreeDto entryYearDto = new DhtmlTreeDto(year, year, MontYearImgList);
			for (String month : this.getMonthsHaveEventByYear(year)) {
				final DhtmlTreeDto entryMonthDto = new DhtmlTreeDto(year + "_" + month, "Tháng " + month, MontYearImgList);
				for (EventDto eventDto : this.getEventsByYearMonth(year, month)) {
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
}
