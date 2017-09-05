package com.aispeech.solution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.aispeech.music.Music;
import com.aispeech.navi.Navi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Music.init();
        Navi.init();
    }
}
