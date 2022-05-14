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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  233 (same as 233, 688, 888)
 *  StipulationType
 *  String
 *  <p>
 *  For Fixed Income.  Type of Stipulation.
 *  <p>
 *  Other types may be used by mutual agreement of the counterparties.
 *  <p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  688
 *  LegStipulationType
 *  String
 *  <p>
 *  For Fixed Income, type of Stipulation for this leg.
 *  <p>
 *  See StipulationType (233) for description and valid values
 *  <p></p>
 *  888
 *  UnderlyingStipType
 *  String
 *  <p>
 *  Type of stipulation.
 *  <p>
 *  Same values as StipulationType (233)
 *  <p></p>
 *  Valid values:
 *  <p>    AMT - Alternative Minimum Tax (Y/N)
 *  <p>    AUTOREINV - Auto Reinvestment at <rate> or better
 *  <p>    BANKQUAL - Bank qualified (Y/N)
 *  <p>    BGNCON - Bargain conditions (see StipulationValue (234) for values)
 *  <p>    COUPON - Coupon range
 *  <p></p>
 *  <p>    CURRENCY - ISO Currency Code
 *  <p>    CUSTOMDATE - Custom start/end date
 *  <p>    GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])
 *  <p>    HAIRCUT - Valuation Discount
 *  <p>    INSURED - Insured (Y/N)
 *  <p></p>
 *  <p>    ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)
 *  <p>    ISSUER - Issuer's ticker
 *  <p>    ISSUESIZE - issue size range
 *  <p>    LOOKBACK - Lookback Days
 *  <p>    LOT - Explicit lot identifier
 *  <p></p>
 *  <p>    LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)
 *  <p>    MAT - Maturity Year And Month
 *  <p>    MATURITY - Maturity range
 *  <p>    MAXSUBS - Maximum substitutions (Repo)
 *  <p>    MINDNOM - Minimum denomination
 *  <p></p>
 *  <p>    MININCR - Minimum increment
 *  <p>    MINQTY - Minimum quantity
 *  <p>    PAYFREQ - Payment frequency, calendar
 *  <p>    PIECES - Number Of Pieces
 *  <p>    PMAX - Pools Maximum
 *  <p></p>
 *  <p>    PPL - Pools per Lot
 *  <p>    PPM - Pools per Million
 *  <p>    PPT - Pools per Trade
 *  <p>    PRICE - Price Range
 *  <p>    PRICEFREQ - Pricing frequency
 *  <p></p>
 *  <p>    PROD - Production Year
 *  <p>    PROTECT - Call protection
 *  <p>    PURPOSE - Purpose
 *  <p>    PXSOURCE - Benchmark price source
 *  <p>    RATING - Rating source and range
 *  <p></p>
 *  <p>    REDEMPTION - Type Of Redemption - values are:
 *              NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible
 *  <p>    RESTRICTED - Restricted (Y/N)
 *  <p>    SECTOR - Market Sector
 *  <p>    SECTYPE - Security Type included or excluded
 *  <p>    STRUCT - Structure
 *  <p></p>
 *      SUBSFREQ - Substitutions frequency (Repo)
 *      SUBSLEFT - Substitutions left (Repo)
 *      TEXT - Freeform Text
 *      TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)
 *      WAC - Weighted Average Coupon - value in percent (exact or range)
 *              plus "Gross" or "Net" of servicing spread (the default)
 *              (ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])
 *  <p></p>
 *  <p>    WAL - Weighted Average Life Coupon - value in percent (exact or range)
 *  <p>    WALA - Weighted Average Loan Age - value in months (exact or range)
 *  <p>    WAM - Weighted Average Maturity - value in months (exact or range)
 *  <p>    WHOLE - Whole Pool (Y/N)
 *  <p>    YIELD - Yield Range
 *  <p></p>
 *      Prepayment Speeds
 *  <p>    ABS - Absolute Prepayment Speed
 *  <p>    CPP - Constant Prepayment Penalty
 *  <p>    CPR - Constant Prepayment Rate
 *  <p>    CPY - Constant Prepayment Yield
 *  <p>    HEP - final CPR of Home Equity Prepayment Curve
 *  <p></p>
 *  <p>    MHP - Percent of Manufactured Housing Prepayment Curve
 *  <p>    MPR - Monthly Prepayment Rate
 *  <p>    PPC - Percent of Prospectus Prepayment Curve
 *  <p>    PSA - Percent of BMA Prepayment Curve
 *  <p>    SMM - Single Monthly Mortality
 */
