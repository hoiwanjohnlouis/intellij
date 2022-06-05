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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix42.enums.Enum216RoutingType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag587EnuLegSettlType;
import com.hwtsllc.fixengine2022.fix43.enums.Enum587LegSettlType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
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
class Tag587EnuLegSettlTypeTest {
    @Test
    void FIX0587Test() {
        FIX43 fixData = FIX43.FIX587_ENU_LEG_SETTL_TYPE;
        assertEquals( "587", fixData.toFIXIDString());
        assertEquals( "LEG_SETTL_TYPE", fixData.toFIXNameString());
        assertEquals( "LegSettlType (formerly named LegSettlmntTyp prior to FIX 4.4)", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0587Test() {
        Tag587EnuLegSettlType tagData;

        /*
         *  0-9, B-C, types
         */

        /*
         *  0-9, types
         */
        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.REGULAR );
        assertEquals( Enum587LegSettlType.REGULAR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.CASH );
        assertEquals( Enum587LegSettlType.CASH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.NEXT_DAY );
        assertEquals( Enum587LegSettlType.NEXT_DAY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.T_PLUS_2 );
        assertEquals( Enum587LegSettlType.T_PLUS_2.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.T_PLUS_3 );
        assertEquals( Enum587LegSettlType.T_PLUS_3.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.T_PLUS_4 );
        assertEquals( Enum587LegSettlType.T_PLUS_4.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.FUTURE );
        assertEquals( Enum587LegSettlType.FUTURE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.WHEN_ISSUED );
        assertEquals( Enum587LegSettlType.WHEN_ISSUED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.SELLERS_OPTION );
        assertEquals( Enum587LegSettlType.SELLERS_OPTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.T_PLUS_5 );
        assertEquals( Enum587LegSettlType.T_PLUS_5.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  B-C, types
         */
        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.BROKEN_DATE );
        assertEquals( Enum587LegSettlType.BROKEN_DATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag587EnuLegSettlType( Enum587LegSettlType.FX_SPOT );
        assertEquals( Enum587LegSettlType.FX_SPOT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag587EnuLegSettlType tagData;

        // loop around the ENUM and process
        for ( Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag587EnuLegSettlType tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag587EnuLegSettlType tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag587EnuLegSettlType tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag587EnuLegSettlType tagData;

        // loop around the ENUM and process
        for (Enum216RoutingType oneEnum : Enum216RoutingType.values()) {
            tagData = new Tag587EnuLegSettlType(oneEnum);
            assertEquals( "Tag587EnuLegSettlType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}