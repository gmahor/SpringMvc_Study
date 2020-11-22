package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository

/*
 * Automatically identify that this is Database layer class we don't need to
 * configure this in xml. We just need Repository annotation(@Repository).
 */

public class UserDao {

	@Autowired(required = true)
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveUser(User user) {

		Integer id = (Integer) this.hibernateTemplate.save(user);
		return id;
	}

}
