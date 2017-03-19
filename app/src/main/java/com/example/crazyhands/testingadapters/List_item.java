package com.example.crazyhands.testingadapters;

/**
 * Created by crazyhands on 19/03/2017.
 */

public class List_item {

    private String mCname;
    private String mCtime;
    public List_item(String CName, String CTime){
        mCname = CName;
        mCtime = CTime;
    }
    public String getCname() {
        return mCname;
    }

    public String getCtime () {return mCtime;}

}
