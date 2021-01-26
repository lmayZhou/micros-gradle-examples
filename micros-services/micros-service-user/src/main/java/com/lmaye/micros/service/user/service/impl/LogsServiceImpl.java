package com.lmaye.micros.service.user.service.impl;

import com.lmaye.micros.core.context.ResultCode;
import com.lmaye.micros.core.context.ResultVO;
import com.lmaye.micros.core.exception.ServiceException;
import com.lmaye.micros.service.user.entity.Logs;
import com.lmaye.micros.service.user.repository.LogsRepository;
import com.lmaye.micros.service.user.service.ILogsService;
import org.springframework.stereotype.Service;

/**
 * -- Logs Service Impl
 *
 * @author Lmay Zhou
 * @date 2021/1/26 18:19
 * @email lmay@lmaye.com
 */
@Service
public class LogsServiceImpl implements ILogsService {
    /**
     * Logs Repository
     */
    private final LogsRepository logsRepository;

    public LogsServiceImpl(LogsRepository logsRepository) {
        this.logsRepository = logsRepository;
    }

    /**
     * 查询记录
     * - 根据主键ID
     *
     * @param id 主键ID
     * @return ResultVO<Logs>
     */
    @Override
    public ResultVO<Logs> queryById(Long id) {
        return ResultVO.success(logsRepository.selectByPrimaryKey(id));
    }

    /**
     * 新增记录
     *
     * @param dto 数据
     * @return ResultVO<Logs>
     */
    @Override
    public ResultVO<Logs> insert(Logs dto) {
        if (0 == logsRepository.insertSelective(dto)) {
            throw new ServiceException(ResultCode.FAILURE);
        }
        return ResultVO.success(dto);
    }
}
