package com.test.bt_tuan5_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btXoa;
    int vt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<MonAn> arrayList;
        Adapter adapter;

        btXoa = findViewById(R.id.buttonXoa);
        listView = findViewById(R.id.list_view);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAn(R.drawable.food1, "Item1", "Information of item1", "10$"));
        arrayList.add(new MonAn(R.drawable.food2, "Item2", "Information of item2", "8$"));
        arrayList.add(new MonAn(R.drawable.food3, "Item3", "Information of item3", "9$"));
        arrayList.add(new MonAn(R.drawable.food4, "Item4", "Information of item4", "3$"));
        arrayList.add(new MonAn(R.drawable.food5, "Item5", "Information of item5", "4$"));
        arrayList.add(new MonAn(R.drawable.food6, "Item6", "Information of item6", "6$"));

        adapter = new Adapter(MainActivity.this, R.layout.layoutitem, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                vt = i;
                if(i==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
        btXoa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                arrayList.remove(vt);
                adapter.notifyDataSetChanged();
            }
        });
    }
}