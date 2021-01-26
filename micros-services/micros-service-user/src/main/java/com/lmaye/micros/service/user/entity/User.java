package com.lmaye.micros.service.user.entity;

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
@ApiModel(value = "User", description = "用户信息")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @ApiModelProperty(value = "主键ID")
    private Long id;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Integer sex;

    /**
     * 状态(0. 正常; 1. 停用; 2. 删除;)
     */
    @ApiModelProperty(value = "状态(0. 正常; 1. 停用; 2. 删除;)")
    private Integer status;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Date createAt;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Long createBy;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新时间")
    private Date updateAt;

    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private Long updateBy;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 拓展字段
     */
    @ApiModelProperty(value = "拓展字段")
    private String ext;

    /**
     * 版本号
     */
    @ApiModelProperty(value = "版本号")
    private Integer version;
}