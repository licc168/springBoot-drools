package com.licc.drools.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.licc.drools.domain.Message;
import com.licc.drools.enums.EnumMessage;

@Controller
@RequestMapping("/")
public class TestController {

    @KSession("ksession")
    private KieSession kSession;

    @RequestMapping("/index")
    @ResponseBody
    String index() {
        return "index Page!";
    }

    @RequestMapping(value = "/droolsTest",method = RequestMethod.GET)
    @ResponseBody
    public String droolsTest() {
        try {
            Message message = new Message();
            message.setMessage("hello drools");
            message.setStatus(EnumMessage.HELLO.getCode());
            System.out.println("开始执行规则" + message);
            kSession.insert(message);// 插入
            kSession.fireAllRules();// 执行规则
            kSession.dispose();
            System.out.println("执行规则结束" );
            return message.getMessage();
        } catch (Throwable t) {
            t.printStackTrace();
            return "error";
        }
    }

}
