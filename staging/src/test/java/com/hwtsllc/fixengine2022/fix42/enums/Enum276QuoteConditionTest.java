/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix42.enums;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum276QuoteConditionTest {
    @Test
    void Enum0276Test() {
        Enum276QuoteCondition enumType;

        /*
         * A-Z
         */
        enumType = Enum276QuoteCondition.OPEN_ACTIVE;
        enumType = Enum276QuoteCondition.CLOSED_INACTIVE;
        enumType = Enum276QuoteCondition.EXCHANGE_BEST;
        enumType = Enum276QuoteCondition.CONSOLIDATED_BEST;
        enumType = Enum276QuoteCondition.LOCKED;
        enumType = Enum276QuoteCondition.CROSSED;
        enumType = Enum276QuoteCondition.DEPTH;
        enumType = Enum276QuoteCondition.FAST_TRADING;
        enumType = Enum276QuoteCondition.NON_FIRM;
        enumType = Enum276QuoteCondition.OUTRIGHT_PRICE;
        enumType = Enum276QuoteCondition.IMPLIED_PRICE;
        enumType = Enum276QuoteCondition.MANUAL_SLOW_QUOTE;
        enumType = Enum276QuoteCondition.DEPTH_ON_OFFER;
        enumType = Enum276QuoteCondition.DEPTH_ON_BID;
        enumType = Enum276QuoteCondition.CLOSING;
        enumType = Enum276QuoteCondition.NEWS_DISSEMINATION;
        enumType = Enum276QuoteCondition.TRADING_RANGE;
        enumType = Enum276QuoteCondition.ORDER_INFLUX;
        enumType = Enum276QuoteCondition.DUE_TO_RELATED;
        enumType = Enum276QuoteCondition.NEWS_PENDING;
        enumType = Enum276QuoteCondition.ADDITIONAL_INFO;
        enumType = Enum276QuoteCondition.ADDITIONAL_INFO_RELATED;
        enumType = Enum276QuoteCondition.RESUME;
        enumType = Enum276QuoteCondition.VIEW_OF_COMMON;
        enumType = Enum276QuoteCondition.VOLUME_ALERT;
        enumType = Enum276QuoteCondition.ORDER_IMBALANCE;

        /*
         * a-z
         */
        enumType = Enum276QuoteCondition.EQUIPMENT_CHANGEOVER;
        enumType = Enum276QuoteCondition.NO_OPEN_NO_RESUME;
        enumType = Enum276QuoteCondition.REGULAR_ETH;
        enumType = Enum276QuoteCondition.AUTOMATIC_EXECUTION;
        enumType = Enum276QuoteCondition.AUTOMATIC_EXECUTION_ETH;
        enumType = Enum276QuoteCondition.FAST_MARKET_ETH;
        enumType = Enum276QuoteCondition.INACTIVE_ETH;
        enumType = Enum276QuoteCondition.ROTATION;
        enumType = Enum276QuoteCondition.ROTATION_ETH;
        enumType = Enum276QuoteCondition.HALT;
        enumType = Enum276QuoteCondition.HALT_ETH;
        enumType = Enum276QuoteCondition.DUE_TO_NEWS_DISSEMINATION;
        enumType = Enum276QuoteCondition.DUE_TO_NEWS_PENDING;
        enumType = Enum276QuoteCondition.TRADING_RESUME;
        enumType = Enum276QuoteCondition.OUT_OF_SEQUENCE;
        enumType = Enum276QuoteCondition.BID_SPECIALIST;
        enumType = Enum276QuoteCondition.OFFER_SPECIALIST;
        enumType = Enum276QuoteCondition.BID_OFFER_SPECIALIST;
        enumType = Enum276QuoteCondition.END_OF_DAY_SAM;
        enumType = Enum276QuoteCondition.FORBIDDEN_SAM;
        enumType = Enum276QuoteCondition.FROZEN_SAM;
        enumType = Enum276QuoteCondition.PREOPENING_SAM;
        enumType = Enum276QuoteCondition.OPENING_SAM;
        enumType = Enum276QuoteCondition.OPEN_SAM;
        enumType = Enum276QuoteCondition.SURVEILLANCE_SAM;
        enumType = Enum276QuoteCondition.SUSPENDED_SAM;

        /*
         * 0-2
         */
        enumType = Enum276QuoteCondition.RESERVED_SAM;
        enumType = Enum276QuoteCondition.NO_ACTIVE_SAM;
        enumType = Enum276QuoteCondition.RESTRICTED;


        assertEquals(1,1);
        assertNotEquals(2,1);
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}