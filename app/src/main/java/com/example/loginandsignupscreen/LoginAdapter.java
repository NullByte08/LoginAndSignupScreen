package com.example.loginandsignupscreen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class LoginAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Object> mloginElementsList;
    public LoginAdapter (ArrayList<Object> loginElementsList){
        mloginElementsList = loginElementsList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=null;
        if(viewType==0) {
            view = layoutInflater.inflate(R.layout.login_cardview_layout, parent, false);
            return new LoginViewHolder(view);
        }
        else if(viewType==1){
            view = layoutInflater.inflate(R.layout.signup_cardview_layout, parent,false);
            return new SignupViewHolder(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
        //return super.getItemViewType(position);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(position==0) {
            LoginViewHolder loginViewHolder=(LoginViewHolder) holder;
            LoginElements loginElements = (LoginElements)this.mloginElementsList.get(position);
            loginViewHolder.swipeUp.setText(loginElements.getSwipeUp().getText());
            loginViewHolder.imageView.setImageResource(loginElements.getLogo());
            loginViewHolder.forgotPassText.setText(loginElements.getForgotPassString());
            loginViewHolder.login.setText(loginElements.getLogin().getText());
            loginViewHolder.passwordTextInput.getEditText().setHint(loginElements.getPasswordTextInputHint());
            loginViewHolder.emailTextInput.getEditText().setHint(loginElements.getEmailTextInputHint());
        }
        else{
            SignupViewHolder signupViewHolder=(SignupViewHolder)holder;
            SignupElements signupElements = (SignupElements) this.mloginElementsList.get(position);
            signupViewHolder.swipeDown.setText(signupElements.getSwipeDown().getText());
            signupViewHolder.imageView.setImageResource(signupElements.getLogo());
            signupViewHolder.usernameTexInput2.getEditText().setText(signupElements.getUsernameTextInputHint2());
            signupViewHolder.signup.setText(signupElements.getSignupButton().getText());
            signupViewHolder.passwordTextInput2.getEditText().setHint(signupElements.getPasswordTextInputHint2());
            signupViewHolder.emailTextInput2.getEditText().setHint(signupElements.getEmailTextInputHint2());
        }

    }

    @Override
    public int getItemCount() {
        return mloginElementsList.size();
    }

    public class LoginViewHolder extends RecyclerView.ViewHolder{
        TextInputLayout emailTextInput,passwordTextInput;
        TextView forgotPassText;
        ImageView imageView;
        Button login,swipeUp;
        public LoginViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            emailTextInput=itemView.findViewById(R.id.emailTextInputLayout);
            passwordTextInput=itemView.findViewById(R.id.passwordTextInputLayout);
            forgotPassText=itemView.findViewById(R.id.forgotPassTextView);
            login=itemView.findViewById(R.id.loginButton);
            swipeUp=itemView.findViewById(R.id.swipeUpButton);
        }
    }
    public class SignupViewHolder extends RecyclerView.ViewHolder{
        TextInputLayout emailTextInput2,passwordTextInput2,usernameTexInput2;
        ImageView imageView;
        Button signup,swipeDown;
        public SignupViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView2);
            emailTextInput2=itemView.findViewById(R.id.emailTextInputLayout2);
            passwordTextInput2=itemView.findViewById(R.id.passwordTextInputLayout2);
            usernameTexInput2=itemView.findViewById(R.id.usernameTextInputLayout);
            signup=itemView.findViewById(R.id.signupButton);
            swipeDown=itemView.findViewById(R.id.swipeDownButton);
        }

    }
}
