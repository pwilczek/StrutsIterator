package name.wilu.model;

public class LookupRequest {

    private boolean selected;
    private String name;

    public LookupRequest(boolean selected, String name) {
        this.selected = selected;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }


}
