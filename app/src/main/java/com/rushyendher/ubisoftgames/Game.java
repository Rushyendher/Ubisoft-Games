package com.rushyendher.ubisoftgames;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by rushi on 25-12-2016.
 */

public class Game implements Parcelable
{
    private int mImageResourceId;
    private String  mName;
    private String  mGenre;
    private String  mRating;

    public Game(int mImageResourceId,String mName, String mGenre,String mRating) {
        this.mImageResourceId   = mImageResourceId;
        this.mName              = mName;
        this.mGenre             = mGenre;
        this.mRating            = mRating;
    }

    public Game(Parcel in)
    {
        mImageResourceId    = in.readInt();
        mName               = in.readString();
        mGenre              = in.readString();
        mRating             = in.readString();
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmRating() {
        return mRating;
    }


    public String getmGenre() {
        return mGenre;
    }

    public String getmName() {
        return mName;
    }

    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageResourceId);
        dest.writeString(mName);
        dest.writeString(mGenre);
        dest.writeString(mRating);
    }


    public static final Parcelable.Creator<Game> CREATOR = new Parcelable.Creator<Game>()
    {
        public Game createFromParcel(Parcel in)
        {
            return new Game(in);
        }
        public Game[] newArray(int size)
        {
            return new Game[size];
        }
    };

}
