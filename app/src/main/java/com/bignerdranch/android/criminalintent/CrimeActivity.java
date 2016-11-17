package com.bignerdranch.android.criminalintent;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
//Using built in Fragment so doin't need these support libraries
//import android.support.v4.app.FragmentActivity;
//import android.support.v4.app.FragmentManager;

public class CrimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        //This is anroid.app.Fragment Manager and Fragment
        FragmentManager fm = getFragmentManager();
        android.app.Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if(fragment == null) {
            //Changed CrimeFragment class to correct his here.
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }
}