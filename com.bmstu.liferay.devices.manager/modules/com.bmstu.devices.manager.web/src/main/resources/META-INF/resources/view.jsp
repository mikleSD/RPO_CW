<%@include file="/init.jsp"%>

<%
	Device traccarDevice = null;
%>

<aui:button-row cssClass="traccar-buttons">

	<portlet:renderURL var="addDeviceURL">
		<portlet:param name="mvcPath" value="/edit_device.jsp" />
	</portlet:renderURL>

	<aui:button onClick="<%=addDeviceURL.toString()%>" value="Add Device"></aui:button>

</aui:button-row>

<portlet:actionURL name="deleteDevice" var="deleteDeviceURL"/>

<liferay-ui:search-container
	total="<%=DeviceLocalServiceUtil.getDevicesCount()%>">
	<liferay-ui:search-container-results
		results="<%=DeviceLocalServiceUtil.getDevices(scopeGroupId.longValue(), searchContainer.getStart(),
						searchContainer.getEnd())%>" />

	<liferay-ui:search-container-row
		className="com.bmstu.devices.manager.core.model.Device"
		modelVar="device">

		<liferay-ui:search-container-column-text property="deviceId" />

		<liferay-ui:search-container-column-text property="name" />
		
		<liferay-ui:search-container-column-text property="uniqueId" />
		
		<liferay-ui:search-container-column-text property="group" />
		
		<liferay-ui:search-container-column-text property="phoneNumber" />
		
		<liferay-ui:search-container-column-text property="model" />
		
		<liferay-ui:search-container-column-text property="contact" />
		
		<liferay-ui:search-container-column-text property="category" />
		
		<liferay-ui:search-container-column-text property="deviceAttributes" />

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>

<aui:form action="<%=deleteDeviceURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=traccarDevice%>"
		model="<%=Device.class%>" />

	<aui:fieldset>

		<aui:input name="deviceId" type="clear"/>

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit" value="Delete"/>

	</aui:button-row>
</aui:form>