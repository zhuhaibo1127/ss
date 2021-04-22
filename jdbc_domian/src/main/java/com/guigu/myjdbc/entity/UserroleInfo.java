package com.guigu.myjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("userrole_info")
public class UserroleInfo {

    //  @TableId(type = IdType.AUTO)
   private Integer id;
   private Integer rid;
   private Integer uid;

}
