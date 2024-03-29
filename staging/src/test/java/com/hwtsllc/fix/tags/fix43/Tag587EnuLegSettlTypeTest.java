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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.enums.fix43.Enum587LegSettlType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag587EnuLegSettlTypeTest {
    Tag587EnuLegSettlType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum587LegSettlType oneEnum : Enum587LegSettlType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum587LegSettlType oneEnum : Enum587LegSettlType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            assertEquals( "FIX587_ENU_LEG_SETTL_TYPE", tagData.toFIXLabelString());
            assertEquals( "587", tagData.toFIXIDString());
            assertEquals( "LEG_SETTL_TYPE", tagData.toFIXNameString());
            assertEquals( "LegSettlType (formerly named LegSettlmntTyp prior to FIX 4.4)", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum587LegSettlType oneEnum : Enum587LegSettlType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  587
         *  LegSettlType
         *  char
         *  <p>    0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)
         *  <p>    1 - Cash (TOD / T+0)
         *  <p>    2 - Next Day (TOM / T+1)
         *  <p>    3 - T+2
         *  <p>    4 - T+3
         */
        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.REGULAR );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.CASH );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.NEXT_DAY );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.T_PLUS_2 );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.T_PLUS_3 );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - T+4
         *  <p>    6 - Future
         *  <p>    7 - When And If Issued
         *  <p>    8 - Sellers Option
         *  <p>    9 - T+5
         */
        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.T_PLUS_4 );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.FUTURE );
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.WHEN_ISSUED );
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.SELLERS_OPTION );
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.T_PLUS_5 );
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    B - Broken date - for FX expressing non-standard tenor, SettlDate (64) must be specified
         *  <p>    C - FX Spot Next settlement (Spot+1, aka next day)
         */
        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.BROKEN_DATE );
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.FX_SPOT );
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum587LegSettlType oneEnum : Enum587LegSettlType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum587LegSettlType oneEnum : Enum587LegSettlType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            assertEquals( "Tag587EnuLegSettlType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}