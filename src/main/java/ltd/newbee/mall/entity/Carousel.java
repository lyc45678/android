/**
 * 严肃声明：
 * 开源版本请务必保留此注释头信息，若删除我方将保留所有法律责任追究！
 * 本软件已申请软件著作权，受国家版权局知识产权以及国家计算机软件著作权保护！
 * 可正常分享和学习源码，不得用于违法犯罪活动，违者必究！
 * Copyright (c) 2019-2021 十三 all rights reserved.
 * 版权所有，侵权必究！
 */
package ltd.newbee.mall.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 该类为轮播图实体
 *
 * @author 13
 */
@Data
@TableName("tb_newbee_mall_carousel")
public class Carousel {

    //轮播图id
    @TableId(value = "carousel_id",type = IdType.AUTO)
    private Integer carouselId;

    //轮播图url
    private String carouselUrl;

    //轮播图跳转url
    private String redirectUrl;

    //轮播图排序值
    private Integer carouselRank;

    //删除标记，0未删除，1删除
    @TableLogic(value = "0", delval = "1")
    private Byte isDeleted;

    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    //创建人id
    private Integer createUser;

    //修改时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    //修改人id
    private Integer updateUser;
}
