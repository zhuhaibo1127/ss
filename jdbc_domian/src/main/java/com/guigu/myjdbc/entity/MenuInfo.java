package com.guigu.myjdbc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("menu_info")
public class MenuInfo {

    //@TableId(type = IdType.AUTO)
   private Integer id;

  private String   name;
   private String menucode;
  private Integer  parentid;
  private Integer   nodetype;
 private String   iconurl;
  private Integer   sort;
  private String  linkurl;
  private Integer  level;
  private String  path;
 private Integer   isdelete;


}
