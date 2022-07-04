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
 *  832
 *  TotNumAssignmentReports
 *  int
 *  <p></p>
 *  Total Number of Assignment Reports being returned to a firm
 */
class Tag832IntTotNumAssignmentReportsTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX832_INT_TOT_NUM_ASSIGNMENT_REPORTS;
        assertEquals( "832", fixData.toEnumIDString());
        assertEquals( "TOT_NUM_ASSIGNMENT_REPORTS", fixData.toEnumNameString());
        assertEquals( "TotNumAssignmentReports", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0832Test() {
        Tag832IntTotNumAssignmentReports tagData;
        int oneElement;

        oneElement = Tag832IntTotNumAssignmentReports.TESTA_INT_TOT_NUM_ASSIGNMENT_REPORTS;
        tagData = new Tag832IntTotNumAssignmentReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
        assertEquals( "832", tagData.toEnumIDString());
        assertEquals( "TOT_NUM_ASSIGNMENT_REPORTS", tagData.toEnumNameString());
        assertEquals( "TotNumAssignmentReports", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag832IntTotNumAssignmentReports.TESTB_INT_TOT_NUM_ASSIGNMENT_REPORTS;
        tagData = new Tag832IntTotNumAssignmentReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag832IntTotNumAssignmentReports tagData;
        int oneElement;

        oneElement = Tag832IntTotNumAssignmentReports.TESTA_INT_TOT_NUM_ASSIGNMENT_REPORTS;
        tagData = new Tag832IntTotNumAssignmentReports( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag832IntTotNumAssignmentReports.TESTB_INT_TOT_NUM_ASSIGNMENT_REPORTS;
        tagData = new Tag832IntTotNumAssignmentReports( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag832IntTotNumAssignmentReports tagData;
        int oneElement;

        oneElement = Tag832IntTotNumAssignmentReports.TESTB_INT_TOT_NUM_ASSIGNMENT_REPORTS;
        tagData = new Tag832IntTotNumAssignmentReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag832IntTotNumAssignmentReports tagData;
        int oneElement;

        oneElement = Tag832IntTotNumAssignmentReports.TESTB_INT_TOT_NUM_ASSIGNMENT_REPORTS;
        tagData = new Tag832IntTotNumAssignmentReports( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag832IntTotNumAssignmentReports tagData;
        int oneElement;

        oneElement = Tag832IntTotNumAssignmentReports.TESTB_INT_TOT_NUM_ASSIGNMENT_REPORTS;
        tagData = new Tag832IntTotNumAssignmentReports( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag832IntTotNumAssignmentReports tagData;
        int oneElement;

        oneElement = Tag832IntTotNumAssignmentReports.TESTA_INT_TOT_NUM_ASSIGNMENT_REPORTS;
        tagData = new Tag832IntTotNumAssignmentReports( new MyIntType( oneElement ) );
        assertEquals( "Tag832IntTotNumAssignmentReports\n" +
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