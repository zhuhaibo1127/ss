package com.guigu.myjdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.myjdbc.entity.RoleInfo;
import com.guigu.myjdbc.mapper.RoleInfoMapper;
import com.guigu.myjdbc.service.RoleInfoService;
import org.springframework.stereotype.Service;

@Service
public class RoleInfoServiceImpl extends ServiceImpl<RoleInfoMapper, RoleInfo> implements RoleInfoService {
}
