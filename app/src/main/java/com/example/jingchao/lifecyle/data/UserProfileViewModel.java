package com.example.jingchao.lifecyle.data;

import android.arch.lifecycle.ViewModel;

public class UserProfileViewModel extends ViewModel{
    private String userId;
    private User user;

    //初始化传递uid进来
    public void init(String userId) {
        this.userId = userId;
    }
    //提供完整的用户信息
    public User getUser() {
        return user;
    }

}
