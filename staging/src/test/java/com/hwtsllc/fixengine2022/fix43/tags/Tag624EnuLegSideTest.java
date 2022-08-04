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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.MyEnumSide;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  54 (same as 54, 624,)
 *  Side
 *  char
 *  <p>
 *  Side of order (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  624 (same as 54, 624,)
 *  LegSide
 *  char
 *  <p>
 *  The side of this individual leg (multileg security).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Buy
 *  <p>    2 - Sell
 *  <p>    3 - Buy minus
 *  <p>    4 - Sell plus
 *  <p>    5 - Sell short
 *  <p></p>
 *  <p>    6 - Sell short exempt
 *  <p>    7 - Undisclosed (valid for IOI and List Order messages only)
 *  <p>    8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)
 *  <p>    9 - Cross short
 *  <p></p>
 *  <p>    A - Cross short exxmpt
 *  <p>    B - "As Defined" (for use with multileg instruments)
 *  <p>    C - "Opposite" (for use with multileg instruments)
 *  <p>    D - Subscribe (e.g. CIV)
 *  <p>    E - Redeem (e.g. CIV)
 *  <p></p>
 *  <p>    F - Lend (FINANCING - identifies direction of collateral)
 *  <p>    G - Borrow (FINANCING - identifies direction of collateral)
 */
class Tag624EnuLegSideTest {
    Tag624EnuLegSide tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag624EnuLegSide(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag624EnuLegSide(oneEnum);
            assertEquals( "FIX624_ENU_LEG_SIDE", tagData.toEnumLabelString());
            assertEquals( "624", tagData.toEnumIDString());
            assertEquals( "LEG_SIDE", tagData.toEnumNameString());
            assertEquals( "LegSide", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 1-9 msg types
         */
        tagData = new Tag624EnuLegSide(MyEnumSide.BUY);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.SELL);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.BUY_MINUS);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.SELL_PLUS);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.SELL_SHORT);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag624EnuLegSide(MyEnumSide.SELL_SHORT_EXEMPT);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.UNDISCLOSED);
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.CROSS);
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.CROSS_SHORT);
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        /*
         * A-G msg types
         */
        tagData = new Tag624EnuLegSide(MyEnumSide.CROSS_SHORT_EXEMPT);
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.AS_DEFINED);
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.OPPOSITE);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.SUBSCRIBE);
        assertEquals( "D", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.REDEEM);
        assertEquals( "E", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag624EnuLegSide(MyEnumSide.LEND_FINANCING);
        assertEquals( "F", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag624EnuLegSide(MyEnumSide.BORROW_FINANCING);
        assertEquals( "G", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag624EnuLegSide(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag624EnuLegSide(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag624EnuLegSide(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag624EnuLegSide(oneEnum);
            assertEquals( "Tag624EnuLegSide\n" +
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