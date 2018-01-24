package com.example.daniel.bird_jury;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * Created by daniel on 23/01/18.
 */

public class LoginActivity extends Activity {
    public EditText loginName;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.login_page);
        loginName = (EditText)findViewById(R.id.editText);
        EditText password = (EditText)findViewById(R.id.editText2);
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.nama_burung, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button login = (Button)findViewById(R.id.button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start NewActivity.class
                Intent myIntent = new Intent(LoginActivity.this,
                        MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("loginName", loginName.getText().toString());
                bundle.putString("jenisBurung", spinner.getSelectedItem().toString());
                myIntent.putExtras(bundle);
                startActivity(myIntent);
            }
        });
    }
}
