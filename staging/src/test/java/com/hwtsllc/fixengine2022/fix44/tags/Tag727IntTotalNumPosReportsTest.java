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
 *  727
 *  TotalNumPosReports
 *  int
 *  <p></p>
 *  Total number of Position Reports being returned.
 */
class Tag727IntTotalNumPosReportsTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX727_INT_TOTAL_NUM_POS_REPORTS;
        assertEquals( "727", fixData.toEnumIDString());
        assertEquals( "TOTAL_NUM_POS_REPORTS", fixData.toEnumNameString());
        assertEquals( "TotalNumPosReports", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0727Test() {
        Tag727IntTotalNumPosReports tagData;
        int oneElement;

        oneElement = Tag727IntTotalNumPosReports.TESTA_INT_TOTAL_NUM_POS_REPORTS;
        tagData = new Tag727IntTotalNumPosReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
        assertEquals( "727", tagData.toEnumIDString());
        assertEquals( "TOTAL_NUM_POS_REPORTS", tagData.toEnumNameString());
        assertEquals( "TotalNumPosReports", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag727IntTotalNumPosReports.TESTB_INT_TOTAL_NUM_POS_REPORTS;
        tagData = new Tag727IntTotalNumPosReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag727IntTotalNumPosReports tagData;
        int oneElement;

        oneElement = Tag727IntTotalNumPosReports.TESTA_INT_TOTAL_NUM_POS_REPORTS;
        tagData = new Tag727IntTotalNumPosReports( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag727IntTotalNumPosReports.TESTB_INT_TOTAL_NUM_POS_REPORTS;
        tagData = new Tag727IntTotalNumPosReports( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag727IntTotalNumPosReports tagData;
        int oneElement;

        oneElement = Tag727IntTotalNumPosReports.TESTB_INT_TOTAL_NUM_POS_REPORTS;
        tagData = new Tag727IntTotalNumPosReports( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag727IntTotalNumPosReports tagData;
        int oneElement;

        oneElement = Tag727IntTotalNumPosReports.TESTB_INT_TOTAL_NUM_POS_REPORTS;
        tagData = new Tag727IntTotalNumPosReports( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag727IntTotalNumPosReports tagData;
        int oneElement;

        oneElement = Tag727IntTotalNumPosReports.TESTB_INT_TOTAL_NUM_POS_REPORTS;
        tagData = new Tag727IntTotalNumPosReports( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag727IntTotalNumPosReports tagData;
        int oneElement;

        oneElement = Tag727IntTotalNumPosReports.TESTA_INT_TOTAL_NUM_POS_REPORTS;
        tagData = new Tag727IntTotalNumPosReports( new MyIntType( oneElement ) );
        assertEquals( "Tag727IntTotalNumPosReports\n" +
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