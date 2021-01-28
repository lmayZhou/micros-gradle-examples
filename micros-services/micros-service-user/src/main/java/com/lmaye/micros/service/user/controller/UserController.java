package com.lmaye.micros.service.user.controller;

import com.lmaye.micros.core.context.ResultVO;
import com.lmaye.micros.service.user.entity.User;
import com.lmaye.micros.service.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * -- User Controller
 *
 * @author Lmay Zhou
 * @date 2021/1/25 17:11
 * @email lmay@lmaye.com
 */
@RestController
@RequestMapping("/user")
@Api(tags = "用户信息管理相关接口")
public class UserController {
    /**
     * Sys User Service
     */
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }


    /**
     * 获取用户信息
     *
     * @param userId 用户ID
     * @return ResultVO<User>
     */
    @GetMapping("/queryUserInfo/{userId}")
    @ApiOperation("获取用户信息")
    public ResultVO<User> queryUserInfo(@PathVariable @ApiParam(value = "用户ID", required = true) Long userId) {
        return ResultVO.success(userService.findById(userId).orElse(null));
    }

    /**
     * 新增用户信息
     *
     * @param dto 用户信息
     * @return ResultVO<User>
     */
    @PostMapping("/insert")
    @ApiOperation("新增用户信息")
    public ResultVO<User> insert(@RequestBody User dto) {
        return ResultVO.success(userService.insertOrUpdate(dto));
    }
}
