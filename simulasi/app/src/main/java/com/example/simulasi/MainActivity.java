package com.example.simulasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private TextView textName;
    private FirebaseUser firebaseUser;
    private Button btnLogOut, clock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textName = findViewById(R.id.textview2);
        btnLogOut = findViewById(R.id.btnLogOut);
        clock = findViewById(R.id.kalenderr);

        clock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kalender();
            }
        });

        firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

        if(firebaseUser!=null){
            textName.setText(firebaseUser.getDisplayName());
        }
        else{
            textName.setText("login gagal!");
        }

        btnLogOut.setOnClickListener(view -> {
          FirebaseAuth.getInstance().signOut();
          startActivity(new Intent(getApplicationContext(), LoginActivity.class));
          finish();
        });



    }
    public void kalender(){
        Intent intent = new Intent(this, kalender.class);
        startActivity(intent);
    }

}