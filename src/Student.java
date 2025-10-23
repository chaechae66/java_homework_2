public class Student {
    private String name;
    private int age;
    private String id;
    private int score;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int age, String id,int score) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.score = score;
    }
}
