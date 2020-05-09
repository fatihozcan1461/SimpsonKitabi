package com.example.simpsonkitab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_detail );

        ImageView ımageView = findViewById( R.id.imageView );
        TextView nameText   = findViewById( R.id.nameText );
        TextView jobtext    = findViewById( R.id.jobText );

        Intent intent = getIntent();
        Simpson selectedSimpson = (Simpson) intent.getSerializableExtra( "selectedSimpson" );


        Bitmap bitmap = BitmapFactory.decodeResource( getApplicationContext().getResources(),selectedSimpson.getPictureId() );
        ımageView.setImageBitmap( bitmap );

        nameText.setText( selectedSimpson.getName() );
        jobtext.setText( selectedSimpson.getJob() );
    }
}
