package thethirdtext.example.com.thethirdtext;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText text;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment frag = new fragment();
        getFragmentManager().beginTransaction().replace(R.id.one, frag).commit();

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        text = (EditText) findViewById(R.id.text);
        class MyClickListener implements View.OnClickListener {
            public void onClick(View view) {
                EditText text = (EditText) findViewById(R.id.text);
                text.setText("内部类");
            }
        }
        class ExtentEvent implements View.OnClickListener {
            private Activity act;
            private EditText text;
            public ExtentEvent(Activity act, EditText text) {
                this.act = act;
                this.text = text;
            }

            public void onClick(View view) {
                text.setText("外部类");
            }
        }
        button1.setOnClickListener(new MyClickListener());
        button2.setOnClickListener(new ExtentEvent(this, text));
        button4.setOnClickListener((View.OnClickListener) this);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("匿名内部类");
            }
        });
    }
public void clickHandler(View source){
EditText text=(EditText)findViewById(R.id.text);
text.setText("绑定到标签");
}

public void onClick (View view){
            text.setText("Activity");
        }

}







