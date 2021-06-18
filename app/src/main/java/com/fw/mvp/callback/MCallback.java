package com.fw.mvp.callback;

import com.fw.mvp.bean.Acount;

/**
 * description :回调接口
 * author : apple
 * date : 2021/6/16 11:30
 */
public interface MCallback {
    void onSuccess(Acount acount);

    void onFail();
}
