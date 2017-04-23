package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jamie_000 on 3/20/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
