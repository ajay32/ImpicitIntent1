package com.hackingbuzz.accessphonestuff;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView facebook = (ImageView)findViewById(R.id.facebook);
        ImageView dial = (ImageView)findViewById(R.id.dial);
        ImageView camera = (ImageView)findViewById(R.id.camera);
        ImageView call = (ImageView)findViewById(R.id.call);


        facebook.setOnClickListener(this);
        dial.setOnClickListener(this);
        camera.setOnClickListener(this);
        call.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent i = null;

        switch(view.getId()){

            case R.id.facebook:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://facebook.com"));
                startActivity(i);
                break;

            // this intent will show dialer first..
            case R.id.dial:
                i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9582238254"));
                startActivity(i); break;


            // dial directly dial the call

            case R.id.call:
                i = new Intent(Intent.ACTION_CALL,Uri.parse("tel:+919582238254"));
                startActivity(i); break;

            case R.id.camera:
                i = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(i); break;
        }


    }
}

