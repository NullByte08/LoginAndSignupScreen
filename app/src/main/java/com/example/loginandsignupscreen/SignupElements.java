package com.example.loginandsignupscreen;

import android.widget.Button;

public class SignupElements {
    private String emailTextInputHint2,passwordTextInputHint2,usernameTextInputHint2;
    private int logo;
    private Button signupButton,swipeDown;

    public SignupElements(String emailTextInputHint2, String passwordTextInputHint2, String usernameTextInputHint2, int logo, Button signupButton, Button swipeDown) {
        this.emailTextInputHint2 = emailTextInputHint2;
        this.passwordTextInputHint2 = passwordTextInputHint2;
        this.usernameTextInputHint2 = usernameTextInputHint2;
        this.logo = logo;
        this.signupButton = signupButton;
        this.swipeDown = swipeDown;
    }

    public String getEmailTextInputHint2() {
        return emailTextInputHint2;
    }

    public String getPasswordTextInputHint2() {
        return passwordTextInputHint2;
    }

    public String getUsernameTextInputHint2() {
        return usernameTextInputHint2;
    }

    public int getLogo() {
        return logo;
    }

    public Button getSignupButton() {
        return signupButton;
    }

    public Button getSwipeDown() {
        return swipeDown;
    }
}
