package com.lmaye.micros.service.user.repository;

import com.lmaye.micros.service.user.entity.Logs;

/**
 * -- Logs Repository
 *
 * @author Lmay Zhou
 * @date 2021/1/26 9:57
 * @email lmay@lmaye.com
 */
public interface LogsRepository {
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
    int insert(Logs record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Logs record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Logs selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Logs record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Logs record);
}