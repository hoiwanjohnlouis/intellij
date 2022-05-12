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

class Tag380EnuBusinessRejectReasonTest {
    @Test
    void FIX0380Test() {
        FIX42 fixData = FIX42.FIX380_ENU_BUSINESS_REJECT_REASON;
        assertEquals( "380", fixData.getID());
        assertEquals( "BUSINESS_REJECT_REASON", fixData.getName());
        assertEquals( "BusinessRejectReason", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag380
     *  Enu
     *  BusinessRejectReason
     *
     *      0-7, 18 msg types
     *      OTHER( "0", "OTHER", "0 - Other" ),
     *      UNKNOWN_ID( "1", "UNKNOWN_ID", "1 - Unknown ID" ),
     *      UNKNOWN_SECURITY( "2", "UNKNOWN_SECURITY", "2 - Unknown Security" ),
     *      UNKNOWN_MESSAGE_TYPE( "3", "UNKNOWN_MESSAGE_TYPE", "3 - Unknown Message Type" ),
     *      APPLICATION_NOT_AVAILABLE( "4", "APPLICATION_NOT_AVAILABLE", "4 - Application not available" ),
     *      REQUIRED_FIELD_MISSING( "5", "REQUIRED_FIELD_MISSING", "5 - Conditionally required field missing" ),
     *      NOT_AUTHORIZED( "6", "NOT_AUTHORIZED", "6 - Not Authorized" ),
     *      DELIVERTO_FIRM_NOT_AVAILABLE( "7", "DELIVERTO_FIRM_NOT_AVAILABLE",
     *                          "7 - DeliverTo firm not available at this time" ),
     *      INVALID_PRICE_INCREMENT( "18", "INVALID_PRICE_INCREMENT", "18 - Invalid price increment" ),
     */
    @Test
    void Tag0380Test() {
        Log380EnuBusinessRejectReason tagData;

        /**
         * 0-7, 18 msg types
         */
        tagData = new Log380EnuBusinessRejectReason(Enum380BusinessRejectReason.OTHER);
        assertEquals( Enum380BusinessRejectReason.OTHER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_ID);
        assertEquals( Enum380BusinessRejectReason.UNKNOWN_ID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_SECURITY);
        assertEquals( Enum380BusinessRejectReason.UNKNOWN_SECURITY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log380EnuBusinessRejectReason(Enum380BusinessRejectReason.UNKNOWN_MESSAGE_TYPE);
        assertEquals( Enum380BusinessRejectReason.UNKNOWN_MESSAGE_TYPE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log380EnuBusinessRejectReason(Enum380BusinessRejectReason.APPLICATION_NOT_AVAILABLE);
        assertEquals( Enum380BusinessRejectReason.APPLICATION_NOT_AVAILABLE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log380EnuBusinessRejectReason(Enum380BusinessRejectReason.REQUIRED_FIELD_MISSING);
        assertEquals( Enum380BusinessRejectReason.REQUIRED_FIELD_MISSING.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log380EnuBusinessRejectReason(Enum380BusinessRejectReason.NOT_AUTHORIZED);
        assertEquals( Enum380BusinessRejectReason.NOT_AUTHORIZED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log380EnuBusinessRejectReason(Enum380BusinessRejectReason.DELIVERTO_FIRM_NOT_AVAILABLE);
        assertEquals( Enum380BusinessRejectReason.DELIVERTO_FIRM_NOT_AVAILABLE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log380EnuBusinessRejectReason(Enum380BusinessRejectReason.INVALID_PRICE_INCREMENT);
        assertEquals( Enum380BusinessRejectReason.INVALID_PRICE_INCREMENT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}