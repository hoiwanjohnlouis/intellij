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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
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
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("1,PROGRAM_TRADE,1 - Program Trade", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.INDEX_ARBITRAGE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("2,INDEX_ARBITRAGE,2 - Index Arbitrage", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.NON_INDEX_ARBITRAGE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("3,NON_INDEX_ARBITRAGE,3 - Non-Index Arbitrage", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.COMPETING_MARKET_MAKER;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("4,COMPETING_MARKET_MAKER,4 - Competing Market Maker", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.SPECIALIST_IN_SECURITY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("5,SPECIALIST_IN_SECURITY,5 - Acting as Market Maker or Specialist in the security", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.SPECIALIST_IN_UNDERLYING_SECURITY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("6,SPECIALIST_IN_UNDERLYING_SECURITY,6 - Acting as Market Maker of Specialist in the underlying security of a derivative security", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.FOREIGN_ENTITY;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("7,FOREIGN_ENTITY,7 - Foreign Entity (of foreign government or regulatory jurisdiction)", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.EXTERNAL_MARKET_PARTICIPANT;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("8,EXTERNAL_MARKET_PARTICIPANT,8 - External Market Participant", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum529OrderRestrictions.EXTERNAL_INTER_CONNECTED;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("[9,EXTERNAL_INTER_CONNECTED,9 - External Inter-connected Market Linkage", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());



        /*
         *  A type
         */
        enumType = Enum529OrderRestrictions.RISKLESS_ARBITRAGE;
        assertEquals("", enumType.getID());
        assertEquals("", enumType.getName());
        assertEquals("[A,RISKLESS_ARBITRAGE,A - Riskless Arbitrage", enumType.getDescription());
        assertNotEquals( FIX43.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX43.JUNK_ID, enumType.getID());
        assertNotEquals( FIX43.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX43.JUNK_DESCRIPTION, enumType.getDescription());
    }
}