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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *  63
 *  SettlType
 *  String
 *  Indicates order settlement period.
 *
 *  If present, SettlDate (64) overrides this field.
 *
 *  If both SettlType (63) and SettDate (64) are omitted,
 *  the default for SettlType (63) is 0 (Regular)
 *
 *  Regular is defined as the default settlement period
 *  for the particular security on the exchange of execution.
 *
 *  In Fixed Income the contents of this field may influence
 *  the instrument definition if the SecurityID (48) is ambiguous.
 *
 *  In the US an active Treasury offering may be re-opened,
 *  and for a time one CUSIP will apply to both the current
 *  and "when-issued" securities.
 *
 *  Supplying a value of "7" clarifies the instrument description;
 *  any other value or the absence of this field should cause the
 *  respondent to default to the active issue.
 *
 *  Additionally the following patterns may be uses as well as enum values
 *
 *  Dx = FX tenor expression for "days", e.g. "D5", where "x" is any integer > 0
 *  Mx = FX tenor expression for "months", e.g. "M3", where "x" is any integer > 0
 *  Wx = FX tenor expression for "weeks", e.g. "W13", where "x" is any integer > 0
 *  Yx = FX tenor expression for "years", e.g. "Y1", where "x" is any integer > 0
 *
 *  Noted that for FX the tenors expressed using Dx, Mx, Wx, and Yx values
 *  do not denote business days, but calendar days.
 *
 *  Valid values:
 *      0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)
 *      1 - Cash (TOD / T+0)
 *      2 - Next Day (TOM / T+1)
 *      3 - T+2
 *      4 - T+3
 *
 *      5 - T+4
 *      6 - Future
 *      7 - When And If Issued
 *      8 - Sellers Option
 *      9 - T+5
 *
 *      B - Broken date for FX expressing non-standard tenor, SettlDate (64) must be specified
 *      C - FX Spot Next settlement (Spot+1, aka next day)
 *
 *      or any value conforming to the data type Tenor
 */
class Enum63SettlTypeTest {
    @Test
    void Enum0063Test() {
        Enum63SettlType enumType;

        enumType = Enum63SettlType.REGULAR;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "REGULAR", enumType.toFIXNameString());
        assertEquals( "0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum63SettlType.CASH;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "CASH", enumType.toFIXNameString());
        assertEquals( "1 - Cash (TOD / T+0)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum63SettlType.NEXT_DAY;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "NEXT_DAY", enumType.toFIXNameString());
        assertEquals( "2 - Next Day (TOM / T+1)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum63SettlType.T_PLUS_2;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "T_PLUS_2", enumType.toFIXNameString());
        assertEquals( "3 - T+2", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum63SettlType.T_PLUS_3;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "T_PLUS_3", enumType.toFIXNameString());
        assertEquals( "4 - T+3", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum63SettlType.T_PLUS_4;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "T_PLUS_4", enumType.toFIXNameString());
        assertEquals( "5 - T+4", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum63SettlType.FUTURE;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "FUTURE", enumType.toFIXNameString());
        assertEquals( "6 - Future", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum63SettlType.WHEN_ISSUED;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "WHEN_ISSUED", enumType.toFIXNameString());
        assertEquals( "7 - When And If Issued", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum63SettlType.SELLERS_OPTION;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "SELLERS_OPTION", enumType.toFIXNameString());
        assertEquals( "8 - Sellers Option", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum63SettlType.T_PLUS_5;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "T_PLUS_5", enumType.toFIXNameString());
        assertEquals( "9 - T+5", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        enumType = Enum63SettlType.BROKEN_DATE;
        assertEquals( "B", enumType.toFIXIDString());
        assertEquals( "BROKEN_DATE", enumType.toFIXNameString());
        assertEquals( "B - Broken date for FX expressing non-standard tenor, SettlDate (64) must be specified",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum63SettlType.FX_SPOT;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "FX_SPOT", enumType.toFIXNameString());
        assertEquals( "C - FX Spot Next settlement (Spot+1, aka next day)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}