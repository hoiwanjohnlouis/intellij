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
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag235EnuYieldTypeTest {
    @Test
    void FIX0235Test() {
        FIX42 fixData = FIX42.FIX235_ENU_YIELD_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * various msg types
     */
    AFTERTAX( "AFTERTAX", "AFTERTAX", "AFTERTAX - After Tax Yield (Municipals)" ),
    ANNUAL( "ANNUAL", "ANNUAL", "ANNUAL - Annual Yield" ),
    ATISSUE( "ATISSUE", "ATISSUE", "ATISSUE - Yield At Issue (Municipals)" ),
    AVGMATURITY( "AVGMATURITY", "AVGMATURITY", "AVGMATURITY - Yield To Avg Maturity" ),
    BOOK( "BOOK", "BOOK", "BOOK - Book Yield" ),
    CALL( "CALL", "CALL", "CALL - Yield to Next Call" ),
    CHANGE( "CHANGE", "CHANGE", "CHANGE - Yield Change Since Close" ),
    CLOSE( "CLOSE", "CLOSE", "CLOSE - Closing Yield" ),
    COMPOUND( "COMPOUND", "COMPOUND", "COMPOUND - Compound Yield" ),
    CURRENT( "CURRENT", "CURRENT", "CURRENT - Current Yield" ),
    GOVTEQUIV( "GOVTEQUIV", "GOVTEQUIV", "GOVTEQUIV - Gvnt Equivalent Yield" ),
    GROSS( "GROSS", "GROSS", "GROSS - True Gross Yield" ),
    INFLATION( "INFLATION", "INFLATION", "INFLATION - Yield with Inflation Assumption" ),
    INVERSEFLOATER( "INVERSEFLOATER", "INVERSEFLOATER", "INVERSEFLOATER - Inverse Floater Bond Yield" ),
    LASTCLOSE( "LASTCLOSE", "LASTCLOSE", "LASTCLOSE - Most Recent Closing Yield" ),
    LASTMONTH( "LASTMONTH", "LASTMONTH", "LASTMONTH - Closing Yield Most Recent Month" ),
    LASTQUARTER( "LASTQUARTER", "LASTQUARTER", "LASTQUARTER - Closing Yield Most Recent Quarter" ),
    LASTYEAR( "LASTYEAR", "LASTYEAR", "LASTYEAR - Closing Yield Most Recent Year" ),
    LONGAVGLIFE( "LONGAVGLIFE", "LONGAVGLIFE", "LONGAVGLIFE - Yield to Longest Average Life" ),
    MARK( "MARK", "MARK", "MARK - Mark to Market Yield" ),
    MATURITY( "MATURITY", "MATURITY", "MATURITY - Yield to Maturity" ),
    NEXTREFUND( "NEXTREFUND", "NEXTREFUND", "NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)" ),
    OPENAVG( "OPENAVG", "OPENAVG", "OPENAVG - Open Average Yield" ),
    PREVCLOSE( "PREVCLOSE", "PREVCLOSE", "PREVCLOSE - Previous Close Yield" ),
    PROCEEDS( "PROCEEDS", "PROCEEDS", "PROCEEDS - Proceeds Yield" ),
    PUT( "PUT", "PUT", "PUT - Yield to Next Put" ),
    SEMIANNUAL( "SEMIANNUAL", "SEMIANNUAL", "SEMIANNUAL - Semi-annual Yield" ),
    SHORTAVGLIFE( "SHORTAVGLIFE", "SHORTAVGLIFE", "SHORTAVGLIFE - Yield to Shortest Average Life" ),
    SIMPLE( "SIMPLE", "SIMPLE", "SIMPLE - Simple Yield" ),
    TAXEQUIV( "TAXEQUIV", "TAXEQUIV", "TAXEQUIV - Tax Equivalent Yield" ),
    TENDER( "TENDER", "TENDER", "TENDER - Yield to Tender Date" ),
    TRUE( "TRUE", "TRUE", "TRUE - True Yield" ),
    VALUE1_32( "VALUE1_32", "VALUE1_32", "VALUE1_32 - Yield Value Of 1/32" ),
    WORST( "WORST", "WORST", "WORST - Yield To Worst" ),
    @Test
    void Tag0235Test() {
        Tag235EnuYieldType tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}