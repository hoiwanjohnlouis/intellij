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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  772
 *  ConfirmRefID
 *  String
 *  <p></p>
 *  Reference identifier to be used with ConfirmTransType (666) = Replace or Cancel
 */
class Tag772StrConfirmRefIDTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX772_STR_CONFIRM_REF_ID;
        assertEquals( "772", fixData.toEnumIDString());
        assertEquals( "CONFIRM_REF_ID", fixData.toEnumNameString());
        assertEquals( "ConfirmRefID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0772Test() {
        Tag772StrConfirmRefID tagData;
        String oneElement;

        oneElement = Tag772StrConfirmRefID.TESTA_STR_CONFIRM_REF_ID;
        tagData = new Tag772StrConfirmRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
        assertEquals( "772", tagData.toEnumIDString());
        assertEquals( "CONFIRM_REF_ID", tagData.toEnumNameString());
        assertEquals( "ConfirmRefID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag772StrConfirmRefID.TESTB_STR_CONFIRM_REF_ID;
        tagData = new Tag772StrConfirmRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag772StrConfirmRefID tagData;
        String oneElement;

        oneElement = Tag772StrConfirmRefID.TESTA_STR_CONFIRM_REF_ID;
        tagData = new Tag772StrConfirmRefID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag772StrConfirmRefID.TESTB_STR_CONFIRM_REF_ID;
        tagData = new Tag772StrConfirmRefID( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag772StrConfirmRefID tagData;
        String oneElement;

        oneElement = Tag772StrConfirmRefID.TESTB_STR_CONFIRM_REF_ID;
        tagData = new Tag772StrConfirmRefID( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag772StrConfirmRefID tagData;
        String oneElement;

        oneElement = Tag772StrConfirmRefID.TESTB_STR_CONFIRM_REF_ID;
        tagData = new Tag772StrConfirmRefID( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag772StrConfirmRefID tagData;
        String oneElement;

        oneElement = Tag772StrConfirmRefID.TESTB_STR_CONFIRM_REF_ID;
        tagData = new Tag772StrConfirmRefID(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag772StrConfirmRefID tagData;
        String oneElement;

        oneElement = Tag772StrConfirmRefID.TESTA_STR_CONFIRM_REF_ID;
        tagData = new Tag772StrConfirmRefID( new MyStringType( oneElement ) );
        assertEquals( "Tag772StrConfirmRefID\n" +
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