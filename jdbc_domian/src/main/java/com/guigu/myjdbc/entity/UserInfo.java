package com.guigu.myjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_info")
public class UserInfo {

   //  @TableId(type = IdType.AUTO)
   private Integer id;
   private String name;

   @TableField("loginName")
   private String loginName;

   private String pwd;
   private String image;
   private Integer isdelete;

}
