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
 *  528
 *  OrderCapacity
 *  char
 *  <p></p>
 *  Designates the capacity of the firm placing the order.
 *  <p>
 *  (as of FIX 4.3, this field replaced Rule80A (tag 47)
 *  <p>
 *  used in conjunction with OrderRestrictions (529) field)
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency
 *  <p>    G - Proprietary
 *  <p>    I - Individual
 *  <p>    P - Principal
 *              (Note for CMS purposes, "Principal" includes "Proprietary")
 *  <p>    R - Riskless Principal
 *  <p></p>
 *  <p>    W - Agent for Other Member
 */
class Enum528OrderCapacityTest {
    /*
     *  Information is the same for TAGS 528
     */
    @Test
    void Enum0528Test() {
        Enum528OrderCapacity enumType;

        /*
         *  A, G, I, P, R, and W types
         */
        enumType = Enum528OrderCapacity.AGENCY;
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("AGENCY", enumType.toFIXNameString());
        assertEquals("A - Agency", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum528OrderCapacity.PROPRIETARY;
        assertEquals("G", enumType.toFIXIDString());
        assertEquals("PROPRIETARY", enumType.toFIXNameString());
        assertEquals("G - Proprietary", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum528OrderCapacity.INDIVIDUAL;
        assertEquals("I", enumType.toFIXIDString());
        assertEquals("INDIVIDUAL", enumType.toFIXNameString());
        assertEquals("I - Individual", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum528OrderCapacity.PRINCIPAL;
        assertEquals("P", enumType.toFIXIDString());
        assertEquals("PRINCIPAL", enumType.toFIXNameString());
        assertEquals("P - Principal (Note for CMS purposes, Principal includes Proprietary)",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum528OrderCapacity.RISKLESS_PRINCIPAL;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("RISKLESS_PRINCIPAL", enumType.toFIXNameString());
        assertEquals("R - Riskless Principal", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        enumType = Enum528OrderCapacity.AGENT_FOR_OTHER_MEMBER;
        assertEquals("W", enumType.toFIXIDString());
        assertEquals("AGENT_FOR_OTHER_MEMBER", enumType.toFIXNameString());
        assertEquals("W - Agent for Other Member", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}