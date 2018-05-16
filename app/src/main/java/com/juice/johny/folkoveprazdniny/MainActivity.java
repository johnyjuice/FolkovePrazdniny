package com.juice.johny.folkoveprazdniny;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    return true;
                case R.id.navigation_ucinkujici:
                    Intent intent0 = new Intent(MainActivity.this, Ucinkujici.class );
                    startActivity(intent0);
                    break;
                case R.id.navigation_program:
                    Intent intent1 = new Intent(MainActivity.this, Program.class );
                    startActivity(intent1);
                    break;
                case R.id.navigation_menu:
                    Intent intent2 = new Intent(MainActivity.this, vMenu.class );
                    startActivity(intent2);
                    break;


            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Menu menu = navigation.getMenu();
        MenuItem menuitem = menu.getItem(0);
        menuitem.setChecked(true);
    }

}
