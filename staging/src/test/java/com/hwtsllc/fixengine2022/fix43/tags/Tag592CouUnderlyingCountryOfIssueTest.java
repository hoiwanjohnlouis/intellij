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
import com.hwtsllc.fixengine2022.datatypes.MyCountryType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  592
 *  UnderlyingCountryOfIssue
 *  Country
 *  <p>
 *  Underlying security’s CountryOfIssue.
 *  <p>
 *  See CountryOfIssue (470) field for description
 */
class Tag592CouUnderlyingCountryOfIssueTest {
    @Test
    void FIX0592Test() {
        FIX43 fixData = FIX43.FIX592_COU_UNDERLYING_COUNTRY_OF_ISSUE;
        assertEquals( "592", fixData.toEnumIDString());
        assertEquals( "UNDERLYING_COUNTRY_OF_ISSUE", fixData.toEnumNameString());
        assertEquals( "UnderlyingCountryOfIssue", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0592Test() {
        Tag592CouUnderlyingCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag592CouUnderlyingCountryOfIssue.TESTA_COU_UNDERLYING_COUNTRY_OF_ISSUE;
        tagData = new Tag592CouUnderlyingCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag592CouUnderlyingCountryOfIssue.TESTB_COU_UNDERLYING_COUNTRY_OF_ISSUE;
        tagData = new Tag592CouUnderlyingCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag592CouUnderlyingCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag592CouUnderlyingCountryOfIssue.TESTA_COU_UNDERLYING_COUNTRY_OF_ISSUE;
        tagData = new Tag592CouUnderlyingCountryOfIssue( new MyCountryType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag592CouUnderlyingCountryOfIssue.TESTB_COU_UNDERLYING_COUNTRY_OF_ISSUE;
        tagData = new Tag592CouUnderlyingCountryOfIssue( new MyCountryType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag592CouUnderlyingCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag592CouUnderlyingCountryOfIssue.TESTB_COU_UNDERLYING_COUNTRY_OF_ISSUE;
        tagData = new Tag592CouUnderlyingCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag592CouUnderlyingCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag592CouUnderlyingCountryOfIssue.TESTB_COU_UNDERLYING_COUNTRY_OF_ISSUE;
        tagData = new Tag592CouUnderlyingCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag592CouUnderlyingCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag592CouUnderlyingCountryOfIssue.TESTB_COU_UNDERLYING_COUNTRY_OF_ISSUE;
        tagData = new Tag592CouUnderlyingCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag592CouUnderlyingCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag592CouUnderlyingCountryOfIssue.TESTA_COU_UNDERLYING_COUNTRY_OF_ISSUE;
        tagData = new Tag592CouUnderlyingCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( "Tag592CouUnderlyingCountryOfIssue\n" +
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