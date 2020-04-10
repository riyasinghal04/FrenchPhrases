package com.example.gridlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void buttonTapped(View view){


        int id=view.getId();
        String ourid="";
        ourid= view.getResources().getResourceEntryName(id);

        Log.i("button tapped",ourid);

        int resourceId=getResources().getIdentifier(ourid,"raw","com.example.gridlayoutdemo");

        MediaPlayer mplayer= MediaPlayer.create(this,resourceId);
        mplayer.start();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
