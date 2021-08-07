package com.example.dcyber_africa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Teams extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Paresh Makawana  (CEO)","Siddharth Parmar","Poonam Chacha","Akash Kundu","Jayesh Darji  (And. Dev)","Naman Adep"};
    String mDiscription[] = {"+91 9820293767","+91 9619687979","+91 9870096867","+91 9680969159","+91 8169769128","+91 9833869448"};
    int images[] = {R.drawable.paresh,R.drawable.sid,R.drawable.poonam,R.drawable.aakash,R.drawable.jay,R.drawable.naman};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teams);
        getSupportActionBar().setTitle("Teams");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = findViewById(R.id.listview);
        MyAdapter adapter = new MyAdapter(this, mTitle, mDiscription ,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Toast.makeText(Teams.this,"Paresh Makawana",Toast.LENGTH_SHORT).show();
                }
                if(position == 1) {
                    Toast.makeText(Teams.this,"Siddharth Parmar",Toast.LENGTH_SHORT).show();
                }
                if(position == 2) {
                    Toast.makeText(Teams.this,"Poonam Chacha",Toast.LENGTH_SHORT).show();
                }
                if(position == 3) {
                    Toast.makeText(Teams.this,"Akash Kundu",Toast.LENGTH_SHORT).show();
                }
                if(position == 4) {
                    Toast.makeText(Teams.this,"Jayesh Darji",Toast.LENGTH_SHORT).show();
                }
                if(position == 5) {
                    Toast.makeText(Teams.this,"Naman Adep",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row,R.id.textv1,title);
            this.context=c;
            this.rTitle=title;
            this.rDescription=description;
            this.rImgs=imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textv1);
            TextView myDescription = row.findViewById(R.id.textv2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            return row;
        }
    }
}








