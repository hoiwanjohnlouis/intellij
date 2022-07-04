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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  521
 *  ContAmtCurr
 *  Currency
 *  <p>
 *  Specifies currency for the Contract amount if different from the Deal Currency
 *  <p>
 *  see "Appendix 6-A; Valid Currency Codes".
 */
class Tag521CcyContAmtCurrTest {
    @Test
    void FIX0521Test() {
        FIX43 fixData = FIX43.FIX521_CCY_CONT_AMT_CURR;
        assertEquals( "521", fixData.toEnumIDString());
        assertEquals( "CONT_AMT_CURR", fixData.toEnumNameString());
        assertEquals( "ContAmtCurr", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0521Test() {
        Tag521CcyContAmtCurr tagData;
        String oneElement;

        oneElement = Tag521CcyContAmtCurr.TESTB_CCY_CONT_AMT_CURR;
        tagData = new Tag521CcyContAmtCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag521CcyContAmtCurr.TESTB_CCY_CONT_AMT_CURR;
        tagData = new Tag521CcyContAmtCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag521CcyContAmtCurr tagData;
        String oneElement;

        oneElement = Tag521CcyContAmtCurr.TESTA_CCY_CONT_AMT_CURR;
        tagData = new Tag521CcyContAmtCurr( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag521CcyContAmtCurr.TESTB_CCY_CONT_AMT_CURR;
        tagData = new Tag521CcyContAmtCurr( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag521CcyContAmtCurr tagData;
        String oneElement;

        oneElement = Tag521CcyContAmtCurr.TESTB_CCY_CONT_AMT_CURR;
        tagData = new Tag521CcyContAmtCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag521CcyContAmtCurr tagData;
        String oneElement;

        oneElement = Tag521CcyContAmtCurr.TESTB_CCY_CONT_AMT_CURR;
        tagData = new Tag521CcyContAmtCurr( new MyCurrencyType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag521CcyContAmtCurr tagData;
        String oneElement;

        oneElement = Tag521CcyContAmtCurr.TESTB_CCY_CONT_AMT_CURR;
        tagData = new Tag521CcyContAmtCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag521CcyContAmtCurr tagData;
        String oneElement;

        oneElement = Tag521CcyContAmtCurr.TESTA_CCY_CONT_AMT_CURR;
        tagData = new Tag521CcyContAmtCurr( new MyCurrencyType( oneElement ) );
        assertEquals( "Tag521CcyContAmtCurr\n" +
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