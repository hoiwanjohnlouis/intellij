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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyEnumStipulationType;
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  888 (same as 233, 688, 888)
 *  UnderlyingStipType
 *  String
 *  Type of stipulation.
 *              Same values as StipulationType (233)
 *  Valid values:
 *      AMT - Alternative Minimum Tax (Y/N)
 *      AUTOREINV - Auto Reinvestment at <rate> or better
 *      BANKQUAL - Bank qualified (Y/N)
 *      BGNCON - Bargain conditions (see StipulationValue (234) for values)
 *      COUPON - Coupon range
 *      CURRENCY - ISO Currency Code
 *      CUSTOMDATE - Custom start/end date
 *      GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])
 *      HAIRCUT - Valuation Discount
 *      INSURED - Insured (Y/N)
 *      ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)
 *      ISSUER - Issuer's ticker
 *      ISSUESIZE - issue size range
 *      LOOKBACK - Lookback Days
 *      LOT - Explicit lot identifier
 *      LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)
 *      MAT - Maturity Year And Month
 *      MATURITY - Maturity range
 *      MAXSUBS - Maximum substitutions (Repo)
 *      MINDNOM - Minimum denomination
 *      MININCR - Minimum increment
 *      MINQTY - Minimum quantity
 *      PAYFREQ - Payment frequency, calendar
 *      PIECES - Number Of Pieces
 *      PMAX - Pools Maximum
 *      PPL - Pools per Lot
 *      PPM - Pools per Million
 *      PPT - Pools per Trade
 *      PRICE - Price Range
 *      PRICEFREQ - Pricing frequency
 *      PROD - Production Year
 *      PROTECT - Call protection
 *      PURPOSE - Purpose
 *      PXSOURCE - Benchmark price source
 *      RATING - Rating source and range
 *      REDEMPTION - Type Of Redemption - values are:
 *              NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible
 *      RESTRICTED - Restricted (Y/N)
 *      SECTOR - Market Sector
 *      SECTYPE - Security Type included or excluded
 *      STRUCT - Structure
 *      SUBSFREQ - Substitutions frequency (Repo)
 *      SUBSLEFT - Substitutions left (Repo)
 *      TEXT - Freeform Text
 *      TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)
 *      WAC - Weighted Average Coupon - value in percent (exact or range)
 *              plus "Gross" or "Net" of servicing spread (the default)
 *              (ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])
 *      WAL - Weighted Average Life Coupon - value in percent (exact or range)
 *      WALA - Weighted Average Loan Age - value in months (exact or range)
 *      WAM - Weighted Average Maturity - value in months (exact or range)
 *      WHOLE - Whole Pool (Y/N)
 *      YIELD - Yield Range
 *
 *      Prepayment Speeds
 *      ABS - Absolute Prepayment Speed
 *      CPP - Constant Prepayment Penalty
 *      CPR - Constant Prepayment Rate
 *      CPY - Constant Prepayment Yield
 *      HEP - final CPR of Home Equity Prepayment Curve
 *      MHP - Percent of Manufactured Housing Prepayment Curve
 *      MPR - Monthly Prepayment Rate
 *      PPC - Percent of Prospectus Prepayment Curve
 *      PSA - Percent of BMA Prepayment Curve
 *      SMM - Single Monthly Mortality
 */
