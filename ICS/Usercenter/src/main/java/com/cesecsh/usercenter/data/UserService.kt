package com.cesecsh.usercenter.data

/**
 * 作者：RockQ on 2018/6/11
 * 邮箱：qingle6616@sina.com
 *
 * msg：用户数据操作接口
 */
interface UserService {
    //用户登陆
    fun login(userName: String, password: String, pushId: String)
}