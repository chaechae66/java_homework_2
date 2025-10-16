import java.util.ArrayList;
import java.util.Scanner;

public class Print {
    Scanner input = new Scanner(System.in);
    Database db = new Database();

    public int showAboutList(){
        System.out.println("=== 학생 관리 프로그램 ===\n1. 학생등록\n2. 학생 목록 보기\n3. 학생 검색\n4. 학생 수정\n5. 학생 삭제\n0. 종료");
        System.out.println("어떤 번호로 하시겠어요? 숫자로만 입력해주세요");
        int num = input.nextInt();
        return num;
    }

    public int getId(String str){
        System.out.println(str+" 학생의 학번을 입력하세요");
        int id = input.nextInt();
        return id;
    }

    public String InsertName(){
        System.out.println("학생의 이름을 입력하세요");
        String name = input.next();
        return name;
    }

    public int InsertAge(){
        System.out.println("학생의 나이를 입력하세요");
        int age = input.nextInt();
        return age;
    }

    public void Insert(){
        System.out.println("학생의 이름을 입력하세요");
        String name = input.next();

        System.out.println("학생의 나이를 입력하세요");
        int age = input.nextInt();

        System.out.println("학생의 학번을 입력하세요");
        int id = input.nextInt();

        Student student = new Student(name,age, id);

        db.InsertStudent(student);

        System.out.println("등록이 완료되었습니다.");
    }

    public void show(){
        ArrayList<Student> students = db.ShowStudents();
        if(students.isEmpty()){
            System.out.println("등록된 학생이 존재하지 않습니다.");
            return;
        }
        for (Student student : students) {
            System.out.println("학번: " + student.getId() + " 이름: " + student.getName() + " 나이: " + student.getAge());
        }
    }

    public void search(){
        int id = getId("검색할");
        if(!db.IsStudentExist(id)){
            System.out.println("해당 학번인 학생이 존재하지 않습니다.");
            return;
        }
        Student student =db.FindStudentByID(id);
        System.out.println(student.getId()+"학번의 학생의 이름은 "+student.getName()+" 이고, 나이는 "+student.getAge()+"세 입니다.");
    }

    public void modify(){
        int id = getId("수정할");
        if(!db.IsStudentExist(id)){
            System.out.println("해당 학번인 학생이 존재하지 않습니다.");
            return;
        }
        String name = InsertName();
        int age = InsertAge();
        db.modifyStudent(id, name, age);

        System.out.println("수정이 완료되었습니다.");
    }

    public void delete(){
        int id = getId("삭제할");
        if(!db.IsStudentExist(id)){
            System.out.println("해당 학번인 학생이 존재하지 않습니다.");
            return;
        }
        db.deleteStudent(id);

        System.out.println("삭제가 완료되었습니다.");
    }
}
