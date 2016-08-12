package com.app.mvp.model;

import com.app.mvp.bean.UserBean;

/**
 * Created by Vinchan on 2016/8/12.
 */
public interface IUserModel {

    UserBean getUser();
    void  setUser(UserBean user);
}
