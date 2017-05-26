package com.bibinet.mvprxjavaretrofitokhttp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bibinet.mvprxjavaretrofitokhttp.R;
import com.bibinet.mvprxjavaretrofitokhttp.bean.BookTypeListBean;
import com.bibinet.mvprxjavaretrofitokhttp.ui.BookListActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by bibinet on 2017-5-26.
 */

public class BookTypeListAdapter extends RecyclerView.Adapter<BookTypeListAdapter.BookTypeListViewHolder> {

    private Context context;
    private List<String> bookTypeInfo = new ArrayList<>();

    public BookTypeListAdapter(Context context, List<String> bookTypeInfo) {
        this.context = context;
        this.bookTypeInfo = bookTypeInfo;
    }

    @Override
    public BookTypeListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_booktypelist, parent, false);
        BookTypeListViewHolder viewHolder = new BookTypeListViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(BookTypeListViewHolder holder, int position) {
        holder.bookType.setText(bookTypeInfo.get(position));
        holder.bookType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, BookListActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return bookTypeInfo.size();
    }

    @OnClick(R.id.bookType)
    public void onViewClicked() {
        context.startActivity(new Intent(context, BookListActivity.class));
    }

    class BookTypeListViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.bookType)
        TextView bookType;
        public BookTypeListViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
