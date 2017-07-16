package com.smart.service;

import com.smart.model.User;

/**
 * @author gaowenming
 */
public interface IUserService  {

    public User getUserById(Integer id) throws Exception;
}
