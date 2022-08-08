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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  762
 *  SecuritySubType
 *  String
 *  <p></p>
 *  Sub-type qualification/identification of the SecurityType
 *  (e.g. for SecurityType="REPO"),
 *  or the CFICode if SecurityType is not specified.
 *  <p></p>
 *  If specified, SecurityType or CFICode is required.
 *  <p>
 *  <p>    Example Values:
 *  <p>    General = General Collateral (for SecurityType=REPO)
 *  <p>    For SecurityType="MLEG" markets can provide the name of the option
 *  <p>    or futures strategy, such as Calendar, Vertical, Butterfly, etc.
 *  <p>    NOTE: Additional values may be used by mutual agreement of the counterparties
 */
class Tag762StrSecuritySubTypeTest {
    Tag762StrSecuritySubType tagData;
    String [] TestArray = {
            Tag762StrSecuritySubType.TESTA_STR_SECURITY_SUB_TYPE,
            Tag762StrSecuritySubType.TESTB_STR_SECURITY_SUB_TYPE
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ));
            assertEquals( "FIX762_STR_SECURITY_SUB_TYPE", tagData.toEnumLabelString());
            assertEquals( "762", tagData.toEnumIDString());
            assertEquals( "SECURITY_SUB_TYPE", tagData.toEnumNameString());
            assertEquals( "SecuritySubType", tagData.toEnumDescriptionString());
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
            tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ));
            assertEquals( oneElement, tagData.getDataValue() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag762StrSecuritySubType( new MyStringType( oneElement ));
            assertEquals( "Tag762StrSecuritySubType\n" +
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