package com.example.joshy.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by joshy on 3/9/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime(){
        mId = UUID.randomUUID();
        mDate = new Date();
    }
    public String getTitle(){
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean Solved) {
        mSolved = Solved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date Date) {
        mDate = Date;
    }
}
