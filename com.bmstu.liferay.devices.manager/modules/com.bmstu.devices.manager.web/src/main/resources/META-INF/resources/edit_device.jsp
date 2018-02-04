<%@include file="/init.jsp"%>

<%
	Device device = null;
%>

<portlet:renderURL var="viewURL">

	<portlet:param name="mvcPath" value="/view.jsp" />

</portlet:renderURL>

<portlet:actionURL name="addDevice" var="addDeviceURL" />

<aui:form action="<%=addDeviceURL%>" name="<portlet:namespace />fm">

	<aui:model-context bean="<%=device%>"
		model="<%=Device.class%>" />

	<aui:fieldset>

		<aui:input name="name" />
		<aui:input name="uniqueId" />
		<aui:input name="group" />
		<aui:input name="phoneNumber" />
		<aui:input name="model" />
		<aui:input name="contact" />
		<aui:input name="category" />
		<aui:input name="deviceAttributes" />

	</aui:fieldset>

	<aui:button-row>

		<aui:button type="submit" />
		<aui:button type="cancel" onClick="<%= viewURL.toString() %>" />

	</aui:button-row>
</aui:form>