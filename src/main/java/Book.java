public class Book extends Product{
    private String nameBook;
    private String autor;

    public Book(int id, String productName, float productCost, String nameBook, String autor){
        super(id,productName,productCost);
        this.nameBook = nameBook;
        this.autor = autor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
