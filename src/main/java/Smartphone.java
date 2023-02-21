public class Smartphone extends Product {
    private String model;
    private String manufacture;

    public Smartphone (int id, String productName, float productCost, String model, String manufacture){
        super(id,productName,productCost);
        this.model = model;
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
