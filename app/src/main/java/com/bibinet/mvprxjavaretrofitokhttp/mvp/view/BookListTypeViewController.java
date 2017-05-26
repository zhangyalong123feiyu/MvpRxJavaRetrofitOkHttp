package com.bibinet.mvprxjavaretrofitokhttp.mvp.view;

import com.bibinet.mvprxjavaretrofitokhttp.base.basemodel.BaseModel;
import com.bibinet.mvprxjavaretrofitokhttp.base.basepresenter.BasePresenter;
import com.bibinet.mvprxjavaretrofitokhttp.base.baseview.BaseView;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookListB;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookTypeListBean;

import java.util.List;

import rx.Observable;

/**
 * Created by bibinet on 2017-5-26.
 */

public interface BookListTypeViewController extends BaseView{
        interface BookListBaseView extends BaseView{
            void onSucess(List<String> bookTypeInfo);
            void onFailed(String msg);
            void onShowProgress();
            void onHideProgress();
        }
        interface BookListBaseModel extends BaseModel{
            Observable<BookTypeListBean> getBookListType();
        }
        abstract class BookListBasePresenter extends BasePresenter<BookListBaseView,BookListBaseModel>{
          public abstract  void getBookListType();
        }
}
