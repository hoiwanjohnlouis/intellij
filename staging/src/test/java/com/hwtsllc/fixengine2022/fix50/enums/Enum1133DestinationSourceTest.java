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

package com.hwtsllc.fixengine2022.fix50.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1133
 *  ExDestinationIDSource
 *  char
 *  <p>
 *  The ID source of ExDestination
 *  <p></p>
 *  Valid values:
 *  <p>    B - BIC (Bank Identification Code) (ISO 9362)
 *  <p>    C - Generally accepted market participant identifier (e.g. NASD mnemonic)
 *  <p>    D - Proprietary / Custom code
 *  <p>    E - ISO Country Code
 *  <p>    G - MIC (ISO 10383 - Market Identifier Code)
 */
class Enum1133DestinationSourceTest {
    @Test
    void EnumTest() {
        Enum1133DestinationSource enumType;

        enumType = Enum1133DestinationSource.BIC;
        assertEquals( "B", enumType.toEnumIDString() );
        assertEquals( "BIC", enumType.toEnumNameString() );
        assertEquals( "B - BIC (Bank Identification Code) (ISO 9362)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1133DestinationSource.MARKET_PARTICIPANT_IDENTIFIER;
        assertEquals( "C", enumType.toEnumIDString() );
        assertEquals( "MARKET_PARTICIPANT_IDENTIFIER", enumType.toEnumNameString() );
        assertEquals( "C - Generally accepted market participant identifier (e.g. NASD mnemonic)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1133DestinationSource.PROPRIETARY;
        assertEquals( "D", enumType.toEnumIDString() );
        assertEquals( "PROPRIETARY", enumType.toEnumNameString() );
        assertEquals( "D - Proprietary / Custom code", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1133DestinationSource.ISO_COUNTRY_CODE;
        assertEquals( "E", enumType.toEnumIDString() );
        assertEquals( "ISO_COUNTRY_CODE", enumType.toEnumNameString() );
        assertEquals( "E - ISO Country Code", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum1133DestinationSource.MIC;
        assertEquals( "G", enumType.toEnumIDString() );
        assertEquals( "MIC", enumType.toEnumNameString() );
        assertEquals( "G - MIC (ISO 10383 - Market Identifier Code)", enumType.toEnumDescriptionString() );
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}