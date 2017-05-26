package com.bibinet.mvprxjavaretrofitokhttp.mvp.model;

import com.bibinet.mvprxjavaretrofitokhttp.api.BookTypeListApi;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookTypeListBean;
import com.bibinet.mvprxjavaretrofitokhttp.mvp.view.BookListTypeViewController;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by bibinet on 2017-5-26.
 */

public class BookTypeListModel implements BookListTypeViewController.BookListBaseModel {

    public Observable<BookTypeListBean> getBookListType(){
        Retrofit retrofit=new Retrofit.Builder().baseUrl("http://japi.juhe.cn/comic/")
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        BookTypeListApi bookTypeListApi = retrofit.create(BookTypeListApi.class);
        Observable<BookTypeListBean> bookTpye = bookTypeListApi.getBookType("949ea374b5538b4d1631a01d7c743562");
        return bookTpye;
    }
}
