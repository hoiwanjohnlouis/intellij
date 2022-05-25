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

/**
 *  235
 *  YieldType
 *  String
 *  <p>
 *  Type of yield. (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  Valid values:
 *  <p>    "AFTERTAX - After Tax Yield (Municipals)"
 *  <p>    "ANNUAL - Annual Yield"
 *  <p>    "ATISSUE - Yield At Issue (Municipals)"
 *  <p>    "AVGMATURITY - Yield To Avg Maturity"
 *  <p>    "BOOK - Book Yield"
 *  <p></p>
 *  <p>    "CALL - Yield to Next Call"
 *  <p>    "CHANGE - Yield Change Since Close"
 *  <p>    "CLOSE - Closing Yield"
 *  <p>    "COMPOUND - Compound Yield"
 *  <p>    "CURRENT - Current Yield"
 *  <p></p>
 *  <p>    "GOVTEQUIV - Gvnt Equivalent Yield"
 *  <p>    "GROSS - True Gross Yield"
 *  <p>    "INFLATION - Yield with Inflation Assumption"
 *  <p>    "INVERSEFLOATER - Inverse Floater Bond Yield"
 *  <p>    "LASTCLOSE - Most Recent Closing Yield"
 *  <p></p>
 *  <p>    "LASTMONTH - Closing Yield Most Recent Month"
 *  <p>    "LASTQUARTER - Closing Yield Most Recent Quarter"
 *  <p>    "LASTYEAR - Closing Yield Most Recent Year"
 *  <p>    "LONGAVGLIFE - Yield to Longest Average Life"
 *  <p>    "MARK - Mark to Market Yield"
 *  <p></p>
 *  <p>    "MATURITY - Yield to Maturity"
 *  <p>    "NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)"
 *  <p>    "OPENAVG - Open Average Yield"
 *  <p>    "PREVCLOSE - Previous Close Yield"
 *  <p>    "PROCEEDS - Proceeds Yield"
 *  <p></p>
 *  <p>    "PUT - Yield to Next Put"
 *  <p>    "SEMIANNUAL - Semi-annual Yield"
 *  <p>    "SHORTAVGLIFE - Yield to Shortest Average Life"
 *  <p>    "SIMPLE - Simple Yield"
 *  <p>    "TAXEQUIV - Tax Equivalent Yield"
 *  <p></p>
 *  <p>    "TENDER - Yield to Tender Date"
 *  <p>    "TRUE - True Yield"
 *  <p>    "VALUE1_32 - Yield Value Of 1/32"
 *  <p>    "WORST - Yield To Worst"
 */
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