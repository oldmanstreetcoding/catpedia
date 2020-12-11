package com.streetcoding.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class ShowCatActivity extends AppCompatActivity {
    public static final String EXTRA_ID = "extra_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_cat);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int pos = getIntent().getIntExtra(EXTRA_ID, 0);

        CatsData catsData = new CatsData();

        String[] catsname = catsData.getCatNames();
        TextView tvCatName = findViewById(R.id.tv_cat_name);
        tvCatName.setText(catsname[pos]);

        String[] catsdetil = catsData.getCatDetails();
        TextView tvCatDetil = findViewById(R.id.tv_cat_detil);
        tvCatDetil.setText(catsdetil[pos]);

        int[] catimages = catsData.getCatImages();
        ImageView tvCatPhoto = findViewById(R.id.tv_cat_photo);
        Glide.with(this)
            .load(catimages[pos])
            .into(tvCatPhoto);

        String[] catshistory = catsData.getCatHistory();
        TextView tvCatHistory = findViewById(R.id.tv_cat_history);
        tvCatHistory.setText(catshistory[pos]);

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
}