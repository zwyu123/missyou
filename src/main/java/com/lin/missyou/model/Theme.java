package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

/**
 * 主题
 */
@Entity
@Getter
@Setter
@Where(clause = "delete_time is null")
public class Theme extends BaseEntity {
    @Id
    private Long id;
    /** 标题(可以显示在前端的标题) */
    private String title;
    /** 描述 */
    private String description;
    /** 名字(作为一种标识) */
    private String name;
    /** 扩展 */
    private String extend;
    /** 入口图片 */
    private String entranceImg;
    /** 详情页面顶部图片 */
    private String internalTopImg;
    /** 是否上线 */
    private Boolean online;
    /** 图片 */
    private String titleImg;
    /** 模板名字 */
    private String tplName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "theme_spu", joinColumns = @JoinColumn(name = "theme_id"),
    inverseJoinColumns = @JoinColumn(name = "spu_id"))
    private List<Spu> spuList;
}
