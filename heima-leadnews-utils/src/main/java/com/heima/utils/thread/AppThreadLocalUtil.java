package com.heima.utils.thread;

import com.heima.model.user.pojos.ApUser;
import com.heima.model.wemedia.pojos.WmUser;

/**
 * @author QRH
 * @date 2024/4/16 23:17
 * @description TODO
 */
public class AppThreadLocalUtil {


    private final static ThreadLocal<ApUser> AP_USER_THREAD_LOCAL = new ThreadLocal<>();

    /**
     * 添加用户
     *
     * @param apUser
     */
    public static void setUser(ApUser apUser) {
        AP_USER_THREAD_LOCAL.set(apUser);
    }

    /**
     * 获取用户
     */
    public static ApUser getUser() {
        return AP_USER_THREAD_LOCAL.get();
    }

    /**
     * 清理用户
     */
    public static void clear() {
        AP_USER_THREAD_LOCAL.remove();
    }
}