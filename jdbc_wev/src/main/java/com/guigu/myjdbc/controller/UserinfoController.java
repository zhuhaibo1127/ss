package com.guigu.myjdbc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.guigu.myjdbc.entity.UserInfo;
import com.guigu.myjdbc.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
@CrossOrigin
public class UserinfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("adduser")
    public void adduser(){

    }

    @RequestMapping("pagebydto")
    @ResponseBody
    public IPage<UserInfo> pagebydto(@RequestParam(defaultValue = "1")Integer pageNo, @RequestParam(defaultValue = "10") Integer pageSize){
      return   userInfoService.page(new Page<UserInfo>(pageNo,pageSize),null);
    }


}
