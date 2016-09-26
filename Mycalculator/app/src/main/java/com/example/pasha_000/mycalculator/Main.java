package com.example.pasha_000.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Main extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

    }

    ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";


    public void oneClick(View v)
    {
        TextView editText2 = (TextView) findViewById(R.id.editText2);
        Button button = (Button) v;
        string = button.getText().toString();

       editText2.setText(editText2.getText()+ string);
    }

public void onClick(View view){
    TextView editText = (TextView)findViewById(R.id.editText);
    TextView editText2 = (TextView)findViewById(R.id.editText2);
    editText2.setText(editText2.getText()+"=");
    String str = editText2.getText().toString();
    str = parser.splitExpression(str);
    try{
        editText.setText(Polish.calculateExp(str).toString());
    }catch (Exception e){}
}

    public void Clear(View view){
        TextView editText2 = (TextView)findViewById(R.id.editText2);
        editText2.setText("");
    }


}
