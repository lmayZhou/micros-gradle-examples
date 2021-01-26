package com.lmaye.micros.service.user.service.impl;

import com.lmaye.micros.core.context.ResultCode;
import com.lmaye.micros.core.context.ResultVO;
import com.lmaye.micros.core.exception.ServiceException;
import com.lmaye.micros.service.user.entity.User;
import com.lmaye.micros.service.user.repository.UserRepository;
import com.lmaye.micros.service.user.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * <p>
 * 用户信息 服务实现类
 * </p>
 *
 * @author Lmay Zhou
 * @since 2021-01-05
 */
@Service
public class UserServiceImpl implements IUserService {
    /**
     * User Repository
     */
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 查询记录
     * - 根据主键ID
     *
     * @param id 主键ID
     * @return ResultVO<User>
     */
    @Override
    public ResultVO<User> queryById(Long id) {
        return ResultVO.success(userRepository.selectByPrimaryKey(id));
    }

    /**
     * 新增记录
     *
     * @param dto 数据
     * @return ResultVO<User>
     */
    @Override
    public ResultVO<User> insert(User dto) {
        if (!Objects.isNull(userRepository.selectByUserName(dto.getUsername()))) {
            throw new ServiceException(ResultCode.FAILURE);
        }
        if (0 == userRepository.insertSelective(dto)) {
            throw new ServiceException(ResultCode.FAILURE);
        }
        return ResultVO.success(dto);
    }
}
