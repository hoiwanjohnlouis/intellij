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

import static org.junit.jupiter.api.Assertions.*;

class Tag297EnuQuoteAckStatusTest {
    @Test
    void FIX0297Test() {
        FIX42 fixData = FIX42.FIX297_ENU_QUOTE_ACK_STATUS;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 0-15 msg types
     */
    ACCEPTED( "0", "ACCEPTED",
                      "0 - Accepted" ),
    CANCEL_FOR_SYMBOL( "1", "CANCEL_FOR_SYMBOL",
                               "1 - Cancel for Symbol(s)" ),
    CANCELED_FOR_SECURITY_TYPE( "2", "CANCELED_FOR_SECURITY_TYPE",
                                        "2 - Canceled for Security Type(s)" ),
    CANCELED_FOR_UNDERLYING( "3", "CANCELED_FOR_UNDERLYING"
                                     , "3 - Canceled for Underlying" ),
    CANCELED_ALL( "4", "CANCELED_ALL",
                          "4 - Canceled All" ),
    REJECTED( "5", "REJECTED",
                      "5 - Rejected" ),
    REMOVED_FROM_MARKET( "6", "REMOVED_FROM_MARKET",
                                 "6 - Removed from Market" ),
    EXPIRED( "7", "EXPIRED",
                     "7 - Expired" ),
    QUERY( "8", "QUERY",
                   "8 - Query" ),
    QUOTE_NOT_FOUND( "9", "QUOTE_NOT_FOUND",
                             "9 - Quote Not Found" ),
    PENDING( "10", "PENDING",
                     "10 - Pending" ),
    PASS( "11", "PASS",
                  "11 - Pass" ),
    LOCKED_MARKET_WARNING( "12", "LOCKED_MARKET_WARNING",
                                   "12 - Locked Market Warning" ),
    CROSS_MARKET_WARNING( "13", "CROSS_MARKET_WARNING",
                                  "13 - Cross Market Warning" ),
    CANCELED_DUE_TO_LOCK_MARKET( "14", "CANCELED_DUE_TO_LOCK_MARKET",
                                         "14 - Canceled Due To Lock Market" ),
    CANCELED_DUE_TO_CROSS_MARKET( "15", "CANCELED_DUE_TO_CROSS_MARKET",
                                          "15 - Canceled Due To Cross Market" ),
    @Test
    void Tag0297Test() {
        Tag297EnuQuoteAckStatus tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}