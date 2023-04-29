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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.enums.fix27.Enum4AdvSide;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag4EnuAdvSideTest {
    Tag4EnuAdvSide tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( "FIX4_ENU_ADV_SIDE", tagData.toFIXLabelString());
            assertEquals( "ADV_SIDE", tagData.toFIXNameString());
            assertEquals( "4", tagData.toFIXIDString());
            assertEquals( "AdvSide", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  4
         *  <p>    B - Buy
         *  <p>    S - Sell
         *  <p>    T - Trade
         *  <p>    X - Cross
         */
        tagData = new Tag4EnuAdvSide( Enum4AdvSide.BUY);
        assertEquals( "B", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag4EnuAdvSide( Enum4AdvSide.SELL);
        assertEquals( "S", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag4EnuAdvSide( Enum4AdvSide.CROSS);
        assertEquals( "X", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag4EnuAdvSide( Enum4AdvSide.TRADE);
        assertEquals( "T", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( "Tag4EnuAdvSide\n" +
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
        }
    }
}