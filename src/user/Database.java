package user;

import user.method.Bufferedstream;
import user.object.User;

import java.util.ArrayList;
import java.util.Objects;

public class Database {
    ArrayList<User> users = new ArrayList<User>();
    Bufferedstream bufferedstream = new Bufferedstream();

    // 공통 클래스
    public User findUserByID(String userID) {
        for (User user : users) {
            if (Objects.equals(user.getId(), userID)) {
                return user;
            }
        }
        return null;
    }

    public boolean isUserExist(String id) {
        return  users.contains(findUserByID(id));
    }

    public boolean isEmpty() {
        return users.isEmpty();
    }

    public boolean isUserExistByParams(String params) {
        return  users.contains(findUserByID(params));
    }


    // 1. 등록
    public void insertUser(User user) {
        bufferedstream.input(user);
        bufferedstream.read();
    }

    // 2. 수정
    public void modifyUser(String id, int age, int score) {
        User findeduser = findUserByID(id);
        int index = users.indexOf(findeduser);
    }

    // 3. 삭제
    public void deleteUser(String userID) {
        User findeduser = findUserByID(userID);
        users.remove(findeduser);
    }

    // 4. 조회
    public ArrayList<User> showUsers() {
        return users;
    }
}
