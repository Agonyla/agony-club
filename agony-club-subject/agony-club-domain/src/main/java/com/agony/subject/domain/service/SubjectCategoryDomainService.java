package com.agony.subject.domain.service;

import com.agony.subject.domain.entity.SubjectCategoryBO;

import java.util.List;

/**
 * @author: Agony
 * @create: 2025/10/2 23:31
 * @describe:
 */
public interface SubjectCategoryDomainService {

    void add(SubjectCategoryBO subjectCategoryBO);

    /**
     * 查询岗位大类
     *
     * @return 实例对象BO列表
     */
    List<SubjectCategoryBO> queryCategory(SubjectCategoryBO subjectCategoryBO);
}
