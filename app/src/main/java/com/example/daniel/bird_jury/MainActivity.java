package com.example.daniel.bird_jury;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);
        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);
        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(this);
        Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(this);
        Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(this);
        Button button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(this);
        Button button14 = (Button) findViewById(R.id.button14);
        button14.setOnClickListener(this);
        Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(this);
        Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(this);
        Button button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(this);
        Button button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(this);
        Button button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(this);
        Button button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(this);
        Button button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(this);
        Button button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(this);
        Button button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(this);
        Button button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(this);
        Button button25 = (Button) findViewById(R.id.button25);
        button25.setOnClickListener(this);
        Button button26 = (Button) findViewById(R.id.button26);
        button26.setOnClickListener(this);
        Button button27 = (Button) findViewById(R.id.button27);
        button27.setOnClickListener(this);
        Button button28 = (Button) findViewById(R.id.button28);
        button28.setOnClickListener(this);
        Button button29 = (Button) findViewById(R.id.button29);
        button29.setOnClickListener(this);
        Button button30 = (Button) findViewById(R.id.button30);
        button30.setOnClickListener(this);
        Button button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(this);
        Button button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(this);
        Button button33 = (Button) findViewById(R.id.button33);
        button33.setOnClickListener(this);
        Button button34 = (Button) findViewById(R.id.button34);
        button34.setOnClickListener(this);
        Button button35 = (Button) findViewById(R.id.button35);
        button35.setOnClickListener(this);
        Button button36 = (Button) findViewById(R.id.button36);
        button36.setOnClickListener(this);
        Button button37 = (Button) findViewById(R.id.button37);
        button37.setOnClickListener(this);
        Button button38 = (Button) findViewById(R.id.button38);
        button38.setOnClickListener(this);
        Button button39 = (Button) findViewById(R.id.button39);
        button39.setOnClickListener(this);
        Button button40 = (Button) findViewById(R.id.button40);
        button40.setOnClickListener(this);
        Button button41 = (Button) findViewById(R.id.button41);
        button41.setOnClickListener(this);
        Button button42 = (Button) findViewById(R.id.button42);
        button42.setOnClickListener(this);
        Button button43 = (Button) findViewById(R.id.button43);
        button43.setOnClickListener(this);
        Button button44 = (Button) findViewById(R.id.button44);
        button44.setOnClickListener(this);
        Button button45 = (Button) findViewById(R.id.button45);
        button45.setOnClickListener(this);
        Button button46 = (Button) findViewById(R.id.button46);
        button46.setOnClickListener(this);
        Button button47 = (Button) findViewById(R.id.button47);
        button47.setOnClickListener(this);
        Button button48 = (Button) findViewById(R.id.button48);
        button48.setOnClickListener(this);

        /*button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //put send data
                PopupMenu popup = new PopupMenu(MainActivity.this,button1);
                popup.getMenuInflater()
                        .inflate(R.menu.popup_menu, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(
                                MainActivity.this,
                                "You Clicked : " + item.getTitle(),
                                Toast.LENGTH_SHORT
                        ).show();
                        return true;
                    }
                });

                popup.show(); //showing popup menu

            }
        });*/
    }
    @Override
    public void onClick(final View v){
        //put send data
        PopupMenu popup = new PopupMenu(MainActivity.this, v);
        popup.getMenuInflater()
                .inflate(R.menu.popup_menu, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(
                        MainActivity.this,
                        "You Clicked : " + getResources().getResourceEntryName(v.getId()) + " " + item.getTitle(),
                        Toast.LENGTH_SHORT
                ).show();
                return true;
            }
        });

        popup.show(); //showing popup menu
    }
}
