package id.sch.smktelkom_mlg.tugas01.xirpl4016.pizzahaha;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etAlamat, etTelp;
    RadioButton rbS, rbM, rbL;
    CheckBox cbSosis, cbMoza, cbBeef;
    Button bPesan, bBatal;
    TextView tvTotal;
    RadioGroup rgSize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        etAlamat = (EditText) findViewById(R.id.editTextAlamat);
        etTelp = (EditText) findViewById(R.id.editTextTelp);
        rbS = (RadioButton) findViewById(R.id.radioButtonS);
        rbM = (RadioButton) findViewById(R.id.radioButtonM);
        rbL = (RadioButton) findViewById(R.id.radioButtonL);
        rgSize = (RadioGroup) findViewById(R.id.radioGroupSize);
        cbSosis = (CheckBox) findViewById(R.id.checkBoxSosis);
        cbMoza = (CheckBox) findViewById(R.id.checkBoxMoza);
        cbBeef = (CheckBox) findViewById(R.id.checkBoxBeef);
        bPesan = (Button) findViewById(R.id.buttonPesan);
        bBatal = (Button) findViewById(R.id.buttonBatal);
        tvTotal = (TextView) findViewById(R.id.textViewTotal);

        bPesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {
        String hasil = null;
        String nama = etNama.getText().toString();

        if (rgSize.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton) findViewById(rgSize.getCheckedRadioButtonId());
            hasil = rb.getText().toString();
        }

        
    }
}
