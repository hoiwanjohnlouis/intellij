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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix44.enums.Enum945CollInquiryStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  945
 *  CollInquiryStatus
 *  int
 *  Status of Collateral Inquiry
 *  Valid values:
 *      0 - Accepted
 *      1 - Accepted With Warnings
 *      2 - Completed
 *      3 - Completed With Warnings
 *      4 - Rejected
 */
class Tag945EnuCollInquiryStatusTest {
    @Test
    void FIX0945Test() {
        FIX44 fixData = FIX44.FIX945_ENU_COLL_INQUIRY_STATUS;
        assertEquals( "945", fixData.getID());
        assertEquals( "COLL_INQUIRY_STATUS", fixData.getName());
        assertEquals( "CollInquiryStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0945Test() {
        Tag945EnuCollInquiryStatus tagData;

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.ACCEPTED );
        assertEquals( Enum945CollInquiryStatus.ACCEPTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.ACCEPTED_WITH_WARNINGS );
        assertEquals( Enum945CollInquiryStatus.ACCEPTED_WITH_WARNINGS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.COMPLETED );
        assertEquals( Enum945CollInquiryStatus.COMPLETED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.COMPLETED_WITH_WARNINGS );
        assertEquals( Enum945CollInquiryStatus.COMPLETED_WITH_WARNINGS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag945EnuCollInquiryStatus( Enum945CollInquiryStatus.REJECTED );
        assertEquals( Enum945CollInquiryStatus.REJECTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}