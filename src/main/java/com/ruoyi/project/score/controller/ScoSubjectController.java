package com.ruoyi.project.score.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.score.domain.ScoSubject;
import com.ruoyi.project.score.service.IScoSubjectService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 学科管理Controller
 * 
 * @author df
 * @date 2023-08-10
 */
@RestController
@RequestMapping("/score/subject")
public class ScoSubjectController extends BaseController
{
    @Autowired
    private IScoSubjectService scoSubjectService;

    /**
     * 查询学科管理列表
     */
    @PreAuthorize("@ss.hasPermi('score:subject:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScoSubject scoSubject)
    {
        startPage();
        List<ScoSubject> list = scoSubjectService.selectScoSubjectList(scoSubject);
        return getDataTable(list);
    }

    /**
     * 导出学科管理列表
     */
    @PreAuthorize("@ss.hasPermi('score:subject:export')")
    @Log(title = "学科管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScoSubject scoSubject)
    {
        List<ScoSubject> list = scoSubjectService.selectScoSubjectList(scoSubject);
        ExcelUtil<ScoSubject> util = new ExcelUtil<ScoSubject>(ScoSubject.class);
        util.exportExcel(response, list, "学科管理数据");
    }

    /**
     * 获取学科管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('score:subject:query')")
    @GetMapping(value = "/{subjectId}")
    public AjaxResult getInfo(@PathVariable("subjectId") Long subjectId)
    {
        return success(scoSubjectService.selectScoSubjectBySubjectId(subjectId));
    }

    /**
     * 新增学科管理
     */
    @PreAuthorize("@ss.hasPermi('score:subject:add')")
    @Log(title = "学科管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScoSubject scoSubject)
    {
        return toAjax(scoSubjectService.insertScoSubject(scoSubject));
    }

    /**
     * 修改学科管理
     */
    @PreAuthorize("@ss.hasPermi('score:subject:edit')")
    @Log(title = "学科管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScoSubject scoSubject)
    {
        return toAjax(scoSubjectService.updateScoSubject(scoSubject));
    }

    /**
     * 删除学科管理
     */
    @PreAuthorize("@ss.hasPermi('score:subject:remove')")
    @Log(title = "学科管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{subjectIds}")
    public AjaxResult remove(@PathVariable Long[] subjectIds)
    {
        return toAjax(scoSubjectService.deleteScoSubjectBySubjectIds(subjectIds));
    }
}
