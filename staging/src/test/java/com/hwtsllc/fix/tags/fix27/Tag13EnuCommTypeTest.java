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

package com.hwtsllc.fix.tags.fix27;

import com.hwtsllc.fix.enums.fix27.Enum13CommType;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
            assertEquals( "FIX13_ENU_COMM_TYPE", tagData.toFIXLabelString());
            assertEquals( "COMM_TYPE", tagData.toFIXNameString());
            assertEquals( "13", tagData.toFIXIDString());
            assertEquals( "CommType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum13CommType oneEnum : Enum13CommType.values()) {
            tagData = new Tag13EnuCommType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  13
         *  <p>    1 - Per Unit (implying shares, par, currency, etc.)
         *  <p>    2 - Percent
         *  <p>    3 - Absolute (total monetary amount)
         *  <p>    4 - Percentage waived - cash discount (for CIV buy orders)
         *  <p>    5 - Percentage waived -= enhanced units (for CIV buy orders)
         */
        tagData = new Tag13EnuCommType(Enum13CommType.PER_UNIT);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENT);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag13EnuCommType(Enum13CommType.ABSOLUTE);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENTAGE_WAIVED_CASH_DISCOUNT);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag13EnuCommType(Enum13CommType.PERCENTAGE_WAIVED_ENHANCED_UNITS);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Points per bond or contract
         *          (supply ContractMultiplier (231) in the <Instrument> component block
         *           if the object security is denominated in a size other than the
         *           industry default - 1000 par for bonds)
         */
        tagData = new Tag13EnuCommType(Enum13CommType.POINTS_PER_BOND);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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