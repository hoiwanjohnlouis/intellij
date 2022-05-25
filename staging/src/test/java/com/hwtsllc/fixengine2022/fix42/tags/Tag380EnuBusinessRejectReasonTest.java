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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum380BusinessRejectReason;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  380
 *  BusinessRejectReason
 *  int
 *  <p>
 *  Code to identify reason for a Business Message Reject message.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Other
 *  <p>     1 - Unknown ID
 *  <p>     2 - Unknown Security
 *  <p>     3 - Unknown Message Type
 *  <p>     4 - Application not available
 *  <p></p>
 *  <p>     5 - Conditionally required field missing
 *  <p>     6 - Not Authorized
 *  <p>     7 - DeliverTo firm not available at this time
 *  <p>     18 - Invalid price increment
 */
class Tag380EnuBusinessRejectReasonTest {
    @Test
    void FIX0380Test() {
        FIX42 fixData = FIX42.FIX380_ENU_BUSINESS_REJECT_REASON;
        assertEquals( "380", fixData.toFIXIDString());
        assertEquals( "BUSINESS_REJECT_REASON", fixData.toFIXNameString());
        assertEquals( "BusinessRejectReason", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0380Test() {
        Tag380EnuBusinessRejectReason tagData;

        /*
         * 0-7, 18 msg types
         */
        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.OTHER);
        assertEquals( Enum380BusinessRejectReason.OTHER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_ID);
        assertEquals( Enum380BusinessRejectReason.UNKNOWN_ID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_SECURITY);
        assertEquals( Enum380BusinessRejectReason.UNKNOWN_SECURITY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_MESSAGE_TYPE);
        assertEquals( Enum380BusinessRejectReason.UNKNOWN_MESSAGE_TYPE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.APPLICATION_NOT_AVAILABLE);
        assertEquals( Enum380BusinessRejectReason.APPLICATION_NOT_AVAILABLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.REQUIRED_FIELD_MISSING);
        assertEquals( Enum380BusinessRejectReason.REQUIRED_FIELD_MISSING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.NOT_AUTHORIZED);
        assertEquals( Enum380BusinessRejectReason.NOT_AUTHORIZED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.DELIVERTO_FIRM_NOT_AVAILABLE);
        assertEquals( Enum380BusinessRejectReason.DELIVERTO_FIRM_NOT_AVAILABLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag380EnuBusinessRejectReason(Enum380BusinessRejectReason.INVALID_PRICE_INCREMENT);
        assertEquals( Enum380BusinessRejectReason.INVALID_PRICE_INCREMENT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}