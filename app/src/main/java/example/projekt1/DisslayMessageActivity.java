package example.projekt1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisslayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disslay_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("key1");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);
    }
}