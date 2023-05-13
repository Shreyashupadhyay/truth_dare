package com.example.truth_dare;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class LoginAdapter extends FragmentPagerAdapter {
    private Context context;
    int totalTab;


    public LoginAdapter(FragmentManager fm, Context context , int totalTab) {
        super(fm);
        this.context  = context;
        this.totalTab= totalTab;

    }

    @Override
    public int getCount() {
        return totalTab;
    }

    public Fragment getItem(int position ){
        switch (position){
            case 0:
                login_frabment login_frabment = new login_frabment();
                return login_frabment;
            case 1 :
                signup_fragment signup_fragment = new signup_fragment();
                return  signup_fragment;
            default:
                return null;
        }
    }

}
