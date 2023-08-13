import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Book book = new Book("Ак кеме ", 50, "Чынгыз Айтматов");
//        Book book1 = new Book("Бетме бет ", 10, "Чынгыз Айтматов");
//        Book book2 = new Book("Ак буура", 24, "Чынгыз Айтматов");
//        Book book3 = new Book("Узак жол  ", 45, "Мукал Эелебаев");
//        Book book4 = new Book(" big man", 26, "Депутат");
//        Book book5 = new Book("Кылым карыттар  ", 40, "Чынгыз Айтматов");
//        Book book6 = new Book("Богатый папа и Бедный папа ", 30, "Роберт Киосаки");
//
//        // Создаем массив книг
//        Book[] books = {book, book1, book2, book3, book4, book5,};
//        Library library = new Library("Bilimkana", "Чынгыз Атматова 454", books);
//
//        // Список книг
//        library.displayBooks();
//
//        //добавление книг
//        System.out.println(library.addABookToTheLibrary(book6));
//        for (Book search : books) {
//            System.out.println(search);
//        }
//
//        System.out.println("Обновление книги");
//        System.out.println(library.updateBookByName("Ак буура", 74));
//
//        // Список книг
//        library.displayBooks();
//        System.out.println(book2);
//        System.out.println("Проверка на удаление книг ");
//
//        // Удаление книг
//        library.removeBookFromLibrary("Ак буура");
//        // Проверка на поиск Книг
//        library.removeBookFromLibrary("Aray");
//
//        System.out.println(Arrays.toString(library.getAllBookByAuthor("Чынгыз Атматов")));
//        System.out.println(library.searchBookByName("Ак буура"));

        //Class student
        StudentManager studentManager = new StudentManager(10);
        Student student1 = new Student(1,"Бегимай Алыкулова", (byte) 20, "it ", "java 11");
        Student student2 = new Student(2,"Артур Ибрагимович", (byte) 20, "it ", "java 11");
        Student student3 = new Student(3,"Билал Шарапов", (byte) 18, "it ", "jc 10");
        Student student4 = new Student(4,"Абраав Хакими", (byte) 20, "it ", "java 11");
        Student student5 = new Student(5,"Тунук исаилова", (byte) 17, "it ", "java 10");
        Student student6 = new Student(6,"Аделя Учкунова", (byte) 23, "it ", "java 10");
        Student student7 = new Student(7,"Бегимай Алыкулова", (byte) 20, "it ", "java 9");
        Student student8 = new Student(8,"Марсель Артуров", (byte) 18, "it ", "jc 11");
        Student student9 = new Student(9,"Карим Бензема", (byte) 20, "it ", "java 11");
        Student student10 = new Student(10,"Жанжар Серцеедов", (byte) 24, "it ", "java 9");
        // Создаем массив для студентов
        Student[] students = {student3, student4, student5, student6, student7, student8, student9, student10};

        System.out.println("Добавление студента");
        studentManager.addStudent(student1);

        System.out.println("Удаление студента");
        studentManager.deleteStudent(1);

        System.out.println("search student is ID ");
        Student foundStudent = studentManager.findStudentById(10);
        if (foundStudent != null) {
            System.out.println("Найденный студент:" + foundStudent.getName());
        } else {
            System.out.println("Студент не найден .");
        }
        System.out.println("обновление студента ");
        Student updatedStudent = new Student(2, "Валодя ", 23, "CS", "Java");
        studentManager.updateStudent(updatedStudent);
    }
}
