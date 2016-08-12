package com.app.mvp.presenter;

import com.app.mvp.bean.UserBean;
import com.app.mvp.model.UserModelImpl;
import com.app.mvp.view.IUserView;

/**
 * Created by VinChan on 2016/8/12.
 */
public class UserPresenter {
    private UserModelImpl userModel;
    private IUserView iUserView;

    public UserPresenter (IUserView iUserView){
        this.iUserView=iUserView;
        userModel=new UserModelImpl();
    }
    public void setUser(UserBean userBean){
        iUserView.setUser(userBean);
    }

    public void  getUser(){
        iUserView.getUser();
    }

}
