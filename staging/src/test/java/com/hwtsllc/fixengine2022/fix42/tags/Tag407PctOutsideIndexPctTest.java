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

import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  407
 *  OutsideIndexPct
 *  Percentage
 *  <p></p>
 *  Used in EFP trades.
 *  <p></p>
 *  Represented as a percentage.
 */
class Tag407PctOutsideIndexPctTest {
    @Test
    void PrintTest() {
        Tag407PctOutsideIndexPct tagData;
        double oneElement;

        oneElement = Tag407PctOutsideIndexPct.TESTA_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag407PctOutsideIndexPct.TESTB_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag407PctOutsideIndexPct tagData;
        double oneElement;

        oneElement = Tag407PctOutsideIndexPct.TESTA_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag407PctOutsideIndexPct.TESTB_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag407PctOutsideIndexPct tagData, final double oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag407PctOutsideIndexPct tagData ) {
        assertEquals( "FIX407_PCT_OUTSIDE_INDEX_PCT", tagData.toEnumLabelString());
        assertEquals( "407", tagData.toEnumIDString());
        assertEquals( "OUTSIDE_INDEX_PCT", tagData.toEnumNameString());
        assertEquals( "OutsideIndexPct", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag407PctOutsideIndexPct tagData, final double oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag407PctOutsideIndexPct tagData, final double oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag407PctOutsideIndexPct tagData, final double oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag407PctOutsideIndexPct tagData ) {
        assertEquals( "Tag407PctOutsideIndexPct\n" +
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