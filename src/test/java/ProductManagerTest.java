import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class ProductManagerTest {

    ProductRepository repo = Mockito.mock(ProductRepository.class);
    Book book = new Book(1, "book", 1000, "testirovanie Dot com", "Roman Savin");
    Smartphone smartphone = new Smartphone(2, "smartphone", 150000,"Samsung galaxsi A2","japan");
    Smartphone smartphone2 = new Smartphone(3, "smartphone", 100000,"Samsung galaxsi m62","japan");
    @Test
    void add() {
        ProductManager manager = new ProductManager(repo);
        // подготавливаем данные:
        manager.add(book);
        // вызываем целевой метод:
        verify(repo).save(any());
        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
    }

    @Test
    void searchBy() {
        ProductManager manager = new ProductManager(repo);

        Product[] expected = {smartphone};
        Product[] items = {book,smartphone}; //


        // подготавливаем данные:
        doReturn(items).when(repo).findAll();//заглушка возвратит items при каждом вызове метода
        // вызываем целевой метод:
        Product[] actual = manager.searchBy("smartphone");


        // производим проверку (сравниваем ожидаемый и фактический):
        assertArrayEquals(expected, actual);

    }

    @Test
    void searchByNone() {
        ProductManager manager = new ProductManager(repo);

        Product[] expected = {};
        Product[] items = {book,smartphone}; //


        // подготавливаем данные:
        doReturn(items).when(repo).findAll();//заглушка возвратит items при каждом вызове метода
        // вызываем целевой метод:
        Product[] actual = manager.searchBy("smartphone 2");


        // производим проверку (сравниваем ожидаемый и фактический):
        assertArrayEquals(expected, actual);

    }

    @Test
    void searchByNone2() {
        ProductManager manager = new ProductManager(repo);

        Product[] expected = {smartphone,smartphone2};
        Product[] items = {smartphone,smartphone2}; //


        // подготавливаем данные:
        doReturn(items).when(repo).findAll();//заглушка возвратит items при каждом вызове метода
        // вызываем целевой метод:
        Product[] actual = manager.searchBy("smartphone");


        // производим проверку (сравниваем ожидаемый и фактический):
        assertArrayEquals(expected, actual);

    }

}
