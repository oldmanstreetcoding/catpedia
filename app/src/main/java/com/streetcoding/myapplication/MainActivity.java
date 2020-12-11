 package com.streetcoding.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_catgallery);
        btnMoveActivity.setOnClickListener(this);
    }

     @Override
     public void onClick(View v) {
         switch (v.getId()) {
             case R.id.btn_move_catgallery:
                 Intent moveIntent = new Intent(MainActivity.this, GalleryActivity.class);
                 startActivity(moveIntent);
                 break;
         }
     }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.menu_main, menu);
         return super.onCreateOptionsMenu(menu);
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         setMode(item.getItemId());
         return super.onOptionsItemSelected(item);
     }

     public void setMode(int selectedMode) {
         switch (selectedMode) {
             case R.id.action_myaccount:
                 Intent moveIntent = new Intent(MainActivity.this, MyAccountActivity.class);
                 startActivity(moveIntent);
                 break;
         }
     }
}