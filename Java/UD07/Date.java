package UD07;

public class Date {
    int year;
    int month;
    int day;
    public Date(int year, int month, int day) {
        this.year = 2013;
        this.month = 11;
        this.day = 30;
        
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;

    }
    @Override
    public String toString() {
        return String.format("%02d/%02d/%4d", day, month, year);
    }

}
