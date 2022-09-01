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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.fix50.enums.Enum1094PegPriceType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag1094EnuPegPriceTypeTest {
    Tag1094EnuPegPriceType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum1094PegPriceType oneEnum : Enum1094PegPriceType.values()) {
            tagData = new Tag1094EnuPegPriceType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum1094PegPriceType oneEnum : Enum1094PegPriceType.values()) {
            tagData = new Tag1094EnuPegPriceType(oneEnum);
            assertEquals( "FIX1094_ENU_PEG_PRICE_TYPE", tagData.toFIXLabelString());
            assertEquals( "1094", tagData.toEnumIDString());
            assertEquals( "PEG_PRICE_TYPE", tagData.toEnumNameString());
            assertEquals( "PegPriceType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum1094PegPriceType oneEnum : Enum1094PegPriceType.values()) {
            tagData = new Tag1094EnuPegPriceType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  1094
         *  PegPriceType
         *  int
         *  <p>    1 - Last peg (last sale)
         *  <p>    2 - Mid-price peg (midprice of inside quote)
         *  <p>    3 - Opening peg
         *  <p>    4 - Market peg
         *  <p>    5 - Primary peg (primary market - buy at bid or sell at offer)
         */
        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.LAST_PEG );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.MID_PEG );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.OPENING_PEG );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.MARKET_PEG );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.PRIMARY_PEG );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Fixed Peg to Local best bid or offer at time of order
         *  <p>    7 - Peg to VWAP
         *  <p>    8 - Trailing Stop Peg
         *  <p>    9 - Peg to Limit Price
         */
        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.FIXED_PEG );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.PEG_TO_VWAP );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.TRAILING_STOP );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag1094EnuPegPriceType( Enum1094PegPriceType.PEG_TO_LIMIT );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum1094PegPriceType oneEnum : Enum1094PegPriceType.values()) {
            tagData = new Tag1094EnuPegPriceType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum1094PegPriceType oneEnum : Enum1094PegPriceType.values()) {
            tagData = new Tag1094EnuPegPriceType(oneEnum);
            assertEquals( "Tag1094EnuPegPriceType\n" +
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