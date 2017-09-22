package com.mistcorp.lab3_314;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper vf;
    ImageView im1, im2, im3, im4, im5;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vf = (ViewFlipper) findViewById(R.id.viewFlipper);
        im1 = (ImageView)findViewById(R.id.imageView);
        im2 = (ImageView)findViewById(R.id.imageView2);
        im3 = (ImageView)findViewById(R.id.imageView3);
        im4 = (ImageView)findViewById(R.id.imageView4);
        im5 = (ImageView)findViewById(R.id.imageView5);
        tv = (TextView)findViewById(R.id.text);

        tv.setText(getResources().getString(R.string.address1));
    }

    public void onViewFlipperClick(View view){
        vf.showNext();
        switch ((vf.getCurrentView().getId())){
            case R.id.imageView:
                tv.setText(getResources().getString(R.string.address1));
                break;
            case R.id.imageView2:
                tv.setText(getResources().getString(R.string.address2));
                break;
            case R.id.imageView3:
                tv.setText(getResources().getString(R.string.address3));
                break;
            case R.id.imageView4:
                tv.setText(getResources().getString(R.string.address4));
                break;
            case R.id.imageView5:
                tv.setText(getResources().getString(R.string.address5));
                break;
        }
    }

    public void onClick(View view){
        switch ((vf.getCurrentView().getId())) {
            case R.id.imageView:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.address1)));
                startActivity(browserIntent);
                break;
            case R.id.imageView2:
                Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.address2)));
                startActivity(browserIntent2);
                break;
            case R.id.imageView3:
                Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.address3)));
                startActivity(browserIntent3);
                break;
            case R.id.imageView4:
                Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.address4)));
                startActivity(browserIntent4);
                break;
            case R.id.imageView5:
                Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse(getResources().getString(R.string.address5)));
                startActivity(browserIntent5);
                break;
            }
        }
}


