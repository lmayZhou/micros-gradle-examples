package com.lmaye.micros.service.user.repository;

import com.lmaye.micros.service.user.entity.User;

/**
 * -- User Repository
 *
 * @author Lmay Zhou
 * @date 2021/1/26 9:57
 * @email lmay@lmaye.com
 */
public interface UserRepository {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(User record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(User record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    User selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(User record);

    /**
     * 获取用户信息
     * - 根据用户名
     *
     * @param username 用户名
     * @return SysUser
     */
    User selectByUserName(String username);
}