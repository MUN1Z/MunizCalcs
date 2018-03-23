package com.example.munizcalcs.munizcalcs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edtA) EditText mEdtA;
    @BindView(R.id.edtB) EditText mEdtB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCalc)
    public void btnCalcClick(){
        Toast.makeText(this, getResult() , Toast.LENGTH_SHORT).show();
    }

    private String getResult(){
        if(mEdtA.getText().toString().isEmpty() || mEdtB.getText().toString().isEmpty())
            return "Insert value in all fields.";

        return String.valueOf(Calc.calcResult(Integer.parseInt(mEdtA.getText().toString()), Integer.parseInt(mEdtB.getText().toString())));
    }
}
