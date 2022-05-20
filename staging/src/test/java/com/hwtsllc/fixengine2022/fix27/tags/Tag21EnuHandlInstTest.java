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
import com.hwtsllc.fixengine2022.fix27.enums.Enum21HandlInst;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  21
 *  HandlInst
 *  char
 *  Instructions for order handling on Broker trading floor
 *  Valid values:
 *      1 - Automated execution order, private, no Broker intervention
 *      2 - Automated execution order, public, Broker intervention OK
 *      3 - Manual order, best execution
 */
class Tag21EnuHandlInstTest {
    @Test
    void FIX0021Test() {
        FIX27 fixData = FIX27.FIX21_ENU_HANDL_INST;
        assertEquals( "HANDL_INST", fixData.toFIXNameString());
        assertEquals( "21", fixData.toFIXIDString());
        assertEquals( "HandlInst", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0021Test() {
        Tag21EnuHandlInst tagData;

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
    void PrintFIXTagTest() {
        Tag21EnuHandlInst tagData;

        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag21EnuHandlInst tagData;

        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag21EnuHandlInst tagData;

        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag21EnuHandlInst tagData;

        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag21EnuHandlInst tagData;

        // loop around the ENUM and process
        for (Enum21HandlInst oneEnum : Enum21HandlInst.values()) {
            tagData = new Tag21EnuHandlInst(oneEnum);
            assertEquals( "Tag21EnuHandlInst\n" +
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