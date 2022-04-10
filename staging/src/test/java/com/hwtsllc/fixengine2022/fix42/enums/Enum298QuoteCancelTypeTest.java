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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum298QuoteCancelTypeTest {
    @Test
    void Enum0298Test() {
        Enum298QuoteCancelType enumType;

        /*
         * 1-5 msg types
         */
        enumType = Enum298QuoteCancelType.CANCEL_FOR_SYMBOL;
        assertEquals( "1", enumType.getID());
        assertEquals( "CANCEL_FOR_SYMBOL", enumType.getName());
        assertEquals( "1 - Cancel for Symbol(s)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum298QuoteCancelType.CANCEL_FOR_SECURITY_TYPE;
        assertEquals( "2", enumType.getID());
        assertEquals( "CANCEL_FOR_SECURITY_TYPE", enumType.getName());
        assertEquals( "2 - Cancel for Security Type(s)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum298QuoteCancelType.CANCEL_FOR_UNDERLYING_SYMBOL;
        assertEquals( "3", enumType.getID());
        assertEquals( "CANCEL_FOR_UNDERLYING_SYMBOL", enumType.getName());
        assertEquals( "3 - Cancel for Underlying Symbol", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum298QuoteCancelType.CANCEL_ALL_QUOTES;
        assertEquals( "4", enumType.getID());
        assertEquals( "CANCEL_ALL_QUOTES", enumType.getName());
        assertEquals( "4 - Cancel All Quotes", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum298QuoteCancelType.CANCEL_QUOTEID_QUOTE;
        assertEquals( "5", enumType.getID());
        assertEquals( "CANCEL_QUOTEID_QUOTE", enumType.getName());
        assertEquals( "5 - Cancel quote specified in QuoteID", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}