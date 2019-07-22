package com.example.loginandsignupscreen;

import android.widget.Button;
public class LoginElements {
    private String emailTextInputHint,passwordTextInputHint;
    private String forgotPassString;
    private int logo;
    private Button login,swipeUp;

    public LoginElements(String emailTextInputHint, String passwordTextInputHint, String forgotPassString, int logo, Button login, Button swipeDown) {
        this.emailTextInputHint = emailTextInputHint;
        this.passwordTextInputHint = passwordTextInputHint;
        this.forgotPassString = forgotPassString;
        this.logo = logo;
        this.login = login;
        this.swipeUp = swipeDown;
    }

    public String getEmailTextInputHint() {
        return emailTextInputHint;
    }

    public String getPasswordTextInputHint() {
        return passwordTextInputHint;
    }

    public String getForgotPassString() {
        return forgotPassString;
    }

    public int getLogo() {
        return logo;
    }

    public Button getLogin() {
        return login;
    }

    public Button getSwipeUp() {
        return swipeUp;
    }
}
