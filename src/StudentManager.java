import java.util.Arrays;

public class StudentManager  {
    private Student[] students;
    private int studentCount;

    public StudentManager(int capacity) {
        students = new Student[capacity];
        studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Студент успешно добавлен.");
        } else {
            System.out.println("Не удается добавить учащегося, нет мест , заполнено.");
        }
    }
// нахождение студента по id
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student != null && student.getId() == id) {
                return student;
            }
        }
        return null; // нет сдутента
    }

    public void updateStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == student.getId()) {
                students[i] = student;
                System.out.println("Студент успешно  обновлен.");
                return;
            }
        }
        System.out.println("Студент не найдет, студент не обновлен .");
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentCount--;
                System.out.println("Студент успешно удален.");
                return;
            }
        }
        System.out.println("Студент не найдет, студент не удален.");
    }
    }


