package com.agony.subject.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 刷题controller
 *
 * @author: Agony
 * @create: 2025/9/30 00:12
 * @describe:
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {

    @GetMapping("/test")
    public String test() {
        return "hello world";
    }
}
