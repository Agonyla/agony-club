package com.agony.subject.application.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author: Agony
 * @create: 2025/10/2 23:51
 * @describe:
 */
@Data
public class SubjectCategoryDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 715966454107124320L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 分类名称
     */
    private String categoryName;

    /**
     * 分类类型
     */
    private Integer categoryType;

    /**
     * 图标连接
     */
    private String imageUrl;

    /**
     * 父级id
     */
    private Long parentId;

}
