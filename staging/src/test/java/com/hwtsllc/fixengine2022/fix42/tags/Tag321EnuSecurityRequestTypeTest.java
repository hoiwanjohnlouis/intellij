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
import com.hwtsllc.fixengine2022.fix42.enums.Enum321SecurityRequestType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag321EnuSecurityRequestTypeTest {
    @Test
    void FIX0321Test() {
        FIX42 fixData = FIX42.FIX321_ENU_SECURITY_REQUEST_TYPE;
        assertEquals( "321", fixData.getID());
        assertEquals( "SECURITY_REQUEST_TYPE", fixData.getName());
        assertEquals( "SecurityRequestType", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  321
     *  Enu
     *  SecurityRequestType
     *
     *      0-3 msg types
     *      REQUEST_SECURITY_IDENTITY( "0", "REQUEST_SECURITY_IDENTITY",
     *                          "0 - Request Security identity and specifications" ),
     *      REQUEST_SPECIFIED_SECURITY( "1", "REQUEST_SPECIFIED_SECURITY",
     *                          "1 - Request Security identity for the specifications provided " +
     *                          "(name of the security is not supplied)" ),
     *      REQUEST_LIST_SECURITY_TYPES( "2", "REQUEST_LIST_SECURITY_TYPES",
     *                          "2 - Request List Security Types" ),
     *      REQUEST_LIST_SECURITIES( "3", "REQUEST_LIST_SECURITIES",
     *                          "3 - Request List Securities (can be qualified with Symbol, SecurityType, " +
     *                          "TradingSessionID, SecurityExchange. " +
     *                          "If provided, then only list Securities for the specific type.)" ),
     */
    @Test
    void Tag0321Test() {
        Tag321EnuSecurityRequestType tagData;

        /**
         * 0-3 msg types
         */
        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_SECURITY_IDENTITY);
        assertEquals( Enum321SecurityRequestType.REQUEST_SECURITY_IDENTITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_SPECIFIED_SECURITY);
        assertEquals( Enum321SecurityRequestType.REQUEST_SPECIFIED_SECURITY.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_LIST_SECURITY_TYPES);
        assertEquals( Enum321SecurityRequestType.REQUEST_LIST_SECURITY_TYPES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag321EnuSecurityRequestType(Enum321SecurityRequestType.REQUEST_LIST_SECURITIES);
        assertEquals( Enum321SecurityRequestType.REQUEST_LIST_SECURITIES.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}