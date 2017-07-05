package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.SysUser;
import com.company.project.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by CuiCan on 2017/07/02.
 */
@RestController
public class LoginController {

    @Resource
    private SysUserService sysUserService;

    @RequestMapping("/")
    public Result index(Model model) {

        model.addAttribute("msg", "登录成功");
        return ResultGenerator.genSuccessResult("index");
    }
}
