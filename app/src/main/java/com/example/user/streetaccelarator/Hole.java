package com.example.user.streetaccelarator;

/**
 * Created by user on 24/9/2017.
 */

public class Hole {

    int _holeId;
    int _courseId;
    double _coordinateX;
    double _coordinateY;
    int _confirmationStatus;

    public int get_holesId() {
        return _holeId;
    }

    public void set_holesId(int _holesId) {
        this._holeId = _holesId;
    }

    public int get_courseId() {
        return _courseId;
    }

    public void set_courseId(int _courseId) {
        this._courseId = _courseId;
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

    public int get_confirmationStatus() {
        return _confirmationStatus;
    }

    public void set_confirmationStatus(int _confirmationStatus) {
        this._confirmationStatus = _confirmationStatus;
    }

    public Hole(){

    }

    //constructor forCreate
    public Hole(int _courseId, double _coordinateX, double _coordinateY, int _confirmationStatus){

        this._courseId = _courseId;
        this._coordinateX = _coordinateX;
        this. _coordinateY = _coordinateY;
        this._confirmationStatus = _confirmationStatus;
    }

    //constructor for Update, Delete
    public Hole(int _holeId, int _courseId, double _coordinateX, double _coordinateY, int _confirmationStatus){

        this._holeId = _holeId;
        this._courseId = _courseId;
        this._coordinateX = _coordinateX;
        this. _coordinateY = _coordinateY;
        this._confirmationStatus = _confirmationStatus;
    }
}
