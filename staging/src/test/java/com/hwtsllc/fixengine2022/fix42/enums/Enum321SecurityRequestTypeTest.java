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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Enum321SecurityRequestTypeTest {
    @Test
    void Enum0321Test() {
        Enum321SecurityRequestType enumType;

        /**
         * 0-3 msg types
         */
        enumType = Enum321SecurityRequestType.REQUEST_SECURITY_IDENTITY;
        assertEquals( "0", enumType.getID());
        assertEquals( "REQUEST_SECURITY_IDENTITY", enumType.getName());
        assertEquals( "0 - Request Security identity and specifications", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum321SecurityRequestType.REQUEST_SPECIFIED_SECURITY;
        assertEquals( "1", enumType.getID());
        assertEquals( "REQUEST_SPECIFIED_SECURITY", enumType.getName());
        assertEquals( "1 - Request Security identity for the specifications provided " +
                        "(name of the security is not supplied)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum321SecurityRequestType.REQUEST_LIST_SECURITY_TYPES;
        assertEquals( "2", enumType.getID());
        assertEquals( "REQUEST_LIST_SECURITY_TYPES", enumType.getName());
        assertEquals( "2 - Request List Security Types", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum321SecurityRequestType.REQUEST_LIST_SECURITIES;
        assertEquals( "3", enumType.getID());
        assertEquals( "REQUEST_LIST_SECURITIES", enumType.getName());
        assertEquals( "3 - Request List Securities " +
                        "(can be qualified with Symbol, SecurityType, TradingSessionID, SecurityExchange. " +
                        "If provided, then only list Securities for the specific type.)",
                enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}