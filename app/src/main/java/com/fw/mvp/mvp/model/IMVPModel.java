package com.fw.mvp.mvp.model;

import com.fw.mvp.callback.MCallback;

/**
 * description :Model层接口
 * author : apple
 * date : 2021/6/16 15:19
 */
public interface IMVPModel {
    /**
     * 成功：返回数据
     * 失败：回调失败
     *
     * @param name
     * @param mCallback
     */
    void getAcountData(String name, MCallback mCallback);
}
