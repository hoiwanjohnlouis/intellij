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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  128
 *  DeliverToCompID
 *  String
 *  Assigned value used to identify the firm targeted to receive
 *  the message if the message is delivered by a third party
 *  i.e.  the third party firm identifier would be delivered in the
 *  TargetCompID (56) field and the ultimate receiver firm ID in this field.
 */
class Tag128StrDeliverToCompIDTest {
    @Test
    void FIX0128Test() {
        FIX40 fixData = FIX40.FIX128_STR_DELIVER_TO_COMP_ID;
        assertEquals( "DELIVER_TO_COMP_ID", fixData.toFIXNameString());
        assertEquals( "128", fixData.toFIXIDString());
        assertEquals( "DeliverToCompID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0128Test() {
        Tag128StrDeliverToCompID tagData;

        tagData = new Tag128StrDeliverToCompID(new MyStringType("SongJiHyo-128DeliverToCompID") );
        assertEquals( "SongJiHyo-128DeliverToCompID", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag128StrDeliverToCompID tagData;

        tagData = new Tag128StrDeliverToCompID(new MyStringType(Tag128StrDeliverToCompID.TESTB_STR_DELIVER_TO_COMP_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag128StrDeliverToCompID tagData;

        tagData = new Tag128StrDeliverToCompID(new MyStringType(Tag128StrDeliverToCompID.TESTB_STR_DELIVER_TO_COMP_ID));
        assertEquals( Tag128StrDeliverToCompID.TESTB_STR_DELIVER_TO_COMP_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag128StrDeliverToCompID tagData;

        tagData = new Tag128StrDeliverToCompID(new MyStringType(Tag128StrDeliverToCompID.TESTB_STR_DELIVER_TO_COMP_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag128StrDeliverToCompID.TESTB_STR_DELIVER_TO_COMP_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag128StrDeliverToCompID tagData;

        tagData = new Tag128StrDeliverToCompID(new MyStringType(Tag128StrDeliverToCompID.TESTB_STR_DELIVER_TO_COMP_ID));
        assertEquals( Tag128StrDeliverToCompID.TESTB_STR_DELIVER_TO_COMP_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag128StrDeliverToCompID tagData;

        tagData = new Tag128StrDeliverToCompID(new MyStringType(Tag128StrDeliverToCompID.TESTA_STR_DELIVER_TO_COMP_ID));
        assertEquals( "Tag128StrDeliverToCompID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag128StrDeliverToCompID.TESTA_STR_DELIVER_TO_COMP_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag128StrDeliverToCompID.TESTA_STR_DELIVER_TO_COMP_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}