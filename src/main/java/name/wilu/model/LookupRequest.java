package name.wilu.model;

public class LookupRequest {

    private final Long id;
    private final String name;

    public LookupRequest(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
}
