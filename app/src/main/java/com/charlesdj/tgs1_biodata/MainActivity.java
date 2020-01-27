package com.charlesdj.tgs1_biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Npm;
    EditText NamaLengkap;
    EditText Almat;
    EditText PrgamStudi;
    Button BtnSubmit;
    TextView txtNpm;
    TextView txtNama;
    TextView txtAalamat;
    TextView txtProgamStudi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Npm = (EditText) findViewById(R.id.Npm);
        NamaLengkap = (EditText) findViewById(R.id.namalngkp);
        Almat = (EditText) findViewById(R.id.Alamat);
        PrgamStudi = (EditText) findViewById(R.id.prgamStudi);
        BtnSubmit = (Button) findViewById(R.id.btnsubmit);
        txtNpm = (TextView) findViewById(R.id.txtNpm);
        txtNama = (TextView) findViewById(R.id.txtNama);
        txtAalamat = (TextView) findViewById(R.id.txtAlamat);
        txtProgamStudi = (TextView) findViewById(R.id.txtProgamStudi);

        BtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strNpm = Npm.getText().toString();
                String strNamaLengkkap = NamaLengkap.getText().toString();
                String strAlamat = Almat.getText().toString();
                String strPrgramstudi = PrgamStudi.getText().toString();

                txtNpm.setText(strNpm);
                txtNama.setText(strNamaLengkkap);
                txtAalamat.setText(strAlamat);
                txtProgamStudi.setText(strPrgramstudi);

            }
        });
    }
}
