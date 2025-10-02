package com.agony.subject.domain.service.impl;

import com.agony.subject.domain.convert.SubjectCategoryConverter;
import com.agony.subject.domain.entity.SubjectCategoryBO;
import com.agony.subject.domain.service.SubjectCategoryDomainService;
import com.agony.subject.infra.basic.entity.SubjectCategory;
import com.agony.subject.infra.basic.service.SubjectCategoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author: Agony
 * @create: 2025/10/2 23:32
 * @describe:
 */
@Service
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @Override
    public void add(SubjectCategoryBO subjectCategoryBO) {

        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE.convert(subjectCategoryBO);

        subjectCategoryService.insert(subjectCategory);
    }
}
