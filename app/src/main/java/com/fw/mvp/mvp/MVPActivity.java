package com.fw.mvp.mvp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.fw.mvp.R;
import com.fw.mvp.bean.Acount;
import com.fw.mvp.mvp.presenter.IMVPPresenter;
import com.fw.mvp.mvp.presenter.MVPPresenter;
import com.fw.mvp.mvp.view.IMVPView;

/**
 * description :
 * author : apple
 * date : 2021/6/15 21:04
 */
public class MVPActivity extends AppCompatActivity implements IMVPView, View.OnClickListener {

    private EditText editText;
    private Button button;
    private TextView textView;

    private IMVPPresenter mvpPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        initView();
        initData();
    }

    private void initView() {
        editText = findViewById(R.id.et);
        button = findViewById(R.id.btn);
        textView = findViewById(R.id.tv);
    }

    private void initData() {
        button.setOnClickListener(this);
        mvpPresenter = new MVPPresenter(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn) {
            mvpPresenter.onClick(getInputText());
        }
    }

    @Override
    public String getInputText() {
        return editText.getText().toString().trim();
    }

    @Override
    public void showSuccessPage(Acount acount) {
        textView.setText(acount.getName() + " | " + acount.getLevel());
    }

    @Override
    public void showFail() {
        textView.setText("数据获取失败");
    }
}
