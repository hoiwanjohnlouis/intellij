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
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("MASS_CANCEL_NOT_SUPPORTED", enumType.toEnumNameString());
        assertEquals("0 - Mass Cancel Not Supported", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_SECURITY;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("UNKNOWN_SECURITY", enumType.toEnumNameString());
        assertEquals("1 - Invalid or Unknown Security", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_UNDERLYING;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("UNKNOWN_UNDERLYING", enumType.toEnumNameString());
        assertEquals("2 - Invalid or Unknown Underlying security", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_PRODUCT;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("UNKNOWN_PRODUCT", enumType.toEnumNameString());
        assertEquals("3 - Invalid or Unknown Product", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_CFICODE;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("UNKNOWN_CFICODE", enumType.toEnumNameString());
        assertEquals("4 - Invalid or Unknown CFICode", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum532MassCancelRejectReason.UNKNOWN_SECURITYTYPE;
        assertEquals("5", enumType.toEnumIDString());
        assertEquals("UNKNOWN_SECURITYTYPE", enumType.toEnumNameString());
        assertEquals("5 - Invalid or Unknown SecurityType", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum532MassCancelRejectReason.UNKNOWN_SESSION;
        assertEquals("6", enumType.toEnumIDString());
        assertEquals("UNKNOWN_SESSION", enumType.toEnumNameString());
        assertEquals("6 - Invalid or Unknown Trading Session", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());



        /*
         *  99, type
         */
        enumType = Enum532MassCancelRejectReason.OTHER;
        assertEquals("99", enumType.toEnumIDString());
        assertEquals("OTHER", enumType.toEnumNameString());
        assertEquals("99 - Other", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}