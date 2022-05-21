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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.fix40.enums.Bool121ForexReq;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  121
 *  ForexReq
 *  Boolean
 *  Indicates request for forex accommodation trade
 *  to be executed along with security transaction.
 *  Valid values:
 *      N - Do Not Execute Forex After Security Trade
 *      Y - Execute Forex After Security Trade
 */
class Tag121BoolForexReqTest {
    @Test
    void FIX0121Test() {
        FIX40 fixData = FIX40.FIX121_BOOL_FOREX_REQ;
        assertEquals( "FOREX_REQ", fixData.toFIXNameString());
        assertEquals( "121", fixData.toFIXIDString());
        assertEquals( "ForexReq", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0121Test() {
        Tag121BoolForexReq tagData;

        tagData = new Tag121BoolForexReq(Bool121ForexReq.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag121BoolForexReq(Bool121ForexReq.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag121BoolForexReq tagData;

        // loop around the ENUM and process
        for (Bool121ForexReq oneEnum : Bool121ForexReq.values()) {
            tagData = new Tag121BoolForexReq(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag121BoolForexReq tagData;

        // loop around the ENUM and process
        for (Bool121ForexReq oneEnum : Bool121ForexReq.values()) {
            tagData = new Tag121BoolForexReq(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag121BoolForexReq tagData;

        // loop around the ENUM and process
        for (Bool121ForexReq oneEnum : Bool121ForexReq.values()) {
            tagData = new Tag121BoolForexReq(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag121BoolForexReq tagData;

        // loop around the ENUM and process
        for (Bool121ForexReq oneEnum : Bool121ForexReq.values()) {
            tagData = new Tag121BoolForexReq(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag121BoolForexReq tagData;

        // loop around the ENUM and process
        for (Bool121ForexReq oneEnum : Bool121ForexReq.values()) {
            tagData = new Tag121BoolForexReq(oneEnum);
            assertEquals( "Tag121BoolForexReq\n" +
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