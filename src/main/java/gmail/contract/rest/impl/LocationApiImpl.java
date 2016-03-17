/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.rest.impl;

import gmail.contract.dto.LocationDto;
import gmail.contract.dto.PointAddressDto;
import gmail.contract.rest.LocationApi;
import gmail.contract.service.LocationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Component
public class LocationApiImpl implements LocationApi {
	static Logger log = Logger.getLogger(LocationApiImpl.class);

	@Autowired
	private LocationService locationService;

	@Override
	public List<LocationDto> getEvent() {
		return locationService.getAllLocation();
	}

	@Override
	public List<PointAddressDto> getPointAddresses(long locationId) {
		return locationService.getPointAddresses(locationId);
	}
}
