/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.dao;

import gmail.contract.dto.UserDto;
import org.apache.ibatis.annotations.Param;

import javax.ws.rs.core.MultivaluedMap;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public interface UserMapper {
	UserDto authorizeUser(@Param("credential") MultivaluedMap<String, String> credential);
}
