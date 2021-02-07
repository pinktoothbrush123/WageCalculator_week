package mcm.edu.ph.wagecalculator_weekly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculate;

        btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText txtOperand1;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtAnswer = findViewById(R.id.txtAnswer);

        Double regularRate = 100.0;
        Double Operand1 = 0.0;
        Double answer = 0.0;

        regularRate = Double.parseDouble(regularRate.getClass().toString());


        switch (v.getId()) {
            case R.id.btnCalculate:
                answer = Operand1 * regularRate ;
                txtAnswer.setText(Double.toString(answer));
                break;


        }
    }
}