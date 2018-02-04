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

package com.bmstu.devices.manager.core.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.bmstu.devices.manager.core.model.Device;
import com.bmstu.devices.manager.core.model.DeviceModel;
import com.bmstu.devices.manager.core.model.DeviceSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Device service. Represents a row in the &quot;DM_Device&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link DeviceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DeviceImpl}.
 * </p>
 *
 * @author Strahov
 * @see DeviceImpl
 * @see Device
 * @see DeviceModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class DeviceModelImpl extends BaseModelImpl<Device>
	implements DeviceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a device model instance should use the {@link Device} interface instead.
	 */
	public static final String TABLE_NAME = "DM_Device";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "deviceId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "status", Types.INTEGER },
			{ "statusByUserId", Types.BIGINT },
			{ "statusByUserName", Types.VARCHAR },
			{ "statusDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "group_", Types.VARCHAR },
			{ "phoneNumber", Types.VARCHAR },
			{ "model", Types.VARCHAR },
			{ "contact", Types.VARCHAR },
			{ "category", Types.VARCHAR },
			{ "deviceAttributes", Types.VARCHAR },
			{ "uniqueId", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("deviceId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("statusByUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("statusByUserName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("group_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("phoneNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("model", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("contact", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("category", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("deviceAttributes", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("uniqueId", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table DM_Device (uuid_ VARCHAR(75) null,deviceId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null,name VARCHAR(75) null,group_ VARCHAR(75) null,phoneNumber VARCHAR(75) null,model VARCHAR(75) null,contact VARCHAR(75) null,category VARCHAR(75) null,deviceAttributes VARCHAR(75) null,uniqueId VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table DM_Device";
	public static final String ORDER_BY_JPQL = " ORDER BY device.deviceId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY DM_Device.deviceId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.bmstu.devices.manager.core.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.bmstu.devices.manager.core.model.Device"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.bmstu.devices.manager.core.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.bmstu.devices.manager.core.model.Device"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.bmstu.devices.manager.core.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.bmstu.devices.manager.core.model.Device"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long DEVICEID_COLUMN_BITMASK = 2L;
	public static final long GROUPID_COLUMN_BITMASK = 4L;
	public static final long UNIQUEID_COLUMN_BITMASK = 8L;
	public static final long UUID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Device toModel(DeviceSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Device model = new DeviceImpl();

		model.setUuid(soapModel.getUuid());
		model.setDeviceId(soapModel.getDeviceId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setStatus(soapModel.getStatus());
		model.setStatusByUserId(soapModel.getStatusByUserId());
		model.setStatusByUserName(soapModel.getStatusByUserName());
		model.setStatusDate(soapModel.getStatusDate());
		model.setName(soapModel.getName());
		model.setGroup(soapModel.getGroup());
		model.setPhoneNumber(soapModel.getPhoneNumber());
		model.setModel(soapModel.getModel());
		model.setContact(soapModel.getContact());
		model.setCategory(soapModel.getCategory());
		model.setDeviceAttributes(soapModel.getDeviceAttributes());
		model.setUniqueId(soapModel.getUniqueId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Device> toModels(DeviceSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Device> models = new ArrayList<Device>(soapModels.length);

		for (DeviceSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.bmstu.devices.manager.core.service.util.ServiceProps.get(
				"lock.expiration.time.com.bmstu.devices.manager.core.model.Device"));

	public DeviceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _deviceId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setDeviceId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _deviceId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getDeviceId() {
		return _deviceId;
	}

	@Override
	public void setDeviceId(long deviceId) {
		_columnBitmask |= DEVICEID_COLUMN_BITMASK;

		if (!_setOriginalDeviceId) {
			_setOriginalDeviceId = true;

			_originalDeviceId = _deviceId;
		}

		_deviceId = deviceId;
	}

	public long getOriginalDeviceId() {
		return _originalDeviceId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@JSON
	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getStatusByUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
	}

	@JSON
	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return StringPool.BLANK;
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	@JSON
	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_name = name;
	}

	@JSON
	@Override
	public String getGroup() {
		if (_group == null) {
			return StringPool.BLANK;
		}
		else {
			return _group;
		}
	}

	@Override
	public void setGroup(String group) {
		_group = group;
	}

	@JSON
	@Override
	public String getPhoneNumber() {
		if (_phoneNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _phoneNumber;
		}
	}

	@Override
	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	@JSON
	@Override
	public String getModel() {
		if (_model == null) {
			return StringPool.BLANK;
		}
		else {
			return _model;
		}
	}

	@Override
	public void setModel(String model) {
		_model = model;
	}

	@JSON
	@Override
	public String getContact() {
		if (_contact == null) {
			return StringPool.BLANK;
		}
		else {
			return _contact;
		}
	}

	@Override
	public void setContact(String contact) {
		_contact = contact;
	}

	@JSON
	@Override
	public String getCategory() {
		if (_category == null) {
			return StringPool.BLANK;
		}
		else {
			return _category;
		}
	}

	@Override
	public void setCategory(String category) {
		_category = category;
	}

	@JSON
	@Override
	public String getDeviceAttributes() {
		if (_deviceAttributes == null) {
			return StringPool.BLANK;
		}
		else {
			return _deviceAttributes;
		}
	}

	@Override
	public void setDeviceAttributes(String deviceAttributes) {
		_deviceAttributes = deviceAttributes;
	}

	@JSON
	@Override
	public String getUniqueId() {
		if (_uniqueId == null) {
			return StringPool.BLANK;
		}
		else {
			return _uniqueId;
		}
	}

	@Override
	public void setUniqueId(String uniqueId) {
		_columnBitmask |= UNIQUEID_COLUMN_BITMASK;

		if (_originalUniqueId == null) {
			_originalUniqueId = _uniqueId;
		}

		_uniqueId = uniqueId;
	}

	public String getOriginalUniqueId() {
		return GetterUtil.getString(_originalUniqueId);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Device.class.getName()));
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Device.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Device toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Device)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DeviceImpl deviceImpl = new DeviceImpl();

		deviceImpl.setUuid(getUuid());
		deviceImpl.setDeviceId(getDeviceId());
		deviceImpl.setGroupId(getGroupId());
		deviceImpl.setCompanyId(getCompanyId());
		deviceImpl.setUserId(getUserId());
		deviceImpl.setUserName(getUserName());
		deviceImpl.setCreateDate(getCreateDate());
		deviceImpl.setModifiedDate(getModifiedDate());
		deviceImpl.setStatus(getStatus());
		deviceImpl.setStatusByUserId(getStatusByUserId());
		deviceImpl.setStatusByUserName(getStatusByUserName());
		deviceImpl.setStatusDate(getStatusDate());
		deviceImpl.setName(getName());
		deviceImpl.setGroup(getGroup());
		deviceImpl.setPhoneNumber(getPhoneNumber());
		deviceImpl.setModel(getModel());
		deviceImpl.setContact(getContact());
		deviceImpl.setCategory(getCategory());
		deviceImpl.setDeviceAttributes(getDeviceAttributes());
		deviceImpl.setUniqueId(getUniqueId());

		deviceImpl.resetOriginalValues();

		return deviceImpl;
	}

	@Override
	public int compareTo(Device device) {
		long primaryKey = device.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Device)) {
			return false;
		}

		Device device = (Device)obj;

		long primaryKey = device.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		DeviceModelImpl deviceModelImpl = this;

		deviceModelImpl._originalUuid = deviceModelImpl._uuid;

		deviceModelImpl._originalDeviceId = deviceModelImpl._deviceId;

		deviceModelImpl._setOriginalDeviceId = false;

		deviceModelImpl._originalGroupId = deviceModelImpl._groupId;

		deviceModelImpl._setOriginalGroupId = false;

		deviceModelImpl._originalCompanyId = deviceModelImpl._companyId;

		deviceModelImpl._setOriginalCompanyId = false;

		deviceModelImpl._setModifiedDate = false;

		deviceModelImpl._originalUniqueId = deviceModelImpl._uniqueId;

		deviceModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Device> toCacheModel() {
		DeviceCacheModel deviceCacheModel = new DeviceCacheModel();

		deviceCacheModel.uuid = getUuid();

		String uuid = deviceCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			deviceCacheModel.uuid = null;
		}

		deviceCacheModel.deviceId = getDeviceId();

		deviceCacheModel.groupId = getGroupId();

		deviceCacheModel.companyId = getCompanyId();

		deviceCacheModel.userId = getUserId();

		deviceCacheModel.userName = getUserName();

		String userName = deviceCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			deviceCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			deviceCacheModel.createDate = createDate.getTime();
		}
		else {
			deviceCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			deviceCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			deviceCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		deviceCacheModel.status = getStatus();

		deviceCacheModel.statusByUserId = getStatusByUserId();

		deviceCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = deviceCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			deviceCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			deviceCacheModel.statusDate = statusDate.getTime();
		}
		else {
			deviceCacheModel.statusDate = Long.MIN_VALUE;
		}

		deviceCacheModel.name = getName();

		String name = deviceCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			deviceCacheModel.name = null;
		}

		deviceCacheModel.group = getGroup();

		String group = deviceCacheModel.group;

		if ((group != null) && (group.length() == 0)) {
			deviceCacheModel.group = null;
		}

		deviceCacheModel.phoneNumber = getPhoneNumber();

		String phoneNumber = deviceCacheModel.phoneNumber;

		if ((phoneNumber != null) && (phoneNumber.length() == 0)) {
			deviceCacheModel.phoneNumber = null;
		}

		deviceCacheModel.model = getModel();

		String model = deviceCacheModel.model;

		if ((model != null) && (model.length() == 0)) {
			deviceCacheModel.model = null;
		}

		deviceCacheModel.contact = getContact();

		String contact = deviceCacheModel.contact;

		if ((contact != null) && (contact.length() == 0)) {
			deviceCacheModel.contact = null;
		}

		deviceCacheModel.category = getCategory();

		String category = deviceCacheModel.category;

		if ((category != null) && (category.length() == 0)) {
			deviceCacheModel.category = null;
		}

		deviceCacheModel.deviceAttributes = getDeviceAttributes();

		String deviceAttributes = deviceCacheModel.deviceAttributes;

		if ((deviceAttributes != null) && (deviceAttributes.length() == 0)) {
			deviceCacheModel.deviceAttributes = null;
		}

		deviceCacheModel.uniqueId = getUniqueId();

		String uniqueId = deviceCacheModel.uniqueId;

		if ((uniqueId != null) && (uniqueId.length() == 0)) {
			deviceCacheModel.uniqueId = null;
		}

		return deviceCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", deviceId=");
		sb.append(getDeviceId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusByUserName=");
		sb.append(getStatusByUserName());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", group=");
		sb.append(getGroup());
		sb.append(", phoneNumber=");
		sb.append(getPhoneNumber());
		sb.append(", model=");
		sb.append(getModel());
		sb.append(", contact=");
		sb.append(getContact());
		sb.append(", category=");
		sb.append(getCategory());
		sb.append(", deviceAttributes=");
		sb.append(getDeviceAttributes());
		sb.append(", uniqueId=");
		sb.append(getUniqueId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("com.bmstu.devices.manager.core.model.Device");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deviceId</column-name><column-value><![CDATA[");
		sb.append(getDeviceId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>group</column-name><column-value><![CDATA[");
		sb.append(getGroup());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
		sb.append(getPhoneNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>model</column-name><column-value><![CDATA[");
		sb.append(getModel());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contact</column-name><column-value><![CDATA[");
		sb.append(getContact());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>category</column-name><column-value><![CDATA[");
		sb.append(getCategory());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deviceAttributes</column-name><column-value><![CDATA[");
		sb.append(getDeviceAttributes());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>uniqueId</column-name><column-value><![CDATA[");
		sb.append(getUniqueId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Device.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Device.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _deviceId;
	private long _originalDeviceId;
	private boolean _setOriginalDeviceId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private String _name;
	private String _group;
	private String _phoneNumber;
	private String _model;
	private String _contact;
	private String _category;
	private String _deviceAttributes;
	private String _uniqueId;
	private String _originalUniqueId;
	private long _columnBitmask;
	private Device _escapedModel;
}