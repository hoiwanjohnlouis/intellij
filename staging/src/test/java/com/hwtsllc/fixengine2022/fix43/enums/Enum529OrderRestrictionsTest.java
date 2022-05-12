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

class Enum529OrderRestrictionsTest {
    /**
     *  Information is the same for TAGS 529
     */
    @Test
    void Enum0529Test() {
        Enum529OrderRestrictions enumType;

        /*
         *  1-9, A, types
         */

        /*
         *  1-9, types
         */
        enumType = Enum529OrderRestrictions.PROGRAM_TRADE;
        assertEquals("1", enumType.getID());
        assertEquals("PROGRAM_TRADE", enumType.getName());
        assertEquals("1 - Program Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.INDEX_ARBITRAGE;
        assertEquals("2", enumType.getID());
        assertEquals("INDEX_ARBITRAGE", enumType.getName());
        assertEquals("2 - Index Arbitrage", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.NON_INDEX_ARBITRAGE;
        assertEquals("3", enumType.getID());
        assertEquals("NON_INDEX_ARBITRAGE", enumType.getName());
        assertEquals("3 - Non-Index Arbitrage", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.COMPETING_MARKET_MAKER;
        assertEquals("4", enumType.getID());
        assertEquals("COMPETING_MARKET_MAKER", enumType.getName());
        assertEquals("4 - Competing Market Maker", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.SPECIALIST_IN_SECURITY;
        assertEquals("5", enumType.getID());
        assertEquals("SPECIALIST_IN_SECURITY", enumType.getName());
        assertEquals("5 - Acting as Market Maker or Specialist in the security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.SPECIALIST_IN_UNDERLYING_SECURITY;
        assertEquals("6", enumType.getID());
        assertEquals("SPECIALIST_IN_UNDERLYING_SECURITY", enumType.getName());
        assertEquals("6 - Acting as Market Maker of Specialist in the underlying security of a derivative security", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.FOREIGN_ENTITY;
        assertEquals("7", enumType.getID());
        assertEquals("FOREIGN_ENTITY", enumType.getName());
        assertEquals("7 - Foreign Entity (of foreign government or regulatory jurisdiction)", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.EXTERNAL_MARKET_PARTICIPANT;
        assertEquals("8", enumType.getID());
        assertEquals("EXTERNAL_MARKET_PARTICIPANT", enumType.getName());
        assertEquals("8 - External Market Participant", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.EXTERNAL_INTER_CONNECTED;
        assertEquals("9", enumType.getID());
        assertEquals("EXTERNAL_INTER_CONNECTED", enumType.getName());
        assertEquals("9 - External Inter-connected Market Linkage", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  A type
         */
        enumType = Enum529OrderRestrictions.RISKLESS_ARBITRAGE;
        assertEquals("A", enumType.getID());
        assertEquals("RISKLESS_ARBITRAGE", enumType.getName());
        assertEquals("A - Riskless Arbitrage", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}