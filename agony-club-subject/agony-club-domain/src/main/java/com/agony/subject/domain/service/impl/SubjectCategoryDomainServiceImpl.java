package com.agony.subject.domain.service.impl;

import com.agony.subject.domain.convert.SubjectCategoryConverter;
import com.agony.subject.domain.entity.SubjectCategoryBO;
import com.agony.subject.domain.service.SubjectCategoryDomainService;
import com.agony.subject.infra.basic.entity.SubjectCategory;
import com.agony.subject.infra.basic.service.SubjectCategoryService;
import com.alibaba.fastjson.JSON;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author: Agony
 * @create: 2025/10/2 23:32
 * @describe:
 */
@Service
@Slf4j
public class SubjectCategoryDomainServiceImpl implements SubjectCategoryDomainService {

    @Resource
    private SubjectCategoryService subjectCategoryService;

    @Override
    public void add(SubjectCategoryBO subjectCategoryBO) {

        if (log.isInfoEnabled()) {
            log.info("SubjectCategoryDomainServiceImpl.add.bo:{}", JSON.toJSONString(subjectCategoryBO));
        }
        SubjectCategory subjectCategory = SubjectCategoryConverter.INSTANCE.convert(subjectCategoryBO);

        subjectCategoryService.insert(subjectCategory);
    }
}
