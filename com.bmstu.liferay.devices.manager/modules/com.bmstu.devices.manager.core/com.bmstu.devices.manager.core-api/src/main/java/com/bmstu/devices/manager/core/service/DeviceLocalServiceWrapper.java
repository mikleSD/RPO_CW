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
 * Provides a wrapper for {@link DeviceLocalService}.
 *
 * @author Strahov
 * @see DeviceLocalService
 * @generated
 */
@ProviderType
public class DeviceLocalServiceWrapper implements DeviceLocalService,
	ServiceWrapper<DeviceLocalService> {
	public DeviceLocalServiceWrapper(DeviceLocalService deviceLocalService) {
		_deviceLocalService = deviceLocalService;
	}

	/**
	* Adds the device to the database. Also notifies the appropriate model listeners.
	*
	* @param device the device
	* @return the device that was added
	*/
	@Override
	public com.bmstu.devices.manager.core.model.Device addDevice(
		com.bmstu.devices.manager.core.model.Device device) {
		return _deviceLocalService.addDevice(device);
	}

	@Override
	public com.bmstu.devices.manager.core.model.Device addDevice(long userId,
		java.lang.String name, java.lang.String uniqueId,
		java.lang.String group, java.lang.String phoneNumber,
		java.lang.String model, java.lang.String contact,
		java.lang.String category, java.lang.String deviceAttributes,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deviceLocalService.addDevice(userId, name, uniqueId, group,
			phoneNumber, model, contact, category, deviceAttributes,
			serviceContext);
	}

	/**
	* Creates a new device with the primary key. Does not add the device to the database.
	*
	* @param deviceId the primary key for the new device
	* @return the new device
	*/
	@Override
	public com.bmstu.devices.manager.core.model.Device createDevice(
		long deviceId) {
		return _deviceLocalService.createDevice(deviceId);
	}

	/**
	* Deletes the device from the database. Also notifies the appropriate model listeners.
	*
	* @param device the device
	* @return the device that was removed
	*/
	@Override
	public com.bmstu.devices.manager.core.model.Device deleteDevice(
		com.bmstu.devices.manager.core.model.Device device) {
		return _deviceLocalService.deleteDevice(device);
	}

	/**
	* Deletes the device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deviceId the primary key of the device
	* @return the device that was removed
	* @throws PortalException if a device with the primary key could not be found
	*/
	@Override
	public com.bmstu.devices.manager.core.model.Device deleteDevice(
		long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deviceLocalService.deleteDevice(deviceId);
	}

	@Override
	public com.bmstu.devices.manager.core.model.Device fetchDevice(
		long deviceId) {
		return _deviceLocalService.fetchDevice(deviceId);
	}

	/**
	* Returns the device matching the UUID and group.
	*
	* @param uuid the device's UUID
	* @param groupId the primary key of the group
	* @return the matching device, or <code>null</code> if a matching device could not be found
	*/
	@Override
	public com.bmstu.devices.manager.core.model.Device fetchDeviceByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _deviceLocalService.fetchDeviceByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the device with the primary key.
	*
	* @param deviceId the primary key of the device
	* @return the device
	* @throws PortalException if a device with the primary key could not be found
	*/
	@Override
	public com.bmstu.devices.manager.core.model.Device getDevice(long deviceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deviceLocalService.getDevice(deviceId);
	}

	/**
	* Returns the device matching the UUID and group.
	*
	* @param uuid the device's UUID
	* @param groupId the primary key of the group
	* @return the matching device
	* @throws PortalException if a matching device could not be found
	*/
	@Override
	public com.bmstu.devices.manager.core.model.Device getDeviceByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deviceLocalService.getDeviceByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the device in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param device the device
	* @return the device that was updated
	*/
	@Override
	public com.bmstu.devices.manager.core.model.Device updateDevice(
		com.bmstu.devices.manager.core.model.Device device) {
		return _deviceLocalService.updateDevice(device);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _deviceLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _deviceLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _deviceLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _deviceLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deviceLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deviceLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of devices.
	*
	* @return the number of devices
	*/
	@Override
	public int getDevicesCount() {
		return _deviceLocalService.getDevicesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _deviceLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _deviceLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmstu.devices.manager.core.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _deviceLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmstu.devices.manager.core.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _deviceLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.bmstu.devices.manager.core.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of devices
	*/
	@Override
	public java.util.List<com.bmstu.devices.manager.core.model.Device> getDevices(
		int start, int end) {
		return _deviceLocalService.getDevices(start, end);
	}

	@Override
	public java.util.List<com.bmstu.devices.manager.core.model.Device> getDevices(
		long groupId, int start, int end) {
		return _deviceLocalService.getDevices(groupId, start, end);
	}

	/**
	* Returns all the devices matching the UUID and company.
	*
	* @param uuid the UUID of the devices
	* @param companyId the primary key of the company
	* @return the matching devices, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.bmstu.devices.manager.core.model.Device> getDevicesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _deviceLocalService.getDevicesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of devices matching the UUID and company.
	*
	* @param uuid the UUID of the devices
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching devices, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<com.bmstu.devices.manager.core.model.Device> getDevicesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.bmstu.devices.manager.core.model.Device> orderByComparator) {
		return _deviceLocalService.getDevicesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _deviceLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _deviceLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public DeviceLocalService getWrappedService() {
		return _deviceLocalService;
	}

	@Override
	public void setWrappedService(DeviceLocalService deviceLocalService) {
		_deviceLocalService = deviceLocalService;
	}

	private DeviceLocalService _deviceLocalService;
}