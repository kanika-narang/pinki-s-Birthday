package com.example.kanika.pinkisbirthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kanika on 3/3/17.
 */

public class NewActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wishes);

        button = (Button) findViewById(R.id.next);

        // Capture button clicks

    }

}
