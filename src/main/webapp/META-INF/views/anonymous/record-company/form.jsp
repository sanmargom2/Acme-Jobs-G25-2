<%--
- form.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.record-company.form.label.name" path="name" />
	<acme:form-textbox code="anonymous.record-company.form.label.sector" path="sector" />
	<acme:form-textarea code="anonymous.record-company.form.label.description" path="description" />
	<acme:form-textbox code="anonymous.record-company.form.label.website" path="website" />
	<acme:form-textbox code="anonymous.record-company.form.label.ceo" path="CEO" />
	<acme:form-textbox code="anonymous.record-company.form.label.email" path="email" />
	<acme:form-textbox code="anonymous.record-company.form.label.telephone" path="telephone" />
	<acme:form-textbox code="anonymous.record-company.form.label.incorporated" path="incorporated" />


	<%--> <acme:form-submit code="anonymous.record-company.button.create" action="/anonymous/record-company/create"/>--%>
	<acme:form-return code="anonymous.record-company.button.return" />
</acme:form>
