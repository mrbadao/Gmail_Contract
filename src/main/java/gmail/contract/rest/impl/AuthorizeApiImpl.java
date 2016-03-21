/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.rest.impl;

import gmail.contract.rest.AuthorizeApi;
import gmail.contract.service.AuthorizeService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Component
public class AuthorizeApiImpl implements AuthorizeApi {
	static Logger log = Logger.getLogger(AuthorizeApiImpl.class);

	@Autowired
	private AuthorizeService authorizeService;

	@Override
	public String authorizeUser(MultivaluedMap<String, String> credential) {
//		credential.put("loginEmail", "hieunc299@gmail.com");
//		credential.put("loginPwd", "07781266010");
		log.info(credential.get("loginEmail"));
		log.info(authorizeService.authorizeUser(credential));
		return "123";
	}
}
