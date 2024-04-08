package io.javabrains.springbootsecurity.models;


public class AttendanceRecord {
    
    //private int id;
    private int day;
    private boolean isPresent;

    public AttendanceRecord(int day, boolean isPresent) {
        //this.id = id;
        this.day = day;
        this.isPresent = isPresent;
    }

    public void setAttendance(AttendanceRecord record)
    {
        //this.id=record.getId();
        this.day=record.getDay();
        this.isPresent=record.getIsPresent();
    }

    // public int getId()
    // {
    //     return this.id;
    // }
    // public void setId(int id)
    // {
    //     this.id=id;
    // }

    public int getDay()
    {
        return this.day;
    }
    public void setDay(int day)
    {
        this.day=day;
    }

    public boolean getIsPresent()
    {
        return this.isPresent;
    }
    public void setIsPresent(boolean isPresent)
    {
        this.isPresent=isPresent;
    }


}
