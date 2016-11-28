package com.example.zhanghaihua.columnar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.zhanghaihua.columnar.util.DatePackerUtil;
import com.example.zhanghaihua.columnar.util.PopDateHelper;
import com.example.zhanghaihua.columnar.util.PopDateHelper2;

public class MainActivity extends AppCompatActivity {

    Button  btn2;
    PopDateHelper2 popDateHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/************************  by zhh 弹窗类型二   *************************/
        popDateHelper = new PopDateHelper2(this);
        popDateHelper.setOnClickOkListener(new PopDateHelper2.OnClickOkListener() {
            @Override
            public void onClickOk(String date, String amfm, String time,String min) {
                Toast.makeText(MainActivity.this, date + " "+amfm+" " + time+" "+min, Toast.LENGTH_LONG).show();
            }
        });




/************************  by zhh 按钮二   *************************/
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popDateHelper.show(btn2);
            }
        });



    }
}
