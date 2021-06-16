package com.fw.mvp.mvp.presenter;

import com.fw.mvp.bean.Acount;
import com.fw.mvp.callback.MCallback;
import com.fw.mvp.mvp.model.IMVPModel;
import com.fw.mvp.mvp.model.MVPModel;
import com.fw.mvp.mvp.view.IMVPView;

/**
 * description :
 * author : apple
 * date : 2021/6/16 11:11
 */
public class MVPPresenter implements IMVPPresenter {
    private IMVPView mView;
    private IMVPModel mModel;

    public MVPPresenter(IMVPView mView) {
        this.mView = mView;
        mModel = new MVPModel();
    }

    @Override
    public void onClick(String name) {
        mModel.getAcountData(name, new MCallback() {
            @Override
            public void onSuccess(Acount acount) {
                mView.showSuccessPage(acount);
            }

            @Override
            public void onFail() {
                mView.showFail();
            }
        });
    }
}
