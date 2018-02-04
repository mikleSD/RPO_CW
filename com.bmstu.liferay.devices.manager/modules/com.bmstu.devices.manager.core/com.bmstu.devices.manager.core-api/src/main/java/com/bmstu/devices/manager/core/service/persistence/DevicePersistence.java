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

package com.bmstu.devices.manager.core.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.devices.manager.core.exception.NoSuchDeviceException;
import com.bmstu.devices.manager.core.model.Device;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Strahov
 * @see com.bmstu.devices.manager.core.service.persistence.impl.DevicePersistenceImpl
 * @see DeviceUtil
 * @generated
 */
@ProviderType
public interface DevicePersistence extends BasePersistence<Device> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DeviceUtil} to access the device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the devices where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching devices
	*/
	public java.util.List<Device> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the devices where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of matching devices
	*/
	public java.util.List<Device> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the devices where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns an ordered range of all the devices where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first device in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the first device in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns the last device in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the last device in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns the devices before and after the current device in the ordered set where uuid = &#63;.
	*
	* @param deviceId the primary key of the current device
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next device
	* @throws NoSuchDeviceException if a device with the primary key could not be found
	*/
	public Device[] findByUuid_PrevAndNext(long deviceId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Removes all the devices where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of devices where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching devices
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the device where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDeviceException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDeviceException;

	/**
	* Returns the device where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the device where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the device where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the device that was removed
	*/
	public Device removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchDeviceException;

	/**
	* Returns the number of devices where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching devices
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the devices where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching devices
	*/
	public java.util.List<Device> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the devices where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of matching devices
	*/
	public java.util.List<Device> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the devices where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns an ordered range of all the devices where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first device in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the first device in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns the last device in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the last device in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns the devices before and after the current device in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param deviceId the primary key of the current device
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next device
	* @throws NoSuchDeviceException if a device with the primary key could not be found
	*/
	public Device[] findByUuid_C_PrevAndNext(long deviceId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Removes all the devices where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of devices where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching devices
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the devices where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching devices
	*/
	public java.util.List<Device> findByGroupId(long groupId);

	/**
	* Returns a range of all the devices where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of matching devices
	*/
	public java.util.List<Device> findByGroupId(long groupId, int start, int end);

	/**
	* Returns an ordered range of all the devices where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns an ordered range of all the devices where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first device in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the first device in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns the last device in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the last device in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns the devices before and after the current device in the ordered set where groupId = &#63;.
	*
	* @param deviceId the primary key of the current device
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next device
	* @throws NoSuchDeviceException if a device with the primary key could not be found
	*/
	public Device[] findByGroupId_PrevAndNext(long deviceId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Removes all the devices where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of devices where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching devices
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the devices where uniqueId = &#63;.
	*
	* @param uniqueId the unique ID
	* @return the matching devices
	*/
	public java.util.List<Device> findByUniqueId(java.lang.String uniqueId);

	/**
	* Returns a range of all the devices where uniqueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uniqueId the unique ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of matching devices
	*/
	public java.util.List<Device> findByUniqueId(java.lang.String uniqueId,
		int start, int end);

	/**
	* Returns an ordered range of all the devices where uniqueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uniqueId the unique ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByUniqueId(java.lang.String uniqueId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns an ordered range of all the devices where uniqueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uniqueId the unique ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByUniqueId(java.lang.String uniqueId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first device in the ordered set where uniqueId = &#63;.
	*
	* @param uniqueId the unique ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByUniqueId_First(java.lang.String uniqueId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the first device in the ordered set where uniqueId = &#63;.
	*
	* @param uniqueId the unique ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByUniqueId_First(java.lang.String uniqueId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns the last device in the ordered set where uniqueId = &#63;.
	*
	* @param uniqueId the unique ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByUniqueId_Last(java.lang.String uniqueId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the last device in the ordered set where uniqueId = &#63;.
	*
	* @param uniqueId the unique ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByUniqueId_Last(java.lang.String uniqueId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns the devices before and after the current device in the ordered set where uniqueId = &#63;.
	*
	* @param deviceId the primary key of the current device
	* @param uniqueId the unique ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next device
	* @throws NoSuchDeviceException if a device with the primary key could not be found
	*/
	public Device[] findByUniqueId_PrevAndNext(long deviceId,
		java.lang.String uniqueId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Removes all the devices where uniqueId = &#63; from the database.
	*
	* @param uniqueId the unique ID
	*/
	public void removeByUniqueId(java.lang.String uniqueId);

	/**
	* Returns the number of devices where uniqueId = &#63;.
	*
	* @param uniqueId the unique ID
	* @return the number of matching devices
	*/
	public int countByUniqueId(java.lang.String uniqueId);

	/**
	* Returns all the devices where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @return the matching devices
	*/
	public java.util.List<Device> findByDeviceId(long deviceId);

	/**
	* Returns a range of all the devices where deviceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deviceId the device ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of matching devices
	*/
	public java.util.List<Device> findByDeviceId(long deviceId, int start,
		int end);

	/**
	* Returns an ordered range of all the devices where deviceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deviceId the device ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByDeviceId(long deviceId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns an ordered range of all the devices where deviceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deviceId the device ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching devices
	*/
	public java.util.List<Device> findByDeviceId(long deviceId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first device in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByDeviceId_First(long deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the first device in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByDeviceId_First(long deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns the last device in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws NoSuchDeviceException if a matching device could not be found
	*/
	public Device findByDeviceId_Last(long deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator)
		throws NoSuchDeviceException;

	/**
	* Returns the last device in the ordered set where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	*/
	public Device fetchByDeviceId_Last(long deviceId,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Removes all the devices where deviceId = &#63; from the database.
	*
	* @param deviceId the device ID
	*/
	public void removeByDeviceId(long deviceId);

	/**
	* Returns the number of devices where deviceId = &#63;.
	*
	* @param deviceId the device ID
	* @return the number of matching devices
	*/
	public int countByDeviceId(long deviceId);

	/**
	* Caches the device in the entity cache if it is enabled.
	*
	* @param device the device
	*/
	public void cacheResult(Device device);

	/**
	* Caches the devices in the entity cache if it is enabled.
	*
	* @param devices the devices
	*/
	public void cacheResult(java.util.List<Device> devices);

	/**
	* Creates a new device with the primary key. Does not add the device to the database.
	*
	* @param deviceId the primary key for the new device
	* @return the new device
	*/
	public Device create(long deviceId);

	/**
	* Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deviceId the primary key of the device
	* @return the device that was removed
	* @throws NoSuchDeviceException if a device with the primary key could not be found
	*/
	public Device remove(long deviceId) throws NoSuchDeviceException;

	public Device updateImpl(Device device);

	/**
	* Returns the device with the primary key or throws a {@link NoSuchDeviceException} if it could not be found.
	*
	* @param deviceId the primary key of the device
	* @return the device
	* @throws NoSuchDeviceException if a device with the primary key could not be found
	*/
	public Device findByPrimaryKey(long deviceId) throws NoSuchDeviceException;

	/**
	* Returns the device with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param deviceId the primary key of the device
	* @return the device, or <code>null</code> if a device with the primary key could not be found
	*/
	public Device fetchByPrimaryKey(long deviceId);

	@Override
	public java.util.Map<java.io.Serializable, Device> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the devices.
	*
	* @return the devices
	*/
	public java.util.List<Device> findAll();

	/**
	* Returns a range of all the devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of devices
	*/
	public java.util.List<Device> findAll(int start, int end);

	/**
	* Returns an ordered range of all the devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of devices
	*/
	public java.util.List<Device> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator);

	/**
	* Returns an ordered range of all the devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of devices
	*/
	public java.util.List<Device> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Device> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the devices from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of devices.
	*
	* @return the number of devices
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}