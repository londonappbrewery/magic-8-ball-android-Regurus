package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button run = findViewById(R.id.run_button);
        final ImageView mainImage = findViewById(R.id.main_image);
        final int[] images = {R.drawable.ball1,R.drawable.ball2,R.drawable.ball3,R.drawable.ball4,R.drawable.ball5};
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random generator = new Random();
                mainImage.setImageResource(images[generator.nextInt(5)]);
            }
        });
    }
}
