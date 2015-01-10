package name.wilu.actions;

import com.opensymphony.xwork2.ActionSupport;
import name.wilu.model.LookupRequest;
import org.apache.struts2.convention.annotation.Result;

import java.util.ArrayList;
import java.util.List;

@Result(location = "table.jsp")
public class TableAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        LOG.info(this.getClass().getSimpleName() + "is being executed!");
        return super.execute();
    }

    public Iterable<LookupRequest> getLookupRequests() {
        List<LookupRequest> result = new ArrayList<LookupRequest>();
        result.add(new LookupRequest(true, "First lookup"));
        result.add(new LookupRequest(false, "Seconf lookup"));
        result.add(new LookupRequest(false, "Third lookup"));
        return result;
    }
}
