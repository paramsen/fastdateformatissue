package com.paramsen.fastdateformatissue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.apache.commons.lang3.time.FastDateFormat;

import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String formatted = FastDateFormat.getInstance("EEE", TimeZone.getTimeZone("UTC"), new Locale("pt", "pt")).format(1494115200);
        ((TextView) findViewById(R.id.dateFormat)).setText(formatted);
    }
}
