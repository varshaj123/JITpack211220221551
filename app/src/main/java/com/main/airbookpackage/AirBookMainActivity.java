package com.main.airbookpackage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.main.mylibrary.LibraryMain;

public class AirBookMainActivity {
    private Context mContext;
    public AirBookMainActivity(Context mContext) {
        this.mContext = mContext;
    }
    public void redirectToMainPage(){
       Intent myIntent = new Intent(mContext, LibraryMain.class);
        //myIntent.putExtra("key", value); //Optional parameters
       mContext.startActivity(myIntent);
    }
}