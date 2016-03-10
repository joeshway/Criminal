package com.example.joshy.criminalintent;

import java.util.UUID;

/**
 * Created by joshy on 3/9/2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime(){
        //Generate unique identifier
        mId = UUID.randomUUID();
    }
    public String getTitle(){
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }
}
