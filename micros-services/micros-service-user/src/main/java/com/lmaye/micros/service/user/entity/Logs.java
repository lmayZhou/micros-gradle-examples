package com.lmaye.micros.service.user.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * -- 日志信息
 *
 * @author Lmay Zhou
 * @date 2021/1/26 9:57
 * @email lmay@lmaye.com
 */
@Data
@NoArgsConstructor
@TableName("tb_logs")
@ApiModel(value = "Logs", description = "日志信息")
public class Logs implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    @ApiModelProperty(value = "主键ID")
    private Long id;

    /**
     * 用户ID
     */
    @TableField("user_id")
    @ApiModelProperty(value = "用户ID")
    private Long userId;

    /**
     * 日志内容
     */
    @TableField("content")
    @ApiModelProperty(value = "日志内容")
    private String content;

    /**
     * 日志类型
     */
    @TableField("type")
    @ApiModelProperty(value = "日志类型")
    private Integer type;

    /**
     * 备注
     */
    @TableField("remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 创建时间
     */
    @TableField("create_at")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建时间")
    private Date createAt;
}