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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  899
 *  MarginExcess
 *  Amt
 *  <p></p>
 *  Excess margin amount (deficit if value is negative)
 */
class Tag899AmtMarginExcessTest {
    @Test
    void FIX0899Test() {
        FIX44 fixData = FIX44.FIX899_AMT_MARGIN_EXCESS;
        assertEquals( "899", fixData.toFIXIDString());
        assertEquals( "MARGIN_EXCESS", fixData.toFIXNameString());
        assertEquals( "MarginExcess", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0899Test() {
        Tag899AmtMarginExcess tagData;
        double oneElement;

        oneElement = Tag899AmtMarginExcess.TESTA_AMT_MARGIN_EXCESS;
        tagData = new Tag899AmtMarginExcess( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "899", tagData.toFIXIDString());
        assertEquals( "MARGIN_EXCESS", tagData.toFIXNameString());
        assertEquals( "MarginExcess", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag899AmtMarginExcess.TESTB_AMT_MARGIN_EXCESS;
        tagData = new Tag899AmtMarginExcess( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag899AmtMarginExcess tagData;
        double oneElement;

        oneElement = Tag899AmtMarginExcess.TESTA_AMT_MARGIN_EXCESS;
        tagData = new Tag899AmtMarginExcess( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag899AmtMarginExcess.TESTB_AMT_MARGIN_EXCESS;
        tagData = new Tag899AmtMarginExcess( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag899AmtMarginExcess tagData;
        double oneElement;

        oneElement = Tag899AmtMarginExcess.TESTB_AMT_MARGIN_EXCESS;
        tagData = new Tag899AmtMarginExcess( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag899AmtMarginExcess tagData;
        double oneElement;

        oneElement = Tag899AmtMarginExcess.TESTB_AMT_MARGIN_EXCESS;
        tagData = new Tag899AmtMarginExcess( new MyAmtType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag899AmtMarginExcess tagData;
        double oneElement;

        oneElement = Tag899AmtMarginExcess.TESTB_AMT_MARGIN_EXCESS;
        tagData = new Tag899AmtMarginExcess( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag899AmtMarginExcess tagData;
        double oneElement;

        oneElement = Tag899AmtMarginExcess.TESTA_AMT_MARGIN_EXCESS;
        tagData = new Tag899AmtMarginExcess( new MyAmtType( oneElement ) );
        assertEquals( "Tag899AmtMarginExcess\n" +
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