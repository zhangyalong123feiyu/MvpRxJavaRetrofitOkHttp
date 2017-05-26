package com.bibinet.mvprxjavaretrofitokhttp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.bibinet.mvprxjavaretrofitokhttp.R;
import com.bibinet.mvprxjavaretrofitokhttp.adapter.BookTypeListAdapter;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookTypeListBean;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.presenter.BookTypeListPresenter;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.view.BookListTypeViewController;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<BookTypeListPresenter>implements BookListTypeViewController.BookListBaseView {

    @BindView(R.id.booklistrecy)
    RecyclerView booklistrecy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.getBookListType();
        ButterKnife.bind(this);
    }

    @Override
    public BookTypeListPresenter onCreatePresenter() {
        return new BookTypeListPresenter(this);
    }

    @Override
    public void onSucess(List<String> bookTypeListinfo) {
        Log.i("TAG",bookTypeListinfo.size()+"==================");
        booklistrecy.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));
        BookTypeListAdapter adapter=new BookTypeListAdapter(MainActivity.this,bookTypeListinfo);
        booklistrecy.setAdapter(adapter);
    }

    @Override
    public void onFailed(String msg) {
        Log.i("TAG",msg+"--------------");
    }

    @Override
    public void onShowProgress() {

    }

    @Override
    public void onHideProgress() {

    }
}
