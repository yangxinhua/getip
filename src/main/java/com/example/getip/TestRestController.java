package com.example.getip;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.util.Date;

@RestController
public class TestRestController {
    @RequestMapping("/TestRestController/getip")
    public String hello(String info)throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        String hostname = addr.getHostName();
        return String.format(addr+"__"+new Date()+info);
    }
}
