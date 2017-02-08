package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jonat on 1/28/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
