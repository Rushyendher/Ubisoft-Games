package com.rushyendher.ubisoftgames;

import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by rushi on 25-12-2016.
 */

public class Year implements Serializable
{
    private Integer mYear;
    private ArrayList<Game> mGameList;

    public Year(Integer mYear, ArrayList<Game> mGameList) {
        this.mYear = mYear;
        this.mGameList = mGameList;
    }

    public Integer getmYear() {
        return mYear;
    }

    public ArrayList<Game> getmGameList() {
        return mGameList;
    }
}
