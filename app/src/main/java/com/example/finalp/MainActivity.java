package com.example.finalp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

        public class MainActivity extends AppCompatActivity {

            private String[] quotes = {
                    "Believe in yourself!",
                    "Your limit is you.",
                    "Stay positive.",
                    "The best way to predict the future is to create it.",
                    "Life is what happens when you're busy making other plans.",
                    "Get busy living or get busy dying.",
                    "To be yourself in to make you something else is the greatest accomplishment.",
                    "The only impossible journey is the one you never begin.",
                    "The only limit to our realization of tomorrow is our doubts of today.",
                    "In three words I can sum up everything I've learned about life: it goes on."

                    // Add more quotes
            };

            private int[] images = {
                    R.drawable.anime1,
                    R.drawable.anime2,
                    R.drawable.anime3,
                    R.drawable.anime4,
                    R.drawable.anime1,
                    R.drawable.anime7,
                    R.drawable.anime8,
                    R.drawable.anime9,
                    R.drawable.anime1,
                    R.drawable.anime2,

            };

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                ListView listView = findViewById(R.id.listView);
                ListViewAdapter adapter = new ListViewAdapter(this, quotes, images);
                listView.setAdapter(adapter);

                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                        intent.putExtra("quote", quotes[position]);
                        intent.putExtra("image", images[position]);
                        startActivity(intent);
                    }
                });
            }
        }


