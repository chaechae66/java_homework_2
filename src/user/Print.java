package user;

import common.ExceptionHandler;
import user.object.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Print {
    Scanner input = new Scanner(System.in);
    Database db = new Database();
    User user;

    // 0. 공통
    private String getUserID() {
        System.out.println("수정할 사용자의 아이디를 입력하세요");
        String userID = input.next();

        return userID;
    }

    // 1. 등록
    public void insert(){
        try{
            System.out.println("사용자의 아이디를 입력하세요");
            String userID = input.next();

            System.out.println("사용자의 비밀번호를 입력하세요");
            String pw = input.next();

            System.out.println("사용자의의 이름을 입력하세요");
            String name = input.next();

            if(db.isUserExist(userID)){
                System.out.println("이미 존재하는 아이디를 사용 하실 수 없습니다.");
                return;
            }

            user = new User(userID, name, pw);


            System.out.println("등록이 완료되었습니다.");
        } catch (Exception e){
            ExceptionHandler.handleException(e);
        }
    }

    // 2. 수정
    public void modify(){
        String userID = getUserID();

        if(db.isEmpty()){
            System.out.println("등록된 학생이 존재하지 않습니다. 등록부터 이용 부탁드립니다.");
            return;
        }

        if(!db.isUserExistByParams(userID)){
            System.out.println("해당 학번인 학생이 존재하지 않습니다.");
            return;
        }

        User findedUser =db.findUserByID(userID);


        int num;
        System.out.println("수정할 요소의 번호를 선택해주세요. \n1. 이름\n2. 비밀번호");
        num = input.nextInt();

        if(num == 1){
            String name = input.next();

            // DB 접근하는 내용

        }else if(num == 2){
            String pw = input.next();

            // DB 접근하는 내용

        }else {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        System.out.println("수정이 완료되었습니다.");
    }

    // 3. 삭제
    public void delete(){

        String userID = getUserID();

        if(db.isEmpty()){
            System.out.println("등록된 학생이 존재하지 않습니다. 등록부터 이용 부탁드립니다.");
            return;
        }

        if(!db.isUserExist(userID)){
            System.out.println("해당 학번인 학생이 존재하지 않습니다.");
            return;
        }

        db.deleteUser(userID);

        System.out.println("삭제가 완료되었습니다.");
    }

    // 4. 조회
    public void show(){
        ArrayList<User> Users = db.showUsers();
        if(db.isEmpty()){
            System.out.println("등록된 학생이 존재하지 않습니다. 등록부터 이용 부탁드립니다.");
            return;
        }

        for (User user : Users) {
            System.out.println("등록 번호 : " + user.getId() + " 아이디 : " + user.getUserID() + " 비밀번호 : " + user.getPassword() + " 회원 이름 : " + user.getName() + " 회원 등급 : " + user.getMember() + "\n");
        }
    }

}
