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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyEnumLimitType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  837 (same as 837, 843,)
 *  PegLimitType
 *  int
 *  <p>
 *  Type of Peg Limit
 *  <p></p>
 *  843 (same as 837, 843,)
 *  DiscretionLimitType
 *  int
 *  <p>
 *  Type of Discretion Limit
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Or better (default) - price improvement allowed
 *  <p>    1 - Strict - limit is a strict limit
 *  <p>    2 - Or worse - for a buy the peg limit is a minimum
 *                  and for a sell the peg limit is a maximum
 *                  (for use for orders which have a price range)
 */
class Tag837EnuPegLimitTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX837_ENU_PEG_LIMIT_TYPE;
        assertEquals( "837", fixData.toEnumIDString());
        assertEquals( "PEG_LIMIT_TYPE", fixData.toEnumNameString());
        assertEquals( "PegLimitType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0837Test() {
        Tag837EnuPegLimitType tagData;
        MyEnumLimitType oneElement;

        oneElement = MyEnumLimitType.OR_BETTER;
        tagData = new Tag837EnuPegLimitType( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "837", tagData.toEnumIDString());
        assertEquals( "PEG_LIMIT_TYPE", tagData.toEnumNameString());
        assertEquals( "PegLimitType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag837EnuPegLimitType(MyEnumLimitType.STRICT);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag837EnuPegLimitType(MyEnumLimitType.OR_WORSE);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag837EnuPegLimitType tagData;

        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag837EnuPegLimitType tagData;

        // loop around the ENUM and process
        for (MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag837EnuPegLimitType tagData;

        // loop around the ENUM and process
        for (MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag837EnuPegLimitType tagData;

        // loop around the ENUM and process
        for (MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag837EnuPegLimitType tagData;

        // loop around the ENUM and process
        for (MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            assertEquals( "Tag837EnuPegLimitType\n" +
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