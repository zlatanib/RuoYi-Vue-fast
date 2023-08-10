package com.ruoyi.project.score.mapper;

import java.util.List;
import com.ruoyi.project.score.domain.ScoSubject;

/**
 * 学科管理Mapper接口
 * 
 * @author df
 * @date 2023-08-10
 */
public interface ScoSubjectMapper 
{
    /**
     * 查询学科管理
     * 
     * @param subjectId 学科管理主键
     * @return 学科管理
     */
    public ScoSubject selectScoSubjectBySubjectId(Long subjectId);

    /**
     * 查询学科管理列表
     * 
     * @param scoSubject 学科管理
     * @return 学科管理集合
     */
    public List<ScoSubject> selectScoSubjectList(ScoSubject scoSubject);

    /**
     * 新增学科管理
     * 
     * @param scoSubject 学科管理
     * @return 结果
     */
    public int insertScoSubject(ScoSubject scoSubject);

    /**
     * 修改学科管理
     * 
     * @param scoSubject 学科管理
     * @return 结果
     */
    public int updateScoSubject(ScoSubject scoSubject);

    /**
     * 删除学科管理
     * 
     * @param subjectId 学科管理主键
     * @return 结果
     */
    public int deleteScoSubjectBySubjectId(Long subjectId);

    /**
     * 批量删除学科管理
     * 
     * @param subjectIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScoSubjectBySubjectIds(Long[] subjectIds);
}
