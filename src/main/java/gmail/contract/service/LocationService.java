/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.service;

import gmail.contract.dto.LocationDto;
import gmail.contract.dto.PointAddressDto;

import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
public interface LocationService {
	public List<LocationDto> getAllLocation();

	public List<PointAddressDto> getPointAddresses(long locationId);
}
