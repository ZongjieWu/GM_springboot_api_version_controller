package com.example.springbootmybatisplus.web.controller;

import com.example.springbootmybatisplus.config.apiversionconfig.ApiVersion;
import com.example.springbootmybatisplus.enums.Result;
import com.example.springbootmybatisplus.model.vo.request.saasuser.user.SaasUserLoginRequestVo;
import com.example.springbootmybatisplus.model.vo.response.SaasUserBaseInfoResponseVo;
import com.example.springbootmybatisplus.service.ISaasUserLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "1.平台管理员",description = "登入等接口")
@RestController
@ApiVersion(2)
@RequestMapping("{version}/admin")
public class SaasUserLoginController {
    @Autowired
    private ISaasUserLoginService saasUserLoginService;

    @ApiOperation(value = "登入",notes = "登入")
    @PostMapping("/login")
    public Result<SaasUserBaseInfoResponseVo> add(@Validated SaasUserLoginRequestVo loginRequestVo) {
        return saasUserLoginService.login(loginRequestVo);
    }

}
