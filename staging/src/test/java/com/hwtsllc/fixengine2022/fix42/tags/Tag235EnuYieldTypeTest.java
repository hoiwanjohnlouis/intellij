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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum235YieldType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag235EnuYieldTypeTest {
    @Test
    void FIX0235Test() {
        FIX42 fixData = FIX42.FIX235_ENU_YIELD_TYPE;
        assertEquals( "235", fixData.toFIXIDString());
        assertEquals( "YIELD_TYPE", fixData.toFIXNameString());
        assertEquals( "YieldType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    /**
     *  235
     *  YieldType
     *  various msg types
     *      "AFTERTAX - After Tax Yield (Municipals)"
     *      "ANNUAL - Annual Yield"
     *      "ATISSUE - Yield At Issue (Municipals)"
     *      "AVGMATURITY - Yield To Avg Maturity"
     *      "BOOK - Book Yield"
     *      "CALL - Yield to Next Call"
     *      "CHANGE - Yield Change Since Close"
     *      "CLOSE - Closing Yield"
     *      "COMPOUND - Compound Yield"
     *      "CURRENT - Current Yield"
     *      "GOVTEQUIV - Gvnt Equivalent Yield"
     *      "GROSS - True Gross Yield"
     *      "INFLATION - Yield with Inflation Assumption"
     *      "INVERSEFLOATER - Inverse Floater Bond Yield"
     *      "LASTCLOSE - Most Recent Closing Yield"
     *      "LASTMONTH - Closing Yield Most Recent Month"
     *      "LASTQUARTER - Closing Yield Most Recent Quarter"
     *      "LASTYEAR - Closing Yield Most Recent Year"
     *      "LONGAVGLIFE - Yield to Longest Average Life"
     *      "MARK - Mark to Market Yield"
     *      "MATURITY - Yield to Maturity"
     *      "NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)"
     *      "OPENAVG - Open Average Yield"
     *      "PREVCLOSE - Previous Close Yield"
     *      "PROCEEDS - Proceeds Yield"
     *      "PUT - Yield to Next Put"
     *      "SEMIANNUAL - Semi-annual Yield"
     *      "SHORTAVGLIFE - Yield to Shortest Average Life"
     *      "SIMPLE - Simple Yield"
     *      "TAXEQUIV - Tax Equivalent Yield"
     *      "TENDER - Yield to Tender Date"
     *      "TRUE - True Yield"
     *      "VALUE1_32 - Yield Value Of 1/32"
     *      "WORST - Yield To Worst"
     */
    @Test
    void Tag0235Test() {
        Tag235EnuYieldType tagData;

        tagData = new Tag235EnuYieldType(Enum235YieldType.AFTERTAX);
        assertEquals( Enum235YieldType.AFTERTAX.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.ANNUAL);
        assertEquals( Enum235YieldType.ANNUAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.ATISSUE);
        assertEquals( Enum235YieldType.ATISSUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.AVGMATURITY);
        assertEquals( Enum235YieldType.AVGMATURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.BOOK);
        assertEquals( Enum235YieldType.BOOK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CALL);
        assertEquals( Enum235YieldType.CALL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CHANGE);
        assertEquals( Enum235YieldType.CHANGE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CLOSE);
        assertEquals( Enum235YieldType.CLOSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.COMPOUND);
        assertEquals( Enum235YieldType.COMPOUND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CURRENT);
        assertEquals( Enum235YieldType.CURRENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.GOVTEQUIV);
        assertEquals( Enum235YieldType.GOVTEQUIV.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.GROSS);
        assertEquals( Enum235YieldType.GROSS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.INFLATION);
        assertEquals( Enum235YieldType.INFLATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.INVERSEFLOATER);
        assertEquals( Enum235YieldType.INVERSEFLOATER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTCLOSE);
        assertEquals( Enum235YieldType.LASTCLOSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTMONTH);
        assertEquals( Enum235YieldType.LASTMONTH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTQUARTER);
        assertEquals( Enum235YieldType.LASTQUARTER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTYEAR);
        assertEquals( Enum235YieldType.LASTYEAR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LONGAVGLIFE);
        assertEquals( Enum235YieldType.LONGAVGLIFE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.MARK);
        assertEquals( Enum235YieldType.MARK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.MATURITY);
        assertEquals( Enum235YieldType.MATURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.NEXTREFUND);
        assertEquals( Enum235YieldType.NEXTREFUND.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.OPENAVG);
        assertEquals( Enum235YieldType.OPENAVG.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.PREVCLOSE);
        assertEquals( Enum235YieldType.PREVCLOSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.PROCEEDS);
        assertEquals( Enum235YieldType.PROCEEDS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.PUT);
        assertEquals( Enum235YieldType.PUT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.SEMIANNUAL);
        assertEquals( Enum235YieldType.SEMIANNUAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.SHORTAVGLIFE);
        assertEquals( Enum235YieldType.SHORTAVGLIFE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.SIMPLE);
        assertEquals( Enum235YieldType.SIMPLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.TAXEQUIV);
        assertEquals( Enum235YieldType.TAXEQUIV.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.TENDER);
        assertEquals( Enum235YieldType.TENDER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.TRUE);
        assertEquals( Enum235YieldType.TRUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.VALUE1_32);
        assertEquals( Enum235YieldType.VALUE1_32.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.WORST);
        assertEquals( Enum235YieldType.WORST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}