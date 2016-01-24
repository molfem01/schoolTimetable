package model;

import control.ConstructionException;

/**
 * Created by Marco on 24/01/2016.
 */
public class TimetableCellDO {

    private TeacherDO teacher;
    private SchoolClassDO schoolClass;
    private TimeCoordinateDO timeCoordinate;
    private int size;

    public TimetableCellDO(TeacherDO teacher, SchoolClassDO schoolClass, TimeCoordinateDO timeCoordinate, int size){
        if (size <= 0){
            throw new ConstructionException();
        }

        this.teacher = teacher;
        this.schoolClass = schoolClass;
        this.timeCoordinate = timeCoordinate;
        this.size = size;
    }

    public TeacherDO getTeacher() {
        return teacher;
    }

    public SchoolClassDO getSchoolClass() {
        return schoolClass;
    }

    public TimeCoordinateDO getTimeCoordinate() {
        return timeCoordinate;
    }

    public int getSize() {
        return size;
    }

    public void setTeacher(TeacherDO teacher) {
        this.teacher = teacher;
    }

    public void setSchoolClass(SchoolClassDO schoolClass) {
        this.schoolClass = schoolClass;
    }

    @Override
    public String toString() {
        return "TimetableCellDO{" +
                "teacher=" + teacher +
                ", schoolClass=" + schoolClass +
                ", timeCoordinate=" + timeCoordinate +
                ", size=" + size +
                '}';
    }
}
