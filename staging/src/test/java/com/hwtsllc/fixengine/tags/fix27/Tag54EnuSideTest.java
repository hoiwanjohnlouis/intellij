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

package com.hwtsllc.fixengine.tags.fix27;

import com.hwtsllc.fixengine.datatypes.MyEnumSide;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag54EnuSideTest {
    Tag54EnuSide tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            assertEquals( "FIX54_ENU_SIDE", tagData.toFIXLabelString());
            assertEquals( "SIDE", tagData.toFIXNameString());
            assertEquals( "54", tagData.toFIXIDString());
            assertEquals( "Side", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  54 (same as 54, 624,)
         *  <p>    1 - Buy
         *  <p>    2 - Sell
         *  <p>    3 - Buy minus
         *  <p>    4 - Sell plus
         *  <p>    5 - Sell short
         */
        tagData = new Tag54EnuSide(MyEnumSide.BUY);
        assertEquals("1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.SELL);
        assertEquals("2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.BUY_MINUS);
        assertEquals("3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.SELL_PLUS);
        assertEquals("4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.SELL_SHORT);
        assertEquals("5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Sell short exempt
         *  <p>    7 - Undisclosed (valid for IOI and List Order messages only)
         *  <p>    8 - Cross (orders where counterparty is an exchange, valid for all messages except IOIs)
         *  <p>    9 - Cross short
         */
        tagData = new Tag54EnuSide(MyEnumSide.SELL_SHORT_EXEMPT);
        assertEquals("6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.UNDISCLOSED);
        assertEquals("7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.CROSS);
        assertEquals("8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.CROSS_SHORT);
        assertEquals("9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    A - Cross short exempt
         *  <p>    B - "As Defined" (for use with multileg instruments)
         *  <p>    C - "Opposite" (for use with multileg instruments)
         *  <p>    D - Subscribe (e.g. CIV)
         *  <p>    E - Redeem (e.g. CIV)
         */
        tagData = new Tag54EnuSide(MyEnumSide.CROSS_SHORT_EXEMPT);
        assertEquals("A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.AS_DEFINED);
        assertEquals("B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.OPPOSITE);
        assertEquals("C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.SUBSCRIBE);
        assertEquals("D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.REDEEM);
        assertEquals("E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    F - Lend (FINANCING - identifies direction of collateral)
         *  <p>    G - Borrow (FINANCING - identifies direction of collateral)
         */
        tagData = new Tag54EnuSide(MyEnumSide.LEND_FINANCING);
        assertEquals("F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag54EnuSide(MyEnumSide.BORROW_FINANCING);
        assertEquals("G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            assertEquals( "Tag54EnuSide\n" +
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