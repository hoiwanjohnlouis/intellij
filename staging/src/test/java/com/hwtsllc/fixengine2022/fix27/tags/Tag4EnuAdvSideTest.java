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
import com.hwtsllc.fixengine2022.fix27.enums.Enum4AdvSide;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  4
 *  AdvSide
 *  char
 *  Broker's side of advertised trade
 *  Valid values:
 *      B - Buy
 *      S - Sell
 *      T - Trade
 *      X - Cross
 */
class Tag4EnuAdvSideTest {
    @Test
    void FIX0004Test() {
        FIX27 fixData = FIX27.FIX4_ENU_ADV_SIDE;
        assertEquals( "ADV_SIDE", fixData.toFIXNameString());
        assertEquals( "4", fixData.toFIXIDString());
        assertEquals( "AdvSide", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag4EnuAdvSide tagData;

        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag4EnuAdvSide tagData;

        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( oneEnum.toFIXIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag4EnuAdvSide tagData;

        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( "4=" + oneEnum.toFIXIDString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag4EnuAdvSide tagData;

        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( "Tag4EnuAdvSide\n" +
                    "\tEnumName[FIX4_ENU_ADV_SIDE]\n" +
                    "\tFIXID[4]\n" +
                    "\tFIXName[ADV_SIDE]\n" +
                    "\tFIXDescription[AdvSide]\n" +
                    "\tDataValue[" + oneEnum.toFIXIDString() + "]\n" +
                    "\tValuePair[4=" + oneEnum.toFIXIDString() + "]\n" +
                    "\tDataID[" + oneEnum.toFIXIDString() + "]\n" +
                    "\tDataName[" + oneEnum.toFIXNameString() + "]\n" +
                    "\tDataDescription[" + oneEnum.toFIXDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag4EnuAdvSide tagData;

        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( oneEnum.toFIXIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
}