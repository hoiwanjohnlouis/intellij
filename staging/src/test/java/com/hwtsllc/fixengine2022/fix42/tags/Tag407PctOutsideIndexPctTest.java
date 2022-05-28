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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  407
 *  OutsideIndexPct
 *  Percentage
 *  <p>
 *  Used in EFP trades.
 *  <p>
 *  Represented as a percentage.
 */
class Tag407PctOutsideIndexPctTest {
    @Test
    void FIX0407Test() {
        FIX42 fixData = FIX42.FIX407_PCT_OUTSIDE_INDEX_PCT;
        assertEquals( "407", fixData.toFIXIDString());
        assertEquals( "OUTSIDE_INDEX_PCT", fixData.toFIXNameString());
        assertEquals( "OutsideIndexPct", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0407Test() {
        Tag407PctOutsideIndexPct tagData;
        double oneElement;

        oneElement = Tag407PctOutsideIndexPct.TESTA_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag407PctOutsideIndexPct.TESTB_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
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
    void TagGetDataValueTest() {
        Tag407PctOutsideIndexPct tagData;
        double oneElement;

        oneElement = Tag407PctOutsideIndexPct.TESTB_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag407PctOutsideIndexPct tagData;
        double oneElement;

        oneElement = Tag407PctOutsideIndexPct.TESTB_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag407PctOutsideIndexPct tagData;
        double oneElement;

        oneElement = Tag407PctOutsideIndexPct.TESTB_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag407PctOutsideIndexPct tagData;
        double oneElement;

        oneElement = Tag407PctOutsideIndexPct.TESTA_PCT_OUTSIDE_INDEX_PCT;
        tagData = new Tag407PctOutsideIndexPct( new MyPercentageType( oneElement ) );
        assertEquals( "Tag407PctOutsideIndexPct\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}