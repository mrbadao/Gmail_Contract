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

import java.util.ArrayList;
import java.util.Iterator;
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

	@Override
	public DhtmlTreeDto getDhtmlEventTree(DhtmlTreeDto treeDto) {
		return getDhtmlEventYearTree(treeDto, getYearHaveEvent());
	}

	DhtmlTreeDto getDhtmlEventYearTree(DhtmlTreeDto parentTreeDto, List<String> yearList) {
		List<DhtmlTreeDto> dhtmlTreeDtoList = new ArrayList<DhtmlTreeDto>();

		for (Iterator<String> year = yearList.iterator(); year.hasNext(); ) {
			String srtYear = year.next();
			DhtmlTreeDto dhtmlTreeDto = new DhtmlTreeDto();
			dhtmlTreeDto.setId(parentTreeDto.getId() + "_y_" + srtYear);
			dhtmlTreeDto.setText(srtYear);
			dhtmlTreeDto.setIm0("folderOpen.gif");
			dhtmlTreeDto.setIm1("folderOpen.gif");
			dhtmlTreeDto.setIm2("folderOpen.gif");
			getDhtmlEventMonthTree(dhtmlTreeDto, getMonthsHaveEventByYear(srtYear));
			dhtmlTreeDtoList.add(dhtmlTreeDto);
		}
		parentTreeDto.setItem(dhtmlTreeDtoList);
		return parentTreeDto;
	}

	DhtmlTreeDto getDhtmlEventMonthTree(DhtmlTreeDto parentTreeDto, List<String> monthList) {
		List<DhtmlTreeDto> dhtmlTreeDtoList = new ArrayList<DhtmlTreeDto>();

		for (Iterator<String> month = monthList.iterator(); month.hasNext(); ) {
			String srtMonth = month.next();
			DhtmlTreeDto dhtmlTreeDto = new DhtmlTreeDto();
			dhtmlTreeDto.setId(parentTreeDto.getId() + "_m_" + srtMonth);
			dhtmlTreeDto.setText("Tháng " + srtMonth);
			dhtmlTreeDto.setIm0("folderOpen.gif");
			dhtmlTreeDto.setIm1("folderOpen.gif");
			dhtmlTreeDto.setIm2("folderOpen.gif");
			getDhtmlEventItemTree(dhtmlTreeDto, getEventsByYearMonth(parentTreeDto.getText(), srtMonth));
			dhtmlTreeDtoList.add(dhtmlTreeDto);
		}
		parentTreeDto.setItem(dhtmlTreeDtoList);
		return parentTreeDto;
	}

	DhtmlTreeDto getDhtmlEventItemTree(DhtmlTreeDto parentTreeDto, List<EventDto> eventDtoList) {
		List<DhtmlTreeDto> dhtmlTreeDtoList = new ArrayList<DhtmlTreeDto>();

		for (Iterator<EventDto> eventDtoIterator = eventDtoList.iterator(); eventDtoIterator.hasNext(); ) {
			EventDto eventDto = eventDtoIterator.next();
			DhtmlTreeDto dhtmlTreeDto = new DhtmlTreeDto();
			dhtmlTreeDto.setId(parentTreeDto.getId() + "_ev_" + eventDto.getEventId());
			dhtmlTreeDto.setText(eventDto.getEventTitle());
			dhtmlTreeDto.setIm0("folderOpen.gif");
			dhtmlTreeDto.setIm1("folderOpen.gif");
			dhtmlTreeDto.setIm2("folderOpen.gif");
			dhtmlTreeDtoList.add(dhtmlTreeDto);
		}
		parentTreeDto.setItem(dhtmlTreeDtoList);
		return parentTreeDto;
	}
}
