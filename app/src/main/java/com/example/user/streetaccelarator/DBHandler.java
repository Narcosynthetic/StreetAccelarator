package com.example.user.streetaccelarator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import android.os.Build;

/**
 * Created by user on 24/9/2017.
 */

public class DBHandler extends SQLiteOpenHelper {

    //Datebase Version
    private static final int DATABASE_VERSION = 1;

    //DaraBAse Name
    private static final String DATABASE_NAME = "StreetAccelarator";

    //Tables
    private static final String TABLE_USER = "User";
    private static final String TABLE_HOLE = "Hole";
    private static final String TABLE_COURSE = "Course";
    private static final String TABLE_COURSE_DETAIL = "CourseDetail";

    //Table Fields
    private static final String USER_ID = "_userId";
    private static final String USERNAME = "_userName";
    private static final String PASSWORD = "_password";

    private static final String HOLESID = "_holesId";
    private static final String COURSEID = "_courseId";
    private static final String COORDINATEX = "_coordinateX";
    private static final String COORDINATEY = "_coordinateY";
    private static final String CONFIRMATIONSTATUS = "_confirmationStatus";

    //private static final String COURSEID = "_courseId";
    //private static final String USERID = "_userId";
    private static final String INITIALCOORDINATEX = "_initialCoordinateX";
    private static final String INITIALCOORDINATEY = "_initialCoordinateY";
    private static final String INITIALDATETIME = "_initialDateTime";

    private static final String COURSEDETAILID = "_courseDetailId";
    //private static final String COURSEID = "_courseId";
    private static final String ORDER = "_order";
    //private static final String COORDINATEX = "_coordinateX";
    //private static final String COORDINATEY = "_coordinateY";
    private static final String DATETIME = "_datetime";

    //constructor
    public DBHandler(Context contex) {
        super(contex, DATABASE_NAME, null, DATABASE_VERSION);
    }


    //Creating Tables

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_USER + "("
                + USER_ID + " INTEGER PRIMARY KEY, "
                + USERNAME + " TEXT, "
                + PASSWORD + " TEXT)";
        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addNewUser(User newUser)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(USERNAME, newUser.get_userName());
        values.put(PASSWORD, newUser.get_password());

        db.insert(TABLE_USER, null, values);
        db.close();
    }
    // Getting users Count
    public int getUsersCount() {
        String countQuery = "SELECT * FROM " + TABLE_USER;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

    // return count
        return cursor.getCount();
    }

    public void addNewCourse(Course newCourse)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(USER_ID, newCourse.get_userId());
        values.put(INITIALCOORDINATEX, newCourse.get_initialCoordinateX());
        values.put(INITIALCOORDINATEY, newCourse.get_initialCoordinateY());
        values.put(INITIALDATETIME, newCourse.get_initialDateTime());

        db.insert(TABLE_COURSE, null, values);
        db.close();;
    }

    public void addNewCourseDetail(CourseDetail newCourseDetail)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COURSEID, newCourseDetail.get_courseId());
        values.put(ORDER, newCourseDetail.get_order());
        values.put(COORDINATEX, newCourseDetail.get_coordinateX());
        values.put(COORDINATEY, newCourseDetail.get_coordinateY());
        values.put(DATETIME, newCourseDetail.get_datetime());

        db.insert(TABLE_COURSE, null, values);
        db.close();;
    }

    public void addNewHole(Hole newHole)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COURSEID, newHole.get_courseId());
        values.put(COORDINATEX, newHole.get_coordinateX());
        values.put(COORDINATEY, newHole.get_coordinateY());
        values.put(CONFIRMATIONSTATUS, newHole.get_confirmationStatus());

        db.insert(TABLE_HOLE, null, values);
        db.close();;
    }
}
