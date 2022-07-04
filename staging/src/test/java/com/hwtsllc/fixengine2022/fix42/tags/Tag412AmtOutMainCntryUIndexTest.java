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
import com.hwtsllc.fixengine2022.datatypes.MyAmtType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  412
 *  OutMainCntryUIndex
 *  Amt
 *  <p>
 *  Value of stocks in Currency
 */
class Tag412AmtOutMainCntryUIndexTest {
    @Test
    void FIX0412Test() {
        FIX42 fixData = FIX42.FIX412_AMT_OUT_MAIN_CNTRY_U_INDEX;
        assertEquals( "412", fixData.toEnumIDString());
        assertEquals( "OUT_MAIN_CNTRY_U_INDEX", fixData.toEnumNameString());
        assertEquals( "OutMainCntryUIndex", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0412Test() {
        Tag412AmtOutMainCntryUIndex tagData;
        double oneElement;

        oneElement = Tag412AmtOutMainCntryUIndex.TESTA_AMT_OUT_MAIN_CNTRY_U_INDEX;
        tagData = new Tag412AmtOutMainCntryUIndex( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag412AmtOutMainCntryUIndex.TESTB_AMT_OUT_MAIN_CNTRY_U_INDEX;
        tagData = new Tag412AmtOutMainCntryUIndex( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_AMT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag412AmtOutMainCntryUIndex tagData;
        double oneElement;

        oneElement = Tag412AmtOutMainCntryUIndex.TESTA_AMT_OUT_MAIN_CNTRY_U_INDEX;
        tagData = new Tag412AmtOutMainCntryUIndex( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag412AmtOutMainCntryUIndex.TESTB_AMT_OUT_MAIN_CNTRY_U_INDEX;
        tagData = new Tag412AmtOutMainCntryUIndex( new MyAmtType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag412AmtOutMainCntryUIndex tagData;
        double oneElement;

        oneElement = Tag412AmtOutMainCntryUIndex.TESTB_AMT_OUT_MAIN_CNTRY_U_INDEX;
        tagData = new Tag412AmtOutMainCntryUIndex( new MyAmtType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag412AmtOutMainCntryUIndex tagData;
        double oneElement;

        oneElement = Tag412AmtOutMainCntryUIndex.TESTB_AMT_OUT_MAIN_CNTRY_U_INDEX;
        tagData = new Tag412AmtOutMainCntryUIndex( new MyAmtType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag412AmtOutMainCntryUIndex tagData;
        double oneElement;

        oneElement = Tag412AmtOutMainCntryUIndex.TESTB_AMT_OUT_MAIN_CNTRY_U_INDEX;
        tagData = new Tag412AmtOutMainCntryUIndex( new MyAmtType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag412AmtOutMainCntryUIndex tagData;
        double oneElement;

        oneElement = Tag412AmtOutMainCntryUIndex.TESTA_AMT_OUT_MAIN_CNTRY_U_INDEX;
        tagData = new Tag412AmtOutMainCntryUIndex( new MyAmtType( oneElement ) );
        assertEquals( "Tag412AmtOutMainCntryUIndex\n" +
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