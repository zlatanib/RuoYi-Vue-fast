package com.ruoyi.project.score.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.project.score.domain.ScoTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.score.mapper.ScoSubjectMapper;
import com.ruoyi.project.score.domain.ScoSubject;
import com.ruoyi.project.score.service.IScoSubjectService;

/**
 * 学科管理Service业务层处理
 * 
 * @author df
 * @date 2023-08-10
 */
@Service
public class ScoSubjectServiceImpl implements IScoSubjectService 
{
    @Autowired
    private ScoSubjectMapper scoSubjectMapper;

    /**
     * 查询学科管理
     * 
     * @param subjectId 学科管理主键
     * @return 学科管理
     */
    @Override
    public ScoSubject selectScoSubjectBySubjectId(Long subjectId)
    {
        return scoSubjectMapper.selectScoSubjectBySubjectId(subjectId);
    }

    /**
     * 查询学科管理列表
     * 
     * @param scoSubject 学科管理
     * @return 学科管理
     */
    @Override
    public List<ScoSubject> selectScoSubjectList(ScoSubject scoSubject)
    {
        return scoSubjectMapper.selectScoSubjectList(scoSubject);
    }

    /**
     * 新增学科管理
     * 
     * @param scoSubject 学科管理
     * @return 结果
     */
    @Override
    public int insertScoSubject(ScoSubject scoSubject)
    {
        scoSubject.setCreateTime(DateUtils.getNowDate());
        return scoSubjectMapper.insertScoSubject(scoSubject);
    }

    /**
     * 修改学科管理
     * 
     * @param scoSubject 学科管理
     * @return 结果
     */
    @Override
    public int updateScoSubject(ScoSubject scoSubject)
    {
        scoSubject.setUpdateTime(DateUtils.getNowDate());
        return scoSubjectMapper.updateScoSubject(scoSubject);
    }

    /**
     * 批量删除学科管理
     * 
     * @param subjectIds 需要删除的学科管理主键
     * @return 结果
     */
    @Override
    public int deleteScoSubjectBySubjectIds(Long[] subjectIds)
    {
        return scoSubjectMapper.deleteScoSubjectBySubjectIds(subjectIds);
    }

    /**
     * 删除学科管理信息
     * 
     * @param subjectId 学科管理主键
     * @return 结果
     */
    @Override
    public int deleteScoSubjectBySubjectId(Long subjectId)
    {
        return scoSubjectMapper.deleteScoSubjectBySubjectId(subjectId);
    }

    /**
     * 根据条件分页查询教师已分配科目列表
     *
     * @param teacher 教师信息
     * @return 学科集合信息
     */
    @Override
    public List<ScoSubject> selectAllocatedList(ScoTeacher teacher) {
        return scoSubjectMapper.selectAllocatedList(teacher);
    }
}
