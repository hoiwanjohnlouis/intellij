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
import com.hwtsllc.fixengine2022.fix44.enums.Enum797CopyMsgIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  797
 *  CopyMsgIndicator
 *  Boolean
 *  <p></p>
 *  Indicates whether this message is a drop copy of another message.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Regular Message
 *  <p>    Y - Drop Copy Message
 */
class Tag797EnuCopyMsgIndicatorTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX797_ENU_COPY_MSG_INDICATOR;
        assertEquals( "797", fixData.toFIXIDString());
        assertEquals( "COPY_MSG_INDICATOR", fixData.toFIXNameString());
        assertEquals( "CopyMsgIndicator", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0797Test() {
        Tag797EnuCopyMsgIndicator tagData;
        Enum797CopyMsgIndicator oneElement;

        oneElement = Enum797CopyMsgIndicator.NO;
        tagData = new Tag797EnuCopyMsgIndicator( oneElement );
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "797", tagData.toFIXIDString());
        assertEquals( "COPY_MSG_INDICATOR", tagData.toFIXNameString());
        assertEquals( "CopyMsgIndicator", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag797EnuCopyMsgIndicator( Enum797CopyMsgIndicator.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag797EnuCopyMsgIndicator tagData;

        // loop around the ENUM and process
        for ( Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag797EnuCopyMsgIndicator tagData;

        // loop around the ENUM and process
        for (Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag797EnuCopyMsgIndicator tagData;

        // loop around the ENUM and process
        for (Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag797EnuCopyMsgIndicator tagData;

        // loop around the ENUM and process
        for (Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag797EnuCopyMsgIndicator tagData;

        // loop around the ENUM and process
        for (Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            assertEquals( "Tag797EnuCopyMsgIndicator\n" +
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