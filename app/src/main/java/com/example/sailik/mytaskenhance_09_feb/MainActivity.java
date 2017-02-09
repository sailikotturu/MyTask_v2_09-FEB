package com.example.sailik.mytaskenhance_09_feb;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;



public class MainActivity extends AppCompatActivity implements OnClickListener {

    private static final String TAG=MainActivity.class.getName();


    private Button calculate;
    private EditText number1;
    private EditText number2;
    private TextView addition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate()");

        calculate = (Button) findViewById(R.id.calculate_button);
        number1 = (EditText) findViewById(R.id.num1_editText);
        number2 = (EditText) findViewById(R.id.num2_editText);
        addition = (TextView) findViewById(R.id.add_textview);

        number1.setOnClickListener(MainActivity.this);
        number2.setOnClickListener(MainActivity.this);
        calculate.setOnClickListener(MainActivity.this);


//        number1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//
//                Context c = MainActivity.this;
//                Toast.makeText(c,c.getResources().getString(R.string.numbertype_toast), Toast.LENGTH_SHORT).show();
//
//
//
//            }
//        });
//
//        number2.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//
//                Context c = MainActivity.this;
//                Toast.makeText(c,c.getResources().getString(R.string.numbertype_toast), Toast.LENGTH_SHORT).show();
//
////
//
//            }
//        });
//
//        calculate.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//
//                String numb1 = number1.getText().toString();
//                String numb2 = number2.getText().toString();
//
//                if(numb1.equals("")||numb2.equals("")||(numb1.equals("")&&numb2.equals(""))){
//                    Context context = getApplicationContext();
//                    CharSequence text = "enter valid input";
//                    int duration = Toast.LENGTH_SHORT;
//
//                    Toast toast = Toast.makeText(context,text,duration);
//                    toast.setGravity(Gravity.CENTER, 0, 0);
//                    toast.show();
//                }
//
//                else {
//                    int num1 = Integer.parseInt(numb1);
//                    int num2 = Integer.parseInt(numb2);
//
//
//
//                    int sum = num1 + num2;
//
//                    Context c = MainActivity.this;
//                    Toast.makeText(c,"sum: "+sum, Toast.LENGTH_SHORT).show();
//
//
//                    number1.setText("");
//                    number2.setText("");
//                }
//
//            }
//        });
    }
        @Override
        public void onClick(View v) { // Parameter v stands for the view that was clicked.

            switch(v.getId()){
                case R.id.num1_editText:
                    Context c = MainActivity.this;
                    Toast.makeText(c,c.getResources().getString(R.string.numbertype_toast), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.num2_editText:
                    c = MainActivity.this;
                    Toast.makeText(c,c.getResources().getString(R.string.numbertype_toast), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.calculate_button:
                    String numb1 = number1.getText().toString();
                    String numb2 = number2.getText().toString();

                    if(numb1.equals("")||numb2.equals("")||(numb1.equals("")&&numb2.equals(""))){
                        Context context = getApplicationContext();
                        CharSequence text = "enter valid input";
                        int duration = Toast.LENGTH_SHORT;

                        Toast toast = Toast.makeText(context,text,duration);
                        toast.setGravity(Gravity.CENTER, 0, 0);
                        toast.show();
                    }

                    else {
                        int num1 = Integer.parseInt(numb1);
                        int num2 = Integer.parseInt(numb2);
                        int sum = num1 + num2;
                        c = MainActivity.this;
                        Toast.makeText(c,"sum: "+sum, Toast.LENGTH_SHORT).show();
                        number1.setText("");
                        number2.setText("");
                }

            }
            // getId() returns this view's identifier.
            
        }


}

