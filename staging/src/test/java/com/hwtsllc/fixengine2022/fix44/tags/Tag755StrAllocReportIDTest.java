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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  755
 *  AllocReportID
 *  String
 *  <p></p>
 *  Unique identifier for Allocation Report message.
 */
class Tag755StrAllocReportIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX755_STR_ALLOC_REPORT_ID;
        assertEquals( "755", fixData.toEnumIDString());
        assertEquals( "ALLOC_REPORT_ID", fixData.toEnumNameString());
        assertEquals( "AllocReportID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0755Test() {
        Tag755StrAllocReportID tagData;
        String oneElement;

        oneElement = Tag755StrAllocReportID.TESTA_STR_ALLOC_REPORT_ID;
        tagData = new Tag755StrAllocReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "755", tagData.toEnumIDString());
        assertEquals( "ALLOC_REPORT_ID", tagData.toEnumNameString());
        assertEquals( "AllocReportID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag755StrAllocReportID.TESTB_STR_ALLOC_REPORT_ID;
        tagData = new Tag755StrAllocReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag755StrAllocReportID tagData;
        String oneElement;

        oneElement = Tag755StrAllocReportID.TESTA_STR_ALLOC_REPORT_ID;
        tagData = new Tag755StrAllocReportID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag755StrAllocReportID.TESTB_STR_ALLOC_REPORT_ID;
        tagData = new Tag755StrAllocReportID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag755StrAllocReportID tagData;
        String oneElement;

        oneElement = Tag755StrAllocReportID.TESTB_STR_ALLOC_REPORT_ID;
        tagData = new Tag755StrAllocReportID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag755StrAllocReportID tagData;
        String oneElement;

        oneElement = Tag755StrAllocReportID.TESTB_STR_ALLOC_REPORT_ID;
        tagData = new Tag755StrAllocReportID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag755StrAllocReportID tagData;
        String oneElement;

        oneElement = Tag755StrAllocReportID.TESTB_STR_ALLOC_REPORT_ID;
        tagData = new Tag755StrAllocReportID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag755StrAllocReportID tagData;
        String oneElement;

        oneElement = Tag755StrAllocReportID.TESTA_STR_ALLOC_REPORT_ID;
        tagData = new Tag755StrAllocReportID( new MyStringType( oneElement ) );
        assertEquals( "Tag755StrAllocReportID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}