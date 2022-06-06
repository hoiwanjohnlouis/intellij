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
 *  478
 *  CashDistribCurr
 *  Currency
 *  <p>
 *  Specifies currency to be  use for Cash Distributions
 *  <p>
 *  see "Appendix 6-A; Valid Currency Codes".
 */
class Tag478CcyCashDistribCurrTest {
    @Test
    void FIX0478Test() {
        FIX43 fixData = FIX43.FIX478_CCY_CASH_DISTRIB_CURR;
        assertEquals( "478", fixData.toFIXIDString());
        assertEquals( "CASH_DISTRIB_CURR", fixData.toFIXNameString());
        assertEquals( "CashDistribCurr", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0478Test() {
        Tag478CcyCashDistribCurr tagData;
        String oneElement;

        oneElement = Tag478CcyCashDistribCurr.TESTA_CCY_CASH_DISTRIB_CURR;
        tagData = new Tag478CcyCashDistribCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag478CcyCashDistribCurr.TESTB_CCY_CASH_DISTRIB_CURR;
        tagData = new Tag478CcyCashDistribCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag478CcyCashDistribCurr tagData;
        String oneElement;

        oneElement = Tag478CcyCashDistribCurr.TESTA_CCY_CASH_DISTRIB_CURR;
        tagData = new Tag478CcyCashDistribCurr( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag478CcyCashDistribCurr.TESTB_CCY_CASH_DISTRIB_CURR;
        tagData = new Tag478CcyCashDistribCurr( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag478CcyCashDistribCurr tagData;
        String oneElement;

        oneElement = Tag478CcyCashDistribCurr.TESTB_CCY_CASH_DISTRIB_CURR;
        tagData = new Tag478CcyCashDistribCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag478CcyCashDistribCurr tagData;
        String oneElement;

        oneElement = Tag478CcyCashDistribCurr.TESTB_CCY_CASH_DISTRIB_CURR;
        tagData = new Tag478CcyCashDistribCurr( new MyCurrencyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag478CcyCashDistribCurr tagData;
        String oneElement;

        oneElement = Tag478CcyCashDistribCurr.TESTB_CCY_CASH_DISTRIB_CURR;
        tagData = new Tag478CcyCashDistribCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag478CcyCashDistribCurr tagData;
        String oneElement;

        oneElement = Tag478CcyCashDistribCurr.TESTA_CCY_CASH_DISTRIB_CURR;
        tagData = new Tag478CcyCashDistribCurr( new MyCurrencyType( oneElement ) );
        assertEquals( "Tag478CcyCashDistribCurr\n" +
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