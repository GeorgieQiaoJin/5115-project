package com.example.a5115_class;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Sending message...", Toast.LENGTH_SHORT).show();
                showNormalDialog();
            }
        });
}

    private void showNormalDialog() {
        final AlertDialog.Builder normalDialog = new AlertDialog.Builder(MainActivity.this);
        normalDialog.setIcon(R.drawable.ic_launcher_background);
        normalDialog.setTitle("This is a normal Dialog");
        normalDialog.setMessage("Which button you want to click?");
        normalDialog.setPositiveButton("Confirm",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                        //t.setText("Confirm");
                        int m = 0;
                        for(int i = 1; i<10; i++){
                            m = m+1;
                        }

                    }
                });
        normalDialog.setNeutralButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // ...To-do
                        //t.setText("OK");
                    }
                });
        normalDialog.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                        //t.setText("Cancel");
                    }
                });

        normalDialog.show();
    }

}