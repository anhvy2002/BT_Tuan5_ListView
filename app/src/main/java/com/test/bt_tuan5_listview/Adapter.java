package com.test.bt_tuan5_listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<MonAn> arraylist;

    public Adapter(Context context, int layout, List<MonAn> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        MonAn monAn = arraylist.get(i);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView tv_ten = view.findViewById(R.id.tv_ten);
        TextView tv_thongTin = view.findViewById(R.id.tv_thongTin);
        TextView tv_gia = view.findViewById(R.id.tv_gia);

        imageView.setImageResource(monAn.getHinh());
        tv_ten.setText(monAn.getTen());
        tv_thongTin.setText(monAn.getThongTin());
        tv_gia.setText(monAn.getGia());

        return view;
    }
}
