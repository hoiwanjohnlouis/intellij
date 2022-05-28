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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
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
class Tag233EnuStipulationTypeTest {
    @Test
    void FIX0233Test() {
        FIX42 fixData = FIX42.FIX233_ENU_STIPULATION_TYPE;
        assertEquals( "233", fixData.toFIXIDString());
        assertEquals( "STIPULATION_TYPE", fixData.toFIXNameString());
        assertEquals( "StipulationType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0233Test() {
        Tag233EnuStipulationType tagData;

        /*
         *  233 StipulationType
         */
        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX);
        assertEquals( MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.AUTO_REINVESTMENT);
        assertEquals( MyEnumStipulationType.AUTO_REINVESTMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.BANK_QUALIFIED);
        assertEquals( MyEnumStipulationType.BANK_QUALIFIED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.BARGAIN_CONDITIONS);
        assertEquals( MyEnumStipulationType.BARGAIN_CONDITIONS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.COUPON_RANGE);
        assertEquals( MyEnumStipulationType.COUPON_RANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.ISO_CURRENCY_CODE);
        assertEquals( MyEnumStipulationType.ISO_CURRENCY_CODE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.CUSTOM_START_END_DATE);
        assertEquals( MyEnumStipulationType.CUSTOM_START_END_DATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE);
        assertEquals( MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.VALUATION_DISCOUNT);
        assertEquals( MyEnumStipulationType.VALUATION_DISCOUNT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.INSURED);
        assertEquals( MyEnumStipulationType.INSURED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE);
        assertEquals( MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.ISSUERS_TICKER);
        assertEquals( MyEnumStipulationType.ISSUERS_TICKER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.ISSUE_SIZE_RANGE);
        assertEquals( MyEnumStipulationType.ISSUE_SIZE_RANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.LOOKBACK_DAYS);
        assertEquals( MyEnumStipulationType.LOOKBACK_DAYS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER);
        assertEquals( MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.LOT_VARIANCE);
        assertEquals( MyEnumStipulationType.LOT_VARIANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.MATURITY_YEAR_AND_MONTH);
        assertEquals( MyEnumStipulationType.MATURITY_YEAR_AND_MONTH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.MATURITY_RANGE);
        assertEquals( MyEnumStipulationType.MATURITY_RANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO);
        assertEquals( MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.MINIMUM_DENOMINATION);
        assertEquals( MyEnumStipulationType.MINIMUM_DENOMINATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.MINIMUM_INCREMENT);
        assertEquals( MyEnumStipulationType.MINIMUM_INCREMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.MINIMUM_QUANTITY);
        assertEquals( MyEnumStipulationType.MINIMUM_QUANTITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.PAYMENT_FREQUENCY);
        assertEquals( MyEnumStipulationType.PAYMENT_FREQUENCY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.NUMBER_OF_PIECES);
        assertEquals( MyEnumStipulationType.NUMBER_OF_PIECES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.POOLS_MAXIMUM);
        assertEquals( MyEnumStipulationType.POOLS_MAXIMUM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.POOLS_PER_LOT);
        assertEquals( MyEnumStipulationType.POOLS_PER_LOT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.POOLS_PER_MILLION);
        assertEquals( MyEnumStipulationType.POOLS_PER_MILLION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.POOLS_PER_TRADE);
        assertEquals( MyEnumStipulationType.POOLS_PER_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.PRICE_RANGE);
        assertEquals( MyEnumStipulationType.PRICE_RANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.PRICING_FREQUENCY);
        assertEquals( MyEnumStipulationType.PRICING_FREQUENCY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.PRODUCTION_YEAR);
        assertEquals( MyEnumStipulationType.PRODUCTION_YEAR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.CALL_PROTECTION);
        assertEquals( MyEnumStipulationType.CALL_PROTECTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.PURPOSE);
        assertEquals( MyEnumStipulationType.PURPOSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.BENCHMARK_PRICE_SOURCE);
        assertEquals( MyEnumStipulationType.BENCHMARK_PRICE_SOURCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.RATING_SOURCE_AND_RANGE);
        assertEquals( MyEnumStipulationType.RATING_SOURCE_AND_RANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.TYPE_OF_REDEMPTION);
        assertEquals( MyEnumStipulationType.TYPE_OF_REDEMPTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.RESTRICTED);
        assertEquals( MyEnumStipulationType.RESTRICTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.MARKET_SECTOR);
        assertEquals( MyEnumStipulationType.MARKET_SECTOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.SECURITY_TYPE);
        assertEquals( MyEnumStipulationType.SECURITY_TYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.STRUCTURE);
        assertEquals( MyEnumStipulationType.STRUCTURE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO);
        assertEquals( MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO);
        assertEquals( MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.FREEFORM_TEXT);
        assertEquals( MyEnumStipulationType.FREEFORM_TEXT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.TRADE_VARIANCE);
        assertEquals( MyEnumStipulationType.TRADE_VARIANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY);
        assertEquals( MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.WHOLE_POOL);
        assertEquals( MyEnumStipulationType.WHOLE_POOL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.YIELD_RANGE);
        assertEquals( MyEnumStipulationType.YIELD_RANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  Prepayment Speeds
         */
        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED);
        assertEquals( MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY);
        assertEquals( MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE);
        assertEquals( MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD);
        assertEquals( MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.FINAL_CPR_HOME_EQUITY);
        assertEquals( MyEnumStipulationType.FINAL_CPR_HOME_EQUITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT);
        assertEquals( MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE);
        assertEquals( MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT);
        assertEquals( MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.PERCENT_BMA_PREPAYMENT);
        assertEquals( MyEnumStipulationType.PERCENT_BMA_PREPAYMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag233EnuStipulationType(MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY);
        assertEquals( MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag233EnuStipulationType tagData;

        // loop around the ENUM and process
        for (MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag233EnuStipulationType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag233EnuStipulationType tagData;

        // loop around the ENUM and process
        for (MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag233EnuStipulationType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag233EnuStipulationType tagData;

        // loop around the ENUM and process
        for (MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag233EnuStipulationType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag233EnuStipulationType tagData;

        // loop around the ENUM and process
        for (MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag233EnuStipulationType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag233EnuStipulationType tagData;

        // loop around the ENUM and process
        for (MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag233EnuStipulationType(oneEnum);
            assertEquals( "Tag233EnuStipulationType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}