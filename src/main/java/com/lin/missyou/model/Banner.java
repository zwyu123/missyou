package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Banner extends BaseEntity {
    @Id
    private long id;
    /** 名字 */
    private String name;
    /** 描述 */
    private String description;
    /** 标题 */
    private String title;
    /** 图片 部分banner可能有标题图片 */
    private String img;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "bannerId")
    private List<BannerItem> items;
}
