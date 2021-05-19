package com.example.homework1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_show#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_show extends Fragment {
    private View view;
    private static final int NUM_LIST_ITEMS = 100;
    private String TAG = "mExample";
    public RecyclerView mCollectRecyclerView;//定義RecyclerView
    ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();//
    private RecyclerViewAdapter mCollectRecyclerAdapter;//設定Adapter

    private RecyclerView mNumbersList;

//---------------------------------------------------------------------------

    public static Fragment_show newInstance(String param1, String param2) {
        Fragment_show fragment = new Fragment_show();
        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_show, container, false);

        Button button = v.findViewById(R.id.button_switch);

//        mRecyclerView = v.findViewById(R.id.recyclerView);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
//        myListAdapter = new RecyclerViewAdapter();
//        mRecyclerView.setAdapter(myListAdapter);



        button.setOnClickListener(new Button.OnClickListener(){@Override
        public void onClick( View v){

            Navigation.findNavController(v).navigate(R.id.action_Fragment_show_to_Fragment_detail);



//            Intent intent=new Intent(Welcome.this,MainActivity.class);//前面是this 後面指到class
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);//刷掉前面的Activity
            //Navigation.findNavController(v).navigate(R.id.Fragment_show);
//            startActivity(intent);

            //startActivityFromFragment(intent);

        }});


        return v;
    }





//    private void initRecyclerView() {
//        //獲取RecyclerView
//        mCollectRecyclerView=(RecyclerView)view.findViewById(R.id.recyclerView);
//        //建立adapter
//        mCollectRecyclerAdapter = new RecyclerViewAdapter(getActivity(), goodsEntityList);
//        //給RecyclerView設定adapter
//        mCollectRecyclerView.setAdapter(mCollectRecyclerAdapter);
//        //設定layoutManager,可以設定顯示效果，是線性佈局、grid佈局，還是瀑布流佈局
//        //引數是：上下文、列表方向（橫向還是縱向）、是否倒敘
//        mCollectRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
//        //設定item的分割線
//        mCollectRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.VERTICAL));
//        //RecyclerView中沒有item的監聽事件，需要自己在介面卡中寫一個監聽事件的介面。引數根據自定義
//        mCollectRecyclerAdapter.setOnItemClickListener(new CollectRecycleAdapter.OnItemClickListener() {
//            @Override
//            public void OnItemClick(View view, GoodsEntity data) {
//                //此處進行監聽事件的業務處理
//                Toast.makeText(getActivity(),"我是item",Toast.LENGTH_SHORT).show();
//            }
//        });
//    }




}