class Tag688EnuLegStipulationTypeTest {
    @Test
    void FIX0688Test() {
        FIX44 fixData = FIX44.FIX688_ENU_LEG_STIPULATION_TYPE;
        assertEquals( "688", fixData.getID());
        assertEquals( "LEG_STIPULATION_TYPE", fixData.getName());
        assertEquals( "LegStipulationType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0688Test() {
        Tag688EnuLegStipulationType tagData;

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX);
        assertEquals( MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.AUTO_REINVESTMENT);
        assertEquals( MyEnumStipulationType.AUTO_REINVESTMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.BANK_QUALIFIED);
        assertEquals( MyEnumStipulationType.BANK_QUALIFIED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.BARGAIN_CONDITIONS);
        assertEquals( MyEnumStipulationType.BARGAIN_CONDITIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.COUPON_RANGE);
        assertEquals( MyEnumStipulationType.COUPON_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.ISO_CURRENCY_CODE);
        assertEquals( MyEnumStipulationType.ISO_CURRENCY_CODE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CUSTOM_START_END_DATE);
        assertEquals( MyEnumStipulationType.CUSTOM_START_END_DATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE);
        assertEquals( MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.VALUATION_DISCOUNT);
        assertEquals( MyEnumStipulationType.VALUATION_DISCOUNT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.INSURED);
        assertEquals( MyEnumStipulationType.INSURED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE);
        assertEquals( MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.ISSUERS_TICKER);
        assertEquals( MyEnumStipulationType.ISSUERS_TICKER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.ISSUE_SIZE_RANGE);
        assertEquals( MyEnumStipulationType.ISSUE_SIZE_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.LOOKBACK_DAYS);
        assertEquals( MyEnumStipulationType.LOOKBACK_DAYS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER);
        assertEquals( MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.LOT_VARIANCE);
        assertEquals( MyEnumStipulationType.LOT_VARIANCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MATURITY_YEAR_AND_MONTH);
        assertEquals( MyEnumStipulationType.MATURITY_YEAR_AND_MONTH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MATURITY_RANGE);
        assertEquals( MyEnumStipulationType.MATURITY_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO);
        assertEquals( MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MINIMUM_DENOMINATION);
        assertEquals( MyEnumStipulationType.MINIMUM_DENOMINATION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MINIMUM_INCREMENT);
        assertEquals( MyEnumStipulationType.MINIMUM_INCREMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MINIMUM_QUANTITY);
        assertEquals( MyEnumStipulationType.MINIMUM_QUANTITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PAYMENT_FREQUENCY);
        assertEquals( MyEnumStipulationType.PAYMENT_FREQUENCY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.NUMBER_OF_PIECES);
        assertEquals( MyEnumStipulationType.NUMBER_OF_PIECES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.POOLS_MAXIMUM);
        assertEquals( MyEnumStipulationType.POOLS_MAXIMUM.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.POOLS_PER_LOT);
        assertEquals( MyEnumStipulationType.POOLS_PER_LOT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.POOLS_PER_MILLION);
        assertEquals( MyEnumStipulationType.POOLS_PER_MILLION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.POOLS_PER_TRADE);
        assertEquals( MyEnumStipulationType.POOLS_PER_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PRICE_RANGE);
        assertEquals( MyEnumStipulationType.PRICE_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PRICING_FREQUENCY);
        assertEquals( MyEnumStipulationType.PRICING_FREQUENCY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PRODUCTION_YEAR);
        assertEquals( MyEnumStipulationType.PRODUCTION_YEAR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CALL_PROTECTION);
        assertEquals( MyEnumStipulationType.CALL_PROTECTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PURPOSE);
        assertEquals( MyEnumStipulationType.PURPOSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.BENCHMARK_PRICE_SOURCE);
        assertEquals( MyEnumStipulationType.BENCHMARK_PRICE_SOURCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.RATING_SOURCE_AND_RANGE);
        assertEquals( MyEnumStipulationType.RATING_SOURCE_AND_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.TYPE_OF_REDEMPTION);
        assertEquals( MyEnumStipulationType.TYPE_OF_REDEMPTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.RESTRICTED);
        assertEquals( MyEnumStipulationType.RESTRICTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MARKET_SECTOR);
        assertEquals( MyEnumStipulationType.MARKET_SECTOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.SECURITY_TYPE);
        assertEquals( MyEnumStipulationType.SECURITY_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.STRUCTURE);
        assertEquals( MyEnumStipulationType.STRUCTURE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO);
        assertEquals( MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO);
        assertEquals( MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.FREEFORM_TEXT);
        assertEquals( MyEnumStipulationType.FREEFORM_TEXT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.TRADE_VARIANCE);
        assertEquals( MyEnumStipulationType.TRADE_VARIANCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WHOLE_POOL);
        assertEquals( MyEnumStipulationType.WHOLE_POOL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.YIELD_RANGE);
        assertEquals( MyEnumStipulationType.YIELD_RANGE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  Prepayment Speeds
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED);
        assertEquals( MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY);
        assertEquals( MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE);
        assertEquals( MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD);
        assertEquals( MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.FINAL_CPR_HOME_EQUITY);
        assertEquals( MyEnumStipulationType.FINAL_CPR_HOME_EQUITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT);
        assertEquals( MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE);
        assertEquals( MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT);
        assertEquals( MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PERCENT_BMA_PREPAYMENT);
        assertEquals( MyEnumStipulationType.PERCENT_BMA_PREPAYMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY);
        assertEquals( MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}