/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.rest;

import gmail.contract.dto.DhtmlTreeDto;
import gmail.contract.dto.EventDto;
import gmail.contract.rest.annotation.AllowRoles;
import gmail.contract.rest.annotation.PermissionBinding;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Path("/events")
@PermissionBinding
@AllowRoles
public interface EventApi {
	@GET
	@Path("/get-event/{eventId}")
	@Produces(MediaType.APPLICATION_JSON)
	public EventDto getEvent(@PathParam("eventId") long eventId);


	@GET
	@Path("/get-event-tree")
	@Produces(MediaType.APPLICATION_JSON)
	public DhtmlTreeDto getDhtmlEventTree();

	@POST
	@Path("/get-event-tree")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public DhtmlTreeDto searchDhtmlEventTree(MultivaluedMap<String, String> formData);

	@POST
	@Path("/create-event")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public EventDto insertEvent(MultivaluedMap<String,String> frmEvent);
}
