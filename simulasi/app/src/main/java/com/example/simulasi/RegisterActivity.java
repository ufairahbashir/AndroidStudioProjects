package com.example.simulasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class RegisterActivity extends AppCompatActivity {
    private EditText editName, editPasswordConf, editEmail, editPassword;
    private Button btnLogin, btnRegis;
    private ProgressDialog ProgressDialog;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editName = findViewById(R.id.nama);
        editEmail = findViewById(R.id.email);
        editPassword = findViewById(R.id.password);
        editPasswordConf = findViewById(R.id.passwordconf);
        btnLogin = findViewById(R.id.login3);
        btnRegis = findViewById(R.id.signUp2);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        ProgressDialog = new ProgressDialog(RegisterActivity.this);
        ProgressDialog.setTitle("Loading");
        ProgressDialog.setMessage("silakan tunggu!");
        ProgressDialog.setCancelable(false);

        btnLogin.setOnClickListener(view -> {
            finish();
        });

        btnRegis.setOnClickListener(view -> {
            if(editEmail.getText().length()>0 && editPassword.getText().length()>0 && editName.getText().length()>0 && editPasswordConf.getText().length()>0){
                if(editPassword.getText().toString().equals(editPasswordConf.getText().toString())){
                    register(editName.getText().toString(), editEmail.getText().toString(), editPassword.getText().toString());
                }
                else{
                    Toast.makeText(getApplicationContext(), "silakan masukkan password yang sesuai", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(getApplicationContext(), "silakan isi semua data", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void register(String nama, String email, String password){
        ProgressDialog.show();
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful() && task.getResult()!=null) {
                    FirebaseUser firebaseUser = task.getResult().getUser();
                    if (firebaseUser!=null){
                        UserProfileChangeRequest request = new UserProfileChangeRequest.Builder()
                                .setDisplayName(nama)
                                .build();
                        firebaseUser.updateProfile(request).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                reload();
                            }
                        });
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "register gagal", Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(getApplicationContext(), task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void reload(){
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            reload();
        }
    }
}