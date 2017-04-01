package com.example.kanika.pinkisbirthday;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements OnTouchListener {

    float downx = 0;
    float downy = 0;
    Button button;
    private View fullView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fullView = (View)findViewById(R.id.activity_main);
        fullView.setOnTouchListener(this);

        Intent svc=new Intent(this, BackgroundSoundService.class);
        startService(svc);


        button = (Button) findViewById(R.id.next);

        // Capture button clicks
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this, NewActivity.class);
                startActivity(myIntent);
            }
        });
    }

   /* public void sendwishes(View view)
    {
        Intent myIntent = new Intent(MainActivity.this, NewActivity.class);
        startActivity(myIntent);
    }
*/
    @Override
    public boolean onTouch(View v, MotionEvent event) {

           if (event.getAction() == MotionEvent.ACTION_DOWN) {
                int x = (int) event.getX();
                int y = (int) event.getY();
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                ; //Assuming you use a RelativeLayout
                ImageView iv = new ImageView(getApplicationContext());
                lp.setMargins(x, y, 0, 0);
                iv.setLayoutParams(lp);
                iv.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.bday));
                ((ViewGroup) v).addView(iv);
            }

        return false;

    }
}

