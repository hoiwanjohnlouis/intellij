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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.fix44.enums.Enum780AllocSettlInstType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  780
 *  AllocSettlInstType
 *  int
 *  <p></p>
 *  Used to indicate whether settlement instructions are provided on an
 *  allocation instruction message, and if not, how they are to be derived.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Use default instructions
 *  <p>    1 - Derive from parameters provided
 *  <p>    2 - Full details provided
 *  <p>    3 - SSI DB IDs provided
 *  <p>    4 - Phone for instructions
 */
class Tag780EnuAllocSettlInstTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX780_ENU_ALLOC_SETTL_INST_TYPE;
        assertEquals( "780", fixData.toFIXIDString());
        assertEquals( "ALLOC_SETTL_INST_TYPE", fixData.toFIXNameString());
        assertEquals( "AllocSettlInstType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0780Test() {
        Tag780EnuAllocSettlInstType tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.USE_DEFAULTS );
        assertEquals( Enum780AllocSettlInstType.USE_DEFAULTS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "780", fixData.toFIXIDString());
        assertEquals( "ALLOC_SETTL_INST_TYPE", fixData.toFIXNameString());
        assertEquals( "AllocSettlInstType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS );
        assertEquals( Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.FULL_DETAILS );
        assertEquals( Enum780AllocSettlInstType.FULL_DETAILS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.SSI_DB_ID_PROVIDED );
        assertEquals( Enum780AllocSettlInstType.SSI_DB_ID_PROVIDED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag780EnuAllocSettlInstType( Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS );
        assertEquals( Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag780EnuAllocSettlInstType tagData;

        // loop around the ENUM and process
        for ( Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag780EnuAllocSettlInstType tagData;

        // loop around the ENUM and process
        for (Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag780EnuAllocSettlInstType tagData;

        // loop around the ENUM and process
        for (Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag780EnuAllocSettlInstType tagData;

        // loop around the ENUM and process
        for (Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag780EnuAllocSettlInstType tagData;

        // loop around the ENUM and process
        for (Enum780AllocSettlInstType oneEnum : Enum780AllocSettlInstType.values()) {
            tagData = new Tag780EnuAllocSettlInstType(oneEnum);
            assertEquals( "Tag780EnuAllocSettlInstType\n" +
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