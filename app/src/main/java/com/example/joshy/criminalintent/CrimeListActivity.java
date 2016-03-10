package com.example.joshy.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by joshy on 3/10/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
