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
import com.hwtsllc.fixengine2022.fix44.enums.Enum903CollAsgnTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  903
 *  CollAsgnTransType
 *  int
 *  <p></p>
 *  Collateral Assignment Transaction Type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Replace
 *  <p>    2 - Cancel
 *  <p>    3 - Release
 *  <p>    4 - Reverse
 */
class Tag903EnuCollAsgnTransTypeTest {
    @Test
    void FIX0903Test() {
        FIX44 fixData = FIX44.FIX903_ENU_COLL_ASGN_TRANS_TYPE;
        assertEquals( "903", fixData.toFIXIDString());
        assertEquals( "COLL_ASGN_TRANS_TYPE", fixData.toFIXNameString());
        assertEquals( "CollAsgnTransType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0903Test() {
        Tag903EnuCollAsgnTransType tagData;

        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.NEW );
        assertEquals( Enum903CollAsgnTransType.NEW.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.REPLACE );
        assertEquals( Enum903CollAsgnTransType.REPLACE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.CANCEL );
        assertEquals( Enum903CollAsgnTransType.CANCEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.RELEASE );
        assertEquals( Enum903CollAsgnTransType.RELEASE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag903EnuCollAsgnTransType( Enum903CollAsgnTransType.REVERSE );
        assertEquals( Enum903CollAsgnTransType.REVERSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag903EnuCollAsgnTransType tagData;

        // loop around the ENUM and process
        for ( Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag903EnuCollAsgnTransType tagData;

        // loop around the ENUM and process
        for (Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag903EnuCollAsgnTransType tagData;

        // loop around the ENUM and process
        for (Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag903EnuCollAsgnTransType tagData;

        // loop around the ENUM and process
        for (Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag903EnuCollAsgnTransType tagData;

        // loop around the ENUM and process
        for (Enum903CollAsgnTransType oneEnum : Enum903CollAsgnTransType.values()) {
            tagData = new Tag903EnuCollAsgnTransType(oneEnum);
            assertEquals( "Tag903EnuCollAsgnTransType\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}