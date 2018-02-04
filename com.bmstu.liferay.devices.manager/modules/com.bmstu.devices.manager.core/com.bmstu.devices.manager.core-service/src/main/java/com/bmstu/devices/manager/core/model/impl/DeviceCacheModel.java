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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Device in entity cache.
 *
 * @author Strahov
 * @see Device
 * @generated
 */
@ProviderType
public class DeviceCacheModel implements CacheModel<Device>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DeviceCacheModel)) {
			return false;
		}

		DeviceCacheModel deviceCacheModel = (DeviceCacheModel)obj;

		if (deviceId == deviceCacheModel.deviceId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, deviceId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", deviceId=");
		sb.append(deviceId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append(", group=");
		sb.append(group);
		sb.append(", phoneNumber=");
		sb.append(phoneNumber);
		sb.append(", model=");
		sb.append(model);
		sb.append(", contact=");
		sb.append(contact);
		sb.append(", category=");
		sb.append(category);
		sb.append(", deviceAttributes=");
		sb.append(deviceAttributes);
		sb.append(", uniqueId=");
		sb.append(uniqueId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Device toEntityModel() {
		DeviceImpl deviceImpl = new DeviceImpl();

		if (uuid == null) {
			deviceImpl.setUuid(StringPool.BLANK);
		}
		else {
			deviceImpl.setUuid(uuid);
		}

		deviceImpl.setDeviceId(deviceId);
		deviceImpl.setGroupId(groupId);
		deviceImpl.setCompanyId(companyId);
		deviceImpl.setUserId(userId);

		if (userName == null) {
			deviceImpl.setUserName(StringPool.BLANK);
		}
		else {
			deviceImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			deviceImpl.setCreateDate(null);
		}
		else {
			deviceImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			deviceImpl.setModifiedDate(null);
		}
		else {
			deviceImpl.setModifiedDate(new Date(modifiedDate));
		}

		deviceImpl.setStatus(status);
		deviceImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			deviceImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			deviceImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			deviceImpl.setStatusDate(null);
		}
		else {
			deviceImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			deviceImpl.setName(StringPool.BLANK);
		}
		else {
			deviceImpl.setName(name);
		}

		if (group == null) {
			deviceImpl.setGroup(StringPool.BLANK);
		}
		else {
			deviceImpl.setGroup(group);
		}

		if (phoneNumber == null) {
			deviceImpl.setPhoneNumber(StringPool.BLANK);
		}
		else {
			deviceImpl.setPhoneNumber(phoneNumber);
		}

		if (model == null) {
			deviceImpl.setModel(StringPool.BLANK);
		}
		else {
			deviceImpl.setModel(model);
		}

		if (contact == null) {
			deviceImpl.setContact(StringPool.BLANK);
		}
		else {
			deviceImpl.setContact(contact);
		}

		if (category == null) {
			deviceImpl.setCategory(StringPool.BLANK);
		}
		else {
			deviceImpl.setCategory(category);
		}

		if (deviceAttributes == null) {
			deviceImpl.setDeviceAttributes(StringPool.BLANK);
		}
		else {
			deviceImpl.setDeviceAttributes(deviceAttributes);
		}

		if (uniqueId == null) {
			deviceImpl.setUniqueId(StringPool.BLANK);
		}
		else {
			deviceImpl.setUniqueId(uniqueId);
		}

		deviceImpl.resetOriginalValues();

		return deviceImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		deviceId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
		group = objectInput.readUTF();
		phoneNumber = objectInput.readUTF();
		model = objectInput.readUTF();
		contact = objectInput.readUTF();
		category = objectInput.readUTF();
		deviceAttributes = objectInput.readUTF();
		uniqueId = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(deviceId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (group == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(group);
		}

		if (phoneNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(phoneNumber);
		}

		if (model == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(model);
		}

		if (contact == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contact);
		}

		if (category == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(category);
		}

		if (deviceAttributes == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deviceAttributes);
		}

		if (uniqueId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uniqueId);
		}
	}

	public String uuid;
	public long deviceId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
	public String group;
	public String phoneNumber;
	public String model;
	public String contact;
	public String category;
	public String deviceAttributes;
	public String uniqueId;
}