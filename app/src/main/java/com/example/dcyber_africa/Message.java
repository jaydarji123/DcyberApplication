package com.example.dcyber_africa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Message extends AppCompatActivity {

    EditText Name, Email, Subject, Comment;
    Button SubmitSave;
    private static final int MY_PERMISSION_SEND_SMS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        getSupportActionBar().setTitle("Message");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Name = (EditText) findViewById(R.id.Name);
        Email = (EditText) findViewById(R.id.Email);
        Subject = (EditText) findViewById(R.id.Subject);
        Comment = (EditText) findViewById(R.id.comment);
        SubmitSave = (Button) findViewById(R.id.btnSubmit);
    }
    public void sendsms (View View) {
        int PermissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
        if(PermissionCheck == PackageManager.PERMISSION_GRANTED){
            Mymessage();
        }
        else{
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},MY_PERMISSION_SEND_SMS);
        }
    }
    public void Mymessage() {
        String num="9820293767";
        String name =Name.getText().toString().trim();
        String email =Email.getText().toString().trim();
        String subject =Subject.getText().toString().trim();
        String comment =Comment.getText().toString().trim();
        if (name.isEmpty()){
            Toast.makeText(Message.this,"Pleas fill the Name field",Toast.LENGTH_SHORT).show();
        }

        else if(email.isEmpty()){
            Toast.makeText(Message.this,"Pleas fill the Email field",Toast.LENGTH_SHORT).show();
        }


        else if (subject.isEmpty()){
            Toast.makeText(Message.this,"Pleas fill the Subject field",Toast.LENGTH_SHORT).show();
        }

        else if(comment.isEmpty()){
            Toast.makeText(Message.this,"Pleas fill the Comment field",Toast.LENGTH_SHORT).show();
        }
        else {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(num,null,name,null,null);
            smsManager.sendTextMessage(num,null,email,null,null);
            smsManager.sendTextMessage(num,null,subject,null,null);
            smsManager.sendTextMessage(num,null,comment,null,null);
            Toast.makeText(this,"Message send",Toast.LENGTH_LONG).show();
        }
    }

    public void onRequestPermissionResult(int reqcode,String[] permission, int[] grantResult){
        super.onRequestPermissionsResult(reqcode,permission,grantResult);
        switch (reqcode) {
            case MY_PERMISSION_SEND_SMS: {
                if ((grantResult.length > 0 && grantResult[0] == PackageManager.PERMISSION_GRANTED)) {
                    Mymessage();
                }
                else {
                    Toast.makeText(this,"No Permission", Toast.LENGTH_LONG).show();
                }
            }
        }
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

