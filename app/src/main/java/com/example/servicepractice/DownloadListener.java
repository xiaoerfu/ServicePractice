package com.example.servicepractice;

/**
 * Created by lijianfu on 2017/3/27.
 * 回调接口，用于对下载过程中的各种状态进行监听与回调
 */
public interface DownloadListener {

    void onProgress(int progress);                  //通知当前下载速度

    void onSuccess();                                            //通知下载成功

    void onFailed();                                          //通知下载失败

    void onPaused();                                              //通知瞎子啊暂停

    void onCanceled();                                      //通知下载取消

}
