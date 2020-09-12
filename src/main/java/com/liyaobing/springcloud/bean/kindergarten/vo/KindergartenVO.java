package com.liyaobing.springcloud.bean.kindergarten.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KindergartenVO {

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
    private Integer isDelete;//0为未删除，1为已删除
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    //非数据库字段
    @Min(value = 1, message = "页数不可小于1")
    private Long pageNo;//页数
    @Min(value = 1, message = "页大小不可小于1")
    private Long pageSize;//页大小
    private String keyword;

    private String verifyCode;
    private String newPassword;
    @JsonProperty(value = "kindergartenMchSk")
    private String kindergartenAppKey;
    private String agentName;
    private Integer loginCount;
    private Integer childCount;
    private Integer loginParentCount;
    private Integer teacherCount;
    private Integer loginTeacherCount;

    private BigDecimal messageBuyPrice;
    private Integer messageSendCount;
}


