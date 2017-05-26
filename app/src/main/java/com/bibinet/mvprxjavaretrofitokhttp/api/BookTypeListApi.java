package com.bibinet.mvprxjavaretrofitokhttp.api;

import com.bibinet.mvprxjavaretrofitokhttp.bean.BookTypeListBean;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by bibinet on 2017-5-26.
 */

public interface BookTypeListApi {
    @POST("category")
    Observable<BookTypeListBean> getBookType(@Query("key") String key);

}
