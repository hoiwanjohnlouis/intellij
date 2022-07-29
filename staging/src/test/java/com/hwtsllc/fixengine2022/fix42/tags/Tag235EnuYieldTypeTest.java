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

import com.hwtsllc.fixengine2022.fix42.enums.Enum235YieldType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
    Tag235EnuYieldType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum235YieldType oneEnum : Enum235YieldType.values()) {
            tagData = new Tag235EnuYieldType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum235YieldType oneEnum : Enum235YieldType.values()) {
            tagData = new Tag235EnuYieldType(oneEnum);
            assertEquals( "FIX235_ENU_YIELD_TYPE", tagData.toEnumLabelString());
            assertEquals( "235", tagData.toEnumIDString());
            assertEquals( "YIELD_TYPE", tagData.toEnumNameString());
            assertEquals( "YieldType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        tagData = new Tag235EnuYieldType(Enum235YieldType.AFTERTAX);
        assertEquals( Enum235YieldType.AFTERTAX.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.ANNUAL);
        assertEquals( Enum235YieldType.ANNUAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.ATISSUE);
        assertEquals( Enum235YieldType.ATISSUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.AVGMATURITY);
        assertEquals( Enum235YieldType.AVGMATURITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.BOOK);
        assertEquals( Enum235YieldType.BOOK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CALL);
        assertEquals( Enum235YieldType.CALL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CHANGE);
        assertEquals( Enum235YieldType.CHANGE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CLOSE);
        assertEquals( Enum235YieldType.CLOSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.COMPOUND);
        assertEquals( Enum235YieldType.COMPOUND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CURRENT);
        assertEquals( Enum235YieldType.CURRENT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.GOVTEQUIV);
        assertEquals( Enum235YieldType.GOVTEQUIV.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.GROSS);
        assertEquals( Enum235YieldType.GROSS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.INFLATION);
        assertEquals( Enum235YieldType.INFLATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.INVERSEFLOATER);
        assertEquals( Enum235YieldType.INVERSEFLOATER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTCLOSE);
        assertEquals( Enum235YieldType.LASTCLOSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTMONTH);
        assertEquals( Enum235YieldType.LASTMONTH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTQUARTER);
        assertEquals( Enum235YieldType.LASTQUARTER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTYEAR);
        assertEquals( Enum235YieldType.LASTYEAR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LONGAVGLIFE);
        assertEquals( Enum235YieldType.LONGAVGLIFE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.MARK);
        assertEquals( Enum235YieldType.MARK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.MATURITY);
        assertEquals( Enum235YieldType.MATURITY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.NEXTREFUND);
        assertEquals( Enum235YieldType.NEXTREFUND.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.OPENAVG);
        assertEquals( Enum235YieldType.OPENAVG.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.PREVCLOSE);
        assertEquals( Enum235YieldType.PREVCLOSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.PROCEEDS);
        assertEquals( Enum235YieldType.PROCEEDS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.PUT);
        assertEquals( Enum235YieldType.PUT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.SEMIANNUAL);
        assertEquals( Enum235YieldType.SEMIANNUAL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.SHORTAVGLIFE);
        assertEquals( Enum235YieldType.SHORTAVGLIFE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.SIMPLE);
        assertEquals( Enum235YieldType.SIMPLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.TAXEQUIV);
        assertEquals( Enum235YieldType.TAXEQUIV.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.TENDER);
        assertEquals( Enum235YieldType.TENDER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.TRUE);
        assertEquals( Enum235YieldType.TRUE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.VALUE1_32);
        assertEquals( Enum235YieldType.VALUE1_32.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag235EnuYieldType(Enum235YieldType.WORST);
        assertEquals( Enum235YieldType.WORST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum235YieldType oneEnum : Enum235YieldType.values()) {
            tagData = new Tag235EnuYieldType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum235YieldType oneEnum : Enum235YieldType.values()) {
            tagData = new Tag235EnuYieldType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum235YieldType oneEnum : Enum235YieldType.values()) {
            tagData = new Tag235EnuYieldType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum235YieldType oneEnum : Enum235YieldType.values()) {
            tagData = new Tag235EnuYieldType(oneEnum);
            assertEquals( "Tag235EnuYieldType\n" +
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