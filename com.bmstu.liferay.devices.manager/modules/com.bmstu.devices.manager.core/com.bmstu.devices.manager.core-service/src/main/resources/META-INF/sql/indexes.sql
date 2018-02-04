create index IX_F7A49F7 on DM_Device (deviceId);
create index IX_858D8138 on DM_Device (groupId);
create unique index IX_FE3C81F2 on DM_Device (uniqueId[$COLUMN_LENGTH:75$]);
create index IX_F87CB526 on DM_Device (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B7DC4D28 on DM_Device (uuid_[$COLUMN_LENGTH:75$], groupId);