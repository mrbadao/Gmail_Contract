/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.rest;

import gmail.contract.dto.LocationDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Path("/locations")
public interface LocationApi {
	@GET
	@Path("/get-all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<LocationDto> getEvent();
}
