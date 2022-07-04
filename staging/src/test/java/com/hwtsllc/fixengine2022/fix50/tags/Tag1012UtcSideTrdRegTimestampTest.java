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
import com.hwtsllc.fixengine2022.datatypes.MyUTCTimestampType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1012
 *  SideTrdRegTimestamp
 *  UTCTimestamp
 *  <p>
 *  Will be used in a multi-sided message.
 *  <p>
 *  Traded Regulatory timestamp value.
 *  <p>
 *  Use to store time information required by government regulators
 *  or self regulatory organizations such as an exchange or clearing house
 */
class Tag1012UtcSideTrdRegTimestampTest {
    @Test
    void FIX1012Test() {
        FIX50 fixData = FIX50.FIX1012_UTC_SIDE_TRD_REG_TIMESTAMP;
        assertEquals( "1012", fixData.toEnumIDString());
        assertEquals( "SIDE_TRD_REG_TIMESTAMP", fixData.toEnumNameString());
        assertEquals( "SideTrdRegTimestamp", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1012Test() {
        Tag1012UtcSideTrdRegTimestamp tagData;
        String oneElement;

        oneElement = Tag1012UtcSideTrdRegTimestamp.TESTA_UTC_SIDE_TRD_REG_TIMESTAMP;
        tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag1012UtcSideTrdRegTimestamp.TESTB_UTC_SIDE_TRD_REG_TIMESTAMP;
        tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag1012UtcSideTrdRegTimestamp tagData;
        String oneElement;

        oneElement = Tag1012UtcSideTrdRegTimestamp.TESTA_UTC_SIDE_TRD_REG_TIMESTAMP;
        tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag1012UtcSideTrdRegTimestamp.TESTB_UTC_SIDE_TRD_REG_TIMESTAMP;
        tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag1012UtcSideTrdRegTimestamp tagData;
        String oneElement;

        oneElement = Tag1012UtcSideTrdRegTimestamp.TESTB_UTC_SIDE_TRD_REG_TIMESTAMP;
        tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1012UtcSideTrdRegTimestamp tagData;
        String oneElement;

        oneElement = Tag1012UtcSideTrdRegTimestamp.TESTB_UTC_SIDE_TRD_REG_TIMESTAMP;
        tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag1012UtcSideTrdRegTimestamp tagData;
        String oneElement;

        oneElement = Tag1012UtcSideTrdRegTimestamp.TESTB_UTC_SIDE_TRD_REG_TIMESTAMP;
        tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1012UtcSideTrdRegTimestamp tagData;
        String oneElement;

        oneElement = Tag1012UtcSideTrdRegTimestamp.TESTA_UTC_SIDE_TRD_REG_TIMESTAMP;
        tagData = new Tag1012UtcSideTrdRegTimestamp( new MyUTCTimestampType( oneElement ) );
        assertEquals( "Tag1012UtcSideTrdRegTimestamp\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_UTC_DATA_VALUE, tagData.toVerboseString() );
    }
}