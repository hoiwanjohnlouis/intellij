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

import com.hwtsllc.fixengine2022.datatypes.MyEnumLimitType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag843EnuDiscretionLimitTypeTest {
    Tag843EnuDiscretionLimitType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag843EnuDiscretionLimitType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag843EnuDiscretionLimitType(oneEnum);
            assertEquals( "FIX843_ENU_DISCRETION_LIMIT_TYPE", tagData.toFIXLabelString());
            assertEquals( "843", tagData.toFIXIDString());
            assertEquals( "DISCRETION_LIMIT_TYPE", tagData.toFIXNameString());
            assertEquals( "DiscretionLimitType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag843EnuDiscretionLimitType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  843 (same as 837, 843,)
         *  DiscretionLimitType
         *  int
         *  <p>    0 - Or better (default) - price improvement allowed
         *  <p>    1 - Strict - limit is a strict limit
         *  <p>    2 - Or worse - for a buy the peg limit is a minimum
         *                  and for a sell the peg limit is a maximum
         *                  (for use for orders which have a price range)
         */
        tagData = new Tag843EnuDiscretionLimitType( MyEnumLimitType.OR_BETTER );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag843EnuDiscretionLimitType(MyEnumLimitType.STRICT);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag843EnuDiscretionLimitType(MyEnumLimitType.OR_WORSE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag843EnuDiscretionLimitType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag843EnuDiscretionLimitType(oneEnum);
            assertEquals( "Tag843EnuDiscretionLimitType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
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