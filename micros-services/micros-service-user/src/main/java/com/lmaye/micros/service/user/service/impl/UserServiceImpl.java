package com.lmaye.micros.service.user.service.impl;

import com.lmaye.micros.service.user.entity.User;
import com.lmaye.micros.service.user.repository.UserRepository;
import com.lmaye.micros.service.user.service.IUserService;
import com.lmaye.micros.starter.mybatis.service.impl.MyBatisServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author Lmay Zhou
 * @since 2021-01-05
 */
@Service
public class UserServiceImpl extends MyBatisServiceImpl<UserRepository, User, Long> implements IUserService {

}
