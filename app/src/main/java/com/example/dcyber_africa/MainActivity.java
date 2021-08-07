package com.example.dcyber_africa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_framework) {
            Intent intent = new Intent(MainActivity.this, Framework.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_Aboutus) {
            Intent intent = new Intent(MainActivity.this, Aboutus.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_Message) {
            Intent intent = new Intent(MainActivity.this, Message.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_partner) {
            Intent intent = new Intent(MainActivity.this, Partner.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_team) {
            Intent intent = new Intent(MainActivity.this, Teams.class);
            startActivity(intent);
            return true;
        }
        return true;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }
}

/*https://media.giphy.com/media/3o85xzkvl1siB2rHSo/giphy.gif
https://media1.giphy.com/media/Wy3Q0fuNIJmYn62Lcv/200.gif
https://i.pinimg.com/originals/4e/30/c9/4e30c95dc885f880a2c2797fdee0e042.gif
*/