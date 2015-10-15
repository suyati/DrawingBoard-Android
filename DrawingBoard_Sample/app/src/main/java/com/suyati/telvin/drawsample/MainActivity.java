package com.suyati.telvin.drawsample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.suyati.telvin.drawingboard.DrawingBoard;
import java.util.Calendar;

/**
 * Created by Telvin Mathew on 22/10/15.
 */
public class MainActivity extends AppCompatActivity {

    DrawingBoard drawingBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawingBoard = (DrawingBoard) findViewById(R.id.view);
        drawingBoard.setPenColor(android.R.color.black); 
        drawingBoard.setCanvasColor(android.R.color.white);
    }

    public void saveBoard(View view) {

        String baseFileName = "/DrawSample/Images";
        String fileName = "drawBoard" + Calendar.getInstance().getTimeInMillis() + ".png";
        Boolean isShownInGallery = true;

        drawingBoard.setBaseFilePath(baseFileName);
        drawingBoard.saveAsImageFile(fileName, isShownInGallery);
    }

    public void clearBoard(View view) {
        drawingBoard.clearBoard();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_gallery) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                    "content://media/internal/images/media"));
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
