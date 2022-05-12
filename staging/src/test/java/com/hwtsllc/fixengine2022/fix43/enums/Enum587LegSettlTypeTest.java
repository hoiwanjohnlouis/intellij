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

class Enum587LegSettlTypeTest {
    /**
     *  Information is the same for TAGS 587
     */
    @Test
    void Enum0587Test() {
        Enum587LegSettlType enumType;

        /*
         *  0-9, B-C, types
         */

        /*
         *  0-9, types
         */
        enumType = Enum587LegSettlType.REGULAR;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("0,REGULAR,0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.CASH;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,CASH,1 - Cash (TOD / T+0)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.NEXT_DAY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,NEXT_DAY,2 - Next Day (TOM / T+1)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.T_PLUS_2;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,T_PLUS_2,3 - T+2", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.T_PLUS_3;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,T_PLUS_3,4 - T+3", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.T_PLUS_4;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,T_PLUS_4,5 - T+4", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.FUTURE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,FUTURE,6 - Future", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.WHEN_ISSUED;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,WHEN_ISSUED,7 - When And If Issued", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.SELLERS_OPTION;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,SELLERS_OPTION,8 - Sellers Option", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.T_PLUS_5;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("9,T_PLUS_5,9 - T+5", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  B-C, types
         */
        enumType = Enum587LegSettlType.BROKEN_DATE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("B,BROKEN_DATE,B - Broken date - for FX expressing non-standard tenor, SettlDate (64) must be specified", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum587LegSettlType.FX_SPOT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("C,FX_SPOT,C - FX Spot Next settlement (Spot+1, aka next day)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}