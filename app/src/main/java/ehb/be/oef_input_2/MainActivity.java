package ehb.be.oef_input_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Double.valueOf;

public class MainActivity extends AppCompatActivity {

    private EditText euro;
    private TextView result;
    private Button converse;
    private double value = 0;

    private View.OnClickListener converseListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            value = valueOf(euro.getText().toString())* 1.129165 ;
            result.setText(Double.toString(value));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.tv_euro);
        result = findViewById(R.id.tv_result);
        converse = findViewById(R.id.btn_converse);
        result.setText(Double.toString(value));

        converse.setOnClickListener(converseListener);
    }
}
