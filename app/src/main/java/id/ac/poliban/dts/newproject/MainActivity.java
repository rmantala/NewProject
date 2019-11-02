package id.ac.poliban.dts.newproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    Button btTampilNama;

    TextView tvListDataTeman;
    Button btTampilDataTeman;

    Button btTampilGambar;

    Button btBuatTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null)
            setTitle("Halaman Utama");


        //deklarasi komponen
        etNama = findViewById(R.id.etNama);

        btTampilNama = findViewById(R.id.btTampilNama);

        tvListDataTeman = findViewById(R.id.tvListDataTeman);

        btTampilDataTeman = findViewById(R.id.btTampilDataTeman);

        btTampilGambar = findViewById(R.id.btTampilGambar);

        btBuatTable = findViewById(R.id.btBuatTableTeman);


        //tampil nama
        btTampilNama.setOnClickListener(v -> {
            if(!etNama.getText().toString().isEmpty())
                Toast.makeText(this, "Selamat datang : " + etNama.getText().toString(), Toast.LENGTH_SHORT).show();
        });


        //tampil data teman
        btTampilDataTeman.setOnClickListener(v -> {
            //penggunaan array
            String[] data = {
                    "nama1",   //ganti nama1 sesuai nama teman, lalu hapus komentar ini
                    "nama2",
                    "nama3"
            };

            String namaTeman = "";
            for(int i=0; i < data.length; i++)
                namaTeman += data[i] + "\n";


            tvListDataTeman.setText(namaTeman);

            new AlertDialog.Builder(this)
                    .setTitle("info")
                    .setMessage(namaTeman)
                    .setPositiveButton("OK", (dialog, which) -> {
                        //
                    }).show();
        });

        //tampil gambar
        btTampilGambar.setOnClickListener(v -> {
            Intent intent = new Intent(this, GambarActivity.class);
            startActivity(intent);
        });

        btBuatTable.setOnClickListener(v -> {
            FriendSQL db = new FriendSQL(this);
            Toast.makeText(this, "table friend berhasil dibuat", Toast.LENGTH_SHORT).show();
        });
    }
}
