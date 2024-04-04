package ru.mireaZherebtsov.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import ru.mireaZherebtsov.intentapp.R;

public class MainActivity extends AppCompatActivity {

    public String timeseet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeseet = time();

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(timeseet);





    }

    public void onClick(View view) {

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("dateString", timeseet);
        startActivity(intent);
    }
    public  String time(){
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateString = sdf.format(new Date(dateInMillis));
        return dateString;
    }

}