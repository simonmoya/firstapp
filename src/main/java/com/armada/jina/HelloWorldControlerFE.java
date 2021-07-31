package com.armada.jina;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/salute")
public class HelloWorldControlerFE {
    @GetMapping(value = "/frontend", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String welcomeAsHTML() {
        return "<html>\n" + "<header><title>FrontEnd in Spring Boot</title></header>\n" +
                "<body><b>\n" + "My First Front End App in Spring Boot for Front End!\n" + "</b></body>\n" + "</html>";
    }
}
