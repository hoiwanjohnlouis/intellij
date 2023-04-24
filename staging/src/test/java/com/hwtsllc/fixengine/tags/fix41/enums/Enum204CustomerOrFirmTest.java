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

package com.hwtsllc.fixengine.tags.fix41.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  204
 *  CustomerOrFirm
 *  int
 *  <p>
 *  Deprecated in FIX.4.2
 *  <p>
 *  Used for options when delivering the order to an execution system
 *  or an exchange to specify if the order is for a  customer or the firm placing the order itself.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Customer
 *  <p>    1 - Firm
 */
class Enum204CustomerOrFirmTest {
    @Test
    void Enum0204Test() {
        Enum204CustomerOrFirm enumType;

        /*
         * 0-1 msg types
         */
        enumType = Enum204CustomerOrFirm.CUSTOMER;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("CUSTOMER", enumType.toFIXNameString());
        assertEquals("0 - Customer", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum204CustomerOrFirm.FIRM;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("FIRM", enumType.toFIXNameString());
        assertEquals("1 - Firm", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}