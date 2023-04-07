package com.cws.scheduled;

import cn.hutool.core.date.DateUtil;
import com.cws.utils.PushUtil;
import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.annotation.Resource;

/**
 * Task 定时任务
 *
 * @author cws
 * @date 2022/8/22 21:42
 */
@EnableScheduling
@Configuration
public class Task {
    // 定时任务
    @Scheduled(cron = "${wechat.cron}")
    public void goodMorning() {
        PushUtil.push();
    }
}
//public class Task {
//
//    @Value("${target.targetOpenId}")
//    private String targetOpenId;
//
//
//    @Scheduled(cron = "0 30 7 * * ?")
//    public static XString goodMorning() {
//        PushUtil.push();
//
//        return null;
//    }
//
//}