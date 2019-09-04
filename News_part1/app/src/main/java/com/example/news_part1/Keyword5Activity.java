package com.example.news_part1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Keyword5Activity extends AppCompatActivity {
    ListView mLsvInfo;
    String[] title = {
            "劉家昌轟韓黑：一群白內障 曝母親遭共產黨抓走3次",
            "習慣這樣站錯了嗎？AIT處長也「背對」youtube創辦人",
            "螞蟻跟著佳芬姐 力挺「庶民當總統」",
            "旺董蔡衍明解釋和韓國瑜關係 欣賞他敢講真話",
            "韓國瑜臉書PO學士學位證明書"

    };

    Integer[] image_id = {
            R.drawable.china_20190825002308,
            R.drawable.china_political_20190825001916_260407,
            R.drawable.china259040,
            R.drawable.china259041,
            R.drawable.china259042,R.drawable.china259043
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword5);

        CustomListAdapter adapter = new CustomListAdapter(this, title, image_id);
        mLsvInfo = (ListView) findViewById(R.id.lv);
        mLsvInfo.setAdapter(adapter);
        mLsvInfo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String Selecteditem = title[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void goToKeyword2(View view) {
        Intent intent =  new Intent(Keyword5Activity.this, Keyword7Activity.class);
        startActivity(intent);
    }
}
