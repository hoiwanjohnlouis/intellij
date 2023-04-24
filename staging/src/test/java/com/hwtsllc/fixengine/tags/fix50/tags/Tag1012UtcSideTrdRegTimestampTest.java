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

package com.hwtsllc.fixengine.tags.fix50.tags;

import com.hwtsllc.fixengine.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1012
 *  SideTrdRegTimestamp
 *  UTCTimestamp
 *  <p>
 *  Will be used in a multi-sided message.
 *  <p></p>
 *  Traded Regulatory timestamp value.
 *  <p></p>
 *  Use to store time information required by government regulators
 *  or self regulatory organizations such as an exchange or clearing house
 */
class Tag1012UtcSideTrdRegTimestampTest {
    Tag1012UtcSideTrdRegTimestamp tagData;
    String [] TestArray = {
            Tag1012UtcSideTrdRegTimestamp.TESTA_UTC_SIDE_TRD_REG_TIMESTAMP,
            Tag1012UtcSideTrdRegTimestamp.TESTB_UTC_SIDE_TRD_REG_TIMESTAMP
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ));
            assertEquals( "FIX1012_UTC_SIDE_TRD_REG_TIMESTAMP", tagData.toFIXLabelString());
            assertEquals( "1012", tagData.toFIXIDString());
            assertEquals( "SIDE_TRD_REG_TIMESTAMP", tagData.toFIXNameString());
            assertEquals( "SideTrdRegTimestamp", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ));
            assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ));
            assertEquals( "Tag1012UtcSideTrdRegTimestamp\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}