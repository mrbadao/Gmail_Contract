/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Path("/auth")
public interface AuthorizeApi {
	@GET
	@Path("/login")
	@Produces(MediaType.APPLICATION_JSON)
	public String authorizeUser();

}
