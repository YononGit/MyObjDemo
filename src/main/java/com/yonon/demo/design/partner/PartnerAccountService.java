package com.yonon.demo.design.partner;

import com.yonon.demo.design.account.common.entity.Loan;
import com.yonon.demo.design.account.common.entity.MQDomain;
import com.yonon.demo.design.account.enums.TransCodeEnum;

/**
 * @author: JiangYinghan
 * @Description:
 * @Date: Create on 2018-01-12.
 */
public interface PartnerAccountService {
    void transAccount(TransCodeEnum transCodeEnum, Loan loan, Object... objects);
    void transAccountExt();
}