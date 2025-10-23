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

    public String getID(String str){
        System.out.println(str+" 학생의 학번을 입력하세요");
        String id = input.next();
        return id;
    }

    public String getParams(String str){
        System.out.println(str+" 학생의 학번 또는 이름을 입력하세요");
        String params = input.next();
        return params;
    }

    public int insertAge(){
        System.out.println("학생의 나이를 입력하세요");
        int age = input.nextInt();
        return age;
    }

    public int insertScore(){
        System.out.println("학생의 점수를 입력하세요");
        int score = input.nextInt();
        return score;
    }

    public void insert(){
        System.out.println("학생의 이름을 입력하세요");
        String name = input.next();

        System.out.println("학생의 나이를 입력하세요");
        int age = input.nextInt();

        System.out.println("학생의 학번을 입력하세요");
        String id = input.next();

        if(!db.isStudentExist(id)){
            System.out.println("이미 존재하는 학번은 등록할 수 없습니다.");
            return;
        }

        System.out.println("학생의 점수를 입력하세요");
        int score = input.nextInt();

        Student student = new Student(name,age, id, score);

        db.insertStudent(student);

        System.out.println("등록이 완료되었습니다.");
    }

    public void show(){
        ArrayList<Student> students = db.showStudents();
        if(students.isEmpty()){
            System.out.println("등록된 학생이 존재하지 않습니다.");
            return;
        }
        for (Student student : students) {
            System.out.println("학번: " + student.getId() + " 이름: " + student.getName() + " 나이: " + student.getAge() + " 점수: " + student.getScore());
        }
    }

    public void search(){
        String params = getParams("검색할");
        if(!db.isStudentExistByParams(params)){
            System.out.println("해당 학번인 학생이 존재하지 않습니다.");
            return;
        }
        ArrayList<Student> findedStudents =db.findStudentByParams(params);
        for (Student student : findedStudents) {
            System.out.println(student.getId() + "학번의 학생의 이름은 " + student.getName() + " 이고, 나이는 " + student.getAge() + "세 입니다." + "학생의 현재 점수는 "+ student.getScore() + "점 입니다.");
        }
    }

    public void modify(){
        String params = getParams("수정할");
        if(!db.isStudentExistByParams(params)){
            System.out.println("해당 학번인 학생이 존재하지 않습니다.");
            return;
        }
        ArrayList<Student> findedStudents =db.findStudentByParams(params);

        if(findedStudents.size() > 1){
            int num;
            System.out.println("수정은 한 번에 한 학생만 가능합니다. 수정할 학생의 번호를 정확히 선택해주세요.");
            for (Student student : findedStudents) {
                System.out.println((findedStudents.indexOf(student) + 1) + "번 : " + ", 이름 : " + student.getName() + " , 나이 : " + student.getAge() + "세, 학번 : " + student.getId());
            }

            num = input.nextInt();

            Student selectedStudent = findedStudents.get(num - 1);

            findedStudents.clear();
            findedStudents.add(selectedStudent);
        }

        String id = findedStudents.getFirst().getId();
        int age = insertAge();
        int score = insertScore();

        db.modifyStudent(id, age, score);

        System.out.println("수정이 완료되었습니다.");
    }

    public void delete(){
        String id = getID("삭제할");
        if(!db.isStudentExist(id)){
            System.out.println("해당 학번인 학생이 존재하지 않습니다.");
            return;
        }
        db.deleteStudent(id);

        System.out.println("삭제가 완료되었습니다.");
    }

    public void getScore(){
        ArrayList<Student> sortedStudents = db.sortedStudents();

        for (Student student : sortedStudents) {
            System.out.println(student.getId() + "학번의 학생의 이름은 " + student.getName() + " 이고, 나이는 " + student.getAge() + "세 입니다." + "학생의 현재 점수는 "+ student.getScore() + "점 입니다.");
        }
    }

    public void chart(){
        // 구현 예정
    }
}
