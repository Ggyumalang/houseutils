package com.zerobase.houseutils.policy;

import com.zerobase.houseutils.constants.ActionType;
import com.zerobase.houseutils.exception.ErrorCode;
import com.zerobase.houseutils.exception.HouseUtilsException;


public class BrokeragePolicyFactory {

    private static final RentBrokeragePolicy rentBrokeragePolicy = new RentBrokeragePolicy();
    private static final PurchaseBrokeragePolicy purchaseBrokeragePolicy = new PurchaseBrokeragePolicy();

    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case PURCHASE -> {
                return purchaseBrokeragePolicy;
            }
            case RENT -> {
                return rentBrokeragePolicy;
            }
            default -> throw new HouseUtilsException(
                    ErrorCode.INVALID_REQUEST
                    , "해당 ActionType 에 대한 정책이 존재하지 않습니다."
            );
        }
    }
}
