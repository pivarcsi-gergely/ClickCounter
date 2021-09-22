package hu.petrik;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int nOfClicks = 0;
    private TextView TextView;
    private Button Plus;
    private Button Minus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView = findViewById(R.id.TextView);
        Plus = findViewById(R.id.BtnPlus);
        Minus = findViewById(R.id.BtnMinus);

        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nOfClicks++;
                TextView.setText("" + nOfClicks);
                if (nOfClicks > 0){
                    TextView.setTextColor(Color.GREEN);
                }
                else if (nOfClicks == 0){
                    TextView.setTextColor(Color.BLUE);
                }
            }
        });
        Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nOfClicks--;
                TextView.setText("" + nOfClicks);
                if (nOfClicks < 0){
                    TextView.setTextColor(Color.RED);
                }
                else if (nOfClicks == 0){
                    TextView.setTextColor(Color.BLUE);
                }
            }
        });
        TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nOfClicks = 0;
                TextView.setText("0");
                TextView.setTextColor(Color.BLUE);
            }
        });
    }
}
