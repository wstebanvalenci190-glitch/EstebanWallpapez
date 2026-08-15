package com.esteban.wallpapers;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.graphics.Color;

public class MainActivity extends Activity {

    LinearLayout layout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.rgb(11, 11, 13));
        layout.setPadding(30, 30, 30, 30);

        TextView title = new TextView(this);
        title.setText("🔥 ESTEBAN WALLPAPERS");
        title.setTextColor(Color.WHITE);
        title.setTextSize(26);
        title.setGravity(17);
        title.setPadding(10, 30, 10, 30);
        title.setBackgroundColor(Color.rgb(230, 0, 18));

        layout.addView(title);

        Button add = new Button(this);
        add.setText("➕ Add My Photos");

        add.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
            intent.setType("image/*");
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            startActivityForResult(intent, 100);
        });

        layout.addView(add);

        Button demo = new Button(this);
        demo.setText("✨ Demo Wallpapers");

        demo.setOnClickListener(v ->
            Toast.makeText(
                this,
                "Welcome to Esteban Wallpapers!",
                Toast.LENGTH_SHORT
            ).show()
        );

        layout.addView(demo);

        TextView message = new TextView(this);
        message.setText("Choose your favorite photos and make your tablet yours!");
        message.setTextColor(Color.WHITE);
        message.setTextSize(17);
        message.setGravity(17);
        message.setPadding(10, 40, 10, 40);

        layout.addView(message);

        setContentView(layout);
    }
}
