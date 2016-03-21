package gmail.contract.service.impl;

import gmail.contract.dao.UserMapper;
import gmail.contract.dto.UserDto;
import gmail.contract.service.AuthorizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by hieunc on 21/03/2016.
 *
 * @Description:
 */

@Service
public class AuthorizeServiceImpl implements AuthorizeService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDto authorizeUser(MultivaluedMap<String, String> credential) {
		return userMapper.authorizeUser(credential);
	}
}
