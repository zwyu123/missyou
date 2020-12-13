package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class BannerItem extends BaseEntity {
    @Id
    private Long id;
    /** 图片 */
    private String img;
    private String keyword;
    /** 跳转类型 */
    private short type;
    private Long bannerId;
    /** 名字 */
    private String name;
}
