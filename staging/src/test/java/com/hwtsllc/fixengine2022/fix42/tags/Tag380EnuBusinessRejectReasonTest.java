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
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag380EnuBusinessRejectReasonTest {
    @Test
    void FIX0380Test() {
        FIX42 fixData = FIX42.FIX380_ENU_BUSINESS_REJECT_REASON;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 0-7, 18 msg types
     */
    OTHER( "0", "OTHER",
                   "0 - Other" ),
    UNKNOWN_ID( "1", "UNKNOWN_ID",
                        "1 - Unknown ID" ),
    UNKNOWN_SECURITY( "2", "UNKNOWN_SECURITY",
                              "2 - Unknown Security" ),
    UNKNOWN_MESSAGE_TYPE( "3", "UNKNOWN_MESSAGE_TYPE",
                                  "3 - Unknown Message Type" ),
    APPLICATION_NOT_AVAILABLE( "4", "APPLICATION_NOT_AVAILABLE",
                                       "4 - Application not available" ),
    REQUIRED_FIELD_MISSING( "5", "REQUIRED_FIELD_MISSING",
                                    "5 - Conditionally required field missing" ),
    NOT_AUTHORIZED( "6", "NOT_AUTHORIZED",
                            "6 - Not Authorized" ),
    DELIVERTO_FIRM_NOT_AVAILABLE( "7", "DELIVERTO_FIRM_NOT_AVAILABLE",
                                          "7 - DeliverTo firm not available at this time" ),
    INVALID_PRICE_INCREMENT( "18", "INVALID_PRICE_INCREMENT",
                                     "18 - Invalid price increment" ),
    @Test
    void Tag0380Test() {
        Tag380EnuBusinessRejectReason tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}