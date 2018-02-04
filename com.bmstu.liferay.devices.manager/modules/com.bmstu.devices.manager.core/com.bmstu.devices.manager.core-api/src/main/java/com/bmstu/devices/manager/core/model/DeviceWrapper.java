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

package com.bmstu.devices.manager.core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Device}.
 * </p>
 *
 * @author Strahov
 * @see Device
 * @generated
 */
@ProviderType
public class DeviceWrapper implements Device, ModelWrapper<Device> {
	public DeviceWrapper(Device device) {
		_device = device;
	}

	@Override
	public Class<?> getModelClass() {
		return Device.class;
	}

	@Override
	public String getModelClassName() {
		return Device.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("deviceId", getDeviceId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("name", getName());
		attributes.put("group", getGroup());
		attributes.put("phoneNumber", getPhoneNumber());
		attributes.put("model", getModel());
		attributes.put("contact", getContact());
		attributes.put("category", getCategory());
		attributes.put("deviceAttributes", getDeviceAttributes());
		attributes.put("uniqueId", getUniqueId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long deviceId = (Long)attributes.get("deviceId");

		if (deviceId != null) {
			setDeviceId(deviceId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String group = (String)attributes.get("group");

		if (group != null) {
			setGroup(group);
		}

		String phoneNumber = (String)attributes.get("phoneNumber");

		if (phoneNumber != null) {
			setPhoneNumber(phoneNumber);
		}

		String model = (String)attributes.get("model");

		if (model != null) {
			setModel(model);
		}

		String contact = (String)attributes.get("contact");

		if (contact != null) {
			setContact(contact);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		String deviceAttributes = (String)attributes.get("deviceAttributes");

		if (deviceAttributes != null) {
			setDeviceAttributes(deviceAttributes);
		}

		String uniqueId = (String)attributes.get("uniqueId");

		if (uniqueId != null) {
			setUniqueId(uniqueId);
		}
	}

	@Override
	public Device toEscapedModel() {
		return new DeviceWrapper(_device.toEscapedModel());
	}

	@Override
	public Device toUnescapedModel() {
		return new DeviceWrapper(_device.toUnescapedModel());
	}

	/**
	* Returns <code>true</code> if this device is approved.
	*
	* @return <code>true</code> if this device is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _device.isApproved();
	}

	@Override
	public boolean isCachedModel() {
		return _device.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this device is denied.
	*
	* @return <code>true</code> if this device is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _device.isDenied();
	}

	/**
	* Returns <code>true</code> if this device is a draft.
	*
	* @return <code>true</code> if this device is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _device.isDraft();
	}

	@Override
	public boolean isEscapedModel() {
		return _device.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this device is expired.
	*
	* @return <code>true</code> if this device is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _device.isExpired();
	}

	/**
	* Returns <code>true</code> if this device is inactive.
	*
	* @return <code>true</code> if this device is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _device.isInactive();
	}

	/**
	* Returns <code>true</code> if this device is incomplete.
	*
	* @return <code>true</code> if this device is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _device.isIncomplete();
	}

	@Override
	public boolean isNew() {
		return _device.isNew();
	}

	/**
	* Returns <code>true</code> if this device is pending.
	*
	* @return <code>true</code> if this device is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _device.isPending();
	}

	/**
	* Returns <code>true</code> if this device is scheduled.
	*
	* @return <code>true</code> if this device is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _device.isScheduled();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _device.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Device> toCacheModel() {
		return _device.toCacheModel();
	}

	@Override
	public int compareTo(Device device) {
		return _device.compareTo(device);
	}

	/**
	* Returns the status of this device.
	*
	* @return the status of this device
	*/
	@Override
	public int getStatus() {
		return _device.getStatus();
	}

	@Override
	public int hashCode() {
		return _device.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _device.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new DeviceWrapper((Device)_device.clone());
	}

	/**
	* Returns the category of this device.
	*
	* @return the category of this device
	*/
	@Override
	public java.lang.String getCategory() {
		return _device.getCategory();
	}

	/**
	* Returns the contact of this device.
	*
	* @return the contact of this device
	*/
	@Override
	public java.lang.String getContact() {
		return _device.getContact();
	}

	/**
	* Returns the device attributes of this device.
	*
	* @return the device attributes of this device
	*/
	@Override
	public java.lang.String getDeviceAttributes() {
		return _device.getDeviceAttributes();
	}

	/**
	* Returns the group of this device.
	*
	* @return the group of this device
	*/
	@Override
	public java.lang.String getGroup() {
		return _device.getGroup();
	}

	/**
	* Returns the model of this device.
	*
	* @return the model of this device
	*/
	@Override
	public java.lang.String getModel() {
		return _device.getModel();
	}

	/**
	* Returns the name of this device.
	*
	* @return the name of this device
	*/
	@Override
	public java.lang.String getName() {
		return _device.getName();
	}

	/**
	* Returns the phone number of this device.
	*
	* @return the phone number of this device
	*/
	@Override
	public java.lang.String getPhoneNumber() {
		return _device.getPhoneNumber();
	}

	/**
	* Returns the status by user name of this device.
	*
	* @return the status by user name of this device
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _device.getStatusByUserName();
	}

	/**
	* Returns the status by user uuid of this device.
	*
	* @return the status by user uuid of this device
	*/
	@Override
	public java.lang.String getStatusByUserUuid() {
		return _device.getStatusByUserUuid();
	}

	/**
	* Returns the unique ID of this device.
	*
	* @return the unique ID of this device
	*/
	@Override
	public java.lang.String getUniqueId() {
		return _device.getUniqueId();
	}

	/**
	* Returns the user name of this device.
	*
	* @return the user name of this device
	*/
	@Override
	public java.lang.String getUserName() {
		return _device.getUserName();
	}

	/**
	* Returns the user uuid of this device.
	*
	* @return the user uuid of this device
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _device.getUserUuid();
	}

	/**
	* Returns the uuid of this device.
	*
	* @return the uuid of this device
	*/
	@Override
	public java.lang.String getUuid() {
		return _device.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _device.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _device.toXmlString();
	}

	/**
	* Returns the create date of this device.
	*
	* @return the create date of this device
	*/
	@Override
	public Date getCreateDate() {
		return _device.getCreateDate();
	}

	/**
	* Returns the modified date of this device.
	*
	* @return the modified date of this device
	*/
	@Override
	public Date getModifiedDate() {
		return _device.getModifiedDate();
	}

	/**
	* Returns the status date of this device.
	*
	* @return the status date of this device
	*/
	@Override
	public Date getStatusDate() {
		return _device.getStatusDate();
	}

	/**
	* Returns the company ID of this device.
	*
	* @return the company ID of this device
	*/
	@Override
	public long getCompanyId() {
		return _device.getCompanyId();
	}

	/**
	* Returns the device ID of this device.
	*
	* @return the device ID of this device
	*/
	@Override
	public long getDeviceId() {
		return _device.getDeviceId();
	}

	/**
	* Returns the group ID of this device.
	*
	* @return the group ID of this device
	*/
	@Override
	public long getGroupId() {
		return _device.getGroupId();
	}

	/**
	* Returns the primary key of this device.
	*
	* @return the primary key of this device
	*/
	@Override
	public long getPrimaryKey() {
		return _device.getPrimaryKey();
	}

	/**
	* Returns the status by user ID of this device.
	*
	* @return the status by user ID of this device
	*/
	@Override
	public long getStatusByUserId() {
		return _device.getStatusByUserId();
	}

	/**
	* Returns the user ID of this device.
	*
	* @return the user ID of this device
	*/
	@Override
	public long getUserId() {
		return _device.getUserId();
	}

	@Override
	public void persist() {
		_device.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_device.setCachedModel(cachedModel);
	}

	/**
	* Sets the category of this device.
	*
	* @param category the category of this device
	*/
	@Override
	public void setCategory(java.lang.String category) {
		_device.setCategory(category);
	}

	/**
	* Sets the company ID of this device.
	*
	* @param companyId the company ID of this device
	*/
	@Override
	public void setCompanyId(long companyId) {
		_device.setCompanyId(companyId);
	}

	/**
	* Sets the contact of this device.
	*
	* @param contact the contact of this device
	*/
	@Override
	public void setContact(java.lang.String contact) {
		_device.setContact(contact);
	}

	/**
	* Sets the create date of this device.
	*
	* @param createDate the create date of this device
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_device.setCreateDate(createDate);
	}

	/**
	* Sets the device attributes of this device.
	*
	* @param deviceAttributes the device attributes of this device
	*/
	@Override
	public void setDeviceAttributes(java.lang.String deviceAttributes) {
		_device.setDeviceAttributes(deviceAttributes);
	}

	/**
	* Sets the device ID of this device.
	*
	* @param deviceId the device ID of this device
	*/
	@Override
	public void setDeviceId(long deviceId) {
		_device.setDeviceId(deviceId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_device.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_device.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_device.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group of this device.
	*
	* @param group the group of this device
	*/
	@Override
	public void setGroup(java.lang.String group) {
		_device.setGroup(group);
	}

	/**
	* Sets the group ID of this device.
	*
	* @param groupId the group ID of this device
	*/
	@Override
	public void setGroupId(long groupId) {
		_device.setGroupId(groupId);
	}

	/**
	* Sets the model of this device.
	*
	* @param model the model of this device
	*/
	@Override
	public void setModel(java.lang.String model) {
		_device.setModel(model);
	}

	/**
	* Sets the modified date of this device.
	*
	* @param modifiedDate the modified date of this device
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_device.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the name of this device.
	*
	* @param name the name of this device
	*/
	@Override
	public void setName(java.lang.String name) {
		_device.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_device.setNew(n);
	}

	/**
	* Sets the phone number of this device.
	*
	* @param phoneNumber the phone number of this device
	*/
	@Override
	public void setPhoneNumber(java.lang.String phoneNumber) {
		_device.setPhoneNumber(phoneNumber);
	}

	/**
	* Sets the primary key of this device.
	*
	* @param primaryKey the primary key of this device
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_device.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_device.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the status of this device.
	*
	* @param status the status of this device
	*/
	@Override
	public void setStatus(int status) {
		_device.setStatus(status);
	}

	/**
	* Sets the status by user ID of this device.
	*
	* @param statusByUserId the status by user ID of this device
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_device.setStatusByUserId(statusByUserId);
	}

	/**
	* Sets the status by user name of this device.
	*
	* @param statusByUserName the status by user name of this device
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_device.setStatusByUserName(statusByUserName);
	}

	/**
	* Sets the status by user uuid of this device.
	*
	* @param statusByUserUuid the status by user uuid of this device
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_device.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Sets the status date of this device.
	*
	* @param statusDate the status date of this device
	*/
	@Override
	public void setStatusDate(Date statusDate) {
		_device.setStatusDate(statusDate);
	}

	/**
	* Sets the unique ID of this device.
	*
	* @param uniqueId the unique ID of this device
	*/
	@Override
	public void setUniqueId(java.lang.String uniqueId) {
		_device.setUniqueId(uniqueId);
	}

	/**
	* Sets the user ID of this device.
	*
	* @param userId the user ID of this device
	*/
	@Override
	public void setUserId(long userId) {
		_device.setUserId(userId);
	}

	/**
	* Sets the user name of this device.
	*
	* @param userName the user name of this device
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_device.setUserName(userName);
	}

	/**
	* Sets the user uuid of this device.
	*
	* @param userUuid the user uuid of this device
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_device.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this device.
	*
	* @param uuid the uuid of this device
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_device.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DeviceWrapper)) {
			return false;
		}

		DeviceWrapper deviceWrapper = (DeviceWrapper)obj;

		if (Objects.equals(_device, deviceWrapper._device)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _device.getStagedModelType();
	}

	@Override
	public Device getWrappedModel() {
		return _device;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _device.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _device.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_device.resetOriginalValues();
	}

	private final Device _device;
}