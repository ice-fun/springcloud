package com.liyaobing.springcloud.bean.device;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Device {
    @TableId
    private String deviceId;
    private String deviceCode;
    private String departmentId;//归属单位
    private String departmentParentId;//上级单位id
    private String deviceName;
    private Double longitude;
    private Double latitude;
    private String positionName;//位置名称
    @TableField(fill = FieldFill.UPDATE)
    private String deviceCameraId;
    private Double electricWarn;//电压警告
    private Double waterWarn;//水位警告
    private Integer deviceStatus;//初始 = 0, 在线 = 1, 离线 = 2, 故障 = 3, 维护 = 4
    private String remark;
    private String deviceContact;//联系人
    private String deviceContactPhone;//联系人电话
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyTime;
    @JsonProperty(value = "leakageVoltage")
    @JSONField(name = "leakageVoltage")
    private Double electricRealTime;
    @JsonProperty(value = "waterHeight")
    @JSONField(name = "waterHeight")
    private Double waterRealTime;
    @JsonProperty(value = "isWarn")
    @JSONField(name = "isWarn")
    private Integer alarmTypeRealTime;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private String alarmIdRealTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataTime;
    @JsonIgnore
    private Integer version;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime offlineTime;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime alarmTime;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime relievedTime;
    private Integer isSendAlarm;
    private Integer isSendSms;
    @TableField(value = "is_delete", fill = FieldFill.INSERT)
    @TableLogic
    private Integer isDelete;//0为未删除，1为已删除
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
