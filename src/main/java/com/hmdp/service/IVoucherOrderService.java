package com.hmdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmdp.dto.Result;
import com.hmdp.entity.VoucherOrder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface IVoucherOrderService extends IService<VoucherOrder> {
    Result seckillVoucher(Long voucherId);

    Result creatVoucherOrder(Long voucherId);
}
