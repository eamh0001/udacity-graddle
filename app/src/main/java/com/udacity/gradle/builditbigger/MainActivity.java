package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;

import com.example.jokesbar.JokesActivity;

public class MainActivity extends AppCompatActivity
        implements EndpointsAsyncTask.Listener {

    private ProgressBar pbLoadingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pbLoadingBar = findViewById(R.id.pbLoadingBar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        showLoadingBar(true);
        new EndpointsAsyncTask(this).execute();
    }

    @Override
    public void onEndpointsDataReceived(String data) {
        showLoadingBar(false);
        Log.d("onEndpointsDataReceived", "" + data);
        Intent jokeIntent = new Intent(this, JokesActivity.class);
        jokeIntent.putExtra(JokesActivity.INTENT_KEY_JOKE, "" + data);
        startActivity(jokeIntent);
    }

    private void showLoadingBar(boolean show) {
        pbLoadingBar.setVisibility(show ? View.VISIBLE : View.GONE);
    }
}
