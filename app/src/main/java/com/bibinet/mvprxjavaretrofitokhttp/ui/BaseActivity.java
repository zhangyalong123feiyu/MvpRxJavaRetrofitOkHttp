package com.bibinet.mvprxjavaretrofitokhttp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bibinet.mvprxjavaretrofitokhttp.base.basepresenter.BasePresenter;

/**
 * Created by bibinet on 2017-5-26.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (mPresenter==null) {
        			mPresenter=onCreatePresenter();
        		}
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null) {
        			mPresenter.unSubScription();
        		}
    }

    public abstract P onCreatePresenter();
}
