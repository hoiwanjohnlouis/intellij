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
 *  737
 *  AllocSettlCurrAmt
 *  Amt
 *  <p></p>
 *  Total amount due expressed in settlement currency
 *  <p>
 *  (includes the effect of the forex transaction) for a specific AllocAccount (79).
 */
class Tag737AmtAllocSettlCurrAmtTest {
    @Test
    void FIX0737Test() {
        FIX44 fixData = FIX44.FIX737_AMT_ALLOC_SETTL_CURR_AMT;
        assertEquals( "737", fixData.toFIXIDString());
        assertEquals( "ALLOC_SETTL_CURR_AMT", fixData.toFIXNameString());
        assertEquals( "AllocSettlCurrAmt", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0737Test() {
        Tag737AmtAllocSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag737AmtAllocSettlCurrAmt.TESTA_AMT_ALLOC_SETTL_CURR_AMT;
        tagData = new Tag737AmtAllocSettlCurrAmt( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "737", tagData.toFIXIDString());
        assertEquals( "ALLOC_SETTL_CURR_AMT", tagData.toFIXNameString());
        assertEquals( "AllocSettlCurrAmt", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag737AmtAllocSettlCurrAmt.TESTB_AMT_ALLOC_SETTL_CURR_AMT;
        tagData = new Tag737AmtAllocSettlCurrAmt( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag737AmtAllocSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag737AmtAllocSettlCurrAmt.TESTA_AMT_ALLOC_SETTL_CURR_AMT;
        tagData = new Tag737AmtAllocSettlCurrAmt( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag737AmtAllocSettlCurrAmt.TESTB_AMT_ALLOC_SETTL_CURR_AMT;
        tagData = new Tag737AmtAllocSettlCurrAmt( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag737AmtAllocSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag737AmtAllocSettlCurrAmt.TESTB_AMT_ALLOC_SETTL_CURR_AMT;
        tagData = new Tag737AmtAllocSettlCurrAmt( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag737AmtAllocSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag737AmtAllocSettlCurrAmt.TESTB_AMT_ALLOC_SETTL_CURR_AMT;
        tagData = new Tag737AmtAllocSettlCurrAmt( new MyAmtType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag737AmtAllocSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag737AmtAllocSettlCurrAmt.TESTB_AMT_ALLOC_SETTL_CURR_AMT;
        tagData = new Tag737AmtAllocSettlCurrAmt( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag737AmtAllocSettlCurrAmt tagData;
        double oneElement;

        oneElement = Tag737AmtAllocSettlCurrAmt.TESTA_AMT_ALLOC_SETTL_CURR_AMT;
        tagData = new Tag737AmtAllocSettlCurrAmt( new MyAmtType( oneElement ) );
        assertEquals( "Tag737AmtAllocSettlCurrAmt\n" +
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