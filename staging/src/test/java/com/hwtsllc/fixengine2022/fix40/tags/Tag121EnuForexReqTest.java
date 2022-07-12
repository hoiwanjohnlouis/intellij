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

import com.hwtsllc.fixengine2022.fix40.enums.Enum121ForexReq;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  121
 *  ForexReq
 *  Boolean
 *  <p></p>
 *  Indicates request for forex accommodation trade to be executed along with security transaction.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Do Not Execute Forex After Security Trade
 *  <p>    Y - Execute Forex After Security Trade
 */
class Tag121EnuForexReqTest {
    @Test
    void PrintFIXTagTest() {
        Tag121EnuForexReq tagData;

        // loop around the ENUM and process
        for (Enum121ForexReq oneEnum : Enum121ForexReq.values()) {
            tagData = new Tag121EnuForexReq(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXTest() {
        Tag121EnuForexReq tagData;

        // loop around the ENUM and process
        for (Enum121ForexReq oneEnum : Enum121ForexReq.values()) {
            tagData = new Tag121EnuForexReq(oneEnum);
            assertEquals( "FIX121_ENU_FOREX_REQ", tagData.toEnumLabelString());
            assertEquals( "FOREX_REQ", tagData.toEnumNameString());
            assertEquals( "121", tagData.toEnumIDString());
            assertEquals( "ForexReq", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag121EnuForexReq tagData;

        tagData = new Tag121EnuForexReq(Enum121ForexReq.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag121EnuForexReq(Enum121ForexReq.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum121ForexReq oneEnum : Enum121ForexReq.values()) {
            tagData = new Tag121EnuForexReq(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag121EnuForexReq tagData;

        // loop around the ENUM and process
        for (Enum121ForexReq oneEnum : Enum121ForexReq.values()) {
            tagData = new Tag121EnuForexReq(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag121EnuForexReq tagData;

        // loop around the ENUM and process
        for (Enum121ForexReq oneEnum : Enum121ForexReq.values()) {
            tagData = new Tag121EnuForexReq(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag121EnuForexReq tagData;

        // loop around the ENUM and process
        for (Enum121ForexReq oneEnum : Enum121ForexReq.values()) {
            tagData = new Tag121EnuForexReq(oneEnum);
            assertEquals( "Tag121EnuForexReq\n" +
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