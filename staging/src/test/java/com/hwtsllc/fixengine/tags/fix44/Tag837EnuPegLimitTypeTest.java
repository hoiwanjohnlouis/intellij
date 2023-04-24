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

package com.hwtsllc.fixengine.tags.fix44;

import com.hwtsllc.fixengine.datatypes.MyEnumLimitType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag837EnuPegLimitTypeTest {
    Tag837EnuPegLimitType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            assertEquals( "FIX837_ENU_PEG_LIMIT_TYPE", tagData.toFIXLabelString());
            assertEquals( "837", tagData.toFIXIDString());
            assertEquals( "PEG_LIMIT_TYPE", tagData.toFIXNameString());
            assertEquals( "PegLimitType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  837 (same as 837, 843,)
         *  PegLimitType
         *  int
         *  843 (same as 837, 843,)
         *  DiscretionLimitType
         *  int
         *  <p>    0 - Or better (default) - price improvement allowed
         *  <p>    1 - Strict - limit is a strict limit
         *  <p>    2 - Or worse - for a buy the peg limit is a minimum
         *                  and for a sell the peg limit is a maximum
         *                  (for use for orders which have a price range)
         */
        tagData = new Tag837EnuPegLimitType( MyEnumLimitType.OR_BETTER );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag837EnuPegLimitType(MyEnumLimitType.STRICT);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag837EnuPegLimitType(MyEnumLimitType.OR_WORSE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumLimitType oneEnum : MyEnumLimitType.values()) {
            tagData = new Tag837EnuPegLimitType(oneEnum);
            assertEquals( "Tag837EnuPegLimitType\n" +
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