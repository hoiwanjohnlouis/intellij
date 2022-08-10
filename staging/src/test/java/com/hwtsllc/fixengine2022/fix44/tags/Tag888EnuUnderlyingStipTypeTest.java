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
 *  <p>    SUBSFREQ - Substitutions frequency (Repo)
 *  <p>    SUBSLEFT - Substitutions left (Repo)
 *  <p>    TEXT - Freeform Text
 *  <p>    TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)
 *  <p>    WAC - Weighted Average Coupon - value in percent (exact or range)
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
class Tag888EnuUnderlyingStipTypeTest {
    Tag888EnuUnderlyingStipType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag888EnuUnderlyingStipType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag888EnuUnderlyingStipType(oneEnum);
            assertEquals( "FIX888_ENU_UNDERLYING_STIP_TYPE", tagData.toEnumLabelString());
            assertEquals( "888", tagData.toEnumIDString());
            assertEquals( "UNDERLYING_STIP_TYPE", tagData.toEnumNameString());
            assertEquals( "UnderlyingStipType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    AMT - Alternative Minimum Tax (Y/N)
         *  <p>    AUTOREINV - Auto Reinvestment at <rate> or better
         *  <p>    BANKQUAL - Bank qualified (Y/N)
         *  <p>    BGNCON - Bargain conditions (see StipulationValue (234) for values)
         *  <p>    COUPON - Coupon range
         */
        tagData = new Tag888EnuUnderlyingStipType( MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX );
        assertEquals( "AMT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.AUTO_REINVESTMENT);
        assertEquals( "AUTOREINV", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.BANK_QUALIFIED);
        assertEquals( "BANKQUAL", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.BARGAIN_CONDITIONS);
        assertEquals( "BGNCON", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.COUPON_RANGE);
        assertEquals( "COUPON", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    CURRENCY - ISO Currency Code
         *  <p>    CUSTOMDATE - Custom start/end date
         *  <p>    GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])
         *  <p>    HAIRCUT - Valuation Discount
         *  <p>    INSURED - Insured (Y/N)
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.ISO_CURRENCY_CODE);
        assertEquals( "CURRENCY", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CUSTOM_START_END_DATE);
        assertEquals( "CUSTOMDATE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE);
        assertEquals( "GEOG", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.VALUATION_DISCOUNT);
        assertEquals( "HAIRCUT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.INSURED);
        assertEquals( "INSURED", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)
         *  <p>    ISSUER - Issuer's ticker
         *  <p>    ISSUESIZE - issue size range
         *  <p>    LOOKBACK - Lookback Days
         *  <p>    LOT - Explicit lot identifier
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE);
        assertEquals( "ISSUE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.ISSUERS_TICKER);
        assertEquals( "ISSUER", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.ISSUE_SIZE_RANGE);
        assertEquals( "ISSUESIZE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.LOOKBACK_DAYS);
        assertEquals( "LOOKBACK", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER);
        assertEquals( "LOT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)
         *  <p>    MAT - Maturity Year And Month
         *  <p>    MATURITY - Maturity range
         *  <p>    MAXSUBS - Maximum substitutions (Repo)
         *  <p>    MINDNOM - Minimum denomination
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.LOT_VARIANCE);
        assertEquals( "LOTVAR", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MATURITY_YEAR_AND_MONTH);
        assertEquals( "MAT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MATURITY_RANGE);
        assertEquals( "MATURITY", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO);
        assertEquals( "MAXSUBS", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MINIMUM_DENOMINATION);
        assertEquals( "MINDNOM", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    MININCR - Minimum increment
         *  <p>    MINQTY - Minimum quantity
         *  <p>    PAYFREQ - Payment frequency, calendar
         *  <p>    PIECES - Number Of Pieces
         *  <p>    PMAX - Pools Maximum
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MINIMUM_INCREMENT);
        assertEquals( "MININCR", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MINIMUM_QUANTITY);
        assertEquals( "MINQTY", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PAYMENT_FREQUENCY);
        assertEquals( "PAYFREQ", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.NUMBER_OF_PIECES);
        assertEquals( "PIECES", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.POOLS_MAXIMUM);
        assertEquals( "PMAX", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    PPL - Pools per Lot
         *  <p>    PPM - Pools per Million
         *  <p>    PPT - Pools per Trade
         *  <p>    PRICE - Price Range
         *  <p>    PRICEFREQ - Pricing frequency
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.POOLS_PER_LOT);
        assertEquals( "PPL", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.POOLS_PER_MILLION);
        assertEquals( "PPM", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.POOLS_PER_TRADE);
        assertEquals( "PPT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PRICE_RANGE);
        assertEquals( "PRICE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PRICING_FREQUENCY);
        assertEquals( "PRICEFREQ", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    PROD - Production Year
         *  <p>    PROTECT - Call protection
         *  <p>    PURPOSE - Purpose
         *  <p>    PXSOURCE - Benchmark price source
         *  <p>    RATING - Rating source and range
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PRODUCTION_YEAR);
        assertEquals( "PROD", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CALL_PROTECTION);
        assertEquals( "PROTECT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PURPOSE);
        assertEquals( "PURPOSE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.BENCHMARK_PRICE_SOURCE);
        assertEquals( "PXSOURCE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.RATING_SOURCE_AND_RANGE);
        assertEquals( "RATING", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    REDEMPTION - Type Of Redemption - values are:
         *              NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible
         *  <p>    RESTRICTED - Restricted (Y/N)
         *  <p>    SECTOR - Market Sector
         *  <p>    SECTYPE - Security Type included or excluded
         *  <p>    STRUCT - Structure
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.TYPE_OF_REDEMPTION);
        assertEquals( "REDEMPTION", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.RESTRICTED);
        assertEquals( "RESTRICTED", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MARKET_SECTOR);
        assertEquals( "SECTOR", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.SECURITY_TYPE);
        assertEquals( "SECTYPE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.STRUCTURE);
        assertEquals( "STRUCT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    SUBSFREQ - Substitutions frequency (Repo)
         *  <p>    SUBSLEFT - Substitutions left (Repo)
         *  <p>    TEXT - Freeform Text
         *  <p>    TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)
         *  <p>    WAC - Weighted Average Coupon - value in percent (exact or range)
         *              plus "Gross" or "Net" of servicing spread (the default)
         *              (ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO);
        assertEquals( "SUBSFREQ", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO);
        assertEquals( "SUBSLEFT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.FREEFORM_TEXT);
        assertEquals( "TEXT", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.TRADE_VARIANCE);
        assertEquals( "TRDVAR", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON);
        assertEquals( "WAC", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *  <p>    WAL - Weighted Average Life Coupon - value in percent (exact or range)
         *  <p>    WALA - Weighted Average Loan Age - value in months (exact or range)
         *  <p>    WAM - Weighted Average Maturity - value in months (exact or range)
         *  <p>    WHOLE - Whole Pool (Y/N)
         *  <p>    YIELD - Yield Range
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON);
        assertEquals( "WAL", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE);
        assertEquals( "WALA", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY);
        assertEquals( "WAM", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.WHOLE_POOL);
        assertEquals( "WHOLE", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.YIELD_RANGE);
        assertEquals( "YIELD", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *      Prepayment Speeds
         *  <p>    ABS - Absolute Prepayment Speed
         *  <p>    CPP - Constant Prepayment Penalty
         *  <p>    CPR - Constant Prepayment Rate
         *  <p>    CPY - Constant Prepayment Yield
         *  <p>    HEP - final CPR of Home Equity Prepayment Curve
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED);
        assertEquals( "ABS", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY);
        assertEquals( "CPP", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE);
        assertEquals( "CPR", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD);
        assertEquals( "CPY", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.FINAL_CPR_HOME_EQUITY);
        assertEquals( "HEP", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         *      Prepayment Speeds
         *  <p>    MHP - Percent of Manufactured Housing Prepayment Curve
         *  <p>    MPR - Monthly Prepayment Rate
         *  <p>    PPC - Percent of Prospectus Prepayment Curve
         *  <p>    PSA - Percent of BMA Prepayment Curve
         *  <p>    SMM - Single Monthly Mortality
         */
        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT);
        assertEquals( "MHP", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE);
        assertEquals( "MPR", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT);
        assertEquals( "PPC", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.PERCENT_BMA_PREPAYMENT);
        assertEquals( "PSA", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag888EnuUnderlyingStipType(MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY);
        assertEquals( "SMM", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag888EnuUnderlyingStipType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag888EnuUnderlyingStipType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag888EnuUnderlyingStipType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag888EnuUnderlyingStipType(oneEnum);
            assertEquals( "Tag888EnuUnderlyingStipType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}