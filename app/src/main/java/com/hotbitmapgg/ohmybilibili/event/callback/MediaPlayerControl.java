package com.hotbitmapgg.ohmybilibili.event.callback;

/**
 * Created by hcc on 16/8/31 21:42
 * 100332338@qq.com
 * <p/>
 * 视频控制回调接口
 */
public interface MediaPlayerControl
{

    void start();

    void pause();

    int getDuration();

    int getCurrentPosition();

    void seekTo(long pos);

    boolean isPlaying();

    int getBufferPercentage();

    boolean canPause();

    boolean canSeekBackward();

    boolean canSeekForward();
}
