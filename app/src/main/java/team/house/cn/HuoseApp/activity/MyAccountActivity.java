package team.house.cn.HuoseApp.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import team.house.cn.HuoseApp.R;

/**
 * Created by kn on 15/11/14.
 */
public class MyAccountActivity extends BaseActivity {
    @Override
    protected void initView() {
        super.initView();
        this.setContentView(R.layout.activity_my_account);
        Intent intent=getIntent();
        String balance=intent.getStringExtra("mybalance");
        TextView tv_balance=(TextView) findViewById(R.id.tv_balance);
        tv_balance.setText(balance);
        String noPay=intent.getStringExtra("noPay");
        TextView tv_coupon=(TextView) findViewById(R.id.tv_coupon);
        tv_coupon.setText("未结算："+noPay);
        tv_balance.setText(balance);
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initEvent() {
        super.initEvent();
    }

    @Override
    protected void onClickListener(View v) {
        super.onClickListener(v);
    }

    @Override
    protected void initTitle() {
        super.initTitle();
        mTitleView.setText("我的账户");
        mCityView.setVisibility(View.GONE);
        mLeftView.setVisibility(View.VISIBLE);
        mRightView.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}
