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

package com.hwtsllc.fixengine2022.fix44.enums;

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
class Enum945CollInquiryStatusTest {
    @Test
    void EnumTest() {
        Enum945CollInquiryStatus enumType;

        enumType = Enum945CollInquiryStatus.ACCEPTED;
        assertEquals( "0", enumType.toEnumIDString() );
        assertEquals( "ACCEPTED", enumType.toEnumNameString() );
        assertEquals( "0 - Accepted", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum945CollInquiryStatus.ACCEPTED_WITH_WARNINGS;
        assertEquals( "1", enumType.toEnumIDString() );
        assertEquals( "ACCEPTED_WITH_WARNINGS", enumType.toEnumNameString() );
        assertEquals( "1 - Accepted With Warnings", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum945CollInquiryStatus.COMPLETED;
        assertEquals( "2", enumType.toEnumIDString() );
        assertEquals( "COMPLETED", enumType.toEnumNameString() );
        assertEquals( "2 - Completed", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum945CollInquiryStatus.COMPLETED_WITH_WARNINGS;
        assertEquals( "3", enumType.toEnumIDString() );
        assertEquals( "COMPLETED_WITH_WARNINGS", enumType.toEnumNameString() );
        assertEquals( "3 - Completed With Warnings", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum945CollInquiryStatus.REJECTED;
        assertEquals( "4", enumType.toEnumIDString() );
        assertEquals( "REJECTED", enumType.toEnumNameString() );
        assertEquals( "4 - Rejected", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}