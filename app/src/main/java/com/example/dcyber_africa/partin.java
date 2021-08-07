package com.example.dcyber_africa;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.LinkAddress;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.textclassifier.TextClassifierEvent;
import android.widget.ImageView;
import android.widget.TextView;

public class partin extends AppCompatActivity {

    ImageView imageView;
    TextView title,description,link;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partin);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        imageView = findViewById(R.id.imageV);
        title = findViewById(R.id.textV);
        description = findViewById(R.id.textVV);
        link = findViewById(R.id.textVVV);

        if(position == 0) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);
            link.setMovementMethod(LinkMovementMethod.getInstance());

            actionBar.setTitle(XTitle);
        }
        if(position == 1) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
        if(position == 2) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
        if(position == 3) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
        if(position == 4) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
        if(position == 5) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
        if(position == 6) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            link.setText(Xlink);
            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);

            actionBar.setTitle(XTitle);
        }
        if(position == 7) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            link.setText(Xlink);
            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);

            actionBar.setTitle(XTitle);
        }
        if(position == 8) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);

            actionBar.setTitle(XTitle);
        }
        if(position == 9) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
        if(position == 10) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
        if(position == 11) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
        if(position == 12) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
        if(position == 13) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String XTitle = intent.getStringExtra("title");
            String XDesc = intent.getStringExtra("description");
            String Xlink = intent.getStringExtra("link");
            link.setMovementMethod(LinkMovementMethod.getInstance());

            imageView.setImageResource(pic);
            title.setText(XTitle);
            description.setText(XDesc);
            link.setText(Xlink);

            actionBar.setTitle(XTitle);
        }
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}