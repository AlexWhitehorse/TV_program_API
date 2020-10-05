package models;

import java.util.Date;

public class TvProgram {
    private int programId;
    private TvChannel channnel = new TvChannel();
    private WeekDay weekDay = new WeekDay();
    private Date start;
    private Date stop;
    private String nameShow;
}
