package com.example.ex101;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import java.util.Random;

/**
 * The type Main activity.
 */
public class MainActivity extends AppCompatActivity {
    LinearLayout screen;
    AlertDialog.Builder builder;
    Random rnd;
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rnd = new Random();
        screen = (LinearLayout) findViewById(R.id.screen);
    }

    /**
     * First sit.
     * short dec: create alert with text
     *
     * <p>
     *      View view
     * @param	view - see which button pressed
     * @return	none
     */
    public void firstSit(View view) {

        // Create the object of
        // AlertDialog Builder class
        builder = new AlertDialog.Builder(MainActivity.this);

        // Set Alert Title
        builder.setTitle("Alert !");
        builder.setMessage("ex1");

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }

    /**
     * sit2.
     * short dec: create alert with text and button
     *
     * <p>
     *      View view
     * @param	view - see which button pressed
     * @return	none
     */
    public void sit2(View view) {
        // Create the object of
        // AlertDialog Builder class
        builder = new AlertDialog.Builder(MainActivity.this);

        // Set Alert Title
        builder.setTitle("Alert !");
        builder.setIcon(R.drawable.untitled);
        builder.setMessage("ex2");

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }

    /**
     * sit3.
     * short dec: create alert with text and button and icon and button for exit
     *
     * <p>
     *      View view
     * @param	view - see which button pressed
     * @return	none
     */
    public void sit3(View view) {
        // Create the object of
        // AlertDialog Builder class
        builder = new AlertDialog.Builder(MainActivity.this);

        // Set Alert Title
        builder.setTitle("Alert !");
        builder.setIcon(R.drawable.untitled);
        builder.setMessage("ex3");

        builder.setPositiveButton("exit", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {

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

    /**
     * sit4.
     * short dec: create alert with text and button and icon and button for exit and to genarate color
     *
     * <p>
     *      View view
     * @param	view - see which button pressed
     * @return	none
     */
    public void sit4(View view) {
        // Create the object of
        // AlertDialog Builder class
        builder = new AlertDialog.Builder(MainActivity.this);

        // Set Alert Title
        builder.setTitle("Alert !");
        builder.setIcon(R.drawable.untitled);
        builder.setMessage("ex4");


        builder.setNegativeButton("gen", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {
                rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                screen.setBackgroundColor(color);
            }
        });

        builder.setPositiveButton("exit", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {

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

    /**
     * sit5.
     * short dec: create alert with text and button and icon and button for exit and to genarate color and one button for reset
     *
     * <p>
     *      View view
     * @param	view - see which button pressed
     * @return	none
     */
    public void sit5(View view) {
        // Create the object of
        // AlertDialog Builder class
        builder = new AlertDialog.Builder(MainActivity.this);

        // Set Alert Title
        builder.setTitle("Alert !");
        builder.setIcon(R.drawable.untitled);


        builder.setNegativeButton("generate", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {

                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                screen.setBackgroundColor(color);
            }
        });
        builder.setNeutralButton("reset", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {
                screen.setBackgroundColor(Color.WHITE);
            }
        });

        builder.setPositiveButton("exit", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {

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

    /**
     * onCreateContextMenu
     * Short description.
     * onCreateContextMenu listener use for the ContextMenu
     * <p>
     *     ContextMenu menu
     *     View v
     *     ContextMenu.ContextMenuInfo menuInfo
     *
     * @param  menu - the object,v - the item that selected ,menuInfo - the info
     * @return	true if it success
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        menu.add("credits");
        return true;
    }

    /**
     * onOptionsItemSelected
     * Short description.
     * what happen if an item was selected
     * <p>
     *     MenuItem item
     *
     * @param  item - the menuItem
     * @return	true if it success
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        si = new Intent(this, credits.class);
        startActivity(si);
        return  true;
    }
}