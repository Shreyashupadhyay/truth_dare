package com.example.truth_dare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class OptionActivity extends AppCompatActivity {
    CircleMenu circleMenu;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        circleMenu = findViewById(R.id.circleoptiion);
        constraintLayout = findViewById(R.id.constraint);

        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.mipmap.menu , R.mipmap.cancel)
                .addSubMenu(Color.parseColor("#88bef5"),R.mipmap.logout)
                .addSubMenu(Color.parseColor("#83e85a"),R.mipmap.offline)
                .addSubMenu(Color.parseColor("#FF4B32"),R.mipmap.online)
                .addSubMenu(Color.parseColor("#ff8a5c"),R.mipmap.support)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Toast.makeText(OptionActivity.this, "logout", Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                Toast.makeText(OptionActivity.this, "offline", Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(OptionActivity.this, "online", Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                Toast.makeText(OptionActivity.this, "support", Toast.LENGTH_SHORT).show();
                                break;


                        }

                    }
                });
    }
}