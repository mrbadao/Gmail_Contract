/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.dao;

import gmail.contract.dto.EventDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public interface EventMapper {
	EventDto findEventById(@Param("eventId") long eventId);

	int insertEvent(@Param("dtoEvent") EventDto eventDto);

	List<String> getYearHaveEvent();

	List<String> getMonthsHaveEventByYear(@Param("year") String year);

	List<EventDto> getEventsByYearMonth(@Param("year") String year, @Param("month") String month);
}
