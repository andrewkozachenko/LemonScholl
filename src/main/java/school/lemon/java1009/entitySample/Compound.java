package school.lemon.java1009.entitySample;

public class Compound {
    
    private String name;
    private String pack;
    private String supplier;
    private String location;

    public Compound() {
    }

    public Compound(String name, String pack, String supplier, String location) {
        this.name = name;
        this.pack = pack;
        this.supplier = supplier;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
