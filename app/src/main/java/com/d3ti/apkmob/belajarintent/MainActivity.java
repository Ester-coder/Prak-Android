package com.d3ti.apkmob.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void panggil(View view){
        String nomor="09667347";
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri.fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    public void buka(View view) {
        String url = "https://badoystudio.com" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }

    public void tentang(View view) {
        Intent tentang = new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }

    public void frame(View view) {
        Intent frame = new Intent(MainActivity.this, Frame.class);
        startActivity(frame);
    }

    public void relative(View view) {
        Intent relative = new Intent(MainActivity.this, Relative.class);
        startActivity(relative);
    }

}
