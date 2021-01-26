package com.lmaye.micros.service.user.service;

import com.lmaye.micros.core.context.ResultVO;
import com.lmaye.micros.service.user.entity.User;

/**
 * <p>
 * 用户信息 服务类
 * </p>
 *
 * @author Lmay Zhou
 * @since 2021-01-05
 */
public interface IUserService {
    /**
     * 查询记录
     * - 根据主键ID
     *
     * @param id 主键ID
     * @return ResultVO<User>
     */
    ResultVO<User> queryById(Long id);

    /**
     * 新增记录
     *
     * @param dto 数据
     * @return ResultVO<User>
     */
    ResultVO<User> insert(User dto);
}
