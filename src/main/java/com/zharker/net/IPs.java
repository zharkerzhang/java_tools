package com.zharker.net;



import org.apache.commons.lang3.StringUtils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPs {
    public static void main(String[] args) {
        String ip = null;
        try {
            ip = getAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println(ip);
    }

    public static String getAddress() throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        String ip = addr.getHostAddress();
        if(StringUtils.isEmpty(ip)){
            System.out.println("ip is null");
        }
        return ip;
    }
}
