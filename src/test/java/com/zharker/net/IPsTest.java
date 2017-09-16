package com.zharker.net;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.net.UnknownHostException;

public class IPsTest {

    @Test
    public void testGetAddress(){
        try {
            String ip = IPs.getAddress();
            System.out.println(ip);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
