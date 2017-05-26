package com.bibinet.mvprxjavaretrofitokhttp.mvp.model;

import com.bibinet.mvprxjavaretrofitokhttp.api.BookListApi;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookListB;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookTypeListBean;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.view.BookListTypeViewController;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.view.BookListViewController;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by bibinet on 2017-5-26.
 */

public class BookListModel implements BookListViewController.bookListModel {
    @Override
    public Observable<BookListB> getBookListB() {
        Retrofit retrofit=new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).
                addCallAdapterFactory(RxJavaCallAdapterFactory.create()).baseUrl("http://japi.juhe.cn/comic/").build();
        BookListApi bookListApi=retrofit.create(BookListApi.class);
        Observable<BookListB> bookListB = bookListApi.getBookListB("949ea374b5538b4d1631a01d7c743562", "少女漫画");
        return bookListB;
    }
}
