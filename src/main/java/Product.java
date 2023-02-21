public class Product {
    protected int id;
    protected String productName;
    protected float productCost;

    //конструктор//
    public Product(int id, String productName, float productCost){
        this.id = id;
        this.productCost = productCost;
        this.productName = productName;
    }
//генерируем гетеры и сеттеры//
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductCost() {
        return productCost;
    }

    public void setProductCost(float productCost) {
        this.productCost = productCost;
    }
}
