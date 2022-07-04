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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  911
 *  TotNumReports
 *  int
 *  <p></p>
 *  Total number or reports returned in response to a request
 */
class Tag911IntTotNumReportsTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX911_INT_TOT_NUM_REPORTS;
        assertEquals( "911", fixData.toEnumIDString());
        assertEquals( "TOT_NUM_REPORTS", fixData.toEnumNameString());
        assertEquals( "TotNumReports", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0911Test() {
        Tag911IntTotNumReports tagData;
        int oneElement;

        oneElement = Tag911IntTotNumReports.TESTA_INT_TOT_NUM_REPORTS;
        tagData = new Tag911IntTotNumReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
        assertEquals( "911", tagData.toEnumIDString());
        assertEquals( "TOT_NUM_REPORTS", tagData.toEnumNameString());
        assertEquals( "TotNumReports", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag911IntTotNumReports.TESTB_INT_TOT_NUM_REPORTS;
        tagData = new Tag911IntTotNumReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag911IntTotNumReports tagData;
        int oneElement;

        oneElement = Tag911IntTotNumReports.TESTA_INT_TOT_NUM_REPORTS;
        tagData = new Tag911IntTotNumReports( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag911IntTotNumReports.TESTB_INT_TOT_NUM_REPORTS;
        tagData = new Tag911IntTotNumReports( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag911IntTotNumReports tagData;
        int oneElement;

        oneElement = Tag911IntTotNumReports.TESTB_INT_TOT_NUM_REPORTS;
        tagData = new Tag911IntTotNumReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag911IntTotNumReports tagData;
        int oneElement;

        oneElement = Tag911IntTotNumReports.TESTB_INT_TOT_NUM_REPORTS;
        tagData = new Tag911IntTotNumReports( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag911IntTotNumReports tagData;
        int oneElement;

        oneElement = Tag911IntTotNumReports.TESTB_INT_TOT_NUM_REPORTS;
        tagData = new Tag911IntTotNumReports( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag911IntTotNumReports tagData;
        int oneElement;

        oneElement = Tag911IntTotNumReports.TESTA_INT_TOT_NUM_REPORTS;
        tagData = new Tag911IntTotNumReports( new MyIntType( oneElement ) );
        assertEquals( "Tag911IntTotNumReports\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}