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

public interface BookListViewController {
    interface BooKListVeiw extends BaseView {
        void onSucess(List<BookListB.ResultBean.BookListBean> bookListInfo);
        void onFailed(String msg);
        void onShowProgress();
        void onHideProgress();
    }
    interface bookListModel extends BaseModel{
        Observable<BookListB> getBookListB();
    }
    abstract class bookListPresenter extends BasePresenter<BooKListVeiw,bookListModel>{
        public abstract void getBoolistData();
    }
}
