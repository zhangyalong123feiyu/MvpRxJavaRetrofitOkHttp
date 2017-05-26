package com.bibinet.mvprxjavaretrofitokhttp.mvp.presenter;

import com.bibinet.mvprxjavaretrofitokhttp.bean.BookListB;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.model.BookListModel;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.view.BookListTypeViewController;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.view.BookListViewController;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by bibinet on 2017-5-26.
 */

public class BookListPresenter extends BookListViewController.bookListPresenter {
    public BookListPresenter(BookListViewController.BooKListVeiw view){
        mView=view;
        mModel=new BookListModel();
    }
    @Override
    public void getBoolistData() {
      Subscription subscription =mModel.getBookListB().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
                new Observer<BookListB>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(BookListB bookListB) {
                        mView.onSucess(bookListB.getResult().getBookList());
                    }
                }
        );
        addSubScription(subscription);
    }
}
