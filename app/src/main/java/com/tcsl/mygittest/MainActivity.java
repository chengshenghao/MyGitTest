package com.tcsl.mygittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Ctrl+K进行提交,alt+9 查看版本控制
 * Git revert可以将版本回退到上一步，但是会新增一个提交，
 * Git reset就要干脆的多，与Git revert的功能一样，它也可以将代码恢复到上一个版本，但是不会新增一次提交
 * git rebase用于把一个分支的修改合并到当前分支
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("我是功能1");
        System.out.println("我是功能3");
        System.out.println("我是功能4");
    }
}
