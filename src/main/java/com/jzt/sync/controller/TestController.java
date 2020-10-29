package com.jzt.sync.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * project mdt-coupon-platform
 *
 * @author chenghai on 2019/3/14 0014. - 星期四
 * nickName louyedaren
 */
@RestController
public class TestController {





    @RequestMapping("test")
    public String test() {
        return "system is ok ";
    }


}
