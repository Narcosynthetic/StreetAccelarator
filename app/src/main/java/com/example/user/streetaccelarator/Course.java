package com.example.user.streetaccelarator;




/**
 * Created by user on 24/9/2017.
 */

public class Course {

    int _courseId;
    int _userId;
    double _initialCoordinateX;
    double _initialCoordinateY;
    String _initialDateTime;

    public int get_courseId() {
        return _courseId;
    }

    public void set_courseId(int _courseId) {
        this._courseId = _courseId;
    }

    public int get_userId() {
        return _userId;
    }

    public void set_userId(int _userId) {
        this._userId = _userId;
    }

    public double get_initialCoordinateX() {
        return _initialCoordinateX;
    }

    public void set_initialCoordinateX(double _initialCoordinateX) {
        this._initialCoordinateX = _initialCoordinateX;
    }

    public double get_initialCoordinateY() {
        return _initialCoordinateY;
    }

    public void set_initialCoordinateY(double _initialCoordinateY) {
        this._initialCoordinateY = _initialCoordinateY;
    }

    public String get_initialDateTime() {
        return _initialDateTime;
    }

    public void set_initialDateTime(String _initialDateTime) {
        this._initialDateTime = _initialDateTime;
    }

    public Course(){

    }

    //constructor forCreate
    public Course (int _userId, double _initialCoordinateX, double _initialCoordinateY, String _initialDateTime){
        this._userId = _userId;
        this._initialCoordinateX = _initialCoordinateX;
        this._initialCoordinateY = _initialCoordinateY;
        this._initialDateTime = _initialDateTime;
    }

    //constructor for Update, Delete
    public Course (int _courseId, int _userId, double _initialCoordinateX, double _initialCoordinateY, String _initialDateTime){
        this._courseId = _courseId;
        this._userId = _userId;
        this._initialCoordinateX = _initialCoordinateX;
        this._initialCoordinateY = _initialCoordinateY;
        this._initialDateTime = _initialDateTime;
    }


}
