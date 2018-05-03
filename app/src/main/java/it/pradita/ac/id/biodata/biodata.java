package it.pradita.ac.id.biodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class biodata extends AppCompatActivity implements View.OnClickListener {

    private ImageView email, call,lokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        email = findViewById(R.id.btn_email);
        call = findViewById(R.id.btn_call);



        //TODO 3 EVENT CLICK MASING MASING BUTTON
        email.setOnClickListener(this);
        call.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_email:

                // intent implicit email using schema
                // hanya email yang bisa menangani aksi dari ACTION SENDTO
                Intent email = new Intent(Intent.ACTION_SENDTO);

                // schema untuk email mailto
                email.setData(Uri.parse("mailto:"));

                email.putExtra(Intent.EXTRA_SUBJECT, "Silakan Isi subject");
                email.putExtra(Intent.EXTRA_TEXT, "Silakan tulis kiriman");

                // cek jika ada email client
                if (email.resolveActivity(getPackageManager()) != null) {

                    // pilih email client jika ada
                    startActivity(Intent.createChooser(email, "Pilih Email Client"));
                } else {

                    // nothing to do
                }
                break;

            case  R.id.btn_call:
                Intent telepon = new Intent(Intent.ACTION_DIAL);
                telepon.setData(Uri.parse("tel:089636196556"));
                startActivity(telepon);

                break;

        }
    }
}