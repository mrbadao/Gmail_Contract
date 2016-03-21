package gmail.contract.service;

import gmail.contract.dto.UserDto;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by hieunc on 21/03/2016.
 *
 * @Description:
 */
public interface AuthorizeService {
	public UserDto authorizeUser(MultivaluedMap<String, String> credential);
}
