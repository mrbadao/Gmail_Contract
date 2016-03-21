package gmail.contract.service;

import gmail.contract.dto.UserDto;

import java.util.Map;

/**
 * Created by hieunc on 21/03/2016.
 *
 * @Description:
 */
public interface AuthorizeService {
	public UserDto authorizeUser(Map<String, String> credential);
}
