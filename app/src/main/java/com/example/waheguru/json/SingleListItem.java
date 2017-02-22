package com.example.waheguru.json;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Waheguru on 2/22/2017.
 */

public class SingleListItem extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.clickview);
        String list;
        TextView tv1= (TextView) findViewById(R.id.textView);
        Intent i = getIntent();
        list = i.getStringExtra("product") ;
        tv1.setText(" " + list);
    }
}
