package com.example.junhee.recyclerviewwithabstract;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PFRecyclerViewAdapter.OnViewHolderClick<Tag> {

    private RecyclerView recyclerView;
    private TagListAdapter adapter;
    private List<Tag> tags;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        initView();
        setRecyclerView();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
    }

    private void setRecyclerView(){
        adapter = new TagListAdapter(this, this);
        Log.e("Main", "tags  : " + tags.size());

        adapter.setList(tags);
        recyclerView.setAdapter(adapter);
        adapter.reset();
    }

    private void setData() {
        tags = new ArrayList<>();
        tags.add(new Tag("junhee", "j", "sdfjk"));
        tags.add(new Tag("heejin", "h", "111"));
    }

    @Override
    public void onClick(View view, int position, Tag item) {
        Toast.makeText(this, "name : " + item.name, Toast.LENGTH_SHORT).show();
    }
}
