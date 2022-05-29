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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  986
 *  UnderlyingCollectAmount
 *  Amt
 *  <p>
 *  Amount to collect in order to deliver the underlying instrument
 */
class Tag986AmtUnderlyingCollectAmountTest {
    @Test
    void FIX0986Test() {
        FIX50 fixData = FIX50.FIX986_AMT_UNDERLYING_COLLECT_AMOUNT;
        assertEquals( "986", fixData.toFIXIDString());
        assertEquals( "UNDERLYING_COLLECT_AMOUNT", fixData.toFIXNameString());
        assertEquals( "UnderlyingCollectAmount", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0986Test() {
        Tag986AmtUnderlyingCollectAmount tagData;
        double oneElement;

        oneElement = Tag986AmtUnderlyingCollectAmount.TESTA_AMT_UNDERLYING_COLLECT_AMOUNT;
        tagData = new Tag986AmtUnderlyingCollectAmount( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag986AmtUnderlyingCollectAmount.TESTB_AMT_UNDERLYING_COLLECT_AMOUNT;
        tagData = new Tag986AmtUnderlyingCollectAmount( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag986AmtUnderlyingCollectAmount tagData;
        double oneElement;

        oneElement = Tag986AmtUnderlyingCollectAmount.TESTA_AMT_UNDERLYING_COLLECT_AMOUNT;
        tagData = new Tag986AmtUnderlyingCollectAmount( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag986AmtUnderlyingCollectAmount.TESTB_AMT_UNDERLYING_COLLECT_AMOUNT;
        tagData = new Tag986AmtUnderlyingCollectAmount( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag986AmtUnderlyingCollectAmount tagData;
        double oneElement;

        oneElement = Tag986AmtUnderlyingCollectAmount.TESTB_AMT_UNDERLYING_COLLECT_AMOUNT;
        tagData = new Tag986AmtUnderlyingCollectAmount( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag986AmtUnderlyingCollectAmount tagData;
        double oneElement;

        oneElement = Tag986AmtUnderlyingCollectAmount.TESTB_AMT_UNDERLYING_COLLECT_AMOUNT;
        tagData = new Tag986AmtUnderlyingCollectAmount( new MyAmtType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag986AmtUnderlyingCollectAmount tagData;
        double oneElement;

        oneElement = Tag986AmtUnderlyingCollectAmount.TESTB_AMT_UNDERLYING_COLLECT_AMOUNT;
        tagData = new Tag986AmtUnderlyingCollectAmount( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag986AmtUnderlyingCollectAmount tagData;
        double oneElement;

        oneElement = Tag986AmtUnderlyingCollectAmount.TESTA_AMT_UNDERLYING_COLLECT_AMOUNT;
        tagData = new Tag986AmtUnderlyingCollectAmount( new MyAmtType( oneElement ) );
        assertEquals( "Tag986AmtUnderlyingCollectAmount\n" +
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