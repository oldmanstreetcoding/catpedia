package com.streetcoding.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class GalleryActivity extends AppCompatActivity {
    private RecyclerView rvCats;
    private ArrayList<Cats> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rvCats = findViewById(R.id.rv_catgallery);
        rvCats.setHasFixedSize(true);

        list.addAll(CatsData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCats.setLayoutManager(new LinearLayoutManager(this));
        ListCatAdapter listCatAdapter = new ListCatAdapter(list);
        rvCats.setAdapter(listCatAdapter);

        listCatAdapter.setOnDetilBtnClickCallback(new ListCatAdapter.OnDetilBtnClickCallback() {
            @Override
            public void onDetilBtnClicked(Cats data) {
                showSelectedCat(data);
            }
        });

        listCatAdapter.setOnShareBtnClickCallback(new ListCatAdapter.OnShareBtnClickCallback() {
            @Override
            public void onShareBtnClicked(Cats data) {
                shareSelectedCat(data);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    private void showSelectedCat(Cats cats) {
        Toast.makeText(this, "Show Cat Profile : " + cats.getName(), Toast.LENGTH_SHORT).show();

        Intent ShowCatIntent = new Intent(GalleryActivity.this, ShowCatActivity.class);
        ShowCatIntent.putExtra(ShowCatActivity.EXTRA_ID, cats.getId());
        startActivity(ShowCatIntent);
    }

    private void shareSelectedCat(Cats cats) {
        Toast.makeText(this, "Share Cat Profile : " + cats.getName(), Toast.LENGTH_SHORT).show();

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, cats.getName() + ". "+ cats.getDetail());
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent, null);
        startActivity(shareIntent);
    }
}