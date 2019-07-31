package com.borisovskiy.simplemvpdagger2.ui;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.borisovskiy.simplemvpdagger2.R;
import com.borisovskiy.simplemvpdagger2.retrofit.PojoArticle;
import com.borisovskiy.simplemvpdagger2.retrofit.PojoNews;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    private List<PojoArticle> posts;


    public RecyclerViewAdapter(Context context) {
        this.posts = new ArrayList<>();
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recview_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PojoArticle post = posts.get(position);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        holder.post.setText(post.getContent());
//        } else {
//            holder.post.setText(Html.fromHtml(post.getContent()));
//        }
        holder.site.setText(post.getTitle());
        Glide.with(context)
                .load(post.getUrlToImage())
                .into(holder.imageview);

    }

    @Override
    public int getItemCount() {
        if (posts == null)
            return 0;
        return posts.size();
    }

    public void setData(PojoNews pojoNews) {
        this.posts.addAll(pojoNews.getArticles());
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView post;
        TextView site;
        ImageView imageview;

        public ViewHolder(View itemView) {
            super(itemView);
            post = (TextView) itemView.findViewById(R.id.postitem_post);
            site = (TextView) itemView.findViewById(R.id.postitem_site);
            imageview = (ImageView) itemView.findViewById(R.id.image_p);

        }
    }
}
