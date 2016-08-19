package com.dou361.ijkplayer.listener;
/**
 * ========================================
 * <p>
 * 版 权：dou361.com 版权所有 （C） 2015
 * <p>
 * 作 者：陈冠明
 * <p>
 * 个人网站：http://www.dou361.com
 * <p>
 * 版 本：1.0
 * <p>
 * 创建日期：2016/8/10 15:28
 * <p>
 * 描 述：加载视频信息监听
 * <p>
 * <p>
 * 修订历史：
 * <p>
 * ========================================
 */
public interface OnInfoListener {

    /**这里融合了ijkplayer原生播放器的几个监听OnPreparedListener、OnCompletionListener、OnErrorListener、OnInfoListener*/
    void onInfo(int what, int extra);
}