package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Spu extends BaseEntity {
    @Id
    private Long id;
    private String title;
    private String subtitle;
    private Long categoryId;
    private Long rootCategoryId;
    private Boolean online;
    private String price;
    private Long sketchSpecId;
    private Long defaultSkuId;
    private String img;
    private String discountPrice;
    private String description;
    private String tags;
    private Boolean isTest;

    private String forThemeImg;

    @JoinColumn(name = "spuId")
    private List<Sku> skuList;

    @JoinColumn(name = "spuId")
    private List<SpuImg> spuImgList;

    @JoinColumn(name = "spuId")
    private List<SpuDetailImg> spuDetailImgList;
}
