package name.wilu.actions;

import com.opensymphony.xwork2.ActionSupport;
import name.wilu.model.LookupRequest;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import java.util.Arrays;
import java.util.List;


@Action(value = "table", results = {@Result(location = "table.jsp")})
public class TableAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        return super.execute();
    }

    public String approve() {
        return SUCCESS;
    }

    public List<LookupRequest> getLookupRequests() {
        return Arrays.asList(
                new LookupRequest(1L, "First lookup"),
                new LookupRequest(2L, "Second lookup"),
                new LookupRequest(3L, "Third lookup"));
    }

    public void setSelected(List<Object> selected) {
        LOG.info(selected.toString());
    }
}
