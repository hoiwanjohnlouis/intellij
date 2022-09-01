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

import com.hwtsllc.fixengine2022.fix44.enums.Enum797CopyMsgIndicator;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag797EnuCopyMsgIndicatorTest {
    Tag797EnuCopyMsgIndicator tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            assertEquals( "FIX797_ENU_COPY_MSG_INDICATOR", tagData.toFIXLabelString());
            assertEquals( "797", tagData.toFIXIDString());
            assertEquals( "COPY_MSG_INDICATOR", tagData.toFIXNameString());
            assertEquals( "CopyMsgIndicator", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  797
         *  CopyMsgIndicator
         *  Boolean
         *  <p>    N - Regular Message
         *  <p>    Y - Drop Copy Message
         */
        tagData = new Tag797EnuCopyMsgIndicator( Enum797CopyMsgIndicator.NO );
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag797EnuCopyMsgIndicator( Enum797CopyMsgIndicator.YES);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum797CopyMsgIndicator oneEnum : Enum797CopyMsgIndicator.values()) {
            tagData = new Tag797EnuCopyMsgIndicator(oneEnum);
            assertEquals( "Tag797EnuCopyMsgIndicator\n" +
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