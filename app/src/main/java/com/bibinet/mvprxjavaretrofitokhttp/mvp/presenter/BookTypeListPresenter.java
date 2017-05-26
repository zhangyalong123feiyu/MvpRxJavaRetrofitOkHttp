package com.bibinet.mvprxjavaretrofitokhttp.mvp.presenter;

import com.bibinet.mvprxjavaretrofitokhttp.base.basepresenter.BasePresenter;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookTypeListBean;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.model.BookTypeListModel;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.view.BookListTypeViewController;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by bibinet on 2017-5-26.
 */

public class BookTypeListPresenter extends BookListTypeViewController.BookListBasePresenter{

    public BookTypeListPresenter(BookListTypeViewController.BookListBaseView bookListTypeView){
        mView=bookListTypeView;
        mModel=new BookTypeListModel();
    }
    @Override
    public void getBookListType() {
        Subscription subscribe=mModel.getBookListType().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
                new Observer<BookTypeListBean>() {
                    @Override
                    public void onCompleted() {

                    }
                    @Override
                    public void onError(Throwable e) {
                        mView.onFailed(e.getMessage());
                    }
                    @Override
                    public void onNext(BookTypeListBean bookTypeListBean) {
                        mView.onSucess(bookTypeListBean.getResult());
                    }
                }
        );
        addSubScription(subscribe);
    }
}
