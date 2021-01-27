package com.lmaye.micros.service.user.controller;

import com.lmaye.micros.core.context.ResultVO;
import com.lmaye.micros.service.user.entity.Logs;
import com.lmaye.micros.service.user.service.ILogsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * -- Logs Controller
 *
 * @author Lmay Zhou
 * @date 2021/1/26 16:45
 * @email lmay@lmaye.com
 */
@RestController
@RequestMapping("/logs")
@Api(tags = "日志信息管理相关接口")
public class LogsController {
    /**
     * LogsService
     */
    private final ILogsService logsService;

    public LogsController(ILogsService logsService) {
        this.logsService = logsService;
    }

    /**
     * 获取日志信息
     *
     * @param id 主键ID
     * @return ResultVO<Logs>
     */
    @GetMapping("/queryLogInfo/{id}")
    @ApiOperation("获取日志信息")
    public ResultVO<Logs> queryLogInfo(@PathVariable @ApiParam(value = "主键ID", required = true) Long id) {
        return logsService.queryById(id);
    }

    /**
     * 新增日志信息
     *
     * @param dto 日志信息
     * @return ResultVO<User>
     */
    @PostMapping("/insert")
    @ApiOperation("新增日志信息")
    public ResultVO<Logs> insert(@RequestBody Logs dto) {
        return logsService.insert(dto);
    }
}
