package com.dou361.simijkplayer.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.dou361.simijkplayer.PlayStateParams;
import com.dou361.simijkplayer.PlayerView;
import com.dou361.simijkplayer.listener.OnShowThumbnailListener;
import com.dou361.simijkplayer.utils.ResourceUtils;


/**
 * ========================================
 * <p/>
 * 版 权：深圳市晶网科技控股有限公司 版权所有 （C） 2015
 * <p/>
 * 作 者：陈冠明
 * <p/>
 * 个人网站：http://www.dou361.com
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2015/11/18 9:40
 * <p/>
 * 描 述：测试临时使用
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class PlayerActivity extends Activity {

    private PlayerView player;
    private String trumb;
    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = this;
        setContentView(ResourceUtils.getResourceIdByName(mContext, "layout", "simple_player_view_player"));
        trumb = "http://115.159.45.251/fbei-test/2016/0512/LA5254B58E265011C.jpg";
//        String url = "rtmp://2026.liveplay.myqcloud.com/live/2026_6b0e62df231111e6b91fa4dcbef5e35a";
//        String url = "http://9890.vod.myqcloud.com/9890_9c1fa3e2aea011e59fc841df10c92278.f20.mp4";
        String url = "rtmp://stream.nodemedia.cn/live/demo";
        player = new PlayerView(this);
        player.setTitle("什么");
        player.setScaleType(PlayStateParams.fillparent);
        player.hideMenu(true);
        player.forbidTouch(false);
        player.showThumbnail(new OnShowThumbnailListener() {
            @Override
            public void onShowThumbnail(ImageView ivThumbnail) {
                if (trumb != null) {
//                    Picasso.with(mContext)
//                            .load(trumb)
//                            .placeholder(R.mipmap.ic_default)
//                            .error(R.mipmap.ic_error)
//                            .into(ivThumbnail);
                    ivThumbnail.setImageResource(ResourceUtils.getResourceIdByName(mContext, "drawable", "imple_player_circle_outline_white_36dp"));
                } else {
                    ivThumbnail.setImageResource(ResourceUtils.getResourceIdByName(mContext, "drawable", "imple_player_circle_outline_white_36dp"));
                }
            }
        });
        player.setPlaySource(url);
        player.startPlay();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (player != null) {
            player.onPause();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (player != null) {
            player.onResume();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (player != null) {
            player.onDestroy();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (player != null) {
            player.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onBackPressed() {
        if (player != null && player.onBackPressed()) {
            return;
        }
        super.onBackPressed();
    }

}
