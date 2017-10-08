package tw.edu.fgu.ai.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_color;
    Button bt_red,bt_blue;
    RadioButton rb_pink,rb_orgin,rb_black;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_color=(TextView)findViewById(R.id.tv_color);
        bt_blue=(Button)findViewById(R.id.bt_blue);
        bt_red=(Button)findViewById(R.id.bt_red);
        rb_black=(RadioButton)findViewById(R.id.rb_black);
        rb_orgin=(RadioButton)findViewById(R.id.rb_orgin);
        rb_pink=(RadioButton)findViewById(R.id.rb_pink);

        bt_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_color.setText("Blue");
                tv_color.setTextColor(Color.BLUE);
            }
        });
        bt_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_color.setText("RED");
                tv_color.setTextColor(Color.RED);
            }
        });
        rb_orgin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    tv_color.setText("YELLO");
                    tv_color.setTextColor(Color.YELLOW);
                }
            }
        });

        rb_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_color.setText("BLACK");
                tv_color.setTextColor(Color.BLACK);
            }
        });
        rb_pink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_color.setText("GREEN");
                tv_color.setTextColor(Color.GREEN);
            }
        });
    }
}
