package com.example.simpsonkitab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        listView = findViewById( R.id.listView );

        Simpson rafadan_tayfa_1 = new Simpson( "1.Rafadan Tayfa Üyesi ","Mühendis",R.drawable.rafadan_1 );
        Simpson rafadan_tayfa_2 = new Simpson( "2.Rafadan Tayfa Üyesi "," Doktor ",R.drawable.rafadan_2 );
        Simpson rafadan_tayfa_3 = new Simpson( "3.Rafadan Tayfa Üyesi" ,"Tekniker",R.drawable.rafadan_tayfa_3 );

        final ArrayList<Simpson> simpsonList = new ArrayList<>();
        simpsonList.add( rafadan_tayfa_1 );
        simpsonList.add( rafadan_tayfa_2 );
        simpsonList.add( rafadan_tayfa_3 );

        CustomAdapter customAdapter = new CustomAdapter( simpsonList,MainActivity.this );
        listView.setAdapter( customAdapter );

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent( MainActivity.this,DetailActivity.class );
                intent.putExtra( "selectedSimpson",simpsonList.get( position ) );
                startActivity( intent );
            }
        } );

    }
}
