package com.wondersgroup.testsdk.bubblechart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wondersgroup.testsdk.bubblechart.view.BallView;
import com.wondersgroup.testsdk.bubblechart.modle.RingEntity;

import java.util.ArrayList;
import java.util.List;

public class BallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);

        BallView ringChart=(BallView)findViewById(R.id.roundProgressBar2);
        List<RingEntity> datas=new ArrayList<RingEntity>();
        RingEntity r1=new RingEntity(getResources().getColor(R.color.colorAccent),(float)78,"78",getResources().getColor(R.color.colorPrimary));
        RingEntity r2=new RingEntity(getResources().getColor(R.color.colorPrimary),(float)178,"178",getResources().getColor(R.color.d1));
        datas.add(r1);
        datas.add(r2);
        ringChart.setDataList(datas);
        ringChart.setCenterText("测试");
        ringChart.setCenterTextColor(getResources().getColor(R.color.d2));
        ringChart.setDataTextColor(getResources().getColor(R.color.d2));
    }
}
