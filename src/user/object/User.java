package user.object;

public class User {
    // 클래스 요소
    private String userID;
    private String name;
    private MemberGrade [] grades;
    private int id = 0;
    private String password;

    // Getter
    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public MemberGrade [] getMember() {
        return grades;
    }

    // 생성자 초기화
    public User(String userID, String name, String pw) {
        grades = new MemberGrade [0];
        ++id;

        this.userID = userID;
        this.name = name;
        this.password = pw;
    }
}