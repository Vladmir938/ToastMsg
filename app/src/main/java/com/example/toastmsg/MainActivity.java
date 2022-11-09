package com.example.toastmsg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked_Shrek(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Шрек",
                Toast.LENGTH_LONG);
        myToast.show();
    }


    public void buttonClicked_Manki(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Паша",
                Toast.LENGTH_LONG);
        myToast.show();
    }

    public void buttonClicked_Pig(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Свинья",
                Toast.LENGTH_LONG);
        myToast.show();
    }
}