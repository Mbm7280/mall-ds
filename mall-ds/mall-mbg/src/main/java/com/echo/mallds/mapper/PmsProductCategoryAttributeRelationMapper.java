package com.echo.mallds.mapper;

import com.echo.mallds.model.PmsProductCategoryAttributeRelation;
import com.echo.mallds.model.PmsProductCategoryAttributeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductCategoryAttributeRelationMapper {
    long countByExample(PmsProductCategoryAttributeRelationExample example);

    int deleteByExample(PmsProductCategoryAttributeRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductCategoryAttributeRelation row);

    int insertSelective(PmsProductCategoryAttributeRelation row);

    List<PmsProductCategoryAttributeRelation> selectByExample(PmsProductCategoryAttributeRelationExample example);

    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsProductCategoryAttributeRelation row, @Param("example") PmsProductCategoryAttributeRelationExample example);

    int updateByExample(@Param("row") PmsProductCategoryAttributeRelation row, @Param("example") PmsProductCategoryAttributeRelationExample example);

    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation row);

    int updateByPrimaryKey(PmsProductCategoryAttributeRelation row);
}