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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("CANCEL_ORDERS_FOR_SECURITY", enumType.toEnumNameString());
        assertEquals("1 - Cancel orders for a security", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_UNDERLYING;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("CANCEL_ORDERS_FOR_UNDERLYING", enumType.toEnumNameString());
        assertEquals("2 - Cancel orders for an underlying security", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_PRODUCT;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("CANCEL_ORDERS_FOR_PRODUCT", enumType.toEnumNameString());
        assertEquals("3 - Cancel orders for a Product", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_CFICODE;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("CANCEL_ORDERS_FOR_CFICODE", enumType.toEnumNameString());
        assertEquals("4 - Cancel orders for a CFICode", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SECURITYTYPE;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("CANCEL_ORDERS_FOR_SECURITYTYPE", enumType.toEnumNameString());
        assertEquals("5 - Cancel orders for a SecurityType", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum530MassCancelRequestType.CANCEL_ORDERS_FOR_SESSION;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("CANCEL_ORDERS_FOR_SESSION", enumType.toEnumNameString());
        assertEquals("6 - Cancel orders for a trading session", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum530MassCancelRequestType.CANCEL_ALL_ORDERS;
        assertEquals("7", enumType.toEnumIDString());
        assertEquals("CANCEL_ALL_ORDERS", enumType.toEnumNameString());
        assertEquals("7 - Cancel all orders", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}