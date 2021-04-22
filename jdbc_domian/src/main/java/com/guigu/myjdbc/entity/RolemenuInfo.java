package com.guigu.myjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("rolemenu_info")
public class RolemenuInfo {

  //  @TableId(type = IdType.AUTO)
   private Integer id;
   private Integer rid;
   private Integer mid ;
}
