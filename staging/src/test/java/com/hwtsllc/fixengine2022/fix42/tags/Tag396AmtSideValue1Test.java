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

import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  396
 *  SideValue1
 *  Amt
 *  <p></p>
 *  Amounts in currency
 */
class Tag396AmtSideValue1Test {
    @Test
    void PrintTest() {
        Tag396AmtSideValue1 tagData;
        double oneElement;

        oneElement = Tag396AmtSideValue1.TESTA_AMT_SIDE_VALUE1;
        tagData = new Tag396AmtSideValue1( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag396AmtSideValue1.TESTB_AMT_SIDE_VALUE1;
        tagData = new Tag396AmtSideValue1( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag396AmtSideValue1 tagData;
        double oneElement;

        oneElement = Tag396AmtSideValue1.TESTA_AMT_SIDE_VALUE1;
        tagData = new Tag396AmtSideValue1( new MyAmtType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag396AmtSideValue1.TESTB_AMT_SIDE_VALUE1;
        tagData = new Tag396AmtSideValue1( new MyAmtType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag396AmtSideValue1 tagData, final double oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag396AmtSideValue1 tagData ) {
        assertEquals( "FIX396_AMT_SIDE_VALUE1", tagData.toEnumLabelString());
        assertEquals( "396", tagData.toEnumIDString());
        assertEquals( "SIDE_VALUE1", tagData.toEnumNameString());
        assertEquals( "SideValue1", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag396AmtSideValue1 tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag396AmtSideValue1 tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag396AmtSideValue1 tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag396AmtSideValue1 tagData ) {
        assertEquals( "Tag396AmtSideValue1\n" +
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