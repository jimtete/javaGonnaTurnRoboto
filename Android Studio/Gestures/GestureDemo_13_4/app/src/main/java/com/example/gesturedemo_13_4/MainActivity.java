package com.example.gesturedemo_13_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener, GestureDetector.OnGestureListener
, View.OnDragListener, GestureDetector.OnDoubleTapListener {


    private ImageView img1,img2;
    private static final String TAG = "MainActivity";
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.image_1);
        img2 = findViewById(R.id.image_2);
        img1.setOnTouchListener(this);
        img2.setOnTouchListener(this);

        gestureDetector = new GestureDetector(this,this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if(v.getId()==R.id.image_1){
            gestureDetector.onTouchEvent(event);
            return true;
        }else{
            if (v.getId()==R.id.image_2){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.d(TAG, "onSingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Log.d(TAG, "onDoubleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Log.d(TAG, "onDoubleTapEventConfirmed");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        Log.d(TAG, "On down called");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        Log.d(TAG,"OnShowPress called");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.d(TAG,"onSingleTapUp called");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.d(TAG,"onScroll called");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        Log.d(TAG,"onLongPress called");
        View.DragShadowBuilder builder = new View.DragShadowBuilder(img1);
        img1.startDragAndDrop(null,builder,null,0);
        builder.getView().setOnDragListener(this);
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.d(TAG,"onFling called");
        return false;
    }


    @Override
    public boolean onDrag(View v, DragEvent event) {
        switch (event.getAction()){
            case DragEvent.ACTION_DRAG_STARTED:
                Log.d(TAG,"onDrag: drag started");
                return true;
            case DragEvent.ACTION_DRAG_ENTERED:
                Log.d(TAG,"onDrag: drag Entered");
                return true;
            case DragEvent.ACTION_DRAG_LOCATION:
                Log.d(TAG,"onDrag: current point: ("+event.getX()+", "+event.getY());
                return true;
            case DragEvent.ACTION_DRAG_EXITED:
                Log.d(TAG,"onDrag: drag Exited");
                return true;
            case DragEvent.ACTION_DROP:
                Log.d(TAG,"onDrag: drag dropped");
                return true;
            case DragEvent.ACTION_DRAG_ENDED:
                Log.d(TAG,"onDrag: drag Ended");
                return true;
        }
        return false;
    }
}
