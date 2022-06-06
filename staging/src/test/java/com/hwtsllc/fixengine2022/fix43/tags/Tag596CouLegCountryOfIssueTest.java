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
 *  596
 *  LegCountryOfIssue
 *  Country
 *  <p>
 *  Multileg instrument's individual leg security’s CountryOfIssue.
 *  <p>
 *  See CountryOfIssue (470) field for description
 */
class Tag596CouLegCountryOfIssueTest {
    @Test
    void FIX0596Test() {
        FIX43 fixData = FIX43.FIX596_COU_LEG_COUNTRY_OF_ISSUE;
        assertEquals( "596", fixData.toFIXIDString());
        assertEquals( "LEG_COUNTRY_OF_ISSUE", fixData.toFIXNameString());
        assertEquals( "LegCountryOfIssue", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0596Test() {
        Tag596CouLegCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag596CouLegCountryOfIssue.TESTA_COU_LEG_COUNTRY_OF_ISSUE;
        tagData = new Tag596CouLegCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag596CouLegCountryOfIssue.TESTB_COU_LEG_COUNTRY_OF_ISSUE;
        tagData = new Tag596CouLegCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag596CouLegCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag596CouLegCountryOfIssue.TESTA_COU_LEG_COUNTRY_OF_ISSUE;
        tagData = new Tag596CouLegCountryOfIssue( new MyCountryType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag596CouLegCountryOfIssue.TESTB_COU_LEG_COUNTRY_OF_ISSUE;
        tagData = new Tag596CouLegCountryOfIssue( new MyCountryType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag596CouLegCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag596CouLegCountryOfIssue.TESTB_COU_LEG_COUNTRY_OF_ISSUE;
        tagData = new Tag596CouLegCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag596CouLegCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag596CouLegCountryOfIssue.TESTB_COU_LEG_COUNTRY_OF_ISSUE;
        tagData = new Tag596CouLegCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag596CouLegCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag596CouLegCountryOfIssue.TESTB_COU_LEG_COUNTRY_OF_ISSUE;
        tagData = new Tag596CouLegCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag596CouLegCountryOfIssue tagData;
        String oneElement;

        oneElement = Tag596CouLegCountryOfIssue.TESTA_COU_LEG_COUNTRY_OF_ISSUE;
        tagData = new Tag596CouLegCountryOfIssue( new MyCountryType( oneElement ) );
        assertEquals( "Tag596CouLegCountryOfIssue\n" +
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