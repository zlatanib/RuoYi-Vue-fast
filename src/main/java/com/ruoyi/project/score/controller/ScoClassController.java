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
import com.ruoyi.project.score.domain.ScoClass;
import com.ruoyi.project.score.service.IScoClassService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 班级信息Controller
 * 
 * @author ruoyi
 * @date 2023-08-09
 */
@RestController
@RequestMapping("/score/class")
public class ScoClassController extends BaseController
{
    @Autowired
    private IScoClassService scoClassService;

    /**
     * 查询班级信息列表
     */
    @PreAuthorize("@ss.hasPermi('score:class:list')")
    @GetMapping("/list")
    public TableDataInfo list(ScoClass scoClass)
    {
        startPage();
        List<ScoClass> list = scoClassService.selectScoClassList(scoClass);
        return getDataTable(list);
    }

    /**
     * 导出班级信息列表
     */
    @PreAuthorize("@ss.hasPermi('score:class:export')")
    @Log(title = "班级信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ScoClass scoClass)
    {
        List<ScoClass> list = scoClassService.selectScoClassList(scoClass);
        ExcelUtil<ScoClass> util = new ExcelUtil<ScoClass>(ScoClass.class);
        util.exportExcel(response, list, "班级信息数据");
    }

    /**
     * 获取班级信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('score:class:query')")
    @GetMapping(value = "/{classId}")
    public AjaxResult getInfo(@PathVariable("classId") Long classId)
    {
        return success(scoClassService.selectScoClassByClassId(classId));
    }

    /**
     * 新增班级信息
     */
    @PreAuthorize("@ss.hasPermi('score:class:add')")
    @Log(title = "班级信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ScoClass scoClass)
    {
        return toAjax(scoClassService.insertScoClass(scoClass));
    }

    /**
     * 修改班级信息
     */
    @PreAuthorize("@ss.hasPermi('score:class:edit')")
    @Log(title = "班级信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ScoClass scoClass)
    {
        return toAjax(scoClassService.updateScoClass(scoClass));
    }

    /**
     * 删除班级信息
     */
    @PreAuthorize("@ss.hasPermi('score:class:remove')")
    @Log(title = "班级信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{classIds}")
    public AjaxResult remove(@PathVariable Long[] classIds)
    {
        return toAjax(scoClassService.deleteScoClassByClassIds(classIds));
    }
}
