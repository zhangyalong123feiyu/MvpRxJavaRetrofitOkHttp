package com.bibinet.mvprxjavaretrofitokhttp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bibinet.mvprxjavaretrofitokhttp.R;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookListB;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by bibinet on 2017-5-26.
 */

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BookListViewHolder> {

    private List<BookListB.ResultBean.BookListBean> bookListBeen;
    private Context context;

    public BookListAdapter(List<BookListB.ResultBean.BookListBean> bookListBeen, Context context) {
        this.bookListBeen = bookListBeen;
        this.context = context;
    }

    @Override
    public BookListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_booklist, parent, false);
        BookListViewHolder viewHolder = new BookListViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BookListViewHolder holder, int position) {
        holder.name.setText(bookListBeen.get(position).getName());
        holder.descrp.setText(bookListBeen.get(position).getDes());
        Glide.with(context).load(bookListBeen.get(position).getCoverImg()).into(holder.imagepic);
    }

    @Override
    public int getItemCount() {
        return bookListBeen.size()==0?0:bookListBeen.size();
    }

    class BookListViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imagepic)
        ImageView imagepic;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.descrp)
        TextView descrp;
        public BookListViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
