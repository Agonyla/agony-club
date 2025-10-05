package com.agony.subject.application.convert;

import com.agony.subject.application.dto.SubjectCategoryDTO;
import com.agony.subject.domain.entity.SubjectCategoryBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author: Agony
 * @create: 2025/10/2 23:52
 * @describe:
 */
@Mapper
public interface SubjectCategoryDTOConverter {

    SubjectCategoryDTOConverter INSTANCE = Mappers.getMapper(SubjectCategoryDTOConverter.class);

    SubjectCategoryBO convert(SubjectCategoryDTO subjectCategoryDTO);

    List<SubjectCategoryDTO> convert(List<SubjectCategoryBO> subjectCategoryBOList);
}
