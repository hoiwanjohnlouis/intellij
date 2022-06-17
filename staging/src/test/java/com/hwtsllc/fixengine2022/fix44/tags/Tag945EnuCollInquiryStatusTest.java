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
import com.hwtsllc.fixengine2022.fix44.enums.Enum945CollInquiryStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  945
 *  CollInquiryStatus
 *  int
 *  <p></p>
 *  Status of Collateral Inquiry
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Accepted
 *  <p>    1 - Accepted With Warnings
 *  <p>    2 - Completed
 *  <p>    3 - Completed With Warnings
 *  <p>    4 - Rejected
 */
class Tag945EnuCollInquiryStatusTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX945_ENU_COLL_INQUIRY_STATUS;
        assertEquals( "945", fixData.toFIXIDString());
        assertEquals( "COLL_INQUIRY_STATUS", fixData.toFIXNameString());
        assertEquals( "CollInquiryStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0945Test() {
        Tag945EnuCollInquiryStatus tagData;
        Enum945CollInquiryStatus oneElement;

        oneElement = Enum945CollInquiryStatus.ACCEPTED;
        tagData = new Tag945EnuCollInquiryStatus( oneElement );
        assertEquals( oneElement.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "945", tagData.toFIXIDString());
        assertEquals( "COLL_INQUIRY_STATUS", tagData.toFIXNameString());
        assertEquals( "CollInquiryStatus", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.ACCEPTED_WITH_WARNINGS );
        assertEquals( Enum945CollInquiryStatus.ACCEPTED_WITH_WARNINGS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.COMPLETED );
        assertEquals( Enum945CollInquiryStatus.COMPLETED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.COMPLETED_WITH_WARNINGS );
        assertEquals( Enum945CollInquiryStatus.COMPLETED_WITH_WARNINGS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.REJECTED );
        assertEquals( Enum945CollInquiryStatus.REJECTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag945EnuCollInquiryStatus tagData;

        // loop around the ENUM and process
        for ( Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag945EnuCollInquiryStatus tagData;

        // loop around the ENUM and process
        for (Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag945EnuCollInquiryStatus tagData;

        // loop around the ENUM and process
        for (Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag945EnuCollInquiryStatus tagData;

        // loop around the ENUM and process
        for (Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag945EnuCollInquiryStatus tagData;

        // loop around the ENUM and process
        for (Enum945CollInquiryStatus oneEnum : Enum945CollInquiryStatus.values()) {
            tagData = new Tag945EnuCollInquiryStatus(oneEnum);
            assertEquals( "Tag945EnuCollInquiryStatus\n" +
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