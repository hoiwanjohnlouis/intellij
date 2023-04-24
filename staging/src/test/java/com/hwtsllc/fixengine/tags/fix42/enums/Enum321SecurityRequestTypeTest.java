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

package com.hwtsllc.fixengine.tags.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  321
 *  SecurityRequestType
 *  int
 *  <p>
 *  Type of Security Definition Request.
 *  <p></p>
 *  Valid values:
 *  <p>    0-3 msg types
 *  <p>    "0 - Request Security identity and specifications"
 *  <p>    "1 - Request Security identity for the specifications provided
 *          (name of the security is not supplied)"
 *  <p>    "2 - Request List Security Types" ),
 *  <p>    "3 - Request List Securities (can be qualified with Symbol, SecurityType,
 *          TradingSessionID, SecurityExchange.
 *          If provided, then only list Securities for the specific type.)"
 */
class Enum321SecurityRequestTypeTest {
    @Test
    void Enum0321Test() {
        Enum321SecurityRequestType enumType;

        /*
         * 0-3 msg types
         */
        enumType = Enum321SecurityRequestType.REQUEST_SECURITY_IDENTITY;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "REQUEST_SECURITY_IDENTITY", enumType.toFIXNameString());
        assertEquals( "0 - Request Security identity and specifications", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum321SecurityRequestType.REQUEST_SPECIFIED_SECURITY;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "REQUEST_SPECIFIED_SECURITY", enumType.toFIXNameString());
        assertEquals( "1 - Request Security identity for the specifications provided " +
                        "(name of the security is not supplied)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum321SecurityRequestType.REQUEST_LIST_SECURITY_TYPES;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "REQUEST_LIST_SECURITY_TYPES", enumType.toFIXNameString());
        assertEquals( "2 - Request List Security Types", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum321SecurityRequestType.REQUEST_LIST_SECURITIES;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "REQUEST_LIST_SECURITIES", enumType.toFIXNameString());
        assertEquals( "3 - Request List Securities " +
                        "(can be qualified with Symbol, SecurityType, TradingSessionID, SecurityExchange. " +
                        "If provided, then only list Securities for the specific type.)",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}