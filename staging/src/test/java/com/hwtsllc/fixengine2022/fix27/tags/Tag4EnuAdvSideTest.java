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

import com.hwtsllc.fixengine2022.fix27.enums.Enum4AdvSide;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  4
 *  AdvSide
 *  char
 *  <p></p>
 *  Broker's side of advertised trade
 *  <p></p>
 *  Valid values:
 *  <p>    B - Buy
 *  <p>    S - Sell
 *  <p>    T - Trade
 *  <p>    X - Cross
 */
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
    void Tag0004Test() {
        tagData = new Tag4EnuAdvSide( Enum4AdvSide.BUY);
        assertEquals( "B", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag4EnuAdvSide( Enum4AdvSide.SELL);
        assertEquals( "S", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag4EnuAdvSide( Enum4AdvSide.CROSS);
        assertEquals( "X", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag4EnuAdvSide( Enum4AdvSide.TRADE);
        assertEquals( "T", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( "FIX4_ENU_ADV_SIDE", tagData.toEnumLabelString());
            assertEquals( "ADV_SIDE", tagData.toEnumNameString());
            assertEquals( "4", tagData.toEnumIDString());
            assertEquals( "AdvSide", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum4AdvSide oneEnum : Enum4AdvSide.values()) {
            tagData = new Tag4EnuAdvSide(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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
        }
    }
}