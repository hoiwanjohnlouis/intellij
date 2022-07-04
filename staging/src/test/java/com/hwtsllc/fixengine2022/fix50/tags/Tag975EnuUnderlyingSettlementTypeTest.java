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

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Enum975UnderlyingSettlementType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  975
 *  UnderlyingSettlementType
 *  int
 *  <p>
 *  Indicates order settlement period for the underlying instrument.
 *  <p></p>
 *  Valid values:
 *  <p>    2 - T+1
 *  <p>    4 - T+3
 *  <p>    5 - T+4
 */
class Tag975EnuUnderlyingSettlementTypeTest {
    @Test
    void FIX0975Test() {
        FIX50 fixData = FIX50.FIX975_ENU_UNDERLYING_SETTLEMENT_TYPE;
        assertEquals( "975", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_SETTLEMENT_TYPE", fixData.toEnumNameString());
        assertEquals( "UnderlyingSettlementType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0975Test() {
        Tag975EnuUnderlyingSettlementType tagData;

        tagData = new Tag975EnuUnderlyingSettlementType( Enum975UnderlyingSettlementType.T_PLUS_1 );
        assertEquals( Enum975UnderlyingSettlementType.T_PLUS_1.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag975EnuUnderlyingSettlementType( Enum975UnderlyingSettlementType.T_PLUS_3 );
        assertEquals( Enum975UnderlyingSettlementType.T_PLUS_3.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag975EnuUnderlyingSettlementType( Enum975UnderlyingSettlementType.T_PLUS_4 );
        assertEquals( Enum975UnderlyingSettlementType.T_PLUS_4.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag975EnuUnderlyingSettlementType tagData;

        // loop around the ENUM and process
        for ( Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag975EnuUnderlyingSettlementType tagData;

        // loop around the ENUM and process
        for (Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag975EnuUnderlyingSettlementType tagData;

        // loop around the ENUM and process
        for (Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag975EnuUnderlyingSettlementType tagData;

        // loop around the ENUM and process
        for (Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag975EnuUnderlyingSettlementType tagData;

        // loop around the ENUM and process
        for (Enum975UnderlyingSettlementType oneEnum : Enum975UnderlyingSettlementType.values()) {
            tagData = new Tag975EnuUnderlyingSettlementType(oneEnum);
            assertEquals( "Tag975EnuUnderlyingSettlementType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}