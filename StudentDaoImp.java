package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository  //Used For Component Scanning And Translate JDBC Connection
public class StudentDaoImp implements StudentDao
{
    //Define a Field For Entity Manager
    private EntityManager entityManager;

    //Inject Entity Manager Using Constructor Injection


    @Autowired //Not Mandatory If Only One Constructor is Available
    public StudentDaoImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional  //We are Using For Updating
    public void save(Student theStudent)
    {
        entityManager.persist(theStudent);

    }
}
