package com.shellcore.android.prototypepattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // Components
    @BindView(R.id.txt_1)
    TextView txt1;
    @BindView(R.id.txt_2)
    TextView txt2;
    @BindView(R.id.txt_3)
    TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        SequenceCache.loadCache();

        Sequence prime = SequenceCache.getSequence("1");
        StringBuilder sb = new StringBuilder();
        sb.append("El número primo 10000 es: ")
                .append(prime.getResult());

        txt1.setText(sb.toString());

        Sequence fibonacci = SequenceCache.getSequence("2");
        sb = new StringBuilder();
        sb.append("El número de Fibonacci 1000 es: ")
                .append(fibonacci.getResult());
        txt2.setText(sb.toString());

        Sequence clone = (Sequence) new Fibonacci().clone();
        long result = clone.getResult() / 5;
        sb = new StringBuilder();
        sb.append("La quinta parte del número de Fibonacci 1000 es:")
                .append(result);
        txt3.setText(sb.toString());
    }
}
