package com.lin.missyou.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Where(clause = "delete_time is null and online = 1")
public class Activity extends BaseEntity {
    private Long id;
    private String title;
    private String name;
    private String description;
    private Date startTime;
    private Date endTime;
    private Boolean online;
    private String entranceImg;
    private String internalTopImg;
    private String remark;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="activityId")
    private List<Coupon> couponList;
}
