package Lesson8Ex3Of3;

public class CalendarDate {
    public static void main(String[] args) {
        Date dateNow = new Date(17, 2, 2023);

        System.out.println("Date (zi/luna/an): " + dateNow.getDay() + "/" + dateNow.getMonth() + "/" + dateNow.getYear());
    }
    //Date (zi/luna/an): 17/2/2023
}
