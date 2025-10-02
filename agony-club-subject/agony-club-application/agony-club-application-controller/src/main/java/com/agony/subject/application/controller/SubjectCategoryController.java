package com.agony.subject.application.controller;

import com.agony.subject.application.convert.SubjectCategoryDTOConverter;
import com.agony.subject.application.dto.SubjectCategoryDTO;
import com.agony.subject.common.entity.Result;
import com.agony.subject.domain.entity.SubjectCategoryBO;
import com.agony.subject.domain.service.SubjectCategoryDomainService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 刷题分类controller
 *
 * @author: Agony
 * @create: 2025/10/2 23:47
 * @describe:
 */
@RestController
@RequestMapping("/subject/category")
public class SubjectCategoryController {

    @Resource
    private SubjectCategoryDomainService subjectCategoryDomainService;

    @PostMapping("/add")
    public Result<Boolean> addCategory(@RequestBody SubjectCategoryDTO subjectCategoryDTO) {

        try {
            SubjectCategoryBO subjectCategoryBO = SubjectCategoryDTOConverter.INSTANCE.convert(subjectCategoryDTO);
            subjectCategoryDomainService.add(subjectCategoryBO);
            return Result.success(true);
        } catch (Exception e) {
            return Result.fail(false);
        }

    }
}
