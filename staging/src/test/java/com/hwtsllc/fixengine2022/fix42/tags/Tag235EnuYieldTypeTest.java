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
            assertEquals( "FIX235_ENU_YIELD_TYPE", tagData.toFIXLabelString());
            assertEquals( "235", tagData.toFIXIDString());
            assertEquals( "YIELD_TYPE", tagData.toFIXNameString());
            assertEquals( "YieldType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum235YieldType oneEnum : Enum235YieldType.values()) {
            tagData = new Tag235EnuYieldType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  235
         *  YieldType
         *  String
         *  <p>    "AFTERTAX - After Tax Yield (Municipals)"
         *  <p>    "ANNUAL - Annual Yield"
         *  <p>    "ATISSUE - Yield At Issue (Municipals)"
         *  <p>    "AVGMATURITY - Yield To Avg Maturity"
         *  <p>    "BOOK - Book Yield"
         */
        tagData = new Tag235EnuYieldType(Enum235YieldType.AFTERTAX);
        assertEquals( "AFTERTAX", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.ANNUAL);
        assertEquals( "ANNUAL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.ATISSUE);
        assertEquals( "ATISSUE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.AVGMATURITY);
        assertEquals( "AVGMATURITY", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.BOOK);
        assertEquals( "BOOK", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "CALL - Yield to Next Call"
         *  <p>    "CHANGE - Yield Change Since Close"
         *  <p>    "CLOSE - Closing Yield"
         *  <p>    "COMPOUND - Compound Yield"
         *  <p>    "CURRENT - Current Yield"
         */
        tagData = new Tag235EnuYieldType(Enum235YieldType.CALL);
        assertEquals( "CALL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CHANGE);
        assertEquals( "CHANGE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CLOSE);
        assertEquals( "CLOSE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.COMPOUND);
        assertEquals( "COMPOUND", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.CURRENT);
        assertEquals( "CURRENT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "GOVTEQUIV - Govt Equivalent Yield"
         *  <p>    "GROSS - True Gross Yield"
         *  <p>    "INFLATION - Yield with Inflation Assumption"
         *  <p>    "INVERSEFLOATER - Inverse Floater Bond Yield"
         *  <p>    "LASTCLOSE - Most Recent Closing Yield"
         */
        tagData = new Tag235EnuYieldType(Enum235YieldType.GOVTEQUIV);
        assertEquals( "GOVTEQUIV", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.GROSS);
        assertEquals( "GROSS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.INFLATION);
        assertEquals( "INFLATION", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.INVERSEFLOATER);
        assertEquals( "INVERSEFLOATER", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTCLOSE);
        assertEquals( "LASTCLOSE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "LASTMONTH - Closing Yield Most Recent Month"
         *  <p>    "LASTQUARTER - Closing Yield Most Recent Quarter"
         *  <p>    "LASTYEAR - Closing Yield Most Recent Year"
         *  <p>    "LONGAVGLIFE - Yield to Longest Average Life"
         *  <p>    "MARK - Mark to Market Yield"
         */
        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTMONTH);
        assertEquals( "LASTMONTH", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTQUARTER);
        assertEquals( "LASTQUARTER", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LASTYEAR);
        assertEquals( "LASTYEAR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.LONGAVGLIFE);
        assertEquals( "LONGAVGLIFE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.MARK);
        assertEquals( "MARK", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "MATURITY - Yield to Maturity"
         *  <p>    "NEXTREFUND - Yield to Next Refund (Sinking Fund Bonds)"
         *  <p>    "OPENAVG - Open Average Yield"
         *  <p>    "PREVCLOSE - Previous Close Yield"
         *  <p>    "PROCEEDS - Proceeds Yield"
         */
        tagData = new Tag235EnuYieldType(Enum235YieldType.MATURITY);
        assertEquals( "MATURITY", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.NEXTREFUND);
        assertEquals( "NEXTREFUND", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.OPENAVG);
        assertEquals( "OPENAVG", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.PREVCLOSE);
        assertEquals( "PREVCLOSE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.PROCEEDS);
        assertEquals( "PROCEEDS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "PUT - Yield to Next Put"
         *  <p>    "SEMIANNUAL - Semi-annual Yield"
         *  <p>    "SHORTAVGLIFE - Yield to Shortest Average Life"
         *  <p>    "SIMPLE - Simple Yield"
         *  <p>    "TAXEQUIV - Tax Equivalent Yield"
         */
        tagData = new Tag235EnuYieldType(Enum235YieldType.PUT);
        assertEquals( "PUT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.SEMIANNUAL);
        assertEquals( "SEMIANNUAL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.SHORTAVGLIFE);
        assertEquals( "SHORTAVGLIFE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.SIMPLE);
        assertEquals( "SIMPLE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.TAXEQUIV);
        assertEquals( "TAXEQUIV", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "TENDER - Yield to Tender Date"
         *  <p>    "TRUE - True Yield"
         *  <p>    "VALUE1_32 - Yield Value Of 1/32"
         *  <p>    "WORST - Yield To Worst"
         */
        tagData = new Tag235EnuYieldType(Enum235YieldType.TENDER);
        assertEquals( "TENDER", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.TRUE);
        assertEquals( "TRUE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.VALUE1_32);
        assertEquals( "VALUE1_32", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag235EnuYieldType(Enum235YieldType.WORST);
        assertEquals( "WORST", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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