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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.fix50.enums.Enum975UnderlyingSettlementType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag975EnuUnderlyingSettlementTypeTest {
    Tag975EnuUnderlyingSettlementType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            assertEquals( "FIX975_ENU_UNDERLYING_SETTLEMENT_TYPE", tagData.toFIXLabelString());
            assertEquals( "975", tagData.toEnumIDString());
            assertEquals( "UNDERLYING_SETTLEMENT_TYPE", tagData.toEnumNameString());
            assertEquals( "UnderlyingSettlementType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  975
         *  UnderlyingSettlementType
         *  int
         *  <p>    2 - T+1
         *  <p>    4 - T+3
         *  <p>    5 - T+4
         */
        tagData = new Tag975EnuUnderlyingSettlementType( Enum975UnderlyingSettlementType.T_PLUS_1 );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag975EnuUnderlyingSettlementType( Enum975UnderlyingSettlementType.T_PLUS_3 );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag975EnuUnderlyingSettlementType( Enum975UnderlyingSettlementType.T_PLUS_4 );
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            assertEquals( "Tag975EnuUnderlyingSettlementType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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