package com.lin.missyou.service;

import com.lin.missyou.model.Activity;
import com.lin.missyou.model.Coupon;
import com.lin.missyou.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    public Activity getByName(String name) {
        return activityRepository.findByName(name);
    }
}
