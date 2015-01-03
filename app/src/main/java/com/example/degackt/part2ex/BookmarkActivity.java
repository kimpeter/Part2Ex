package com.example.degackt.part2ex;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;


public class BookmarkActivity extends ActionBarActivity {

    ListView mStoreList ;
    private ArrayAdapter<String> mAdapter;
	ArrayList<MyItem> list = new ArrayList<MyItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookmark);

		mStoreList = (ListView) findViewById(R.id.storeList);
		MyListAdapter adapter = new MyListAdapter(this, R.layout.list_view,list);
        mStoreList.setAdapter(adapter);



		mStoreList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

				MyItem item = new MyItem();
				Toast.makeText(getApplicationContext(), item.getItemName(), Toast.LENGTH_LONG).show();
			}
		});
		list.add(new MyItem(R.drawable.yes,"네네치킨"));
		list.add(new MyItem(R.drawable.mrp,"미스터피자"));
		list.add(new MyItem(R.drawable.ic_launcher,"버거킹"));

		/*메뉴버튼 관리*/
		Button homeBtn = (Button) findViewById(R.id.mainBtn);
		homeBtn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getBaseContext(),MainActivity.class);
				startActivity(intent);
			}
		});

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bookmark, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
