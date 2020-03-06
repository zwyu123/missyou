package com.lin.missyou.model;

import com.lin.missyou.util.ListAndJson;
import com.lin.missyou.util.MapAndJson;
import com.lin.missyou.util.SuperGenericAndJson;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
public class Sku extends BaseEntity {
    @Id
    private Long id;
    private BigDecimal price;
    private BigDecimal discountPrice;
    private Boolean online;
    private String img;
    private String title;
    private Long spuId;
    private Long categoryId;
    private Long rootCategoryId;

    @Convert(converter = SuperGenericAndJson.class)
    private List<Spec> specs;
    private String code;
    private Long stock;
}
