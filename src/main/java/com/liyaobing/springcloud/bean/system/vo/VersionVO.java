package com.liyaobing.springcloud.bean.system.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Li Yao Bing
 * @Company https://www.knowswift.com/
 * @Date 2020/6/22
 **/

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VersionVO {

    @TableId
    private String versionId;
    private String versionCode;
    private String versionName;
    private String downloadUrl;
    private String versionDescription;
    private Integer isDelete;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-7")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-7")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    private boolean hasNewVersion;
}
