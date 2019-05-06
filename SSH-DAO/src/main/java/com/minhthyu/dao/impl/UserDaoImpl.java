package com.minhthyu.dao.impl;

import com.minhthyu.dao.UserDao;
import com.minhthyu.entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    private String hql="";


    public boolean insertUser(User newUser) {
        SessionFactory sessionFactory = this.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.save(newUser);
            session.flush();
            session.close();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            session.close();
            return false;
        }
    }

    public boolean deleteUser(User user) {
        SessionFactory sessionFactory = this.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.delete(user);
            session.flush();
            session.close();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            session.close();
            return false;
        }
    }

    public boolean update(User user) {
        SessionFactory sessionFactory = this.getSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.update(user);

        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public User selectUser(String uId) {
        SessionFactory sessionFactory = this.getSessionFactory();
        Session session = sessionFactory.openSession();
        hql = "from User where uID = ?";
        Query query = session.createQuery(hql);
        query.setString(0, uId);
        List<User> users = query.list();
        if (users!=null){
            User user = users.get(0);
            return user;
        }
        else return null;
    }
}
