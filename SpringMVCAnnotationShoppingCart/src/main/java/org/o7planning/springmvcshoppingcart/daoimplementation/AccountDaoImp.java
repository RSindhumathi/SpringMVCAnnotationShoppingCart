package org.o7planning.springmvcshoppingcart.daoimplementation;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import org.o7planning.springmvcshoppingcart.dao.AccountDao;
import org.o7planning.springmvcshoppingcart.entity.Account;
//Transactional for Hibernate
@Transactional
public class AccountDaoImp implements AccountDao {
	 @Autowired
	    private SessionFactory sessionFactory;
	 
	    @Override
	    public Account findAccount(String userName ) {
	        Session session = sessionFactory.getCurrentSession();
	        Criteria crit = session.createCriteria(Account.class);
	        crit.add(Restrictions.eq("userName", userName));
	        return (Account) crit.uniqueResult();
	    }
}
