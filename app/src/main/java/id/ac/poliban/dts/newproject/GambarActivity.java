package id.ac.poliban.dts.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class GambarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar);

        if(getSupportActionBar()!=null)
            setTitle("Halaman Gambar");

        Button btHapusGambar = findViewById(R.id.btHapusGambar);
        ImageView imgPhoto = findViewById(R.id.imgPhoto);

        btHapusGambar.setOnClickListener(v -> {
            imgPhoto.setImageURI(Uri.parse(""));
        });
    }
}
