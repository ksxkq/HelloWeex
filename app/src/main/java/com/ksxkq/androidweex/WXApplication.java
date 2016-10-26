package com.ksxkq.androidweex;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;

/**
 * OnePiece
 * Created by xukq on 10/26/16.
 */

public class WXApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WXEnvironment.addCustomOptions("appName","TBSample");
        WXSDKEngine.initialize(this, new InitConfig.Builder()
                .setImgAdapter(new ImageAdapter())
                .build());
    }
}
