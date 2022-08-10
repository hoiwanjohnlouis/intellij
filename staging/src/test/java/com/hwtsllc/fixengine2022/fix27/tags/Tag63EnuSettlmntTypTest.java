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

import com.hwtsllc.fixengine2022.fix27.enums.Enum63SettlType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  63
 *  SettlType
 *  String
 *  <p></p>
 *  Indicates order settlement period.
 *  <p></p>
 *  If present, SettlDate (64) overrides this field.
 *  <p></p>
 *  If both SettlType (63) and SettDate (64) are omitted,
 *  the default for SettlType (63) is 0 (Regular)
 *  <p></p>
 *  Regular is defined as the default settlement period
 *  for the particular security on the exchange of execution.
 *  <p></p>
 *  In Fixed Income the contents of this field may influence
 *  the instrument definition if the SecurityID (48) is ambiguous.
 *  <p></p>
 *  In the US an active Treasury offering may be re-opened,
 *  and for a time one CUSIP will apply to both the current
 *  and "when-issued" securities.
 *  <p></p>
 *  Supplying a value of "7" clarifies the instrument description;
 *  any other value or the absence of this field should cause the
 *  respondent to default to the active issue.
 *  <p></p>
 *  Additionally, the following patterns may be uses as well as enum values
 *  <p></p>
 *  <p>    Dx = FX tenor expression for "days", e.g. "D5", where "x" is any integer > 0
 *  <p>    Mx = FX tenor expression for "months", e.g. "M3", where "x" is any integer > 0
 *  <p>    Wx = FX tenor expression for "weeks", e.g. "W13", where "x" is any integer > 0
 *  <p>    Yx = FX tenor expression for "years", e.g. "Y1", where "x" is any integer > 0
 *  <p></p>
 *  Noted that for FX the tenors expressed using Dx, Mx, Wx, and Yx values
 *  do not denote business days, but calendar days.
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
 *  <p>    B - Broken date for FX expressing non-standard tenor, SettlDate (64) must be specified
 *  <p>    C - FX Spot Next settlement (Spot+1, aka next day)
 *  <p></p>
 *  <p>    Or any value conforming to the data type Tenor
 */
class Tag63EnuSettlmntTypTest {
    Tag63EnuSettlmntTyp tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum63SettlType oneEnum : Enum63SettlType.values()) {
            tagData = new Tag63EnuSettlmntTyp(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum63SettlType oneEnum : Enum63SettlType.values()) {
            tagData = new Tag63EnuSettlmntTyp(oneEnum);
            assertEquals( "FIX63_ENU_SETTLMNT_TYP", tagData.toEnumLabelString());
            assertEquals( "SETTLMNT_TYP", tagData.toEnumNameString());
            assertEquals( "63", tagData.toEnumIDString());
            assertEquals( "SettlmntTyp", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.REGULAR );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.CASH );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.NEXT_DAY );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.T_PLUS_2 );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.T_PLUS_3 );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.T_PLUS_4 );
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.FUTURE );
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.WHEN_ISSUED );
        assertEquals( "7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.SELLERS_OPTION );
        assertEquals( "8", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.T_PLUS_5 );
        assertEquals( "9", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.BROKEN_DATE );
        assertEquals( "B", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag63EnuSettlmntTyp( Enum63SettlType.FX_SPOT );
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for (Enum63SettlType oneEnum : Enum63SettlType.values()) {
            tagData = new Tag63EnuSettlmntTyp(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum63SettlType oneEnum : Enum63SettlType.values()) {
            tagData = new Tag63EnuSettlmntTyp(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum63SettlType oneEnum : Enum63SettlType.values()) {
            tagData = new Tag63EnuSettlmntTyp(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum63SettlType oneEnum : Enum63SettlType.values()) {
            tagData = new Tag63EnuSettlmntTyp(oneEnum);
            assertEquals( "Tag63EnuSettlmntTyp\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}