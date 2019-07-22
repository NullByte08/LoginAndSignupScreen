package com.example.loginandsignupscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    TextInputLayout emailTextInput,emailTextInput2,usernameTextInput2;
    TextInputLayout passTextInput,passTextInput2;
    View login_layoutView,signup_layoutView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login_layoutView= LayoutInflater.from(this).inflate(R.layout.login_cardview_layout,null);
        signup_layoutView= LayoutInflater.from(this).inflate(R.layout.signup_cardview_layout,null);
        ArrayList<Object> ElementsArrayList=new ArrayList<>();
        emailTextInput=login_layoutView.findViewById(R.id.emailTextInputLayout);
        passTextInput=login_layoutView.findViewById(R.id.passwordTextInputLayout);
        usernameTextInput2=signup_layoutView.findViewById(R.id.usernameTextInputLayout);
        emailTextInput2=signup_layoutView.findViewById(R.id.emailTextInputLayout2);
        passTextInput2=signup_layoutView.findViewById(R.id.passwordTextInputLayout2);
        ElementsArrayList.add(new LoginElements(emailTextInput.getEditText().getHint().toString(),passTextInput.getEditText().getHint().toString(),"Forgot Password?",R.drawable.logoimage,(Button)login_layoutView.findViewById(R.id.loginButton),(Button)login_layoutView.findViewById(R.id.swipeUpButton)));
        ElementsArrayList.add(new SignupElements(emailTextInput2.getEditText().getHint().toString(),passTextInput2.getEditText().getHint().toString(),usernameTextInput2.getEditText().getHint().toString(),R.drawable.logoimage,(Button)signup_layoutView.findViewById(R.id.signupButton),(Button)signup_layoutView.findViewById(R.id.swipeDownButton)));
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager= new LinearLayoutManager(this);
        adapter=new LoginAdapter(ElementsArrayList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
