package com.bibinet.mvprxjavaretrofitokhttp.api;

import com.bibinet.mvprxjavaretrofitokhttp.bean.BookListB;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by bibinet on 2017-5-26.
 */

public interface BookListApi {
    @POST("book")
    Observable<BookListB> getBookListB(@Query("key") String key,@Query("name") String name);
}
