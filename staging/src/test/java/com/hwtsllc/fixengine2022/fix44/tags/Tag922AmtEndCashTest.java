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
 *  922
 *  EndCash
 *  Amt
 *  <p></p>
 *  Ending dirty cash consideration of a financing deal.
 *  i.e. reimbursed to the buyer on the End Date.
 */
class Tag922AmtEndCashTest {
    @Test
    void FIX0922Test() {
        FIX44 fixData = FIX44.FIX922_AMT_END_CASH;
        assertEquals( "922", fixData.toEnumIDString());
        assertEquals( "END_CASH", fixData.toEnumNameString());
        assertEquals( "EndCash", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0922Test() {
        Tag922AmtEndCash tagData;
        double oneElement;

        oneElement = Tag922AmtEndCash.TESTA_AMT_END_CASH;
        tagData = new Tag922AmtEndCash( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "922", tagData.toEnumIDString());
        assertEquals( "END_CASH", tagData.toEnumNameString());
        assertEquals( "EndCash", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag922AmtEndCash.TESTB_AMT_END_CASH;
        tagData = new Tag922AmtEndCash( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag922AmtEndCash tagData;
        double oneElement;

        oneElement = Tag922AmtEndCash.TESTA_AMT_END_CASH;
        tagData = new Tag922AmtEndCash( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag922AmtEndCash.TESTB_AMT_END_CASH;
        tagData = new Tag922AmtEndCash( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag922AmtEndCash tagData;
        double oneElement;

        oneElement = Tag922AmtEndCash.TESTB_AMT_END_CASH;
        tagData = new Tag922AmtEndCash( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag922AmtEndCash tagData;
        double oneElement;

        oneElement = Tag922AmtEndCash.TESTB_AMT_END_CASH;
        tagData = new Tag922AmtEndCash( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag922AmtEndCash tagData;
        double oneElement;

        oneElement = Tag922AmtEndCash.TESTB_AMT_END_CASH;
        tagData = new Tag922AmtEndCash( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag922AmtEndCash tagData;
        double oneElement;

        oneElement = Tag922AmtEndCash.TESTA_AMT_END_CASH;
        tagData = new Tag922AmtEndCash( new MyAmtType( oneElement ) );
        assertEquals( "Tag922AmtEndCash\n" +
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