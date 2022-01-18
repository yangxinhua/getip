package com.example.getip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.util.Date;
@Controller
public class TestController {
    @RequestMapping("/TestController/getip")
    public @ResponseBody String hello()throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        String hostname = addr.getHostName();
        return String.format(addr+"__"+new Date());
    }
}
