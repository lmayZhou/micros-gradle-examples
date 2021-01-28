package com.lmaye.micros.service.user.service.impl;

import com.lmaye.micros.service.user.entity.Logs;
import com.lmaye.micros.service.user.repository.LogsRepository;
import com.lmaye.micros.service.user.service.ILogsService;
import com.lmaye.micros.starter.mybatis.service.impl.MyBatisServiceImpl;
import org.springframework.stereotype.Service;

/**
 * -- Logs Service Impl
 *
 * @author Lmay Zhou
 * @date 2021/1/26 18:19
 * @email lmay@lmaye.com
 */
@Service
public class LogsServiceImpl extends MyBatisServiceImpl<LogsRepository, Logs, Long> implements ILogsService {

}
