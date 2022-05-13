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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix27.enums.Enum63SettlType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
class Tag63EnuSettlmntTypTest {
    @Test
    void FIX0063Test() {
        FIX27 fixData = FIX27.FIX63_ENU_SETTLMNT_TYP;
        assertEquals( "SETTLMNT_TYP", fixData.getName());
        assertEquals( "63", fixData.getID());
        assertEquals( "SettlmntTyp", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.getEnumName());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0063Test() {
        Tag63EnuSettlmntTyp tagData;

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.REGULAR );
        assertEquals( Enum63SettlType.REGULAR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.CASH );
        assertEquals( Enum63SettlType.CASH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.NEXT_DAY );
        assertEquals( Enum63SettlType.NEXT_DAY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.T_PLUS_2 );
        assertEquals( Enum63SettlType.T_PLUS_2.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.T_PLUS_3 );
        assertEquals( Enum63SettlType.T_PLUS_3.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.T_PLUS_4 );
        assertEquals( Enum63SettlType.T_PLUS_4.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.FUTURE );
        assertEquals( Enum63SettlType.FUTURE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.WHEN_ISSUED );
        assertEquals( Enum63SettlType.WHEN_ISSUED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.SELLERS_OPTION );
        assertEquals( Enum63SettlType.SELLERS_OPTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.T_PLUS_5 );
        assertEquals( Enum63SettlType.T_PLUS_5.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.BROKEN_DATE );
        assertEquals( Enum63SettlType.BROKEN_DATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.FX_SPOT );
        assertEquals( Enum63SettlType.FX_SPOT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}