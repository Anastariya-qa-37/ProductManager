import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ProductRepositoryTest {

    private Product[] products = new Product[0];
    ProductRepository repo = new ProductRepository();

    //подготовим данные для тестов
    Book book = new Book(1, "book", 1000, "testirovanie Dot com", "Roman Savin");
    Smartphone smartphone = new Smartphone(2, "smartphone", 150000,"Samsung galaxsi A2","japan");


    @Test
    void save() {
       repo.save(book);
        Product[] expected = {book};


        // вызываем целевой метод:
        Product[] actual = repo.findAll();


        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findAllNone() {
        repo.removeById(1);
        Product[] expected = {};


        // вызываем целевой метод:
        Product[] actual = repo.findAll();


        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findAll() {
        repo.save(book);
        repo.save(smartphone);
        Product[] expected = {book,smartphone};


        // вызываем целевой метод:
        Product[] actual = repo.findAll();


        // производим проверку (сравниваем ожидаемый и фактический):
        //assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeById() {
        repo.save(book);
        Product[] expected = {null};

        // вызываем целевой метод:
        repo.removeById(1);
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void removeByIdNone() {
        repo.save(book);
        Product[] expected = {book};

        // вызываем целевой метод:
        repo.removeById(32);
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }


}
