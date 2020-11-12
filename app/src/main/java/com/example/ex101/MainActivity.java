package com.example.ex101;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout screen;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (LinearLayout) findViewById(R.id.screen);
    }

    public void firstSit(View view) {

        // Create the object of
        // AlertDialog Builder class
        builder = new AlertDialog.Builder(MainActivity.this);

        // Set Alert Title
        builder.setTitle("Alert !");

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }

    public void sit2(View view) {
        // Create the object of
        // AlertDialog Builder class
        builder = new AlertDialog.Builder(MainActivity.this);

        // Set Alert Title
        builder.setTitle("Alert !");
        builder.setIcon(R.drawable.untitled);

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }

    public void sit3(View view) {
        // Create the object of
        // AlertDialog Builder class
        builder = new AlertDialog.Builder(MainActivity.this);

        // Set Alert Title
        builder.setTitle("Alert !");
        builder.setIcon(R.drawable.untitled);

        builder.setPositiveButton("exit", new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which)
                            {

                                // When the user click yes button
                                // then app will close
                                dialog.dismiss();
                            }
                        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();

    }

    public void sit4(View view) {
        // Create the object of
        // AlertDialog Builder class
        builder = new AlertDialog.Builder(MainActivity.this);

        // Set Alert Title
        builder.setTitle("Alert !");
        builder.setIcon(R.drawable.untitled);


        builder.setPositiveButton("gen", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which)
            {
                screen.setBackground();
            }
        });

        builder.setPositiveButton("exit", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which)
            {

                // When the user click yes button
                // then app will close
                dialog.dismiss();
            }
        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }
}