package com.lin.missyou.vo;

import com.lin.missyou.model.Spu;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SpuSimplifyVO {
    private Long id;
    private String title;
    private String subtitle;
    private String img;
    private String forThemeImg;
    private String price;
    private String discountPrice;
    private String description;
    private String tags;
    private Long sketchSpecId;

    public SpuSimplifyVO(Spu spu) {
        this.id = spu.getId();
        this.title = spu.getTitle();
        this.subtitle = spu.getSubtitle();
        this.img = spu.getImg();
        this.forThemeImg = spu.getForThemeImg();
        this.price = spu.getPrice();
        this.discountPrice = spu.getDiscountPrice();
        this.description = spu.getDescription();
        this.tags = spu.getTags();
        this.sketchSpecId = spu.getSketchSpecId();
    }
}
