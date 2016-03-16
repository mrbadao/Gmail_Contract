/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.dao;

import gmail.contract.dto.LocationDto;

import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public interface LocationMapper {
	List<LocationDto> getAllLocations();
}
