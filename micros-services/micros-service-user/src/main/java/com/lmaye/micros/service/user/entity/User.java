package com.lmaye.micros.service.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * -- 用户信息
 *
 * @author Lmay Zhou
 * @date 2021/1/26 9:57
 * @email lmay@lmaye.com
 */
@Data
@NoArgsConstructor
@TableName("tb_user")
@ApiModel(value = "User", description = "用户信息")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    @ApiModelProperty(value = "主键ID")
    private Long id;

    /**
     * 用户名
     */
    @TableField("username")
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 性别
     */
    @TableField("sex")
    @ApiModelProperty(value = "性别")
    private Integer sex;

    /**
     * 状态(0. 正常; 1. 停用; 2. 删除;)
     */
    @TableField("status")
    @ApiModelProperty(value = "状态(0. 正常; 1. 停用; 2. 删除;)")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField("create_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Date createAt;

    /**
     * 创建人
     */
    @TableField("create_by")
    @ApiModelProperty(value = "创建人")
    private Long createBy;

    /**
     * 更新时间
     */
    @TableField("update_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间")
    private Date updateAt;

    /**
     * 更新人
     */
    @TableField("update_by")
    @ApiModelProperty(value = "更新人")
    private Long updateBy;

    /**
     * 备注
     */
    @TableField("remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 拓展字段
     */
    @TableField("ext")
    @ApiModelProperty(value = "拓展字段")
    private String ext;

    /**
     * 版本号
     */
    @Version
    @TableField("version")
    @ApiModelProperty(value = "版本号")
    private Integer version;
}