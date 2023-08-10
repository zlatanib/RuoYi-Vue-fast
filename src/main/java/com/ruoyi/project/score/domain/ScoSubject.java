package com.ruoyi.project.score.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 学科管理对象 sco_subject
 * 
 * @author df
 * @date 2023-08-10
 */
public class ScoSubject extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学科ID */
    @Excel(name = "学科ID")
    private Long subjectId;

    /** 学科名称 */
    @Excel(name = "学科名称")
    private String subjectName;

    /** 属性（0文科 1理科） */
    @Excel(name = "属性", readConverterExp = "0=文科,1=理科")
    private String nature;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setSubjectId(Long subjectId) 
    {
        this.subjectId = subjectId;
    }

    public Long getSubjectId() 
    {
        return subjectId;
    }
    public void setSubjectName(String subjectName) 
    {
        this.subjectName = subjectName;
    }

    public String getSubjectName() 
    {
        return subjectName;
    }
    public void setNature(String nature) 
    {
        this.nature = nature;
    }

    public String getNature() 
    {
        return nature;
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
            .append("subjectId", getSubjectId())
            .append("subjectName", getSubjectName())
            .append("nature", getNature())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
