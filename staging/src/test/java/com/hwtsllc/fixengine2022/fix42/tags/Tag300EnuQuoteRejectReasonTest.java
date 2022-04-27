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

class Tag300EnuQuoteRejectReasonTest {
    @Test
    void FIX0300Test() {
        FIX42 fixData = FIX42.FIX300_ENU_QUOTE_REJECT_REASON;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 1-9, 99 msg types
     */
    UNKNOWN_SYMBOL( "1", "UNKNOWN_SYMBOL",
                            "1 - Unknown Symbol (security)" ),
    EXCHANGE_SECURITY_CLOSED( "2", "EXCHANGE_SECURITY_CLOSED",
                                      "2 - Exchange (Security) closed" ),
    QUOTE_REQUEST_EXCEEDS_LIMIT( "3", "QUOTE_REQUEST_EXCEEDS_LIMIT",
                                         "3 - Quote Request exceeds limit" ),
    TOO_LATE_TO_ENTER( "4", "TOO_LATE_TO_ENTER",
                               "4 - Too late to enter" ),
    UNKNOWN_QUOTE( "5", "UNKNOWN_QUOTE",
                           "5 - Unknown Quote" ),
    DUPLICATE_QUOTE( "6", "DUPLICATE_QUOTE",
                             "6 - Duplicate Quote" ),
    INVALID_BID_ASK_SPREAD( "7", "INVALID_BID_ASK_SPREAD",
                                    "7 - Invalid bid/ask spread" ),
    INVALID_PRICE( "8", "INVALID_PRICE",
                           "8 - Invalid price" ),
    NOT_AUTHORIZED_TO_QUOTE_SECURITY( "9", "NOT_AUTHORIZED_TO_QUOTE_SECURITY",
                                              "9 - Not authorized to quote security" ),
    OTHER( "99", "OTHER",
                   "99 - Other" ),
    @Test
    void Tag0300Test() {
        Tag300EnuQuoteRejectReason tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}