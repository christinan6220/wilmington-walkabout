package edu.uncw.wilmingtonwalkabout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Spinner spSites;
    int sitePosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        spSites = findViewById(R.id.sp_sites);

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
        sitePosition = spSites.getSelectedItemPosition();
    }

    protected void onResume() {
        super.onResume();
        spSites.setSelection(sitePosition);
    }

    public void onclickchange (View view) {
        if (spSites.getSelectedItemPosition() != 0) {
            int item_pos = spSites.getSelectedItemPosition();
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("pos_val", item_pos );
            startActivity(intent);
        }
    }

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