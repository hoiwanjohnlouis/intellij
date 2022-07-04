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
import com.hwtsllc.fixengine2022.datatypes.MyPercentageType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  765
 *  AllowableOneSidednessPct
 *  Percentage
 *  <p></p>
 *  The maximum percentage that execution of
 *  <p></p>
 *  one side of a program trade can exceed execution of the other.
 */
class Tag765PctAllowableOneSidednessPctTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX765_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT;
        assertEquals( "765", fixData.toEnumIDString());
        assertEquals( "ALLOWABLE_ONE_SIDEDNESS_PCT", fixData.toEnumNameString());
        assertEquals( "AllowableOneSidednessPct", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0765Test() {
        Tag765PctAllowableOneSidednessPct tagData;
        double oneElement;

        oneElement = Tag765PctAllowableOneSidednessPct.TESTA_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT;
        tagData = new Tag765PctAllowableOneSidednessPct( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "765", tagData.toEnumIDString());
        assertEquals( "ALLOWABLE_ONE_SIDEDNESS_PCT", tagData.toEnumNameString());
        assertEquals( "AllowableOneSidednessPct", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag765PctAllowableOneSidednessPct.TESTB_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT;
        tagData = new Tag765PctAllowableOneSidednessPct( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag765PctAllowableOneSidednessPct tagData;
        double oneElement;

        oneElement = Tag765PctAllowableOneSidednessPct.TESTA_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT;
        tagData = new Tag765PctAllowableOneSidednessPct( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag765PctAllowableOneSidednessPct.TESTB_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT;
        tagData = new Tag765PctAllowableOneSidednessPct( new MyPercentageType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag765PctAllowableOneSidednessPct tagData;
        double oneElement;

        oneElement = Tag765PctAllowableOneSidednessPct.TESTB_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT;
        tagData = new Tag765PctAllowableOneSidednessPct( new MyPercentageType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_PCT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag765PctAllowableOneSidednessPct tagData;
        double oneElement;

        oneElement = Tag765PctAllowableOneSidednessPct.TESTB_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT;
        tagData = new Tag765PctAllowableOneSidednessPct( new MyPercentageType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToStringTest() {
        Tag765PctAllowableOneSidednessPct tagData;
        double oneElement;

        oneElement = Tag765PctAllowableOneSidednessPct.TESTB_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT;
        tagData = new Tag765PctAllowableOneSidednessPct( new MyPercentageType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag765PctAllowableOneSidednessPct tagData;
        double oneElement;

        oneElement = Tag765PctAllowableOneSidednessPct.TESTA_PCT_ALLOWABLE_ONE_SIDEDNESS_PCT;
        tagData = new Tag765PctAllowableOneSidednessPct( new MyPercentageType( oneElement ) );
        assertEquals( "Tag765PctAllowableOneSidednessPct\n" +
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