package com.example.crazyhands.testingadapters;

import java.lang.ref.Reference;

/**
 * Created by crazyhands on 19/03/2017.
 */

public class List_item {
    Class mActivityToName;
    private String mCname;
    private String mCtime;
    public List_item(String CName, String CTime, Class ActivityToName){
        mCname = CName;
        mCtime = CTime;
        mActivityToName = ActivityToName;
    }
    public String getCname() {
        return mCname;
    }

    public String getCtime () {return mCtime;}

    public Class getActivityToName(){return mActivityToName;}
}
