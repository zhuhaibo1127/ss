package com.guigu.myjdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.myjdbc.entity.MenuInfo;
import com.guigu.myjdbc.mapper.MenuInfoMapper;
import com.guigu.myjdbc.service.MenuInfoService;
import org.springframework.stereotype.Service;

@Service
public class MenuInfoServiceImpl extends ServiceImpl<MenuInfoMapper, MenuInfo> implements MenuInfoService {

}
