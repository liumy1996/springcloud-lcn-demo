package com.liumy.distribute.impl.entity;


public class DispatchEntity {

    private Long id;
    // 订单号
    private String orderId;

    // 派单id
    private Long userId;

    public DispatchEntity(String orderId, Long userId) {
        this.orderId = orderId;
        this.userId = userId;
    }

    public DispatchEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
