package com.liumy.order.entity;

import java.util.Date;

/**
 * @program: springcloud-lcn-demo
 * @description:
 * @author: liumingyu
 * @date: 2020-03-04 10:54
 **/
public class OrderEntity {
    //id
    private Long id;

    //订单名称
    private String name;

    //订单时间
    private Date orderCreatetime;

    //下单金额
    private Double orderMoney;

    //订单状态
    private int orderState;

    //商品id
    private Long commodityId;

    //订单id
    private String orderId;

    public OrderEntity(Long id, String name, Date orderCreatetime, Double orderMoney, int orderState, Long commodityId, String orderId) {
        this.id = id;
        this.name = name;
        this.orderCreatetime = orderCreatetime;
        this.orderMoney = orderMoney;
        this.orderState = orderState;
        this.commodityId = commodityId;
        this.orderId = orderId;
    }

    public OrderEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public Long getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Long commodityId) {
        this.commodityId = commodityId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
