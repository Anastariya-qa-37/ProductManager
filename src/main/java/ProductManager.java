public class ProductManager {

    private ProductRepository repo;

    public ProductManager(ProductRepository repos){
        this.repo = repos;
    }

    public void add(Product product){//добавление в репозиторий
            repo.save(product);
    }



    public Product[] searchBy(String text) {
        Product[] result = new Product[0]; // тут будем хранить подошедшие запросу продукты
        for (Product product: repo.findAll()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;// "добавляем в конец" массива result продукт product
            }
        }
        return result;
    }

    // метод определения соответствия товара product запросу search
    private boolean matches(Product product, String search) {
        if (product.getProductName().contains(search)) {
            return true;
        } else {
            return false;
        }
        // или в одну строку:
        // return product.getProductName().contains(search);
    }
}
