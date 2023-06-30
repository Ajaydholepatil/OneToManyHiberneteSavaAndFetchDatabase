package com.example.OneToManyRelationshipMappingExampleWithHB.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.lang.module.Configuration;

public class SessionFactoryRegistry {
    private static SessionFactory sessionFactory;

    static {
        Configuration configuration = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml");
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .applySetting(configuration.getProperties()).build();
        sessionFactory=configuration.builSessionFactory(standardServiceRegistry);
        }catch (Exception e){
        e.printStackTrace();
    }
    }
    public static void closeSessionFactory(){
    return sessionFactory;
    }
}
