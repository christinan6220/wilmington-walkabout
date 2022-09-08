package edu.uncw.wilmingtonwalkabout;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

    int sitePosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        TextView siteName = findViewById(R.id.site_header);
        TextView description = findViewById(R.id.aboutSite);
        ImageView image = findViewById(R.id.site_img);
        TextView detailLink = findViewById(R.id.site_link);

        Intent intent = getIntent();
        sitePosition = intent.getIntExtra("pos_val", 0);

        SiteInfo site = SiteInfo.sites[sitePosition - 1];
        siteName.setText(site.getName());
        description.setText(site.getDescription());
        image.setImageResource(site.getImageRid());
        detailLink.setText(detailLink.getText() + " " + site.getWebsite());
//        a href="http://www.google.com">Google</a



        if (savedInstanceState != null) {
            sitePosition = savedInstanceState.getInt("position");
        }

    }
    public void onSaveInstanceState (Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("position", sitePosition);
    }

    protected void onPause() {
        super.onPause();
    }

    protected void onResume() { super.onResume(); }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_about:
                //code to run when create order item is clicked
                Intent intent = new Intent(this, AboutActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}