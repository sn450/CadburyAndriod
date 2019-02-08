package sample.tatastrive.snehal.cadburyandriod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static sample.tatastrive.snehal.cadburyandriod.MainActivity.status;

public class MainActivityWin extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_win);
        textView=findViewById(R.id.testtxt);
        textView.setText(status);
    }
}
