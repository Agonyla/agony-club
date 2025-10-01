package com.agony.subject.application.controller;

import com.agony.subject.infra.basic.entity.SubjectCategory;
import com.agony.subject.infra.basic.service.SubjectCategoryService;
import jakarta.annotation.Resource;
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

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @GetMapping("/test")
    public String test() {

        SubjectCategory subjectCategory = subjectCategoryService.queryById(1L);
        return subjectCategory.getCategoryName();
    }
}
