package com.rushyendher.ubisoftgames;

/**
 * Created by rushi on 25-12-2016.
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GameAdapter extends ArrayAdapter<Game>
{

    public GameAdapter(Context context, ArrayList<Game> words)
    {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.games_list, parent, false);
        }
        Game game = getItem(position);

        ImageView gameImageView     = (ImageView)listItemView.findViewById(R.id.game_image);
        TextView gameNameTextView   = (TextView) listItemView.findViewById(R.id.game_name);
        TextView gameGenreTextView  = (TextView) listItemView.findViewById(R.id.game_genre);
        TextView gameRatingTextView = (TextView) listItemView.findViewById(R.id.game_rating);

        gameNameTextView.setText(game.getmName());
        gameGenreTextView.setText(game.getmGenre());
        gameRatingTextView.setText(game.getmRating());
        gameImageView.setImageResource(game.getmImageResourceId());

        return listItemView;
    }
}




