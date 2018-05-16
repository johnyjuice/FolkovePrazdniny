package com.juice.johny.folkoveprazdniny;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class vMenu extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent0 = new Intent(vMenu.this, MainActivity.class );
                    startActivity(intent0);
                    break;
                case R.id.navigation_ucinkujici:
                    Intent intent1 = new Intent(vMenu.this, Ucinkujici.class );
                    startActivity(intent1);
                    break;
                case R.id.navigation_program:
                    Intent intent2 = new Intent(vMenu.this, Program.class );
                    startActivity(intent2);
                    break;
                case R.id.navigation_menu:
                     return true;



            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        android.view.Menu menu = navigation.getMenu();
        MenuItem menuitem = menu.getItem(3);
        menuitem.setChecked(true);
    }
}
