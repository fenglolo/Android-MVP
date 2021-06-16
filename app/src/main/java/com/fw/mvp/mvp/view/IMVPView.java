package com.fw.mvp.mvp.view;

import com.fw.mvp.bean.Acount;

/**
 * description :
 * author : apple
 * date : 2021/6/16 11:03
 */
public interface IMVPView {
    /**
     * 获取输入内容
     *
     * @return
     */
    String getInputText();

    /**
     * 展示成功
     *
     * @param acount
     */
    void showSuccessPage(Acount acount);

    /**
     * 展示失败
     */
    void showFail();
}
