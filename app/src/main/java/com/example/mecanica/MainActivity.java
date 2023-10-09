package com.example.mecanica;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn_menos_amortecedor, btn_mais_amortecedor;
    TextView txtV_qnt_amortecedor;

    int qnt_amortecedor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_menos_amortecedor = findViewById(R.id.btn_menos_amortecedor);
        btn_mais_amortecedor = findViewById(R.id.btn_mais_amortecedor);

        txtV_qnt_amortecedor = findViewById(R.id.txtV_qnt_amortecedor);
    }

    public void menos_amortecedor(View v) {
        if (qnt_amortecedor != 0) {
            qnt_amortecedor = qnt_amortecedor - 1;
            txtV_qnt_amortecedor.setText(String.valueOf(qnt_amortecedor));
        }

    }

    public void mais_amortecedor(View v) {
        qnt_amortecedor = qnt_amortecedor + 1;
        txtV_qnt_amortecedor.setText(String.valueOf(qnt_amortecedor));
    }


}