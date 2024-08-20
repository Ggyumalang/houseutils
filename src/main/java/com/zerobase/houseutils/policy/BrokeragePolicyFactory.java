package com.zerobase.houseutils.policy;

import com.zerobase.houseutils.constants.ActionType;


public class BrokeragePolicyFactory {

    public static BrokeragePolicy of(ActionType actionType) {
        switch (actionType) {
            case PURCHASE -> {
                return new PurchaseBrokeragePolicy();
            }
            case RENT -> {
                return new RentBrokeragePolicy();
            }
            default ->
                    throw new IllegalArgumentException("해당 ActionType 에 대한 정책이 존재하지 않습니다.");
        }
    }
}
