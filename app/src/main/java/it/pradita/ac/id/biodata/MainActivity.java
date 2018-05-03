package it.pradita.ac.id.biodata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick (R.id.btn_riwayat)
    void button (){
        Intent intent = new Intent(MainActivity.this, biodata.class);
        startActivity(intent);
    }
    @OnClick (R.id.btn_koleksi)
    void btn () {
        Intent intent = new Intent(MainActivity.this, Koleksi.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
