/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.dao;

import gmail.contract.dto.UserDto;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public interface UserMapper {
	UserDto authorizeUser(@Param("credential") Map<String, String> credential);
}
