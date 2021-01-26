package com.lmaye.micros.service.user.service;

import com.lmaye.micros.core.context.ResultVO;
import com.lmaye.micros.service.user.entity.Logs;

/**
 * -- Logs Service
 *
 * @author Lmay Zhou
 * @date 2021/1/26 18:16
 * @email lmay@lmaye.com
 */
public interface ILogsService {
    /**
     * 查询记录
     * - 根据主键ID
     *
     * @param id 主键ID
     * @return ResultVO<Logs>
     */
    ResultVO<Logs> queryById(Long id);

    /**
     * 新增记录
     *
     * @param dto 数据
     * @return ResultVO<Logs>
     */
    ResultVO<Logs> insert(Logs dto);
}
