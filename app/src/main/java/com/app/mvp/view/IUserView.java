package com.app.mvp.view;

import com.app.mvp.bean.UserBean;

/**
 * Created by Vinchan on 2016/8/12.
 */
public interface IUserView {
    UserBean getUser();
    void setUser(UserBean user);
}
