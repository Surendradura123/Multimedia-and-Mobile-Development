package com.example.suren.myshop;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    Button callPhone;
    Button cameraButton;
    Button animationButton;
    Button speechButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       callPhone = (Button) findViewById(R.id.callButton);
        cameraButton = (Button) findViewById(R.id.camera);
        animationButton = (Button) findViewById(R.id.animationButton);
        speechButton = (Button) findViewById(R.id.speechButton);
       callPhone.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Call Button Pressed", Toast.LENGTH_SHORT).show();
                //This Explicit Intent is done with the help of this tutorial
                //http://www.javatpoint.com/android-explicit-intent-example
                Intent startPhoneCallActivityIntent = new Intent(getApplicationContext(), PhoneCallActivity.class);
                startPhoneCallActivityIntent.putExtra("welcomeMessage","Welcome to  Activity");
                startPhoneCallActivityIntent.putExtra("callToActionMessage", "");
                startActivity(startPhoneCallActivityIntent);
            }
        });

        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Camera Button Pressed", Toast.LENGTH_SHORT).show();
                //This Explicit Intent is done with the help of this tutorial
                //http://www.javatpoint.com/android-explicit-intent-example
                Intent startCameraActivityIntent = new Intent(getApplicationContext(), CameraActivity.class);
                startActivity(startCameraActivityIntent);
            }
        });

        animationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Animation Button Pressed", Toast.LENGTH_SHORT).show();
                //This Explicit Intent is done with the help of this tutorial
                //http://www.javatpoint.com/android-explicit-intent-example
                Intent startAnimationActivityIntent = new Intent(getApplicationContext(), AnimationActivity.class);
                startActivity(startAnimationActivityIntent);
            }
        });

        speechButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Text to Speech Button Pressed", Toast.LENGTH_SHORT).show();
                //This Explicit Intent is done with the help of this tutorial
                //http://www.javatpoint.com/android-explicit-intent-example
                Intent startTextToSpeechActivityIntent = new Intent(getApplicationContext(), TextToSpeechActivity.class);
                startActivity(startTextToSpeechActivityIntent );
            }
        });
    }

    }


