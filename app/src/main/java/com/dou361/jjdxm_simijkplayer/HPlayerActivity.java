package com.dou361.jjdxm_simijkplayer;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.dou361.simijkplayer.PlayStateParams;
import com.dou361.simijkplayer.PlayerView;
import com.dou361.simijkplayer.bean.VideoijkBean;
import com.dou361.simijkplayer.listener.OnShowThumbnailListener;
import com.dou361.simijkplayer.utils.ResourceUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * ========================================
 * <p>
 * 版 权：深圳市晶网科技控股有限公司 版权所有 （C） 2015
 * <p>
 * 作 者：陈冠明
 * <p>
 * 个人网站：http://www.dou361.com
 * <p>
 * 版 本：1.0
 * <p>
 * 创建日期：2015/11/18 9:40
 * <p>
 * 描 述：测试临时使用
 * <p>
 * <p>
 * 修订历史：
 * <p>
 * ========================================
 */
public class HPlayerActivity extends AppCompatActivity {

    private PlayerView player;
    private String trumb;
    private Context mContext;
    private List<VideoijkBean> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mContext = this;
        setContentView(R.layout.activity_h);
        trumb = "http://115.159.45.251/fbei-test/2016/0512/LA5254B58E265011C.jpg";
        list = new ArrayList<VideoijkBean>();
        String url1 = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4";
        String url2 = "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f30.mp4";
        VideoijkBean m1 = new VideoijkBean();
        m1.setStream("标清");
        m1.setUrl(url1);
        VideoijkBean m2 = new VideoijkBean();
        m2.setStream("高清");
        m2.setUrl(url2);
        list.add(m1);
        list.add(m2);
        player = new PlayerView(this)
                .setTitle("什么")
                .setScaleType(PlayStateParams.fitparent)
                .hideMenu(true)
                .forbidTouch(false)
                .showThumbnail(new OnShowThumbnailListener() {
                    @Override
                    public void onShowThumbnail(ImageView ivThumbnail) {
                        if (trumb != null) {
                            ivThumbnail.setImageResource(ResourceUtils.getResourceIdByName(mContext, "drawable", "imple_player_circle_outline_white_36dp"));
                        } else {
                            ivThumbnail.setImageResource(ResourceUtils.getResourceIdByName(mContext, "drawable", "imple_player_circle_outline_white_36dp"));
                        }
                    }
                })
                .setPlaySource(list)
                .startPlay();
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
