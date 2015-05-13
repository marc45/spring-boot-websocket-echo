package org.devzen.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 管理系统
 */
@Controller
@RequestMapping("/")
public class AdminController {

    @RequestMapping(value = "/index")
    public String index(Model model) {
        return "index";
    }
}
