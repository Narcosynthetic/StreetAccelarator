package com.example.user.streetaccelarator;

/**
 * Created by user on 24/9/2017.
 */

public class CourseDetail {

    int _courseDetailId;
    int _courseId;
    int _order;
    double _coordinateX;
    double _coordinateY;
    String _datetime;

    public int get_courseDetailId() {
        return _courseDetailId;
    }

    public void set_courseDetailId(int _courseDetailId) {
        this._courseDetailId = _courseDetailId;
    }

    public int get_courseId() {
        return _courseId;
    }

    public void set_courseId(int _courseId) {
        this._courseId = _courseId;
    }

    public int get_order() {
        return _order;
    }

    public void set_order(int _order) {
        this._order = _order;
    }

    public double get_coordinateX() {
        return _coordinateX;
    }

    public void set_coordinateX(double _coordinateX) {
        this._coordinateX = _coordinateX;
    }

    public double get_coordinateY() {
        return _coordinateY;
    }

    public void set_coordinateY(double _coordinateY) {
        this._coordinateY = _coordinateY;
    }

    public String get_datetime() {
        return _datetime;
    }

    public void set_datetime(String _datetime) {
        this._datetime = _datetime;
    }

    public CourseDetail(){

    }
    public CourseDetail(int _courseId, int _order, double _coordinateX, double _coordinateY, String _datetime){

        this._courseId = _courseId;
        this._order = _order;
        this._coordinateX =_coordinateX;
        this._coordinateY =_coordinateY;
        this._datetime = _datetime;

    }

    public CourseDetail(int _courseDetailId, int _courseId, int _order, double _coordinateX, double _coordinateY, String _datetime){

        this._courseDetailId = _courseDetailId;
        this._courseId = _courseId;
        this._order = _order;
        this._coordinateX =_coordinateX;
        this._coordinateY =_coordinateY;
        this._datetime = _datetime;

    }
}
