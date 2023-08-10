package com.ruoyi.project.score.mapper;

import java.util.List;
import com.ruoyi.project.score.domain.ScoTeacher;

/**
 * 教师信息Mapper接口
 * 
 * @author df
 * @date 2023-08-10
 */
public interface ScoTeacherMapper 
{
    /**
     * 查询教师信息
     * 
     * @param teacherId 教师信息主键
     * @return 教师信息
     */
    public ScoTeacher selectScoTeacherByTeacherId(Long teacherId);

    /**
     * 查询教师信息列表
     * 
     * @param scoTeacher 教师信息
     * @return 教师信息集合
     */
    public List<ScoTeacher> selectScoTeacherList(ScoTeacher scoTeacher);

    /**
     * 新增教师信息
     * 
     * @param scoTeacher 教师信息
     * @return 结果
     */
    public int insertScoTeacher(ScoTeacher scoTeacher);

    /**
     * 修改教师信息
     * 
     * @param scoTeacher 教师信息
     * @return 结果
     */
    public int updateScoTeacher(ScoTeacher scoTeacher);

    /**
     * 删除教师信息
     * 
     * @param teacherId 教师信息主键
     * @return 结果
     */
    public int deleteScoTeacherByTeacherId(Long teacherId);

    /**
     * 批量删除教师信息
     * 
     * @param teacherIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteScoTeacherByTeacherIds(Long[] teacherIds);
}
