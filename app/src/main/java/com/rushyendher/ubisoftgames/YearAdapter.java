package com.rushyendher.ubisoftgames;

/**
 * Created by rushi on 25-12-2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class YearAdapter extends ArrayAdapter<Year>
{

    public YearAdapter(Context context, ArrayList<Year> years)
    {
        super(context, 0, years);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.year_list, parent, false);
        }

        Year year = getItem(position);

        TextView yearTextView = (TextView) listItemView.findViewById(R.id.year);
        yearTextView.setText(year.getmYear().toString());

        return listItemView;
    }
}
