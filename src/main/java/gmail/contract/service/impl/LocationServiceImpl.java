/*
 * Copyright (c) 2016 Hieu Nguyen alright reserve
 */

package gmail.contract.service.impl;

import gmail.contract.dao.LocationMapper;
import gmail.contract.dao.PointAddressMapper;
import gmail.contract.dto.LocationDto;
import gmail.contract.dto.PointAddressDto;
import gmail.contract.service.LocationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hieunc on 23/02/2016.
 *
 * @Description:
 */
@Service
public class LocationServiceImpl implements LocationService {
	static Logger log = Logger.getLogger(LocationServiceImpl.class);

	@Autowired
	private LocationMapper locationMapper;

	@Autowired
	private PointAddressMapper pointAddressMapper;

	@Override
	public List<LocationDto> getAllLocation() {
		return locationMapper.getAllLocations();
	}

	@Override
	public List<PointAddressDto> getPointAddresses(long locationId) {
		return pointAddressMapper.getPointers(locationId);
	}
}
