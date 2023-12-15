package com.example.mini_projet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

//import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView detailDesc, detailTitle ;
    ImageView detailImage,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailDesc = findViewById(R.id.detailDesc);
        detailImage = findViewById(R.id.detailImage);
        detailTitle = findViewById(R.id.detailTitle);
        back=findViewById(R.id.back);
        Bundle bundle = getIntent().getExtras ();
        if (bundle != null) {
            detailDesc.setText (bundle.getString( "Description"));
            detailTitle.setText (bundle.getString ("Title"));

            //Glide.with ( this).load(bundle.getString( "Image")).into (detailImage);
        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}