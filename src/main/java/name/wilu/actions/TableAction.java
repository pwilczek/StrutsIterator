package name.wilu.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;

@Result(location = "table.jsp")
public class TableAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        LOG.info(this.getClass().getSimpleName() + "is being executed!");
        return super.execute();
    }
}
