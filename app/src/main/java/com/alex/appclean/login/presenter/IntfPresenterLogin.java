package com.alex.appclean.login.presenter;

public interface IntfPresenterLogin  {

    void singIn(String username, String password); //interactor
    void loginSuccess();
    void loginError(String error);
}
