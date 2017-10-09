package com.example.user.potholereportingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {
    private TextView mText;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);



        mText=(TextView) findViewById(R.id.textView);
        mText.setText("1.To post in this application please make sure you are a registered user."+"\n\n2.Choose your Registration name wisely because it will be displayed in all " +
                "your posts.\n\n3.Make sure you are connected to the internet every time you want to post a photo of a porthole.\n\n4.take photos in a safe place on the road,lookout for speeding cars.\n\n5.Make sure your GPRS is always on.\n\n6.Your Password should exceed six characters.\n\n7.when uploadin a display photo,all fields should be filled for it to be uploaded.\n\n8.when uploading a pothole photo,make sure all the fields are filled");
    }
}
