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

import com.hwtsllc.fixengine2022.fix44.enums.Enum903CollAsgnTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag903EnuCollAsgnTransTypeTest {
    Tag903EnuCollAsgnTransType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            assertEquals( "FIX903_ENU_COLL_ASGN_TRANS_TYPE", tagData.toEnumLabelString());
            assertEquals( "903", tagData.toEnumIDString());
            assertEquals( "COLL_ASGN_TRANS_TYPE", tagData.toEnumNameString());
            assertEquals( "CollAsgnTransType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  903
         *  CollAsgnTransType
         *  int
         *  <p>    0 - New
         *  <p>    1 - Replace
         *  <p>    2 - Cancel
         *  <p>    3 - Release
         *  <p>    4 - Reverse
         */
        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.NEW );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.REPLACE );
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.CANCEL );
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.RELEASE );
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.REVERSE );
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            assertEquals( "Tag903EnuCollAsgnTransType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}