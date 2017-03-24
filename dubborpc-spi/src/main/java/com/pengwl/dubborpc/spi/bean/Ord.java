package com.pengwl.dubborpc.spi.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by SEELE on 2017/3/24.
 */

@Data
public class Ord implements Serializable{
    private String ordId;
    private Integer totalPrice;
    private String customerName;
}
