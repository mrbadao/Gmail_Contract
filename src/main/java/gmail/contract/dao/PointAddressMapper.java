/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.dao;

import gmail.contract.dto.PointAddressDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public interface PointAddressMapper {
	List<PointAddressDto> getPointers(@Param("locationId") long locationId);
}
