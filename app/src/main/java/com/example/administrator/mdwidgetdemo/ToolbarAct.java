package com.example.administrator.mdwidgetdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by zpw on 2018/8/15.
 * 导航按钮
 * 应用程序的标志logo
 * 标题和子标题
 * 一个和多个自定义的视图控件
 * 操作菜单
 */

public class ToolbarAct extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
    }
}
