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

package com.bmstu.devices.manager.core.service.impl;

import java.util.Date;
import java.util.List;

import com.bmstu.devices.manager.core.model.Device;
import com.bmstu.devices.manager.core.service.base.DeviceLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the device local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.bmstu.devices.manager.core.service.DeviceLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Strahov
 * @see DeviceLocalServiceBaseImpl
 * @see com.bmstu.devices.manager.core.service.DeviceLocalServiceUtil
 */
public class DeviceLocalServiceImpl extends DeviceLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.bmstu.devices.manager.core.service.DeviceLocalServiceUtil} to access
	 * the device local service.
	 */

	@Override
	public Device addDevice(long userId, String name, String uniqueId, String group, String phoneNumber, String model, String contact,
			String category, String deviceAttributes, ServiceContext serviceContext) throws PortalException {
		name = nullToEmpty(name);
		uniqueId = nullToEmpty(uniqueId);
		group = nullToEmpty(group);
		phoneNumber = nullToEmpty(phoneNumber);
		model = nullToEmpty(model);
		contact = nullToEmpty(contact);
		category = nullToEmpty(category);
		deviceAttributes = nullToEmpty(deviceAttributes);
		
		valideteId(uniqueId);

		long groupId = serviceContext.getScopeGroupId();
		User user = userLocalService.getUserById(userId);
		Date currentDate = new Date();

		Device device = devicePersistence.create(counterLocalService.increment());

		device.setUuid(serviceContext.getUuid());
		device.setUserId(userId);
		device.setGroupId(groupId);
		device.setCompanyId(user.getCompanyId());
		device.setUserName(user.getFullName());
		device.setCreateDate(serviceContext.getCreateDate(currentDate));
		device.setModifiedDate(serviceContext.getModifiedDate(currentDate));
		device.setName(name);
		device.setUniqueId(uniqueId);
		device.setGroup(group);
		device.setPhoneNumber(phoneNumber);
		device.setModel(model);
		device.setContact(contact);
		device.setCategory(category);
		device.setDeviceAttributes(deviceAttributes);
		device.setExpandoBridgeAttributes(serviceContext);

		devicePersistence.update(device);

		return device;
	}
	
	@Override
	public List<Device> getDevices(long groupId, int start, int end) {

		return devicePersistence.findByGroupId(groupId, start, end);
	}
	
	@Override
	public int getDevicesCount()
	{
		return devicePersistence.countAll();
	}
	
	private void valideteId(String uniqueId) throws PortalException {
		if (!devicePersistence.findByUniqueId(uniqueId).isEmpty())
		{
			throw new IllegalArgumentException();
		}
	}

	private String nullToEmpty(String string)
	{
		return string == null ? "" : string;
	}
}