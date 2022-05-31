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
import com.hwtsllc.fixengine2022.fix42.enums.Enum258TradedFlatSwitch;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  258
 *  TradedFlatSwitch
 *  Boolean
 *  <p>
 *  Driver and part of trade in the event that the Security Master file was wrong at the point of entry
 *  <p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  Valid values:
 *  <p>    N - Not Traded Flat
 *  <p>    Y - Traded Flat
 */
class Tag258EnuTradedFlatSwitchTest {
    @Test
    void FIX0258Test() {
        FIX42 fixData = FIX42.FIX258_ENU_TRADED_FLAT_SWITCH;
        assertEquals( "258", fixData.toFIXIDString());
        assertEquals( "TRADED_FLAT_SWITCH", fixData.toFIXNameString());
        assertEquals( "TradedFlatSwitch", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0258Test() {
        Tag258EnuTradedFlatSwitch tagData;

        tagData = new Tag258EnuTradedFlatSwitch(Enum258TradedFlatSwitch.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag258EnuTradedFlatSwitch(Enum258TradedFlatSwitch.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag258EnuTradedFlatSwitch tagData;

        // loop around the ENUM and process
        for (Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag258EnuTradedFlatSwitch tagData;

        // loop around the ENUM and process
        for (Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag258EnuTradedFlatSwitch tagData;

        // loop around the ENUM and process
        for (Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag258EnuTradedFlatSwitch tagData;

        // loop around the ENUM and process
        for (Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag258EnuTradedFlatSwitch tagData;

        // loop around the ENUM and process
        for (Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            assertEquals( "Tag258EnuTradedFlatSwitch\n" +
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