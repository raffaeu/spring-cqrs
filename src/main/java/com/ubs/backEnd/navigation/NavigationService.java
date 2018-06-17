package com.ubs.backEnd.navigation;

import com.ubs.backEnd.orm.entities.NavigationEntity;
import org.hibernate.SessionFactory;
import org.hibernate.transform.ResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NavigationService {

    @Autowired
    private SessionFactory sessionFactory;

    public List<NavigationEntity> getNavigation(){

        List<NavigationEntity> menus = sessionFactory
                .openSession()
                .createQuery("select nav from NavigationEntity nav " +
                        "where nav.parent is null", NavigationEntity.class)
                .list();

        return menus;
    }
}
