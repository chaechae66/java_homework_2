package user;

public enum MemberGrade {
    BASIC(10),
    SLIVER(15),
    GOLD(30);

    private final int sale;


    MemberGrade(int sale) {
        this.sale = sale;
    }

    public int getSale() {
        return sale;
    }
}
