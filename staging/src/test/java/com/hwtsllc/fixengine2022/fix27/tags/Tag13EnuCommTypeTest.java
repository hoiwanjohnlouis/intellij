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

import com.hwtsllc.fixengine2022.fix27.enums.Enum13CommType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  13
 *  CommType
 *  char
 *  <p></p>
 *  Commission type
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Per Unit (implying shares, par, currency, etc.)
 *  <p>    2 - Percent
 *  <p>    3 - Absolute (total monetary amount)
 *  <p>    4 - Percentage waived - cash discount (for CIV buy orders)
 *  <p>    5 - Percentage waived -= enhanced units (for CIV buy orders)
 *  <p>    6 - Points per bond or contract
 *          (supply ContractMultiplier (231) in the <Instrument> component block
 *           if the object security is denominated in a size other than the
 *           industry default - 1000 par for bonds)
 */
class Tag13EnuCommTypeTest {
    Tag13EnuCommType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum13CommType oneEnum : Enum13CommType.values()) {
            tagData = new Tag13EnuCommType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum13CommType oneEnum : Enum13CommType.values()) {
            tagData = new Tag13EnuCommType(oneEnum);
            assertEquals( "FIX13_ENU_COMM_TYPE", tagData.toEnumLabelString());
            assertEquals( "COMM_TYPE", tagData.toEnumNameString());
            assertEquals( "13", tagData.toEnumIDString());
            assertEquals( "CommType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 1-6 CommTypes
         */
        tagData = new Tag13EnuCommType(Enum13CommType.PER_UNIT);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENT);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.ABSOLUTE);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENTAGE_WAIVED_CASH_DISCOUNT);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENTAGE_WAIVED_ENHANCED_UNITS);
        assertEquals( "5", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag13EnuCommType(Enum13CommType.POINTS_PER_BOND);
        assertEquals( "6", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for (Enum13CommType oneEnum : Enum13CommType.values()) {
            tagData = new Tag13EnuCommType(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum13CommType oneEnum : Enum13CommType.values()) {
            tagData = new Tag13EnuCommType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum13CommType oneEnum : Enum13CommType.values()) {
            tagData = new Tag13EnuCommType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum13CommType oneEnum : Enum13CommType.values()) {
            tagData = new Tag13EnuCommType(oneEnum);
            assertEquals( "Tag13EnuCommType\n" +
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