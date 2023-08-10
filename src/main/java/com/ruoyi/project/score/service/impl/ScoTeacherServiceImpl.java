package com.ruoyi.project.score.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.score.mapper.ScoTeacherMapper;
import com.ruoyi.project.score.domain.ScoTeacher;
import com.ruoyi.project.score.service.IScoTeacherService;

/**
 * 教师信息Service业务层处理
 * 
 * @author df
 * @date 2023-08-10
 */
@Service
public class ScoTeacherServiceImpl implements IScoTeacherService 
{
    @Autowired
    private ScoTeacherMapper scoTeacherMapper;

    /**
     * 查询教师信息
     * 
     * @param teacherId 教师信息主键
     * @return 教师信息
     */
    @Override
    public ScoTeacher selectScoTeacherByTeacherId(Long teacherId)
    {
        return scoTeacherMapper.selectScoTeacherByTeacherId(teacherId);
    }

    /**
     * 查询教师信息列表
     * 
     * @param scoTeacher 教师信息
     * @return 教师信息
     */
    @Override
    public List<ScoTeacher> selectScoTeacherList(ScoTeacher scoTeacher)
    {
        return scoTeacherMapper.selectScoTeacherList(scoTeacher);
    }

    /**
     * 新增教师信息
     * 
     * @param scoTeacher 教师信息
     * @return 结果
     */
    @Override
    public int insertScoTeacher(ScoTeacher scoTeacher)
    {
        scoTeacher.setCreateTime(DateUtils.getNowDate());
        return scoTeacherMapper.insertScoTeacher(scoTeacher);
    }

    /**
     * 修改教师信息
     * 
     * @param scoTeacher 教师信息
     * @return 结果
     */
    @Override
    public int updateScoTeacher(ScoTeacher scoTeacher)
    {
        scoTeacher.setUpdateTime(DateUtils.getNowDate());
        return scoTeacherMapper.updateScoTeacher(scoTeacher);
    }

    /**
     * 批量删除教师信息
     * 
     * @param teacherIds 需要删除的教师信息主键
     * @return 结果
     */
    @Override
    public int deleteScoTeacherByTeacherIds(Long[] teacherIds)
    {
        return scoTeacherMapper.deleteScoTeacherByTeacherIds(teacherIds);
    }

    /**
     * 删除教师信息信息
     * 
     * @param teacherId 教师信息主键
     * @return 结果
     */
    @Override
    public int deleteScoTeacherByTeacherId(Long teacherId)
    {
        return scoTeacherMapper.deleteScoTeacherByTeacherId(teacherId);
    }
}
