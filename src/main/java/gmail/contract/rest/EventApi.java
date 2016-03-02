/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.rest;

import gmail.contract.dto.EventDto;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Path("/events")
public interface EventApi {
	@GET
	@Path("/get-event/{eventId}")
	@Produces(MediaType.APPLICATION_JSON)
	public EventDto getEvent(@PathParam("eventId") long eventId);

	@POST
	@Path("/create-event")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public EventDto insertEvent(MultivaluedMap<String,String> frmEvent);
}
