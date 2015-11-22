package com.exiangtiankai.scheduled;

/**
 * Created by jaseeka
 * Date 2015/11/8
 * Time 22:38
 */
public interface BaseScheduled {

    /**
     * schedule 调用接口方法
     */
//    @Scheduled(cron = "0 0 1 ? * *") // 秒 分 时 日 月 年
    void invoke();
}
