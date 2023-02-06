package com.zhangbo.controller;

import com.zhangbo.service.ExpertService;
import com.zhangbo.until.PageQuery;
import com.zhangbo.until.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/expert")
public class ExpertController {
    @Autowired
    private ExpertService expertService;

    @PostMapping("findAll")
    public Result findAll_export(PageQuery pageQuery){
        return expertService.findAll(pageQuery);
    }
}
