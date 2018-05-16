package com.juice.johny.folkoveprazdniny;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.view.Menu;

public class Ucinkujici extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucinkujici);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener0);

        Menu menu = navigation.getMenu();
        MenuItem menuitem = menu.getItem(1);
        menuitem.setChecked(true);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener0
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent0 = new Intent(Ucinkujici.this, MainActivity.class );
                    startActivity(intent0);
                    break;
                case R.id.navigation_ucinkujici:
                    return true;

                case R.id.navigation_program:
                    Intent intent1 = new Intent(Ucinkujici.this, Program.class );
                    startActivity(intent1);
                    break;
                case R.id.navigation_menu:
                    Intent intent2 = new Intent(Ucinkujici.this, vMenu.class );
                    startActivity(intent2);
                    break;


            }
            return false;
        }

    };
}
