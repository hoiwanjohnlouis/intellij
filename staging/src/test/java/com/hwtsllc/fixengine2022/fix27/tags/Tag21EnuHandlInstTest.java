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

import com.hwtsllc.fixengine2022.fix27.enums.Enum21HandlInst;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  21
 *  HandlInst
 *  char
 *  <p></p>
 *  Instructions for order handling on Broker trading floor
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Automated execution order, private, no Broker intervention
 *  <p>    2 - Automated execution order, public, Broker intervention OK
 *  <p>    3 - Manual order, best execution
 */
class Tag21EnuHandlInstTest {
    Tag21EnuHandlInst tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void Tag0021Test() {
        tagData = new Tag21EnuHandlInst(Enum21HandlInst.AUTOMATIC_EXECUTION_NO_BROKER);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag21EnuHandlInst(Enum21HandlInst.AUTOMATIC_EXECUTION_BROKER_OKAY);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag21EnuHandlInst(Enum21HandlInst.MANUAL_ORDER_BEST_EXECUTION);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            assertEquals( "FIX21_ENU_HANDL_INST", tagData.toEnumLabelString());
            assertEquals( "HANDL_INST", tagData.toEnumNameString());
            assertEquals( "21", tagData.toEnumIDString());
            assertEquals( "HandlInst", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            assertEquals( "Tag21EnuHandlInst\n" +
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