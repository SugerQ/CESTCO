package com.cesecsh.usercenter.presenter.view

import com.cesecsh.baselib.presenter.view.BaseView
import com.cesecsh.usercenter.data.protocol.User

/**
 * 作者：RockQ on 2018/6/11
 * 邮箱：qingle6616@sina.com
 *
 * msg：登陆结果处理
 */
interface LoginView : BaseView {
    fun showLoginResult(user: User)
}