package com.pengwl.dubborpc.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pengwl.dubborpc.spi.bean.Ord;
import com.pengwl.dubborpc.spi.service.OrdService;

/**
 * Created by SEELE on 2017/3/24.
 */
@Service(version = "1.0.0")
public class OrdServiceImpl implements OrdService {



    public String createOrd(Ord ord) {
        System.out.println("1");
        return "ordId";
    }
}
