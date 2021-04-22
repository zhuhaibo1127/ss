package com.guigu.myjdbc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guigu.myjdbc.entity.UserroleInfo;
import com.guigu.myjdbc.mapper.UserroleInfoMapper;
import com.guigu.myjdbc.service.UserroleInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserroleInfoServiceImpl extends ServiceImpl<UserroleInfoMapper, UserroleInfo> implements UserroleInfoService {
}
