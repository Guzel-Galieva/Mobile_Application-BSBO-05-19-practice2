package ru.mirea.galieva.multiactivity;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import ru.mirea.galieva.multiactivity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt = (TextView) findViewById(R.id.textView2);
        String text = (String) getIntent().getSerializableExtra("key");
        txt.setText(text);
    }
}