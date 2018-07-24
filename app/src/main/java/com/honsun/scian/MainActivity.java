package com.honsun.scian;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import com.honsun.scian.view.SwipeMenu;
import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Bind(R.id.main_swipemenu)
    SwipeMenu mMainSwipemenu;
    @Bind(R.id.main_btn_menu)
    ImageButton mBtnMenu;


    private Context mContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme_NoActionBar);
        super.onCreate(savedInstanceState);
        mContext = this;
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMainSwipemenu.setStyleCode(1113);//侧滑风格
        mMainSwipemenu.setBlur(MainActivity.this, R.mipmap.dayu, R.color.colorPrimary, 22f);//背景风格模糊
        mBtnMenu.setOnClickListener(this);
    }






    @Override
    public void onBackPressed() {
        if (mMainSwipemenu.isMenuShowing()) {
            mMainSwipemenu.hideMenu();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_btn_menu:
                if (mMainSwipemenu.isMenuShowing()) {
                    mMainSwipemenu.hideMenu();
                } else {
                    mMainSwipemenu.showMenu();
                }
                break;
        }
    }

}
