package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Where(clause = "delete_time is null and online = 1")
public class Spu extends BaseEntity {
    @Id
    private Long id;
    /** 主标题 */
    private String title;
    /** 副标题 */
    private String subtitle;
    /** 分类 id */
    private Long categoryId;
    private Long rootCategoryId;
    /** 上架/下架 */
    private Boolean online;
    /** 价格(前端展示用) */
    private String price;
    /** 可视规格 id */
    private Long sketchSpecId;
    /** 默认 sku id */
    private Long defaultSkuId;
    /** 图片 */
    private String img;
    /** 折扣价格 */
    private String discountPrice;
    /** 描述 */
    private String description;
    /** 标签 */
    private String tags;
    private Boolean isTest;
    
    private String forThemeImg;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "spuId")
    private List<Sku> skuList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "spuId")
    private List<SpuImg> spuImgList;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "spuId")
    private List<SpuDetailImg> spuDetailImgList;
}
