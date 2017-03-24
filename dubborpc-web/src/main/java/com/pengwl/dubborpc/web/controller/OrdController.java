package com.pengwl.dubborpc.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pengwl.dubborpc.spi.bean.Ord;
import com.pengwl.dubborpc.spi.service.OrdService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by SEELE on 2017/3/24.
 */
@RestController
@RequestMapping("/ord")
public class OrdController {

    @Reference(version = "1.0.0")
    private OrdService ordService;

    @RequestMapping("/create")
    public String createOrd(HttpServletRequest request){
        return ordService.createOrd(new Ord());
    }
}
