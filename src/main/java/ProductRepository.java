public class ProductRepository {

    private Product[] products = new Product[0];

    //позволяющий сохранять Product
    public void save(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    //findAll — возвращает массив всех хранящихся в массиве объектов Product
    public Product[] findAll() {
        return products;
    }

    //removeById — удаляет объект по идентификатору, если объекта нет, то будет исключение
    public void removeById(int id) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].getId() == id) {
                products[i] = null;
            }
        }

    }
}
