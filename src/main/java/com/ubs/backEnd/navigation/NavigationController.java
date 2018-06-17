package com.ubs.backEnd.navigation;


import com.ubs.backEnd.orm.entities.NavigationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class NavigationController {

    @Autowired
    NavigationService navigationService;

    @RequestMapping("/mainNavigation")
    public List<NavigationEntity> mainNavigation() {
        return navigationService.getNavigation();
    }
}