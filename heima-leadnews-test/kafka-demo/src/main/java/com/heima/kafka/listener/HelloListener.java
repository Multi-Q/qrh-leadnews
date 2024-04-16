package com.heima.kafka.listener;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heima.kafka.pojos.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author QRH
 * @date 2024/4/14 22:31
 * @description TODO
 */
@Component
public class HelloListener {

    @KafkaListener(topics = "user-topic")
    public void onMessage(String message) {
        if (!StringUtils.isEmpty(message)) {
            User user = JSON.parseObject(message, User.class);
            System.out.println("---------" + user.toString());
        }
    }


}
