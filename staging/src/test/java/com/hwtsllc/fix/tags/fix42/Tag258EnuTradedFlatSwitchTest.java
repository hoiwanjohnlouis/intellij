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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.enums.fix42.Enum258TradedFlatSwitch;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag258EnuTradedFlatSwitchTest {
    Tag258EnuTradedFlatSwitch tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            assertEquals( "FIX258_ENU_TRADED_FLAT_SWITCH", tagData.toFIXLabelString());
            assertEquals( "258", tagData.toFIXIDString());
            assertEquals( "TRADED_FLAT_SWITCH", tagData.toFIXNameString());
            assertEquals( "TradedFlatSwitch", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  258
         *  TradedFlatSwitch
         *  Boolean
         *  <p>    N - Not Traded Flat
         *  <p>    Y - Traded Flat
         */
        tagData = new Tag258EnuTradedFlatSwitch(Enum258TradedFlatSwitch.NO);
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag258EnuTradedFlatSwitch(Enum258TradedFlatSwitch.YES);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            tagData = new Tag258EnuTradedFlatSwitch(oneEnum);
            assertEquals( "Tag258EnuTradedFlatSwitch\n" +
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