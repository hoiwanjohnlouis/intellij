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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.ENum980SecurityUpdateAction;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  980
 *  SecurityUpdateAction
 *  char
 *
 *  <p></p>
 *  Valid values:
 *  <p>    A - Add
 *  <p>    D - Delete
 *  <p>    M - Modify
 */
class Tag980EnuSecurityUpdateActionTest {
    @Test
    void FIX0980Test() {
        FIX50 fixData = FIX50.FIX980_ENU_SECURITY_UPDATE_ACTION;
        assertEquals( "980", fixData.toFIXIDString());
        assertEquals( "SECURITY_UPDATE_ACTION", fixData.toFIXNameString());
        assertEquals( "SecurityUpdateAction", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0980Test() {
        Tag980EnuSecurityUpdateAction tagData;

        tagData = new Tag980EnuSecurityUpdateAction( ENum980SecurityUpdateAction.ADD );
        assertEquals( ENum980SecurityUpdateAction.ADD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag980EnuSecurityUpdateAction( ENum980SecurityUpdateAction.DELETE );
        assertEquals( ENum980SecurityUpdateAction.DELETE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag980EnuSecurityUpdateAction( ENum980SecurityUpdateAction.MODIFY );
        assertEquals( ENum980SecurityUpdateAction.MODIFY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag980EnuSecurityUpdateAction tagData;

        // loop around the ENUM and process
        for ( ENum980SecurityUpdateAction oneEnum : ENum980SecurityUpdateAction.values()) {
            tagData = new Tag980EnuSecurityUpdateAction(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag980EnuSecurityUpdateAction tagData;

        // loop around the ENUM and process
        for (ENum980SecurityUpdateAction oneEnum : ENum980SecurityUpdateAction.values()) {
            tagData = new Tag980EnuSecurityUpdateAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag980EnuSecurityUpdateAction tagData;

        // loop around the ENUM and process
        for (ENum980SecurityUpdateAction oneEnum : ENum980SecurityUpdateAction.values()) {
            tagData = new Tag980EnuSecurityUpdateAction(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag980EnuSecurityUpdateAction tagData;

        // loop around the ENUM and process
        for (ENum980SecurityUpdateAction oneEnum : ENum980SecurityUpdateAction.values()) {
            tagData = new Tag980EnuSecurityUpdateAction(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag980EnuSecurityUpdateAction tagData;

        // loop around the ENUM and process
        for (ENum980SecurityUpdateAction oneEnum : ENum980SecurityUpdateAction.values()) {
            tagData = new Tag980EnuSecurityUpdateAction(oneEnum);
            assertEquals( "Tag980EnuSecurityUpdateAction\n" +
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