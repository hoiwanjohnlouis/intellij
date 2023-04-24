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

package com.hwtsllc.fixengine.tags.fix43.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  650
 *  LegalConfirm
 *  Boolean
 *  <p>
 *  Indicates that this message is to serve as the final and legal confirmation.
 *  <p>
 *  Valid values:
 *  <p>    N - Does not constitute a Legal Confirm
 *  <p>    Y - Legal Confirm
 */
class Enum650LegalConfirmTest {
    @Test
    void Enum0650Test() {
        Enum650LegalConfirm enumType;
        /*
         *  N, and Y types
         */
        enumType = Enum650LegalConfirm.NO;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("NO", enumType.toFIXNameString());
        assertEquals("N - Does not constitute a Legal Confirm", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum650LegalConfirm.YES;
        assertEquals("Y", enumType.toFIXIDString());
        assertEquals("YES", enumType.toFIXNameString());
        assertEquals("Y - Legal Confirm", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}