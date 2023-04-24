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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  587
 *  LegSettlType
 *  char
 *  <p></p>
 *  Refer to values for SettlType[63]
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)
 *  <p>    1 - Cash (TOD / T+0)
 *  <p>    2 - Next Day (TOM / T+1)
 *  <p>    3 - T+2
 *  <p>    4 - T+3
 *  <p></p>
 *  <p>    5 - T+4
 *  <p>    6 - Future
 *  <p>    7 - When And If Issued
 *  <p>    8 - Sellers Option
 *  <p>    9 - T+5
 *  <p></p>
 *  <p>    B - Broken date - for FX expressing non-standard tenor, SettlDate (64) must be specified
 *  <p>    C - FX Spot Next settlement (Spot+1, aka next day)
 */
class Enum587LegSettlTypeTest {
    @Test
    void Enum0587Test() {
        Enum587LegSettlType enumType;

        /*
         *  0-9, B-C, types
         */

        /*
         *  0-9, types
         */
        enumType = Enum587LegSettlType.REGULAR;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("REGULAR", enumType.toFIXNameString());
        assertEquals("0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum587LegSettlType.CASH;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("CASH", enumType.toFIXNameString());
        assertEquals("1 - Cash (TOD / T+0)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum587LegSettlType.NEXT_DAY;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("NEXT_DAY", enumType.toFIXNameString());
        assertEquals("2 - Next Day (TOM / T+1)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum587LegSettlType.T_PLUS_2;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("T_PLUS_2", enumType.toFIXNameString());
        assertEquals("3 - T+2", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum587LegSettlType.T_PLUS_3;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("T_PLUS_3", enumType.toFIXNameString());
        assertEquals("4 - T+3", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum587LegSettlType.T_PLUS_4;
        assertEquals("5", enumType.toFIXIDString());
        assertEquals("T_PLUS_4", enumType.toFIXNameString());
        assertEquals("5 - T+4", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum587LegSettlType.FUTURE;
        assertEquals("6", enumType.toFIXIDString());
        assertEquals("FUTURE", enumType.toFIXNameString());
        assertEquals("6 - Future", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum587LegSettlType.WHEN_ISSUED;
        assertEquals("7", enumType.toFIXIDString());
        assertEquals("WHEN_ISSUED", enumType.toFIXNameString());
        assertEquals("7 - When And If Issued", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum587LegSettlType.SELLERS_OPTION;
        assertEquals("8", enumType.toFIXIDString());
        assertEquals("SELLERS_OPTION", enumType.toFIXNameString());
        assertEquals("8 - Sellers Option", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum587LegSettlType.T_PLUS_5;
        assertEquals("9", enumType.toFIXIDString());
        assertEquals("T_PLUS_5", enumType.toFIXNameString());
        assertEquals("9 - T+5", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());



        /*
         *  B-C, types
         */
        enumType = Enum587LegSettlType.BROKEN_DATE;
        assertEquals("B", enumType.toFIXIDString());
        assertEquals("BROKEN_DATE", enumType.toFIXNameString());
        assertEquals("B - Broken date - for FX expressing non-standard tenor, SettlDate (64) must be specified", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum587LegSettlType.FX_SPOT;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("FX_SPOT", enumType.toFIXNameString());
        assertEquals("C - FX Spot Next settlement (Spot+1, aka next day)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}