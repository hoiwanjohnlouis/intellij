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

package com.hwtsllc.fixengine2022.fix41.enums;

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  166
 *  SettlLocation
 *  String
 *  <p>
 *  Deprecated in FIX.4.2 Identifies Settlement Depository or Country Code, ISITC spec
 *  <p></p>
 *  Valid values:
 *  <p>    CED - CEDEL
 *  <p>    DTC - Depository Trust Company
 *  <p>    EUR - Euro clear
 *  <p>    FED - Federal Book Entry
 *  <p>    ISO_Country_Code - Local Market Settle Location
 *  <p></p>
 *  <p>    PNY - Physical
 *  <p>    PTC - Participant Trust Company
 */
class Enum166SettlLocationTest {
    @Test
    void Enum0166Test() {
        Enum166SettlLocation enumType;

        /*
         * CED, DTC, EUR, FED, PNY, & PTC msg types
         */
        enumType = Enum166SettlLocation.CEDEL;
        assertEquals("CED", enumType.getID());
        assertEquals("CEDEL", enumType.getName());
        assertEquals("CED - CEDEL", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum166SettlLocation.DEPOSITORY_TRUST_COMPANY;
        assertEquals("DTC", enumType.getID());
        assertEquals("DEPOSITORY_TRUST_COMPANY", enumType.getName());
        assertEquals("DTC - Depository Trust Company", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum166SettlLocation.EURO_CLEAR;
        assertEquals("EUR", enumType.getID());
        assertEquals("EURO_CLEAR", enumType.getName());
        assertEquals("EUR - Euro clear", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum166SettlLocation.FEDERAL_BOOK_ENTRY;
        assertEquals("FED", enumType.getID());
        assertEquals("FEDERAL_BOOK_ENTRY", enumType.getName());
        assertEquals("FED - Federal Book Entry", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum166SettlLocation.PHYSICAL;
        assertEquals("PNY", enumType.getID());
        assertEquals("PHYSICAL", enumType.getName());
        assertEquals("PNY - Physical", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());


        enumType = Enum166SettlLocation.PARTICIPANT_TRUST_COMPANY;
        assertEquals("PTC", enumType.getID());
        assertEquals("PARTICIPANT_TRUST_COMPANY", enumType.getName());
        assertEquals("PTC - Participant Trust Company", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}