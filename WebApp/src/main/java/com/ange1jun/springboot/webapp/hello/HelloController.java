package com.ange1jun.springboot.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello. Welcome to helloworld this page is controller page";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> Hello Controller </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Hello Controller with HTML");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }


    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }

}