/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.service;

import gmail.contract.dto.EventDto;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public interface EventService {
	public EventDto getEventById(long eventID);

	public int createEvent(EventDto eventDto);
}
