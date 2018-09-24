package com.anik.admobexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {


    /*

    Steps 1: add
     maven{
            url "https://maven.google.com"
        }

        in build.gradle in allprojects after jcenter();

    Steps 2:

     add admob sdk in build.gradle module app
     'com.google.android.gms:play-services-ads:15.0.1'


     */



    //declare AdView Object
    private AdView adView;

    Button btnAds;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAds=findViewById(R.id.btn_ads);

        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-3940256099942544/6300978111");

        //initialize
        adView = (AdView)findViewById(R.id.adView);
        AdRequest request = new AdRequest.Builder().build();
        //request for show baner ads
        adView.loadAd(request);



        btnAds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,InterstitialAdsActivity.class);
                startActivity(intent);
            }
        });

    }
}
