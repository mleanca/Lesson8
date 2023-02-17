package Lesson8Ex3Of3;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        switch (month) {
            case 1:
                this.month = 1;
                break;
            case 2:
                this.month = 2;
                break;
            case 3:
                this.month = 3;
                break;
            case 4:
                this.month = 4;
                break;
            case 5:
                this.month = 5;
                break;
            case 6:
                this.month = 6;
                break;
            case 7:
                this.month = 7;
                break;
            case 8:
                this.month = 8;
                break;
            case 9:
                this.month = 9;
                break;
            case 10:
                this.month = 10;
                break;
            case 11:
                this.month = 11;
                break;
            case 12:
                this.month = 12;
                break;
            default:
                this.month = 0;
        }
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}

