package com.example.ap_11_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    SensorManager deviceSensorManager;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        deviceSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        List<Sensor> availableSensors = deviceSensorManager.getSensorList(Sensor.TYPE_ALL);
        String sensornames="";
        for(int i=0;i<availableSensors.size();i++){
            sensornames+="\n name: "+availableSensors.get(i).getName()+
                    "\n type: "+availableSensors.get(i).getType()+
                    "\n vendor: "+availableSensors.get(i).getVendor()+
                    "\n power: "+availableSensors.get(i).getPower()+
                    "\n maxrange: "+ availableSensors.get(i).getMaximumRange()+"\n";
        }
        txt = findViewById(R.id.sensornametxt);
        txt.setText(sensornames);
    }
}
