package com.fw.mvp.mvp.model;

import com.fw.mvp.callback.MCallback;

/**
 * description :
 * author : apple
 * date : 2021/6/16 15:19
 */
public interface IMVPModel {
    /**
     * 返回 账号｜等级
     *
     * @return
     */
    void getAcountData(String name, MCallback mCallback);
}
