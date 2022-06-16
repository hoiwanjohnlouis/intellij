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
import com.hwtsllc.fixengine2022.datatypes.MyCurrencyType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  767
 *  AllowableOneSidednessCurr
 *  Currency
 *  <p></p>
 *  The currency that AllowableOneSidednessValue (766)
 *  is expressed in if AllowableOneSidednessValue is used.
 */
class Tag767CcyAllowableOneSidednessCurrTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX767_CCY_ALLOWABLE_ONE_SIDEDNESS_CURR;
        assertEquals( "767", fixData.toFIXIDString());
        assertEquals( "ALLOWABLE_ONE_SIDEDNESS_CURR", fixData.toFIXNameString());
        assertEquals( "AllowableOneSidednessCurr", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0767Test() {
        Tag767CcyAllowableOneSidednessCurr tagData;
        String oneElement;

        oneElement = Tag767CcyAllowableOneSidednessCurr.TESTA_CCY_ALLOWABLE_ONE_SIDEDNESS_CURR;
        tagData = new Tag767CcyAllowableOneSidednessCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "767", tagData.toFIXIDString());
        assertEquals( "ALLOWABLE_ONE_SIDEDNESS_CURR", tagData.toFIXNameString());
        assertEquals( "AllowableOneSidednessCurr", tagData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());

        oneElement = Tag767CcyAllowableOneSidednessCurr.TESTB_CCY_ALLOWABLE_ONE_SIDEDNESS_CURR;
        tagData = new Tag767CcyAllowableOneSidednessCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag767CcyAllowableOneSidednessCurr tagData;
        String oneElement;

        oneElement = Tag767CcyAllowableOneSidednessCurr.TESTA_CCY_ALLOWABLE_ONE_SIDEDNESS_CURR;
        tagData = new Tag767CcyAllowableOneSidednessCurr( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag767CcyAllowableOneSidednessCurr.TESTB_CCY_ALLOWABLE_ONE_SIDEDNESS_CURR;
        tagData = new Tag767CcyAllowableOneSidednessCurr( new MyCurrencyType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag767CcyAllowableOneSidednessCurr tagData;
        String oneElement;

        oneElement = Tag767CcyAllowableOneSidednessCurr.TESTB_CCY_ALLOWABLE_ONE_SIDEDNESS_CURR;
        tagData = new Tag767CcyAllowableOneSidednessCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag767CcyAllowableOneSidednessCurr tagData;
        String oneElement;

        oneElement = Tag767CcyAllowableOneSidednessCurr.TESTB_CCY_ALLOWABLE_ONE_SIDEDNESS_CURR;
        tagData = new Tag767CcyAllowableOneSidednessCurr( new MyCurrencyType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag767CcyAllowableOneSidednessCurr tagData;
        String oneElement;

        oneElement = Tag767CcyAllowableOneSidednessCurr.TESTB_CCY_ALLOWABLE_ONE_SIDEDNESS_CURR;
        tagData = new Tag767CcyAllowableOneSidednessCurr( new MyCurrencyType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag767CcyAllowableOneSidednessCurr tagData;
        String oneElement;

        oneElement = Tag767CcyAllowableOneSidednessCurr.TESTA_CCY_ALLOWABLE_ONE_SIDEDNESS_CURR;
        tagData = new Tag767CcyAllowableOneSidednessCurr( new MyCurrencyType( oneElement ) );
        assertEquals( "Tag767CcyAllowableOneSidednessCurr\n" +
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