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

import com.hwtsllc.fixengine2022.fix44.enums.Enum945CollInquiryStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag945EnuCollInquiryStatusTest {
    Tag945EnuCollInquiryStatus tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            assertEquals( "FIX945_ENU_COLL_INQUIRY_STATUS", tagData.toFIXLabelString());
            assertEquals( "945", tagData.toEnumIDString());
            assertEquals( "COLL_INQUIRY_STATUS", tagData.toEnumNameString());
            assertEquals( "CollInquiryStatus", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  945
         *  CollInquiryStatus
         *  int
         *  <p>    0 - Accepted
         *  <p>    1 - Accepted With Warnings
         *  <p>    2 - Completed
         *  <p>    3 - Completed With Warnings
         *  <p>    4 - Rejected
         */
        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.ACCEPTED );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.ACCEPTED_WITH_WARNINGS );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.COMPLETED );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.COMPLETED_WITH_WARNINGS );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.REJECTED );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            assertEquals( "Tag945EnuCollInquiryStatus\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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