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
 *  532
 *  MassCancelRejectReason
 *  int
 *  <p></p>
 *  Reason Order Mass Cancel Request was rejected
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Mass Cancel Not Supported
 *  <p>    1 - Invalid or Unknown Security
 *  <p>    2 - Invalid or Unkown Underlying security
 *  <p>    3 - Invalid or Unknown Product
 *  <p>    4 - Invalid or Unknown CFICode
 *  <p></p>
 *  <p>    5 - Invalid or Unknown SecurityType
 *  <p>    6 - Invalid or Unknown Trading Session
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Enum532MassCancelRejectReasonTest {
    /*
     *  Information is the same for TAGS 532
     */
    @Test
    void Enum0532Test() {
        Enum532MassCancelRejectReason enumType;

        /*
         *  0-6, 99, types
         */

        /*
         *  0-6, types
         */
        enumType = Enum532MassCancelRejectReason.MASS_CANCEL_NOT_SUPPORTED;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("MASS_CANCEL_NOT_SUPPORTED", enumType.toFIXNameString());
        assertEquals("0 - Mass Cancel Not Supported", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_SECURITY;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("UNKNOWN_SECURITY", enumType.toFIXNameString());
        assertEquals("1 - Invalid or Unknown Security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_UNDERLYING;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("UNKNOWN_UNDERLYING", enumType.toFIXNameString());
        assertEquals("2 - Invalid or Unknown Underlying security", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_PRODUCT;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("UNKNOWN_PRODUCT", enumType.toFIXNameString());
        assertEquals("3 - Invalid or Unknown Product", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_CFICODE;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("UNKNOWN_CFICODE", enumType.toFIXNameString());
        assertEquals("4 - Invalid or Unknown CFICode", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum532MassCancelRejectReason.UNKNOWN_SECURITYTYPE;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("UNKNOWN_SECURITYTYPE", enumType.toFIXNameString());
        assertEquals("5 - Invalid or Unknown SecurityType", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_SESSION;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("UNKNOWN_SESSION", enumType.toFIXNameString());
        assertEquals("6 - Invalid or Unknown Trading Session", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  99, type
         */
        enumType = Enum532MassCancelRejectReason.OTHER;
        assertEquals("99", enumType.toFIXIDString());
        assertEquals("OTHER", enumType.toFIXNameString());
        assertEquals("99 - Other", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}