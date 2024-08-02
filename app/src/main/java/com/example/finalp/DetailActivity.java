package com.example.finalp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageButton button = (ImageButton) findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageView = findViewById(R.id.detail_image);
        TextView textView = findViewById(R.id.detail_quote);

        String quote = getIntent().getStringExtra("quote");
        int image = getIntent().getIntExtra("image", 0);

        imageView.setImageResource(image);
        textView.setText(quote);

    }
}
