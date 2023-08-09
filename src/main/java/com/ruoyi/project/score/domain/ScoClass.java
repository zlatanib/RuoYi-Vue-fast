package com.ruoyi.project.score.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 班级信息对象 sco_class
 * 
 * @author ruoyi
 * @date 2023-08-09
 */
public class ScoClass extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班级自增ID */
    private Long classId;

    /** 班级编号 */
    @Excel(name = "班级编号")
    private String classNo;

    /** 班级名称 */
    @Excel(name = "班级名称")
    private String className;

    /** 班级所属部分（1：A部分 2：B部分 3：课改部分） */
    @Excel(name = "所属部分", readConverterExp = "1=A部分,2=B部分,3=课改部分")
    private Long part;

    /** 班级性质（0：文科 1：理科） */
    @Excel(name = "班级性质", readConverterExp = "0=文科,1=理科")
    private Long nature;

    /** 理科班级所属层次（1：一层次 2：二层次 3：三层次） */
    @Excel(name = "所属层次", readConverterExp = "1=一层次,2=二层次,3=三层次,0=/")
    private Long level;

    /** 班级状态（0正常 1停用） */
    @Excel(name = "班级状态", readConverterExp = "0=停用,1=正常")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setClassId(Long classId) 
    {
        this.classId = classId;
    }

    public Long getClassId() 
    {
        return classId;
    }
    public void setClassNo(String classNo) 
    {
        this.classNo = classNo;
    }

    public String getClassNo() 
    {
        return classNo;
    }
    public void setClassName(String className) 
    {
        this.className = className;
    }

    public String getClassName() 
    {
        return className;
    }
    public void setPart(Long part) 
    {
        this.part = part;
    }

    public Long getPart() 
    {
        return part;
    }
    public void setNature(Long nature) 
    {
        this.nature = nature;
    }

    public Long getNature() 
    {
        return nature;
    }
    public void setLevel(Long level) 
    {
        this.level = level;
    }

    public Long getLevel() 
    {
        return level;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("classId", getClassId())
            .append("classNo", getClassNo())
            .append("className", getClassName())
            .append("part", getPart())
            .append("nature", getNature())
            .append("level", getLevel())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
