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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  138
 *  MiscFeeCurr
 *  Currency
 *  Currency of miscellaneous fee
 */
class Tag138CcyMiscFeeCurrTest {
    @Test
    void FIX0138Test() {
        FIX40 fixData = FIX40.FIX138_CCY_MISC_FEE_CURR;
        assertEquals( "MISC_FEE_CURR", fixData.toFIXNameString());
        assertEquals( "138", fixData.toFIXIDString());
        assertEquals( "MiscFeeCurr", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0138Test() {
        Tag138CcyMiscFeeCurr tagData;

        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType("SungHyunAh-138MiscFeeCurr") );
        assertEquals( "SungHyunAh-138MiscFeeCurr", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag138CcyMiscFeeCurr tagData;

        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType(Tag138CcyMiscFeeCurr.TESTB_CCY_MISC_FEE_CURR));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag138CcyMiscFeeCurr tagData;

        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType(Tag138CcyMiscFeeCurr.TESTB_CCY_MISC_FEE_CURR));
        assertEquals( Tag138CcyMiscFeeCurr.TESTB_CCY_MISC_FEE_CURR, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag138CcyMiscFeeCurr tagData;

        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType(Tag138CcyMiscFeeCurr.TESTB_CCY_MISC_FEE_CURR));
        assertEquals( tagData.toFIXIDString() + "=" + Tag138CcyMiscFeeCurr.TESTB_CCY_MISC_FEE_CURR,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag138CcyMiscFeeCurr tagData;

        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType(Tag138CcyMiscFeeCurr.TESTB_CCY_MISC_FEE_CURR));
        assertEquals( Tag138CcyMiscFeeCurr.TESTB_CCY_MISC_FEE_CURR,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag138CcyMiscFeeCurr tagData;

        tagData = new Tag138CcyMiscFeeCurr(new MyCurrencyType(Tag138CcyMiscFeeCurr.TESTA_CCY_MISC_FEE_CURR));
        assertEquals( "Tag138CcyMiscFeeCurr\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag138CcyMiscFeeCurr.TESTA_CCY_MISC_FEE_CURR + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag138CcyMiscFeeCurr.TESTA_CCY_MISC_FEE_CURR + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}