package com.liyaobing.springcloud.bean.kindergarten.po;


import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Kindergarten {

    @TableId
    private String kindergartenId;
    private String kindergartenName;
    private String kindergartenCode;
    private String kindergartenManagerPhone;
    private String kindergartenProvince;
    private String kindergartenCity;
    private String kindergartenDistrict;
    private String kindergartenAddress;
    private Integer kindergartenStatus;
    private String kindergartenMchId;
    @JsonIgnore
    private String kindergartenMchSk;
    private String agentId;
    private String agentCode;
    @JsonIgnore
    private String certPath;
    private Integer messageTotal;
    private Integer messageCount;
    private Integer isFaceCharge;
    private Integer isAttendanceCharge;
    private Integer isFree;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime freeStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime freeEndTime;
    private Integer isVideoCharge;
    @TableField(value = "is_delete", fill = FieldFill.INSERT)
    private Integer isDelete;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
