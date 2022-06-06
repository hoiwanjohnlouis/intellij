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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  598
 *  LegLocaleOfIssue
 *  String
 *  <p>
 *  Multileg instrument's individual leg security’s LocaleOfIssue.
 *  <p>
 *  See LocaleOfIssue (472) field for description
 */
class Tag598StrLegLocaleOfIssueTest {
    @Test
    void FIX0598Test() {
        FIX43 fixData = FIX43.FIX598_STR_LEG_LOCALE_OF_ISSUE;
        assertEquals( "598", fixData.toFIXIDString());
        assertEquals( "LEG_LOCALE_OF_ISSUE", fixData.toFIXNameString());
        assertEquals( "LegLocaleOfIssue", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0598Test() {
        Tag598StrLegLocaleOfIssue tagData;
        String oneElement;

        oneElement = Tag598StrLegLocaleOfIssue.TESTA_STR_LEG_LOCALE_OF_ISSUE;
        tagData = new Tag598StrLegLocaleOfIssue( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag598StrLegLocaleOfIssue.TESTB_STR_LEG_LOCALE_OF_ISSUE;
        tagData = new Tag598StrLegLocaleOfIssue( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag598StrLegLocaleOfIssue tagData;
        String oneElement;

        oneElement = Tag598StrLegLocaleOfIssue.TESTA_STR_LEG_LOCALE_OF_ISSUE;
        tagData = new Tag598StrLegLocaleOfIssue( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag598StrLegLocaleOfIssue.TESTB_STR_LEG_LOCALE_OF_ISSUE;
        tagData = new Tag598StrLegLocaleOfIssue( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag598StrLegLocaleOfIssue tagData;
        String oneElement;

        oneElement = Tag598StrLegLocaleOfIssue.TESTB_STR_LEG_LOCALE_OF_ISSUE;
        tagData = new Tag598StrLegLocaleOfIssue( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag598StrLegLocaleOfIssue tagData;
        String oneElement;

        oneElement = Tag598StrLegLocaleOfIssue.TESTB_STR_LEG_LOCALE_OF_ISSUE;
        tagData = new Tag598StrLegLocaleOfIssue( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag598StrLegLocaleOfIssue tagData;
        String oneElement;

        oneElement = Tag598StrLegLocaleOfIssue.TESTB_STR_LEG_LOCALE_OF_ISSUE;
        tagData = new Tag598StrLegLocaleOfIssue(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag598StrLegLocaleOfIssue tagData;
        String oneElement;

        oneElement = Tag598StrLegLocaleOfIssue.TESTA_STR_LEG_LOCALE_OF_ISSUE;
        tagData = new Tag598StrLegLocaleOfIssue( new MyStringType( oneElement ) );
        assertEquals( "Tag598StrLegLocaleOfIssue\n" +
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