package com.example.teamas.customtheme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.UnderlineSpan;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView = findViewById(R.id.custom_text_view);

        SpannableStringBuilder stringBuilder = new SpannableStringBuilder("This String is Spantastic!");
        stringBuilder.setSpan(new ForegroundColorSpan(Color.RED), 8, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        stringBuilder.setSpan(new UnderlineSpan(), 10, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        stringBuilder.setSpan(new RelativeSizeSpan(2.0f), 8, 15, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(stringBuilder);

    }

   /* @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();
        return true;
    }
*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
