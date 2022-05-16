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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
        assertEquals("CED", enumType.toFIXIDString());
        assertEquals("CEDEL", enumType.toFIXNameString());
        assertEquals("CED - CEDEL", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum166SettlLocation.DEPOSITORY_TRUST_COMPANY;
        assertEquals("DTC", enumType.toFIXIDString());
        assertEquals("DEPOSITORY_TRUST_COMPANY", enumType.toFIXNameString());
        assertEquals("DTC - Depository Trust Company", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum166SettlLocation.EURO_CLEAR;
        assertEquals("EUR", enumType.toFIXIDString());
        assertEquals("EURO_CLEAR", enumType.toFIXNameString());
        assertEquals("EUR - Euro clear", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum166SettlLocation.FEDERAL_BOOK_ENTRY;
        assertEquals("FED", enumType.toFIXIDString());
        assertEquals("FEDERAL_BOOK_ENTRY", enumType.toFIXNameString());
        assertEquals("FED - Federal Book Entry", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum166SettlLocation.PHYSICAL;
        assertEquals("PNY", enumType.toFIXIDString());
        assertEquals("PHYSICAL", enumType.toFIXNameString());
        assertEquals("PNY - Physical", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum166SettlLocation.PARTICIPANT_TRUST_COMPANY;
        assertEquals("PTC", enumType.toFIXIDString());
        assertEquals("PARTICIPANT_TRUST_COMPANY", enumType.toFIXNameString());
        assertEquals("PTC - Participant Trust Company", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}