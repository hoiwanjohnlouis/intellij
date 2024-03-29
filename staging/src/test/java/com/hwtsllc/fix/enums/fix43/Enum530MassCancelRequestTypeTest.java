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

package com.hwtsllc.fix.enums.fix43;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  530
 *  MassCancelRequestType
 *  char
 *  <p></p>
 *  Specifies scope of Order Mass Cancel Request.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Cancel orders for a security
 *  <p>    2 - Cancel orders for an underlying security
 *  <p>    3 - Cancel orders for a Product
 *  <p>    4 - Cancel orders for a CFICode
 *  <p>    5 - Cancel orders for a SecurityType
 *  <p></p>
 *  <p>    6 - Cancel orders for a trading session
 *  <p>    7 - Cancel all orders
 */
class Enum530MassCancelRequestTypeTest {
    /*
     *  Information is the same for TAGS 530
     */
    @Test
    void Enum0530Test() {
        Enum530MassCancelRequestType enumType;

        /*
         *  1-7 types
         */
        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SECURITY;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("CANCEL_ORDERS_FOR_SECURITY", enumType.toFIXNameString());
        assertEquals("1 - Cancel orders for a security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_UNDERLYING;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("CANCEL_ORDERS_FOR_UNDERLYING", enumType.toFIXNameString());
        assertEquals("2 - Cancel orders for an underlying security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_PRODUCT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("CANCEL_ORDERS_FOR_PRODUCT", enumType.toFIXNameString());
        assertEquals("3 - Cancel orders for a Product", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_CFICODE;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("CANCEL_ORDERS_FOR_CFICODE", enumType.toFIXNameString());
        assertEquals("4 - Cancel orders for a CFICode", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SECURITYTYPE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("CANCEL_ORDERS_FOR_SECURITYTYPE", enumType.toFIXNameString());
        assertEquals("5 - Cancel orders for a SecurityType", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SESSION;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("CANCEL_ORDERS_FOR_SESSION", enumType.toFIXNameString());
        assertEquals("6 - Cancel orders for a trading session", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ALL_ORDERS;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("CANCEL_ALL_ORDERS", enumType.toFIXNameString());
        assertEquals("7 - Cancel all orders", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}