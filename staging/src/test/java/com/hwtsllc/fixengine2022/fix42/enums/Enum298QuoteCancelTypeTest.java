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

class Enum298QuoteCancelTypeTest {
    /**
     *  298
     *  QuoteCancelType
     *
     *      1-5 msg types
     *      CANCEL_FOR_SYMBOL( "1", "CANCEL_FOR_SYMBOL", "1 - Cancel for Symbol(s)" ),
     *      CANCEL_FOR_SECURITY_TYPE( "2", "CANCEL_FOR_SECURITY_TYPE", "2 - Cancel for Security Type(s)" ),
     *      CANCEL_FOR_UNDERLYING_SYMBOL( "3", "CANCEL_FOR_UNDERLYING_SYMBOL", "3 - Cancel for Underlying Symbol" ),
     *      CANCEL_ALL_QUOTES( "4", "CANCEL_ALL_QUOTES", "4 - Cancel All Quotes" ),
     *      CANCEL_QUOTEID_QUOTE("5", "CANCEL_QUOTEID_QUOTE", "5 - Cancel quote specified in QuoteID" ),
     */
    @Test
    void Enum0298Test() {
        Enum298QuoteCancelType enumType;

        /**
         * 1-5 msg types
         */
        enumType = Enum298QuoteCancelType.CANCEL_FOR_SYMBOL;
        assertEquals( "1", enumType.getID());
        assertEquals( "CANCEL_FOR_SYMBOL", enumType.getName());
        assertEquals( "1 - Cancel for Symbol(s)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum298QuoteCancelType.CANCEL_FOR_SECURITY_TYPE;
        assertEquals( "2", enumType.getID());
        assertEquals( "CANCEL_FOR_SECURITY_TYPE", enumType.getName());
        assertEquals( "2 - Cancel for Security Type(s)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum298QuoteCancelType.CANCEL_FOR_UNDERLYING_SYMBOL;
        assertEquals( "3", enumType.getID());
        assertEquals( "CANCEL_FOR_UNDERLYING_SYMBOL", enumType.getName());
        assertEquals( "3 - Cancel for Underlying Symbol", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum298QuoteCancelType.CANCEL_ALL_QUOTES;
        assertEquals( "4", enumType.getID());
        assertEquals( "CANCEL_ALL_QUOTES", enumType.getName());
        assertEquals( "4 - Cancel All Quotes", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum298QuoteCancelType.CANCEL_QUOTEID_QUOTE;
        assertEquals( "5", enumType.getID());
        assertEquals( "CANCEL_QUOTEID_QUOTE", enumType.getName());
        assertEquals( "5 - Cancel quote specified in QuoteID", enumType.getDescription());
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