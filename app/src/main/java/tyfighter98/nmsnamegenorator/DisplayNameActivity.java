package tyfighter98.nmsnamegenorator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DisplayNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent receiveIntent = getIntent();

        String message = receiveIntent.getStringExtra(MainActivity.GENERATED_NAME);

        TextView textView = new TextView(this);
        textView.setTextSize(40);

        textView.setText(message);

        // setContentView(R.layout.activity_display_name);
        setContentView(textView);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
