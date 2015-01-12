<%@ taglib prefix="s" uri="/struts-tags" %>

<script type="text/javascript" src="http://code.jquery.com/jquery-2.1.3.min.js"></script>
<script type="text/javascript">
    var lookupRequest = function(){
        var result = {
            action : function(id) {
                //window.alert(id);
                $.ajax({
                    url : '/table',
                    data : {'id' : id}
                });
            }
        }
        return result;
    }();
</script>
<s:form action="table">
    <table>
        <tr>
            <th>Select</th>
            <th>Lookup ID</th>
            <th>Lookup Name</th>
            <th>Action</th>
        </tr>
        <s:iterator value="lookupRequests" var="request">
            <tr>
                <td><s:checkbox name="selected" fieldValue="%{id}"/></td>
                <td><s:property value="id"/></td>
                <td><s:property value="name"/></td>
                <td><img src="images\excel.png" style="width:30px; height:30px"
                    onclick="lookupRequest.action($(this).closest('tr').find('td:nth-child(2)').text());"></td>
            </tr>
        </s:iterator>
    </table>
    <s:submit value="Approve" method="approve" />
</s:form>