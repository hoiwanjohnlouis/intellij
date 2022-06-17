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
import com.hwtsllc.fixengine2022.datatypes.MyLocalMktDateType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  701
 *  YieldCalcDate
 *  LocalMktDate
 *  <p></p>
 *  Include as needed to clarify yield irregularities associated with date,
 *  <p>
 *  e.g. when it falls on a non-business day.
 */
class Tag701LmdYieldCalcDateTest {
    @Test
    void FIX0701Test() {
        FIX44 fixData = FIX44.FIX701_LMD_YIELD_CALC_DATE;
        assertEquals( "701", fixData.toFIXIDString());
        assertEquals( "YIELD_CALC_DATE", fixData.toFIXNameString());
        assertEquals( "YieldCalcDate", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0701Test() {
        Tag701LmdYieldCalcDate tagData;
        String oneElement;

        oneElement = Tag701LmdYieldCalcDate.TESTA_LMD_YIELD_CALC_DATE;
        tagData = new Tag701LmdYieldCalcDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "701", tagData.toFIXIDString());
        assertEquals( "YIELD_CALC_DATE", tagData.toFIXNameString());
        assertEquals( "YieldCalcDate", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag701LmdYieldCalcDate.TESTB_LMD_YIELD_CALC_DATE;
        tagData = new Tag701LmdYieldCalcDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag701LmdYieldCalcDate tagData;
        String oneElement;

        oneElement = Tag701LmdYieldCalcDate.TESTA_LMD_YIELD_CALC_DATE;
        tagData = new Tag701LmdYieldCalcDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag701LmdYieldCalcDate.TESTB_LMD_YIELD_CALC_DATE;
        tagData = new Tag701LmdYieldCalcDate( new MyLocalMktDateType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag701LmdYieldCalcDate tagData;
        String oneElement;

        oneElement = Tag701LmdYieldCalcDate.TESTB_LMD_YIELD_CALC_DATE;
        tagData = new Tag701LmdYieldCalcDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LMD_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag701LmdYieldCalcDate tagData;
        String oneElement;

        oneElement = Tag701LmdYieldCalcDate.TESTB_LMD_YIELD_CALC_DATE;
        tagData = new Tag701LmdYieldCalcDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag701LmdYieldCalcDate tagData;
        String oneElement;

        oneElement = Tag701LmdYieldCalcDate.TESTB_LMD_YIELD_CALC_DATE;
        tagData = new Tag701LmdYieldCalcDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag701LmdYieldCalcDate tagData;
        String oneElement;

        oneElement = Tag701LmdYieldCalcDate.TESTA_LMD_YIELD_CALC_DATE;
        tagData = new Tag701LmdYieldCalcDate( new MyLocalMktDateType( oneElement ) );
        assertEquals( "Tag701LmdYieldCalcDate\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}