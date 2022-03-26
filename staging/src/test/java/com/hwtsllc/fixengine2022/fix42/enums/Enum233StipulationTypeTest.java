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

class Enum233StipulationTypeTest {
    @Test
    void Enum0233Test() {
        Enum233StipulationType enumType;

        /*
         *  233 StipulationType
         */
        enumType = Enum233StipulationType.ALTERNATIVE_MINIMUM_TAX;
        enumType = Enum233StipulationType.AUTO_REINVESTMENT;
        enumType = Enum233StipulationType.BANK_QUALIFIED;
        enumType = Enum233StipulationType.BARGAIN_CONDITIONS;
        enumType = Enum233StipulationType.COUPON_RANGE;
        enumType = Enum233StipulationType.ISO_CURRENCY_CODE;
        enumType = Enum233StipulationType.CUSTOM_START_END_DATE;
        enumType = Enum233StipulationType.GEOGRAPHIC_AND_PERCENT_RANGE;
        enumType = Enum233StipulationType.VALUATION_DISCOUNT;
        enumType = Enum233StipulationType.INSURED;
        enumType = Enum233StipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE;
        enumType = Enum233StipulationType.ISSUERS_TICKER;
        enumType = Enum233StipulationType.ISSUE_SIZE_RANGE;
        enumType = Enum233StipulationType.LOOKBACK_DAYS;
        enumType = Enum233StipulationType.EXPLICIT_LOT_IDENTIFIER;
        enumType = Enum233StipulationType.LOT_VARIANCE;
        enumType = Enum233StipulationType.MATURITY_YEAR_AND_MONTH;
        enumType = Enum233StipulationType.MATURITY_RANGE;
        enumType = Enum233StipulationType.MAXIMUM_SUBSTITUTIONS_REPO;
        enumType = Enum233StipulationType.MINIMUM_DENOMINATION;
        enumType = Enum233StipulationType.MINIMUM_INCREMENT;
        enumType = Enum233StipulationType.MINIMUM_QUANTITY;
        enumType = Enum233StipulationType.PAYMENT_FREQUENCY;
        enumType = Enum233StipulationType.NUMBER_OF_PIECES;
        enumType = Enum233StipulationType.POOLS_MAXIMUM;
        enumType = Enum233StipulationType.POOLS_PER_LOT;
        enumType = Enum233StipulationType.POOLS_PER_MILLION;
        enumType = Enum233StipulationType.POOLS_PER_TRADE;
        enumType = Enum233StipulationType.PRICE_RANGE;
        enumType = Enum233StipulationType.PRICING_FREQUENCY;
        enumType = Enum233StipulationType.PRODUCTION_YEAR;
        enumType = Enum233StipulationType.CALL_PROTECTION;
        enumType = Enum233StipulationType.PURPOSE;
        enumType = Enum233StipulationType.BENCHMARK_PRICE_SOURCE;
        enumType = Enum233StipulationType.RATING_SOURCE_AND_RANGE;
        enumType = Enum233StipulationType.TYPE_OF_REDEMPTION;
        enumType = Enum233StipulationType.RESTRICTED;
        enumType = Enum233StipulationType.MARKET_SECTOR;
        enumType = Enum233StipulationType.SECURITY_TYPE;
        enumType = Enum233StipulationType.STRUCTURE;
        enumType = Enum233StipulationType.SUBSTITUTIONS_FREQUENCY_REPO;
        enumType = Enum233StipulationType.SUBSTITUTIONS_LEFT_REPO;
        enumType = Enum233StipulationType.FREEFORM_TEXT;
        enumType = Enum233StipulationType.TRADE_VARIANCE;
        enumType = Enum233StipulationType.WEIGHTED_AVERAGE_COUPON;
        enumType = Enum233StipulationType.WEIGHTED_AVERAGE_LIFE_COUPON;
        enumType = Enum233StipulationType.WEIGHTED_AVERAGE_LOAN_AGE;
        enumType = Enum233StipulationType.WEIGHTED_AVERAGE_MATURITY;
        enumType = Enum233StipulationType.WHOLE_POOL;
        enumType = Enum233StipulationType.YIELD_RANGE;

        /*
         *  Prepayment Speeds
         */
        enumType = Enum233StipulationType.ABSOLUTE_PREPAYMENT_SPEED;
        enumType = Enum233StipulationType.CONSTANT_PREPAYMENT_PENALTY;
        enumType = Enum233StipulationType.CONSTANT_PREPAYMENT_RATE;
        enumType = Enum233StipulationType.CONSTANT_PREPAYMENT_YIELD;
        enumType = Enum233StipulationType.FINAL_CPR_HOME_EQUITY;
        enumType = Enum233StipulationType.MANUFACTURED_HOUSING_PREPAYMENT;
        enumType = Enum233StipulationType.MONTHLY_PREPAYMENT_RATE;
        enumType = Enum233StipulationType.PERCENT_PROSPECTUS_PREPAYMENT;
        enumType = Enum233StipulationType.PERCENT_BMA_PREPAYMENT;
        enumType = Enum233StipulationType.SINGLE_MONTHLY_MORTALITY;

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