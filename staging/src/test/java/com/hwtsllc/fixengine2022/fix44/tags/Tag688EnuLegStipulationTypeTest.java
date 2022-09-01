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

class Tag688EnuLegStipulationTypeTest {
    Tag688EnuLegStipulationType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag688EnuLegStipulationType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag688EnuLegStipulationType(oneEnum);
            assertEquals( "FIX688_ENU_LEG_STIPULATION_TYPE", tagData.toFIXLabelString());
            assertEquals( "688", tagData.toEnumIDString());
            assertEquals( "LEG_STIPULATION_TYPE", tagData.toEnumNameString());
            assertEquals( "LegStipulationType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag688EnuLegStipulationType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  688 (same as 233, 688, 888)
         *  <p>    AMT - Alternative Minimum Tax (Y/N)
         *  <p>    AUTOREINV - Auto Reinvestment at <rate> or better
         *  <p>    BANKQUAL - Bank qualified (Y/N)
         *  <p>    BGNCON - Bargain conditions (see StipulationValue (234) for values)
         *  <p>    COUPON - Coupon range
         */
        tagData = new Tag688EnuLegStipulationType( MyEnumStipulationType.ALTERNATIVE_MINIMUM_TAX );
        assertEquals( "AMT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.AUTO_REINVESTMENT);
        assertEquals( "AUTOREINV", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.BANK_QUALIFIED);
        assertEquals( "BANKQUAL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.BARGAIN_CONDITIONS);
        assertEquals( "BGNCON", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.COUPON_RANGE);
        assertEquals( "COUPON", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    CURRENCY - ISO Currency Code
         *  <p>    CUSTOMDATE - Custom start/end date
         *  <p>    GEOG - Geographics and % range (ex. 234=CA 0-80 [minimum of 80% California assets])
         *  <p>    HAIRCUT - Valuation Discount
         *  <p>    INSURED - Insured (Y/N)
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.ISO_CURRENCY_CODE);
        assertEquals( "CURRENCY", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CUSTOM_START_END_DATE);
        assertEquals( "CUSTOMDATE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.GEOGRAPHIC_AND_PERCENT_RANGE);
        assertEquals( "GEOG", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.VALUATION_DISCOUNT);
        assertEquals( "HAIRCUT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.INSURED);
        assertEquals( "INSURED", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    ISSUE - Year Or Year/Month of Issue (ex. 234=2002/09)
         *  <p>    ISSUER - Issuer's ticker
         *  <p>    ISSUESIZE - issue size range
         *  <p>    LOOKBACK - Lookback Days
         *  <p>    LOT - Explicit lot identifier
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.YEAR_OR_YEAR_MONTH_OF_ISSUE);
        assertEquals( "ISSUE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.ISSUERS_TICKER);
        assertEquals( "ISSUER", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.ISSUE_SIZE_RANGE);
        assertEquals( "ISSUESIZE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.LOOKBACK_DAYS);
        assertEquals( "LOOKBACK", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.EXPLICIT_LOT_IDENTIFIER);
        assertEquals( "LOT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    LOTVAR - Lot Variance (value in percent maximum over- or under-allocation allowed)
         *  <p>    MAT - Maturity Year And Month
         *  <p>    MATURITY - Maturity range
         *  <p>    MAXSUBS - Maximum substitutions (Repo)
         *  <p>    MINDNOM - Minimum denomination
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.LOT_VARIANCE);
        assertEquals( "LOTVAR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MATURITY_YEAR_AND_MONTH);
        assertEquals( "MAT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MATURITY_RANGE);
        assertEquals( "MATURITY", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MAXIMUM_SUBSTITUTIONS_REPO);
        assertEquals( "MAXSUBS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MINIMUM_DENOMINATION);
        assertEquals( "MINDNOM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    MININCR - Minimum increment
         *  <p>    MINQTY - Minimum quantity
         *  <p>    PAYFREQ - Payment frequency, calendar
         *  <p>    PIECES - Number Of Pieces
         *  <p>    PMAX - Pools Maximum
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MINIMUM_INCREMENT);
        assertEquals( "MININCR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MINIMUM_QUANTITY);
        assertEquals( "MINQTY", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PAYMENT_FREQUENCY);
        assertEquals( "PAYFREQ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.NUMBER_OF_PIECES);
        assertEquals( "PIECES", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.POOLS_MAXIMUM);
        assertEquals( "PMAX", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    PPL - Pools per Lot
         *  <p>    PPM - Pools per Million
         *  <p>    PPT - Pools per Trade
         *  <p>    PRICE - Price Range
         *  <p>    PRICEFREQ - Pricing frequency
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.POOLS_PER_LOT);
        assertEquals( "PPL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.POOLS_PER_MILLION);
        assertEquals( "PPM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.POOLS_PER_TRADE);
        assertEquals( "PPT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PRICE_RANGE);
        assertEquals( "PRICE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PRICING_FREQUENCY);
        assertEquals( "PRICEFREQ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    PROD - Production Year
         *  <p>    PROTECT - Call protection
         *  <p>    PURPOSE - Purpose
         *  <p>    PXSOURCE - Benchmark price source
         *  <p>    RATING - Rating source and range
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PRODUCTION_YEAR);
        assertEquals( "PROD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CALL_PROTECTION);
        assertEquals( "PROTECT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PURPOSE);
        assertEquals( "PURPOSE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.BENCHMARK_PRICE_SOURCE);
        assertEquals( "PXSOURCE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.RATING_SOURCE_AND_RANGE);
        assertEquals( "RATING", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    REDEMPTION - Type Of Redemption - values are:
         *              NonCallable, Prefunded, EscrowedToMaturity, Putable, Convertible
         *  <p>    RESTRICTED - Restricted (Y/N)
         *  <p>    SECTOR - Market Sector
         *  <p>    SECTYPE - Security Type included or excluded
         *  <p>    STRUCT - Structure
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.TYPE_OF_REDEMPTION);
        assertEquals( "REDEMPTION", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.RESTRICTED);
        assertEquals( "RESTRICTED", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MARKET_SECTOR);
        assertEquals( "SECTOR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.SECURITY_TYPE);
        assertEquals( "SECTYPE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.STRUCTURE);
        assertEquals( "STRUCT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    SUBSFREQ - Substitutions frequency (Repo)
         *  <p>    SUBSLEFT - Substitutions left (Repo)
         *  <p>    TEXT - Freeform Text
         *  <p>    TRDVAR - Trade Variance (value in percent maximum over- or under-allocation allowed)
         *  <p>    WAC - Weighted Average Coupon - value in percent (exact or range)
         *              plus "Gross" or "Net" of servicing spread (the default)
         *              (ex. 234=6.5-Net [minimum of 6.5% net of servicing fee])
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.SUBSTITUTIONS_FREQUENCY_REPO);
        assertEquals( "SUBSFREQ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.SUBSTITUTIONS_LEFT_REPO);
        assertEquals( "SUBSLEFT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.FREEFORM_TEXT);
        assertEquals( "TEXT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.TRADE_VARIANCE);
        assertEquals( "TRDVAR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_COUPON);
        assertEquals( "WAC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    WAL - Weighted Average Life Coupon - value in percent (exact or range)
         *  <p>    WALA - Weighted Average Loan Age - value in months (exact or range)
         *  <p>    WAM - Weighted Average Maturity - value in months (exact or range)
         *  <p>    WHOLE - Whole Pool (Y/N)
         *  <p>    YIELD - Yield Range
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_LIFE_COUPON);
        assertEquals( "WAL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_LOAN_AGE);
        assertEquals( "WALA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WEIGHTED_AVERAGE_MATURITY);
        assertEquals( "WAM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.WHOLE_POOL);
        assertEquals( "WHOLE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.YIELD_RANGE);
        assertEquals( "YIELD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Prepayment Speeds
         *  <p>    ABS - Absolute Prepayment Speed
         *  <p>    CPP - Constant Prepayment Penalty
         *  <p>    CPR - Constant Prepayment Rate
         *  <p>    CPY - Constant Prepayment Yield
         *  <p>    HEP - final CPR of Home Equity Prepayment Curve
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.ABSOLUTE_PREPAYMENT_SPEED);
        assertEquals( "ABS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CONSTANT_PREPAYMENT_PENALTY);
        assertEquals( "CPP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CONSTANT_PREPAYMENT_RATE);
        assertEquals( "CPR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.CONSTANT_PREPAYMENT_YIELD);
        assertEquals( "CPY", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.FINAL_CPR_HOME_EQUITY);
        assertEquals( "HEP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *      Prepayment Speeds
         *  <p>    MHP - Percent of Manufactured Housing Prepayment Curve
         *  <p>    MPR - Monthly Prepayment Rate
         *  <p>    PPC - Percent of Prospectus Prepayment Curve
         *  <p>    PSA - Percent of BMA Prepayment Curve
         *  <p>    SMM - Single Monthly Mortality
         */
        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MANUFACTURED_HOUSING_PREPAYMENT);
        assertEquals( "MHP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.MONTHLY_PREPAYMENT_RATE);
        assertEquals( "MPR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PERCENT_PROSPECTUS_PREPAYMENT);
        assertEquals( "PPC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.PERCENT_BMA_PREPAYMENT);
        assertEquals( "PSA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag688EnuLegStipulationType(MyEnumStipulationType.SINGLE_MONTHLY_MORTALITY);
        assertEquals( "SMM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag688EnuLegStipulationType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumStipulationType oneEnum : MyEnumStipulationType.values()) {
            tagData = new Tag688EnuLegStipulationType(oneEnum);
            assertEquals( "Tag688EnuLegStipulationType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}