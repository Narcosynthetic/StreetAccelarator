package com.example.user.streetaccelarator;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener{

    Sensor acceleometer;
    SensorManager sensorManager;
    TextView accelerationResult;
    DBHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        acceleometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, acceleometer, SensorManager.SENSOR_DELAY_NORMAL);

        accelerationResult = (TextView)findViewById(R.id.acceleration);

        db = new DBHandler(this);

        User nUser = new User("aaaa", "hfsiuhgw");
                db.addNewUser(nUser);
        User nUser1 = new User("bbb", "fefefw");
        db.addNewUser(nUser1);
        User nUser2 = new User("qwdsdg", "qwefgw");
        db.addNewUser(nUser2);

        User updUser = new User();
        db.updateUser(updUser);

        User dltUser = new User()
//        int test = db.getUsersCount();*/

        /*Hole nHole = new Hole (0, 1, 2, 1);
                db.addNewHole(nHole);*/




        final Button btnRegisterHole = (Button) findViewById(R.id.btnRegisterHole);
        btnRegisterHole.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        accelerationResult.setText("X: " + event.values[0] +
                                    "\nY: " + event.values[1] +
                                    "\nZ: " + event.values[2]);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
}
