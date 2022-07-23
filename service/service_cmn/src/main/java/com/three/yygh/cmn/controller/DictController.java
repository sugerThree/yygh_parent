package com.three.yygh.cmn.controller;

import com.three.yygh.cmn.service.DictService;
import com.three.yygh.common.result.Result;
import com.three.yygh.model.cmn.Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author three
 * @date 2022-07-23 18:28
 */
@Api(tags ="数据字典接口")
@RestController
@RequestMapping("/admin/cmn/dict")
@CrossOrigin
public class DictController {
    @Autowired
    private DictService dictService;

    @ApiOperation("导出数据字典接口")
    @GetMapping("exportData")
    public Result exportData(HttpServletResponse response){
        dictService.exportData(response);
        return Result.ok();
    }

    @ApiOperation("导入数据字典")
    @PostMapping("importData")
    public Result importData(MultipartFile file){
        dictService.importData(file);
        return Result.ok();
    }

    @ApiOperation("根据数据id获取子数据列表")
    @RequestMapping("findChildData/{id}")
    public Result findChildData(@PathVariable("id") Long id){
        List<Dict> list = dictService.findChildData(id);
        return Result.ok(list);
    }
}
