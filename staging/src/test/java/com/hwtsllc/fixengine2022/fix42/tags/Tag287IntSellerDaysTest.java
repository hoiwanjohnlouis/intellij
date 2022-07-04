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
import com.hwtsllc.fixengine2022.datatypes.MyIntType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  287
 *  SellerDays
 *  int
 *  <p>
 *  Specifies the number of days that may elapse before delivery of the security
 */
class Tag287IntSellerDaysTest {
    @Test
    void FIX0287Test() {
        FIX42 fixData = FIX42.FIX287_INT_SELLER_DAYS;
        assertEquals( "287", fixData.toEnumIDString());
        assertEquals( "SELLER_DAYS", fixData.toEnumNameString());
        assertEquals( "SellerDays", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0287Test() {
        Tag287IntSellerDays tagData;
        int oneElement;

        oneElement = Tag287IntSellerDays.TESTA_INT_SELLER_DAYS;
        tagData = new Tag287IntSellerDays( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag287IntSellerDays.TESTB_INT_SELLER_DAYS;
        tagData = new Tag287IntSellerDays( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag287IntSellerDays tagData;
        int oneElement;

        oneElement = Tag287IntSellerDays.TESTA_INT_SELLER_DAYS;
        tagData = new Tag287IntSellerDays( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag287IntSellerDays.TESTB_INT_SELLER_DAYS;
        tagData = new Tag287IntSellerDays( new MyIntType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag287IntSellerDays tagData;
        int oneElement;

        oneElement = Tag287IntSellerDays.TESTB_INT_SELLER_DAYS;
        tagData = new Tag287IntSellerDays( new MyIntType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_INT_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag287IntSellerDays tagData;
        int oneElement;

        oneElement = Tag287IntSellerDays.TESTB_INT_SELLER_DAYS;
        tagData = new Tag287IntSellerDays( new MyIntType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag287IntSellerDays tagData;
        int oneElement;

        oneElement = Tag287IntSellerDays.TESTB_INT_SELLER_DAYS;
        tagData = new Tag287IntSellerDays( new MyIntType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag287IntSellerDays tagData;
        int oneElement;

        oneElement = Tag287IntSellerDays.TESTA_INT_SELLER_DAYS;
        tagData = new Tag287IntSellerDays( new MyIntType( oneElement ) );
        assertEquals( "Tag287IntSellerDays\n" +
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