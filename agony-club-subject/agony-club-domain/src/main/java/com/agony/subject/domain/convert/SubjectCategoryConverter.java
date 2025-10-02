package com.agony.subject.domain.convert;

import com.agony.subject.domain.entity.SubjectCategoryBO;
import com.agony.subject.infra.basic.entity.SubjectCategory;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author: Agony
 * @create: 2025/10/2 23:39
 * @describe:
 */
@Mapper
public interface SubjectCategoryConverter {

    SubjectCategoryConverter INSTANCE = Mappers.getMapper(SubjectCategoryConverter.class);

    SubjectCategory convert(SubjectCategoryBO subjectCategoryBO);
}
