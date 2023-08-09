package com.ruoyi.project.score.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.score.mapper.ScoClassMapper;
import com.ruoyi.project.score.domain.ScoClass;
import com.ruoyi.project.score.service.IScoClassService;

/**
 * 班级信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-08-09
 */
@Service
public class ScoClassServiceImpl implements IScoClassService 
{
    @Autowired
    private ScoClassMapper scoClassMapper;

    /**
     * 查询班级信息
     * 
     * @param classId 班级信息主键
     * @return 班级信息
     */
    @Override
    public ScoClass selectScoClassByClassId(Long classId)
    {
        return scoClassMapper.selectScoClassByClassId(classId);
    }

    /**
     * 查询班级信息列表
     * 
     * @param scoClass 班级信息
     * @return 班级信息
     */
    @Override
    public List<ScoClass> selectScoClassList(ScoClass scoClass)
    {
        return scoClassMapper.selectScoClassList(scoClass);
    }

    /**
     * 新增班级信息
     * 
     * @param scoClass 班级信息
     * @return 结果
     */
    @Override
    public int insertScoClass(ScoClass scoClass)
    {
        scoClass.setCreateTime(DateUtils.getNowDate());
        return scoClassMapper.insertScoClass(scoClass);
    }

    /**
     * 修改班级信息
     * 
     * @param scoClass 班级信息
     * @return 结果
     */
    @Override
    public int updateScoClass(ScoClass scoClass)
    {
        scoClass.setUpdateTime(DateUtils.getNowDate());
        return scoClassMapper.updateScoClass(scoClass);
    }

    /**
     * 批量删除班级信息
     * 
     * @param classIds 需要删除的班级信息主键
     * @return 结果
     */
    @Override
    public int deleteScoClassByClassIds(Long[] classIds)
    {
        return scoClassMapper.deleteScoClassByClassIds(classIds);
    }

    /**
     * 删除班级信息信息
     * 
     * @param classId 班级信息主键
     * @return 结果
     */
    @Override
    public int deleteScoClassByClassId(Long classId)
    {
        return scoClassMapper.deleteScoClassByClassId(classId);
    }
}
