/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.bmstu.devices.manager.core.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeviceService}.
 *
 * @author Strahov
 * @see DeviceService
 * @generated
 */
@ProviderType
public class DeviceServiceWrapper implements DeviceService,
	ServiceWrapper<DeviceService> {
	public DeviceServiceWrapper(DeviceService deviceService) {
		_deviceService = deviceService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _deviceService.getOSGiServiceIdentifier();
	}

	@Override
	public DeviceService getWrappedService() {
		return _deviceService;
	}

	@Override
	public void setWrappedService(DeviceService deviceService) {
		_deviceService = deviceService;
	}

	private DeviceService _deviceService;
}