class Tag888EnuUnderlyingStipTypeTest {
    @Test
    void FIX0888Test() {
        FIX44 fixData = FIX44.FIX888_ENU_UNDERLYING_STIP_TYPE;
        assertEquals( "888", fixData.getID());
        assertEquals( "UNDERLYING_STIP_TYPE", fixData.getName());
        assertEquals( "UnderlyingStipType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0888Test() {
        Tag888EnuUnderlyingStipType tagData;

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX);
        assertEquals( MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.AUTO_REINVESTMENT);
        assertEquals( MyEnumStipulationType.AUTO_REINVESTMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.BANK_QUALIFIED);
        assertEquals( MyEnumStipulationType.BANK_QUALIFIED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.BARGAIN_CONDITIONS);
        assertEquals( MyEnumStipulationType.BARGAIN_CONDITIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.COUPON_RANGE);
        assertEquals( MyEnumStipulationType.COUPON_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.ISO_CURRENCY_CODE);
        assertEquals( MyEnumStipulationType.ISO_CURRENCY_CODE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CUSTOM_START_END_DATE);
        assertEquals( MyEnumStipulationType.CUSTOM_START_END_DATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE);
        assertEquals( MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.VALUATION_DISCOUNT);
        assertEquals( MyEnumStipulationType.VALUATION_DISCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.INSURED);
        assertEquals( MyEnumStipulationType.INSURED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE);
        assertEquals( MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.ISSUERS_TICKER);
        assertEquals( MyEnumStipulationType.ISSUERS_TICKER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.ISSUE_SIZE_RANGE);
        assertEquals( MyEnumStipulationType.ISSUE_SIZE_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.LOOKBACK_DAYS);
        assertEquals( MyEnumStipulationType.LOOKBACK_DAYS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER);
        assertEquals( MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.LOT_VARIANCE);
        assertEquals( MyEnumStipulationType.LOT_VARIANCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MATURITY_YEAR_AND_MONTH);
        assertEquals( MyEnumStipulationType.MATURITY_YEAR_AND_MONTH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MATURITY_RANGE);
        assertEquals( MyEnumStipulationType.MATURITY_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO);
        assertEquals( MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MINIMUM_DENOMINATION);
        assertEquals( MyEnumStipulationType.MINIMUM_DENOMINATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MINIMUM_INCREMENT);
        assertEquals( MyEnumStipulationType.MINIMUM_INCREMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MINIMUM_QUANTITY);
        assertEquals( MyEnumStipulationType.MINIMUM_QUANTITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PAYMENT_FREQUENCY);
        assertEquals( MyEnumStipulationType.PAYMENT_FREQUENCY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.NUMBER_OF_PIECES);
        assertEquals( MyEnumStipulationType.NUMBER_OF_PIECES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.POOLS_MAXIMUM);
        assertEquals( MyEnumStipulationType.POOLS_MAXIMUM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.POOLS_PER_LOT);
        assertEquals( MyEnumStipulationType.POOLS_PER_LOT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.POOLS_PER_MILLION);
        assertEquals( MyEnumStipulationType.POOLS_PER_MILLION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.POOLS_PER_TRADE);
        assertEquals( MyEnumStipulationType.POOLS_PER_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PRICE_RANGE);
        assertEquals( MyEnumStipulationType.PRICE_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PRICING_FREQUENCY);
        assertEquals( MyEnumStipulationType.PRICING_FREQUENCY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PRODUCTION_YEAR);
        assertEquals( MyEnumStipulationType.PRODUCTION_YEAR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CALL_PROTECTION);
        assertEquals( MyEnumStipulationType.CALL_PROTECTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PURPOSE);
        assertEquals( MyEnumStipulationType.PURPOSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.BENCHMARK_PRICE_SOURCE);
        assertEquals( MyEnumStipulationType.BENCHMARK_PRICE_SOURCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.RATING_SOURCE_AND_RANGE);
        assertEquals( MyEnumStipulationType.RATING_SOURCE_AND_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.TYPE_OF_REDEMPTION);
        assertEquals( MyEnumStipulationType.TYPE_OF_REDEMPTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.RESTRICTED);
        assertEquals( MyEnumStipulationType.RESTRICTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MARKET_SECTOR);
        assertEquals( MyEnumStipulationType.MARKET_SECTOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.SECURITY_TYPE);
        assertEquals( MyEnumStipulationType.SECURITY_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.STRUCTURE);
        assertEquals( MyEnumStipulationType.STRUCTURE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO);
        assertEquals( MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO);
        assertEquals( MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.FREEFORM_TEXT);
        assertEquals( MyEnumStipulationType.FREEFORM_TEXT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.TRADE_VARIANCE);
        assertEquals( MyEnumStipulationType.TRADE_VARIANCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WHOLE_POOL);
        assertEquals( MyEnumStipulationType.WHOLE_POOL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.YIELD_RANGE);
        assertEquals( MyEnumStipulationType.YIELD_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         *  Prepayment Speeds
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED);
        assertEquals( MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY);
        assertEquals( MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE);
        assertEquals( MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD);
        assertEquals( MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.FINAL_CPR_HOME_EQUITY);
        assertEquals( MyEnumStipulationType.FINAL_CPR_HOME_EQUITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT);
        assertEquals( MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE);
        assertEquals( MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT);
        assertEquals( MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PERCENT_BMA_PREPAYMENT);
        assertEquals( MyEnumStipulationType.PERCENT_BMA_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY);
        assertEquals( MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}