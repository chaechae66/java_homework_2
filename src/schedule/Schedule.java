package schedule;

import java.util.Date;

public class Schedule {
    private int id;
    private String title;
    private Date savedDate;
    private Date modifyDate;
    private String memo;

    public Schedule(int id, String title, Date savedDate, Date modifyDate, String memo) {
        this.id = id;
        this.title = title;
        this.savedDate = savedDate;
        this.modifyDate = modifyDate;
        this.memo = memo;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getSavedDate() {
        return savedDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public String getMemo() {
        return memo;
    }
}
