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
import com.hwtsllc.fixengine2022.fix44.enums.Enum666ConfirmTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  666
 *  ConfirmTransType
 *  int
 *  <p></p>
 *  Identifies the Confirmation transaction type.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Replace
 *  <p>    2 - Cancel
 */
class Tag666EnuConfirmTransTypeTest {
    @Test
    void FIX0666Test() {
        FIX44 fixData = FIX44.FIX666_ENU_CONFIRM_TRANS_TYPE;
        assertEquals( "666", fixData.toFIXIDString());
        assertEquals( "CONFIRM_TRANS_TYPE", fixData.toFIXNameString());
        assertEquals( "ConfirmTransType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0666Test() {
        Tag666EnuConfirmTransType tagData;

        tagData = new Tag666EnuConfirmTransType(Enum666ConfirmTransType.NEW);
        assertEquals( Enum666ConfirmTransType.NEW.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag666EnuConfirmTransType(Enum666ConfirmTransType.REPLACE);
        assertEquals( Enum666ConfirmTransType.REPLACE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag666EnuConfirmTransType(Enum666ConfirmTransType.CANCEL);
        assertEquals( Enum666ConfirmTransType.CANCEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for ( Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for (Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for (Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for (Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag666EnuConfirmTransType tagData;

        // loop around the ENUM and process
        for (Enum666ConfirmTransType oneEnum : Enum666ConfirmTransType.values()) {
            tagData = new Tag666EnuConfirmTransType(oneEnum);
            assertEquals( "Tag666EnuConfirmTransType\n" +
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