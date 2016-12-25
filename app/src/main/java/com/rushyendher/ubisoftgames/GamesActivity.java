package com.rushyendher.ubisoftgames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class GamesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);

        String title = " - Ubisoft Games";

        ArrayList<Game> gameArrayList =  getIntent().getParcelableArrayListExtra("YEAR");
        Integer year = getIntent().getIntExtra("YearValue",2015);
        setTitle(year.toString() + title);

        GameAdapter gameAdapter = new GameAdapter(this,gameArrayList);
        ListView listView = (ListView)findViewById(R.id.activity_games);
        listView.setAdapter(gameAdapter);
    }
}
