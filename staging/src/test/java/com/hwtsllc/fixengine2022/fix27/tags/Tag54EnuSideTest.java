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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
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
class Tag54EnuSideTest {
    @Test
    void FIX0054Test() {
        FIX27 fixData = FIX27.FIX54_ENU_SIDE;
        assertEquals( "SIDE", fixData.toFIXNameString());
        assertEquals( "54", fixData.toFIXIDString());
        assertEquals( "Side", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0054Test() {
        Tag54EnuSide tagData;


        /*
         * 1-9 msg types
         */
        tagData = new Tag54EnuSide(MyEnumSide.BUY);
        assertEquals(MyEnumSide.BUY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.SELL);
        assertEquals(MyEnumSide.SELL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.BUY_MINUS);
        assertEquals(MyEnumSide.BUY_MINUS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.SELL_PLUS);
        assertEquals(MyEnumSide.SELL_PLUS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.SELL_SHORT);
        assertEquals(MyEnumSide.SELL_SHORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag54EnuSide(MyEnumSide.SELL_SHORT_EXEMPT);
        assertEquals(MyEnumSide.SELL_SHORT_EXEMPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.UNDISCLOSED);
        assertEquals(MyEnumSide.UNDISCLOSED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.CROSS);
        assertEquals(MyEnumSide.CROSS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.CROSS_SHORT);
        assertEquals(MyEnumSide.CROSS_SHORT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());



        /*
         * A-G msg types
         */
        tagData = new Tag54EnuSide(MyEnumSide.CROSS_SHORT_EXEMPT);
        assertEquals(MyEnumSide.CROSS_SHORT_EXEMPT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.AS_DEFINED);
        assertEquals(MyEnumSide.AS_DEFINED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.OPPOSITE);
        assertEquals(MyEnumSide.OPPOSITE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.SUBSCRIBE);
        assertEquals(MyEnumSide.SUBSCRIBE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.REDEEM);
        assertEquals(MyEnumSide.REDEEM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag54EnuSide(MyEnumSide.LEND_FINANCING);
        assertEquals(MyEnumSide.LEND_FINANCING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag54EnuSide(MyEnumSide.BORROW_FINANCING);
        assertEquals(MyEnumSide.BORROW_FINANCING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag54EnuSide tagData;

        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag54EnuSide tagData;

        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag54EnuSide tagData;

        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag54EnuSide tagData;

        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag54EnuSide tagData;

        // loop around the ENUM and process
        for (MyEnumSide oneEnum : MyEnumSide.values()) {
            tagData = new Tag54EnuSide(oneEnum);
            assertEquals( "Tag54EnuSide\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}