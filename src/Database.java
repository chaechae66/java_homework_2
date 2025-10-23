import java.util.ArrayList;
import java.util.Objects;

public class Database {
    ArrayList<Student> students = new ArrayList<Student>();

    public Student findStudentByID(String id) {
        for (Student student : students) {
            if (Objects.equals(student.getId(), id)) {
                return student;
            }
        }
        return null;
    }

    public boolean isStudentExist(String id) {
        for (Student student : students) {
            if (Objects.equals(student.getId(), id)) {
                return true;
            }
        }
        return false;
    }

    public boolean isStudentExistByParams(String params) {
        for (Student student : students) {
            if (Objects.equals(student.getId(), params) || Objects.equals(student.getName(), params)) {
                return true;
            }
        }
        return false;
    }


    public ArrayList<Student> findStudentByParams(String params) {
        ArrayList<Student> findedStudents = new ArrayList<>();
        for (Student student : students) {
            if (Objects.equals(student.getId(), params) || Objects.equals(student.getName(), params)) {
                findedStudents.add(student);
            }
        }
        return findedStudents;
    }


    public void insertStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> showStudents() {
        return students;
    }

    public void modifyStudent(String id, int age, int score) {
        Student findedStudent = findStudentByID(id);
        int index = students.indexOf(findedStudent);
        Student newStudent = new Student(findedStudent.getName(), age, id, score);
        students.set(index, newStudent);
    }


    public void deleteStudent(String id) {
        Student findedStudent = findStudentByID(id);
        students.remove(findedStudent);
    }
}
