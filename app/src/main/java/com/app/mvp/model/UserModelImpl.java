package com.app.mvp.model;

import com.app.mvp.bean.UserBean;

/**
 * Created by Vinchan on 2016/8/12.
 */
public class UserModelImpl implements  IUserModel{

    private UserBean user=new UserBean();
    @Override
    public UserBean getUser() {
        return user;
    }

    @Override
    public void setUser(UserBean user) {
       this.user=user;
    }
}
