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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  157
 *  NumDaysInterest
 *  int
 *  <p></p>
 *  Number of Days of Interest for convertible bonds and fixed income.
 *  <p></p>
 *  Note value may be negative.
 */
class Tag157IntNumDaysInterestTest {
    @Test
    void PrintTest() {
        Tag157IntNumDaysInterest tagData;
        int oneElement;

        oneElement = Tag157IntNumDaysInterest.TESTA_INT_NUM_DAYS_INTEREST;
        tagData = new Tag157IntNumDaysInterest(new MyIntType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag157IntNumDaysInterest.TESTB_INT_NUM_DAYS_INTEREST;
        tagData = new Tag157IntNumDaysInterest(new MyIntType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag157IntNumDaysInterest tagData;
        int oneElement;

        oneElement = Tag157IntNumDaysInterest.TESTA_INT_NUM_DAYS_INTEREST;
        tagData = new Tag157IntNumDaysInterest(new MyIntType( oneElement ));
        verifyAll( tagData, oneElement );

        oneElement = Tag157IntNumDaysInterest.TESTB_INT_NUM_DAYS_INTEREST;
        tagData = new Tag157IntNumDaysInterest(new MyIntType( oneElement ));
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag157IntNumDaysInterest tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag157IntNumDaysInterest tagData ) {
        assertEquals( "FIX157_INT_NUM_DAYS_INTEREST", tagData.toEnumLabelString());
        assertEquals( "157", tagData.toEnumIDString());
        assertEquals( "NUM_DAYS_INTEREST", tagData.toEnumNameString());
        assertEquals( "NumDaysInterest", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag157IntNumDaysInterest tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag157IntNumDaysInterest tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag157IntNumDaysInterest tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag157IntNumDaysInterest tagData ) {
        assertEquals( "Tag157IntNumDaysInterest\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}