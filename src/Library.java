import java.util.Arrays;

public class Library {
    private String name;
    private String address;
    private Book[] books;
    public Library(String name, String address, Book[] books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Book[] getBooks() {
        return books;
    }
    public void setBooks(Book[] books) {
        this.books = books;
    }
    public String addABookToTheLibrary(Book book){
        for (Book d:books) {
            if (d.getName().equals(book.getName())){return "Такая книга у нас есть ";}}
        Book[] books1 = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {books1[i] = books[i];}


        books1[books.length] = book;
        books = Arrays.copyOf(books1, books1.length);
        return "Вы добавили книгу: " + book.getName();
    }

    public void displayBooks() {
        System.out.println("Список книг в библиотеке:");
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }
    public Book[] removeBookFromLibrary(String bookName){
        int indexToRemove = -1;
            for (int i = 0; i < books.length; i++) {
                if (books[i].getName().equals(bookName)) {
                    indexToRemove = i;
                    break;
                }
            }
            if (indexToRemove != -1) {
                Book[] updatedBooks = new Book[books.length - 1];
                System.arraycopy(books, 0, updatedBooks, 0, indexToRemove);
                System.arraycopy(books, indexToRemove + 1, updatedBooks, indexToRemove, books.length - indexToRemove - 1);
                books = updatedBooks;

                System.out.println("Книга удалена: " + bookName);
            } else {
                System.out.println("Книга с таким названием не найдена: " + bookName);
            }

            return books;
        }

    public Book updateBookByName(String bookName, int newQuantity) {
       int  indexToRemove = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(bookName)) {
                books[i].setQuantity(newQuantity);
                return books[i];
            }
        }
        return null; // если нет такой книги выходит null
    }
    public Book[] getAllBookByAuthor(String author) {
        Book[] result = new Book[0];
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result = Arrays.copyOf(result, result.length);
                result[result.length] = book;
            }
        }
        return result;

    } public Book searchBookByName(String bookName) {
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }}



