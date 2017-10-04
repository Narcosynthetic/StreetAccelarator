package com.example.user.streetaccelarator;

/**
 * Created by user on 24/9/2017.
 */

public class User {

    int _userId;
    String _userName;
    String _password;

    public int get_userId() {
        return _userId;
    }

    public void set_userId(int _userId) {
        this._userId = _userId;
    }

    public String get_userName() {
        return _userName;
    }

    public void set_userName(String _userName) {
        this._userName = _userName;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    //constructor
    public User(){

    }

    //constructor forCreate
    public User(String _userName, String _password){
        this._userName = _userName;
        this._password = _password;
    }

    //constructor for Update, Delete
    public User(int _userId, String _userName, String _password){
        this._userId = _userId;
        this._userName = _userName;
        this._password = _password;
    }

}


