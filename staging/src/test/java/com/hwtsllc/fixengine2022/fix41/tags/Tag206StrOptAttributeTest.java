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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  206
 *  OptAttribute
 *  char
 *  <p>
 *  Can be used for SecurityType (167) =OPT to identify a particular security.
 *  <p></p>
 *  Valid values vary by SecurityExchange:
 *  <p>    *** REPLACED values - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *      For Exchange: MONEP (Paris)
 *  <p>    L = Long (a.k.a. "American")
 *  <p>    S = Short (a.k.a. "European")
 *  <p></p>
 *      For Exchanges: DTB (Frankfurt), HKSE (Hong Kong), and SOFFEX (Zurich)
 *  <p>    0-9 = single digit "version" number assigned by exchange following capital adjustments
 *               (0=current, 1=prior, 2=prior to , etc).
 */
class Tag206StrOptAttributeTest {
    Tag206StrOptAttribute tagData;
    String [] TestArray = {
            Tag206StrOptAttribute.TESTA_STR_OPT_ATTRIBUTE,
            Tag206StrOptAttribute.TESTB_STR_OPT_ATTRIBUTE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag206StrOptAttribute( new MyStringType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag206StrOptAttribute( new MyStringType( oneElement ));
            assertEquals( "FIX206_STR_OPT_ATTRIBUTE", tagData.toEnumLabelString());
            assertEquals( "206", tagData.toEnumIDString());
            assertEquals( "OPT_ATTRIBUTE", tagData.toEnumNameString());
            assertEquals( "OptAttribute", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag206StrOptAttribute( new MyStringType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag206StrOptAttribute( new MyStringType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag206StrOptAttribute( new MyStringType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag206StrOptAttribute( new MyStringType( oneElement ));
            assertEquals( "Tag206StrOptAttribute\n" +
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
}