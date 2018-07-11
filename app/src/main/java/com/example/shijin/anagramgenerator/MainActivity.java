package com.example.shijin.anagramgenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText string;
    public EditText solution;
    private Button generate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        string = (EditText)findViewById(R.id.anagramString);
        solution = (EditText)findViewById(R.id.solutionPage);
        generate = (Button)findViewById(R.id.generateButton);

        

        generate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int n = string.length();
                AnagramGenerator anagramgenerator = new AnagramGenerator();
                anagramgenerator.permute(string.getText().toString(), 0, n-1);


            }

        });


    }
}
