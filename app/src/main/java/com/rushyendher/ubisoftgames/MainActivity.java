package com.rushyendher.ubisoftgames;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Game> gameArrayList2016 = new ArrayList<>();

        //2016 games
        gameArrayList2016.add(new Game(R.drawable.division_2016,"Tom Clancy's The Division","Third-person shooter","GameSpot 8/10"));
        gameArrayList2016.add(new Game(R.drawable.watchdogs2_2016,"Watch Dogs 2","Action-adventure game","GameSpot 8/10"));
        gameArrayList2016.add(new Game(R.drawable.steep_2016,"Steep","Sports","Digital Spy 3.5/5"));
        gameArrayList2016.add(new Game(R.drawable.justdance_2016,"Just Dance","Music video game","Best Buy 4.5/5"));
        gameArrayList2016.add(new Game(R.drawable.eagleflight_2016,"Eagle Flight","Simulation","GameSpot 7/10"));
        gameArrayList2016.add(new Game(R.drawable.grow_up_2016,"Grow Up","Action Adventure","Steam 9/10"));
        gameArrayList2016.add(new Game(R.drawable.farcry_primal_2016,"Farcry Primal","Action-adventure","Steam 7/10"));
        gameArrayList2016.add(new Game(R.drawable.track_mania_2016,"TrackMania Turbo","Racing","IGN 8.4/10"));
        gameArrayList2016.add(new Game(R.drawable.expansion_undergroun_2016,"The Division Expansion II","Third-person shooter","No rating available"));

        //2015 games
        ArrayList<Game> gameArrayList2015 = new ArrayList<>();

        gameArrayList2015.add(new Game(R.drawable.rainbox_six_siege_2015,"Tom Clancy's Rainbow Six Siege","first-person tactical shooter","GameSpot 8/10"));
        gameArrayList2015.add(new Game(R.drawable.syndicate_2015,"Assassin's Creed Syndicate","Action-adventure game","Steam 7/10"));
        gameArrayList2015.add(new Game(R.drawable.anno,"Anno 2205","Strategy","Steam 6/10"));
        gameArrayList2015.add(new Game(R.drawable.ac_chroni0cles_2015,"Assasin's Creed Chronicles","Action-adventure game","Steam 7/10"));
        gameArrayList2015.add(new Game(R.drawable.the_crew_2015,"The Crew","Racing","Metacritic 7.3/10"));
        gameArrayList2015.add(new Game(R.drawable.grow_home_2015,"Grow Home","Adventure","Steam 9/10"));
        gameArrayList2015.add(new Game(R.drawable.awesome_level_max_2015,"Trails Fusion","adventure","Steam 6/10"));
        gameArrayList2015.add(new Game(R.drawable.the_mighty_quest_2015,"The Mighty Quest","strategy","Metacritic 6.4/10"));
        gameArrayList2015.add(new Game(R.drawable.just_dance_disnep_2015,"Just Dance: Disney party2","Music","Walmart 5/5"));
        gameArrayList2015.add(new Game(R.drawable.war_chest_2015,"Toy SOldiers","Strategy","Steam 6/10"));
        gameArrayList2015.add(new Game(R.drawable.gravity_flass_2015,"Gravity falls","Platform","Metacritic 4.6/10"));
        gameArrayList2015.add(new Game(R.drawable.mighty_magic_heroes_2015,"Mighty & Magic","Turn based Strategy","Steam 6/10"));




        final ArrayList<Year> years = new ArrayList<>();

        years.add(new Year(2016,gameArrayList2016));
        years.add(new Year(2015,gameArrayList2015));

        YearAdapter yearAdapter = new YearAdapter(this,years);
        ListView listView = (ListView) findViewById(R.id.year_list);
        listView.setAdapter(yearAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Year year = years.get(position);

                Intent intent = new Intent(MainActivity.this,GamesActivity.class);

                intent.putParcelableArrayListExtra("YEAR",year.getmGameList());
                intent.putExtra("YearValue",year.getmYear());
                startActivity(intent);
            }
        });
    }
}
