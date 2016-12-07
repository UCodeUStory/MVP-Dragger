package com.example.qiyue.mvp_dragger.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.qiyue.mvp_dragger.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

/**
 * Created by Administrator on 2016/11/16 0016.
 */
public class TitleListAdapter extends RecyclerView.Adapter<TitleListAdapter.TitleViewHolder> {


    public void setDatas(List<String> datas) {
        this.datas = datas;
    }

    private List<String> datas = new ArrayList();

    public TitleListAdapter(List<String>datas){
        this.datas = datas;
    }

    @Override
    public TitleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TitleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.title_list,parent,false));
    }

    @Override
    public void onBindViewHolder(TitleViewHolder holder, int position) {
         String dataObject = getDataObject(position);
         holder.tv_title.setText(dataObject);
    }

    public String getDataObject(int position){
        return this.datas.get(position);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class TitleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView tv_title;
        public TitleViewHolder(View itemView) {
            super(itemView);
            tv_title = (TextView)itemView.findViewById(R.id.tv_title);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(onTitleItemClick!=null){
                onTitleItemClick.onItemClick(v,getPosition());
            }
        }
    }

    public void setOnTitleItemClick(OnTitleItemClick onTitleItemClick) {
        this.onTitleItemClick = onTitleItemClick;
    }

    private OnTitleItemClick onTitleItemClick;

    public interface OnTitleItemClick{
        public void onItemClick(View view,int position);
    }
}
