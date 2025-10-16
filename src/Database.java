import java.util.ArrayList;

public class Database {
    ArrayList<Student> students = new ArrayList<Student>();

    public Student FindStudentByID(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public boolean IsStudentExist(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void InsertStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> ShowStudents() {
        return students;
    }

    public void modifyStudent(int id, String name, int age) {
        Student findedStudent = FindStudentByID(id);
        int index = students.indexOf(findedStudent);
        Student newStudent = new Student(name, age, id);
        students.set(index, newStudent);
    }


    public void deleteStudent(int id) {
        Student findedStudent = FindStudentByID(id);
        students.remove(findedStudent);
    }
}
