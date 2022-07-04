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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  237
 *  TotalTakedown
 *  Amt
 *  <p>
 *  The price at which the securities are distributed to the different members of an
 *  underwriting group for the primary market in Municipals, total gross underwriter's spread.
 *  <p></p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 */
class Tag237AmtTotalTakedownTest {
    @Test
    void FIX0237Test() {
        FIX42 fixData = FIX42.FIX237_AMT_TOTAL_TAKEDOWN;
        assertEquals( "237", fixData.toEnumIDString());
        assertEquals( "TOTAL_TAKEDOWN", fixData.toEnumNameString());
        assertEquals( "TotalTakedown", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0237Test() {
        Tag237AmtTotalTakedown tagData;
        double oneElement;

        oneElement = Tag237AmtTotalTakedown.TESTA_AMT_TOTAL_TAKEDOWN;
        tagData = new Tag237AmtTotalTakedown( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag237AmtTotalTakedown.TESTB_AMT_TOTAL_TAKEDOWN;
        tagData = new Tag237AmtTotalTakedown( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag237AmtTotalTakedown tagData;
        double oneElement;

        oneElement = Tag237AmtTotalTakedown.TESTA_AMT_TOTAL_TAKEDOWN;
        tagData = new Tag237AmtTotalTakedown( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag237AmtTotalTakedown.TESTB_AMT_TOTAL_TAKEDOWN;
        tagData = new Tag237AmtTotalTakedown( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag237AmtTotalTakedown tagData;
        double oneElement;

        oneElement = Tag237AmtTotalTakedown.TESTB_AMT_TOTAL_TAKEDOWN;
        tagData = new Tag237AmtTotalTakedown( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag237AmtTotalTakedown tagData;
        double oneElement;

        oneElement = Tag237AmtTotalTakedown.TESTB_AMT_TOTAL_TAKEDOWN;
        tagData = new Tag237AmtTotalTakedown( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag237AmtTotalTakedown tagData;
        double oneElement;

        oneElement = Tag237AmtTotalTakedown.TESTB_AMT_TOTAL_TAKEDOWN;
        tagData = new Tag237AmtTotalTakedown( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag237AmtTotalTakedown tagData;
        double oneElement;

        oneElement = Tag237AmtTotalTakedown.TESTA_AMT_TOTAL_TAKEDOWN;
        tagData = new Tag237AmtTotalTakedown( new MyAmtType( oneElement ) );
        assertEquals( "Tag237AmtTotalTakedown\n" +
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