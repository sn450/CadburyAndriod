package sample.tatastrive.snehal.cadburyandriod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    Button button;
    Spinner spinner;
    public static String val;
    public static int inval = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        spinner = findViewById(R.id.spindice);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String val = (String) spinner.getItemAtPosition(position);
                inval = Integer.parseInt(val);
                Intent intent = new Intent(InputActivity.this, MainActivity.class);
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(InputActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
            }
        });
       /* textView = findViewById(R.id.txts);
        editText = findViewById(R.id.edd);
        button = findViewById(R.id.buttonnext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(InputActivity.this, "Click", Toast.LENGTH_SHORT).show();
                val = editText.getText().toString().trim();
                inval = Integer.parseInt(val);
                if (inval > 0 && inval < 7) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(InputActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
    }
}
