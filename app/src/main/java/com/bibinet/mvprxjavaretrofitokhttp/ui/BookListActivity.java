package com.bibinet.mvprxjavaretrofitokhttp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bibinet.mvprxjavaretrofitokhttp.R;
import com.bibinet.mvprxjavaretrofitokhttp.adapter.BookListAdapter;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookListB;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.presenter.BookListPresenter;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.view.BookListViewController;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bibinet on 2017-5-26.
 */

public class BookListActivity extends BaseActivity<BookListPresenter> implements BookListViewController.BooKListVeiw {

    @BindView(R.id.bookListRecylerView)
    RecyclerView bookListRecylerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist);
        ButterKnife.bind(this);
        mPresenter.getBoolistData();
    }

    @Override
    public BookListPresenter onCreatePresenter() {
        return new BookListPresenter(this);
    }

    @Override
    public void onSucess(List<BookListB.ResultBean.BookListBean> bookListInfo) {
        bookListRecylerView.setLayoutManager(new LinearLayoutManager(this));
        BookListAdapter adapter=new BookListAdapter(bookListInfo,this);
        bookListRecylerView.setAdapter(adapter);
    }

    @Override
    public void onFailed(String msg) {

    }

    @Override
    public void onShowProgress() {

    }

    @Override
    public void onHideProgress() {

    }
}
