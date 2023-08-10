package com.ruoyi.project.score.service;

import java.util.List;
import com.ruoyi.project.score.domain.ScoSubject;
import com.ruoyi.project.score.domain.ScoTeacher;

/**
 * 学科管理Service接口
 * 
 * @author df
 * @date 2023-08-10
 */
public interface IScoSubjectService 
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
     * 批量删除学科管理
     * 
     * @param subjectIds 需要删除的学科管理主键集合
     * @return 结果
     */
    public int deleteScoSubjectBySubjectIds(Long[] subjectIds);

    /**
     * 删除学科管理信息
     * 
     * @param subjectId 学科管理主键
     * @return 结果
     */
    public int deleteScoSubjectBySubjectId(Long subjectId);

    /**
     * 根据条件分页查询教师已分配科目列表
     *
     * @param teacher 教师信息
     * @return 学科集合信息
     */
    List<ScoSubject> selectAllocatedList(ScoTeacher teacher);
}
