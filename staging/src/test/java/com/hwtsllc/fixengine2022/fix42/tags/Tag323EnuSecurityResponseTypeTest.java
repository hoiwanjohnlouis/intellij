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

class Tag323EnuSecurityResponseTypeTest {
    @Test
    void FIX0323Test() {
        FIX42 fixData = FIX42.FIX323_ENU_SECURITY_RESPONSE_TYPE;
        assertEquals( "", fixData.getID());
        assertEquals( "", fixData.getName());
        assertEquals( "", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     * 1-6 msg types
     */
    ACCEPT_SECURITY_AS_IS( "1", "ACCEPT_SECURITY_AS_IS",
                                   "1 - Accept security proposal as-is" ),
    ACCEPT_SECURITY_REVISIONS( "2", "ACCEPT_SECURITY_REVISIONS",
                                       "2 - Accept security proposal with revisions as indicated in the message" ),
    LIST_OF_SECURITY_TYPES_RETURNED( "3", "LIST_OF_SECURITY_TYPES_RETURNED",
                                             "3 - List of security types returned per request" ),
    LIST_OF_SECURITIES_RETURNED_PER_REQUEST( "4", "LIST_OF_SECURITIES_RETURNED_PER_REQUEST",
                                                     "4 - List of securities returned per request" ),
    REJECT_SECURITY_PROPOSAL( "5", "REJECT_SECURITY_PROPOSAL",
                                      "5 - Reject security proposal" ),
    CANNOT_MATCH_SELECTION( "6", "CANNOT_MATCH_SELECTION",
                                    "6 - Cannot match selection criteria" ),
    @Test
    void Tag0323Test() {
        Tag323EnuSecurityResponseType tagData;

        tagData = new Tag216EnuRoutingType(Enum216RoutingType.TARGET_FIRM);
        assertEquals( Enum216RoutingType.TARGET_FIRM.getID(),
                tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}