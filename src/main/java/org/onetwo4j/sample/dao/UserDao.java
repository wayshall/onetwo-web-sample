package org.onetwo4j.sample.dao;

import java.util.List;

import org.onetwo.common.db.dquery.annotation.BatchObject;
import org.onetwo.common.db.dquery.annotation.DbmRepository;
import org.onetwo4j.sample.model.User;

@DbmRepository
public interface UserDao {
	
	public int batchInsert(@BatchObject List<User> users);

}
