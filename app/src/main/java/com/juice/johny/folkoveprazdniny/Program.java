package com.juice.johny.folkoveprazdniny;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

import java.util.List;

public class Program extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent0 = new Intent(Program.this, MainActivity.class );
                    startActivity(intent0);
                    break;
                case R.id.navigation_ucinkujici:
                    Intent intent1 = new Intent(Program.this, Ucinkujici.class );
                    startActivity(intent1);
                    break;
                case R.id.navigation_program:
                    return true;

                case R.id.navigation_menu:
                    Intent intent2 = new Intent(Program.this, vMenu.class );
                    startActivity(intent2);
                    break;


            }
            return false;
        }

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        android.view.Menu menu = navigation.getMenu();
        MenuItem menuitem = menu.getItem(2);
        menuitem.setChecked(true);


// Set an action when any event is clicked.

    }



}
