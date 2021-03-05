package com.offcn.sessiondemo1.controller;

import com.offcn.sessiondemo1.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class MyController {
    @GetMapping("/indexPage")
    public String indexPage(Model model){
        model.addAttribute("message","hello,sk");
        System.out.println("进入控制层");
        List<User> list=new ArrayList<>();
        User user = new User("1","l1",19);
        User user1 = new User("2", "l2", 19);
        User user2 = new User("3", "l3", 19);
        list.add(user);
        list.add(user1);
        list.add(user2);
        model.addAttribute("list",list);
        model.addAttribute("user",user);
        Map map=new HashMap();
        map.put("pic1","1.jpg");
        map.put("pic2","yo.jpg");
        model.addAttribute("pic",map);
        Date date = new Date();
        model.addAttribute("date",date);
        double num=3.1415926;
        model.addAttribute("price",num);
        String str="Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n" ;
        model.addAttribute("textStr",str);
        return "index";
    }
}
