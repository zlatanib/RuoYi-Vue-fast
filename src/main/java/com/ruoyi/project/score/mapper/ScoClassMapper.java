package com.ruoyi.project.score.mapper;

import java.util.List;
import com.ruoyi.project.score.domain.ScoClass;

/**
 * 班级信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-08-09
 */
public interface ScoClassMapper 
{
    /**
     * 查询班级信息
     * 
     * @param classId 班级信息主键
     * @return 班级信息
     */
    public ScoClass selectScoClassByClassId(Long classId);

    /**
     * 查询班级信息列表
     * 
     * @param scoClass 班级信息
     * @return 班级信息集合
     */
    public List<ScoClass> selectScoClassList(ScoClass scoClass);

    /**
     * 新增班级信息
     * 
     * @param scoClass 班级信息
     * @return 结果
     */
    public int insertScoClass(ScoClass scoClass);

    /**
     * 修改班级信息
     * 
     * @param scoClass 班级信息
     * @return 结果
     */
    public int updateScoClass(ScoClass scoClass);

    /**
     * 删除班级信息
     * 
     * @param classId 班级信息主键
     * @return 结果
     */
    public int deleteScoClassByClassId(Long classId);

    /**
     * 批量删除班级信息
     * 
     * @param classIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScoClassByClassIds(Long[] classIds);
}
