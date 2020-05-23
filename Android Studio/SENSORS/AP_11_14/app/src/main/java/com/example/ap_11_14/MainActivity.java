package com.example.ap_11_14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {

    SensorManager deviceSensorManager;
    Sensor accelerometer, lightsensor;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deviceSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        textView1 = findViewById(R.id.textView_accid);
        textView2 = findViewById(R.id.textView_lightid);


    }

    @Override
    protected void onPause(){
        super.onPause();
        deviceSensorManager.unregisterListener(this);
    }

    @Override
    protected void onResume(){
        super.onResume();
        accelerometer = deviceSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        lightsensor = deviceSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        if (accelerometer!=null){
            deviceSensorManager.registerListener(this,accelerometer, SensorManager.SENSOR_DELAY_UI);
        }else{
            Toast.makeText(this,"No accelerometer", Toast.LENGTH_LONG).show();
        }

        if(lightsensor!=null){
            deviceSensorManager.registerListener(this,lightsensor,SensorManager.SENSOR_DELAY_UI);
        }else{
            Toast.makeText(this,"No light sensor",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        switch (event.sensor.getType()){
            case Sensor.TYPE_ACCELEROMETER:
                textView1.setText("x: "+Float.toString(event.values[0])+
                        "\n y: "+Float.toString(event.values[1])+
                        "\n z: "+Float.toString(event.values[2]));
                break;
            case Sensor.TYPE_LIGHT:
                textView2.setText("light: "+Float.toString(event.values[0]));
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
