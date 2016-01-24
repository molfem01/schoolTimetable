package model;

/**
 * Created by Marco on 24/01/2016.
 */
public class TimeCoordinateDO {

    private int dayOfWeek;
    private int hourOfDay;


    public TimeCoordinateDO(int dayOfWeek, int hourOfDay) {
        this.dayOfWeek = dayOfWeek;
        this.hourOfDay = hourOfDay;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public int getHourOfDay() {
        return hourOfDay;
    }
}
