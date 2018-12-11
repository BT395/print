package e.bella.print;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        et1 = (EditText) findViewById(R.id.str1);
        et2 = (EditText) findViewById(R.id.str2);


        btn.setOnClickListener (new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), myOutput.class);
                String first = et1.getText().toString();
                String sec = et2.getText().toString();

                if (first.equalsIgnoreCase(sec)) {   // if not modified aka strings are same

                    // print original string

                    i.putExtra("same", "Text not modified! Display original text here.");
                    startActivity(i);

                } else {   // if modified aka strings not same

                    // print modified string

                    i.putExtra("same", "Text changed! Display modified text here.");
                    startActivity(i);

                }

            }
        });
    }

}
