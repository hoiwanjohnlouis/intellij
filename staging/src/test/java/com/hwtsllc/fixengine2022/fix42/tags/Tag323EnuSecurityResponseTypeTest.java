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
import com.hwtsllc.fixengine2022.fix42.enums.Enum323SecurityResponseType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag323EnuSecurityResponseTypeTest {
    @Test
    void FIX0323Test() {
        FIX42 fixData = FIX42.FIX323_ENU_SECURITY_RESPONSE_TYPE;
        assertEquals( "323", fixData.getID());
        assertEquals( "SECURITY_RESPONSE_TYPE", fixData.getName());
        assertEquals( "SecurityResponseType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  323
     *  Enu
     *  SecurityResponseType
     *
     *      1-6 msg types
     *      ACCEPT_SECURITY_AS_IS( "1", "ACCEPT_SECURITY_AS_IS",
     *                          "1 - Accept security proposal as-is" ),
     *      ACCEPT_SECURITY_REVISIONS( "2", "ACCEPT_SECURITY_REVISIONS",
     *                          "2 - Accept security proposal with revisions as indicated in the message" ),
     *      LIST_OF_SECURITY_TYPES_RETURNED( "3", "LIST_OF_SECURITY_TYPES_RETURNED",
     *                          "3 - List of security types returned per request" ),
     *      LIST_OF_SECURITIES_RETURNED_PER_REQUEST( "4", "LIST_OF_SECURITIES_RETURNED_PER_REQUEST",
     *                          "4 - List of securities returned per request" ),
     *      REJECT_SECURITY_PROPOSAL( "5", "REJECT_SECURITY_PROPOSAL",
     *                          "5 - Reject security proposal" ),
     *      CANNOT_MATCH_SELECTION( "6", "CANNOT_MATCH_SELECTION",
     *                          "6 - Cannot match selection criteria" ),
     */
    @Test
    void Tag0323Test() {
        Log323EnuSecurityResponseType tagData;

        /**
         * 1-6 msg types
         */
        tagData = new Log323EnuSecurityResponseType(Enum323SecurityResponseType.ACCEPT_SECURITY_AS_IS);
        assertEquals( Enum323SecurityResponseType.ACCEPT_SECURITY_AS_IS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log323EnuSecurityResponseType(Enum323SecurityResponseType.ACCEPT_SECURITY_REVISIONS);
        assertEquals( Enum323SecurityResponseType.ACCEPT_SECURITY_REVISIONS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log323EnuSecurityResponseType(Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES_RETURNED);
        assertEquals( Enum323SecurityResponseType.LIST_OF_SECURITY_TYPES_RETURNED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log323EnuSecurityResponseType(Enum323SecurityResponseType.LIST_OF_SECURITIES_RETURNED_PER_REQUEST);
        assertEquals( Enum323SecurityResponseType.LIST_OF_SECURITIES_RETURNED_PER_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log323EnuSecurityResponseType(Enum323SecurityResponseType.REJECT_SECURITY_PROPOSAL);
        assertEquals( Enum323SecurityResponseType.REJECT_SECURITY_PROPOSAL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log323EnuSecurityResponseType(Enum323SecurityResponseType.CANNOT_MATCH_SELECTION);
        assertEquals( Enum323SecurityResponseType.CANNOT_MATCH_SELECTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}