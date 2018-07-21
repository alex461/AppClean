package com.alex.appclean.login.interactor;

import com.alex.appclean.login.presenter.IntfPresenterLogin;
import com.alex.appclean.login.repository.ImplRepositoryLogin;
import com.alex.appclean.login.repository.IntfRepositoryLogin;


public class ImplInteractoLogin implements IntfIteractorLogin {

    private IntfPresenterLogin intfPresenterLogin;
    private IntfRepositoryLogin intfRepositoryLogin;


    public ImplInteractoLogin(IntfPresenterLogin intfPresenterLogin) {
        this.intfPresenterLogin = intfPresenterLogin;
        intfRepositoryLogin= new ImplRepositoryLogin(intfPresenterLogin);

    }

    @Override
    public void singIn(String username, String password) {
        intfRepositoryLogin.singIn(username,password);
    }
}
