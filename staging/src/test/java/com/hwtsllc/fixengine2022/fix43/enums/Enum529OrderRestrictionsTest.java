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
 *  529
 *  OrderRestrictions
 *  MultipleCharValue
 *  <p></p>
 *  Restrictions associated with an order.
 *  <p>
 *  If more than one restriction is applicable to an order,
 *  this field can contain multiple instructions separated by space.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Program Trade
 *  <p>    2 - Index Arbitrage
 *  <p>    3 - Non-Index Arbitrage
 *  <p>    4 - Competing Market Maker
 *  <p>    5 - Acting as Market Maker or Specialist in the security
 *  <p></p>
 *  <p>    6 - Acting as Market Maker of Specialist in the
 *              underlying security of a derivative security
 *  <p>    7 - Foreign Entity (of foreign government or regulatory jurisdiction)
 *  <p>    8 - External Market Participant
 *  <p>    9 - External Inter-connected Market Linkage
 *  <p>    A - Riskless Arbitrage
 */
class Enum529OrderRestrictionsTest {
    /*
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
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("PROGRAM_TRADE", enumType.toFIXNameString());
        assertEquals("1 - Program Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum529OrderRestrictions.INDEX_ARBITRAGE;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("INDEX_ARBITRAGE", enumType.toFIXNameString());
        assertEquals("2 - Index Arbitrage", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum529OrderRestrictions.NON_INDEX_ARBITRAGE;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("NON_INDEX_ARBITRAGE", enumType.toFIXNameString());
        assertEquals("3 - Non-Index Arbitrage", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum529OrderRestrictions.COMPETING_MARKET_MAKER;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("COMPETING_MARKET_MAKER", enumType.toFIXNameString());
        assertEquals("4 - Competing Market Maker", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum529OrderRestrictions.SPECIALIST_IN_SECURITY;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("SPECIALIST_IN_SECURITY", enumType.toFIXNameString());
        assertEquals("5 - Acting as Market Maker or Specialist in the security", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum529OrderRestrictions.SPECIALIST_IN_UNDERLYING_SECURITY;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("SPECIALIST_IN_UNDERLYING_SECURITY", enumType.toFIXNameString());
        assertEquals("6 - Acting as Market Maker of Specialist in the underlying security of a derivative security", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum529OrderRestrictions.FOREIGN_ENTITY;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("FOREIGN_ENTITY", enumType.toFIXNameString());
        assertEquals("7 - Foreign Entity (of foreign government or regulatory jurisdiction)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum529OrderRestrictions.EXTERNAL_MARKET_PARTICIPANT;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("EXTERNAL_MARKET_PARTICIPANT", enumType.toFIXNameString());
        assertEquals("8 - External Market Participant", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum529OrderRestrictions.EXTERNAL_INTER_CONNECTED;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("EXTERNAL_INTER_CONNECTED", enumType.toFIXNameString());
        assertEquals("9 - External Inter-connected Market Linkage", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  A type
         */
        enumType = Enum529OrderRestrictions.RISKLESS_ARBITRAGE;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("RISKLESS_ARBITRAGE", enumType.toFIXNameString());
        assertEquals("A - Riskless Arbitrage", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}