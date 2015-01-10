<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="table">
    <table>
        <tr>
            <th>Selected</th>
            <th>Lookup Name</th>
            <th>Download</th>
        </tr>
        <s:iterator value="lookupRequests" var="request">
            <tr>
                <td><s:checkbox name="selected" fieldValue="%{id}"/></td>
                <td><s:property value="name"/></td>
                <td>TBD</td>
            </tr>
        </s:iterator>
    </table>
    <s:submit value="Delete" method="approve" />
</s:form>