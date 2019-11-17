package com.example.com;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tishi = (Button)findViewById(R.id.button1);
        tishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                final View layout = inflater.inflate(R.layout.tishi, null);
                switch (v.getId()) {
                    case R.id.button1:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("提示对话框");
                        dialog.setView(layout);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
                }

        });
        final Button deng = (Button)findViewById(R.id.button2);
        deng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                final View layout = inflater.inflate(R.layout.res,null);
                switch (v.getId()){
                    case R.id.button2:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("登陆对话框");
                        dialog.setView(layout);
                        dialog.setPositiveButton("登录", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                final EditText  userId = (EditText) layout.findViewById(R.id.userid);
                                final EditText passWord = (EditText)layout.findViewById(R.id.password);
                                Log.d("userid",userId.getText().toString());
                                if(userId.getText().toString().equals("abc") || passWord.getText().toString().equals( "123")){
                                    Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_LONG).show();
                                }
                                else{
                                    Toast.makeText(MainActivity.this,"登录错误",Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                        dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        dialog.show();
                        break;
                    default:
                        break;
                }
            }
        });
    }

}
