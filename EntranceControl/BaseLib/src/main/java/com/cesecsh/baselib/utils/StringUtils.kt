package com.cesecsh.baselib.utils

import android.support.annotation.Nullable
import android.view.TextureView
import java.io.Closeable
import java.io.IOException
import java.util.*

/**
 * 作者：RockQ on 2018/6/12
 * 邮箱：qingle6616@sina.com
 *
 * msg：关于字符串的相关操作
 */
object StringUtils {
    /**
     * 获取数值的位数，例如9返回1，99返回2，999返回3
     *
     * @param number 要计算位数的数值，必须>0
     * @return 数值的位数，若传的参数小于等于0，则返回0
     */
    fun getNumberDigits(number: Int): Int {
        return if (number <= 0) 0 else (Math.log10(number.toDouble()) + 1).toInt()
    }


    fun getNumberDigits(number: Long): Int {
        return if (number <= 0) 0 else (Math.log10(number.toDouble()) + 1).toInt()
    }

    /**
     * 规范化价格字符串显示的工具类
     *
     * @param price 价格
     * @return 保留两位小数的价格字符串
     */
    fun regularizePrice(price: Float): String {
        return String.format(Locale.CHINESE, "%.2f", price)
    }

    /**
     * 规范化价格字符串显示的工具类
     *
     * @param price 价格
     * @return 保留两位小数的价格字符串
     */
    fun regularizePrice(price: Double): String {
        return String.format(Locale.CHINESE, "%.2f", price)
    }


    fun isNullOrEmpty(@Nullable string: CharSequence?): Boolean {
        return string == null || string.isEmpty() || string.toString().equals("null", true)
    }

    fun close(c: Closeable?) {
        if (c != null) {
            try {
                c.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }

        }
    }

    fun objectEquals(a: Any?, b: Any): Boolean {
        return a === b || a != null && a == b
    }

    fun constrain(amount: Int, low: Int, high: Int): Int {
        return if (amount < low) low else if (amount > high) high else amount
    }

    fun constrain(amount: Float, low: Float, high: Float): Float {
        return if (amount < low) low else if (amount > high) high else amount
    }

}