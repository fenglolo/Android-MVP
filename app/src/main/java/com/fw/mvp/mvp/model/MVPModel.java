package com.fw.mvp.mvp.model;

import com.fw.mvp.bean.Acount;
import com.fw.mvp.callback.MCallback;
import com.fw.mvp.mvp.model.IMVPModel;

import java.util.Random;

/**
 * description :
 * author : apple
 * date : 2021/6/16 11:06
 */
public class MVPModel implements IMVPModel {

    /**
     * 返回 账号｜等级
     *
     * @return
     */
    @Override
    public void getAcountData(String name, MCallback mCallback) {
        Random random = new Random();
        boolean isSuccess = random.nextBoolean();
        if (isSuccess) {
            Acount acount = new Acount();
            acount.setName(name);
            acount.setLevel(111);
            mCallback.onSuccess(acount);
        } else {
            mCallback.onFail();
        }
    }
}
