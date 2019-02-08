package sample.tatastrive.snehal.cadburyandriod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import static sample.tatastrive.snehal.cadburyandriod.InputActivity.inval;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView leftD,rightD;
    public static String status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.roll_button);
        rightD = findViewById(R.id.image_rightdice);
        leftD = findViewById(R.id.image_leftdice);
        final int[] diceArray = new int[]{
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6

        };

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNum = new Random();
                int number = randomNum.nextInt(6);
                int l_num = number;
                leftD.setImageResource(diceArray[number]);
                number = randomNum.nextInt(6);
                int r_num = number;
                rightD.setImageResource(diceArray[number]);
                if(l_num==r_num){
                    if(l_num==inval){
                        Toast.makeText(MainActivity.this, "**You Win**", Toast.LENGTH_SHORT).show();
                        status="Congratulations!!"+l_num;
                        Intent intente = new Intent(MainActivity.this,MainActivityWin.class);
                        startActivity(intente);

                    }
                }


            }
        });

    }
}
