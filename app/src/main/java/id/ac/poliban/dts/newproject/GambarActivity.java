package id.ac.poliban.dts.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GambarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar);

        if(getSupportActionBar()!=null)
            setTitle("Halaman Gambar");
    }
}
