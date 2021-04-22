package com.guigu.myjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("role_info")
public class RoleInfo {
   // @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;
    private String code;
    private Integer isdelete;

}
