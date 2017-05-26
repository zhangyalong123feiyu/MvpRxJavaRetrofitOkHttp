package com.bibinet.mvprxjavaretrofitokhttp.base.basepresenter;

import com.bibinet.mvprxjavaretrofitokhttp.base.basemodel.BaseModel;
import com.bibinet.mvprxjavaretrofitokhttp.base.baseview.BaseView;


import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by bibinet on 2017-5-26.
 */

public  class BasePresenter<V extends BaseView,M extends BaseModel> {
    protected V mView;
    protected M mModel;
    private CompositeSubscription compositeSubscription;

    //添加订阅
    protected void addSubScription(Subscription subscription){
        if (this.compositeSubscription==null) {
            this.compositeSubscription=new CompositeSubscription();
        		}
            this.compositeSubscription.add(subscription);
    }
    //解除订阅
    public void unSubScription(){
        if (mView!=null) {
        			mView=null;
        		}
        if (compositeSubscription!=null&&compositeSubscription.isUnsubscribed()) {
            compositeSubscription.clear();
        		}
    }

}
