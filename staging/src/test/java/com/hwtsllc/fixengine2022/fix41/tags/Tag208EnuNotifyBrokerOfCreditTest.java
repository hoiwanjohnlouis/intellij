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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyBooleanType;
import com.hwtsllc.fixengine2022.fix41.enums.Enum208NotifyBrokerOfCredit;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  208
 *  NotifyBrokerOfCredit
 *  Boolean
 *  <p>
 *  Indicates whether or not details should be communicated to BrokerOfCredit (i.e. step-in broker).
 *  <p></p>
 *  Valid values:
 *  <p>    N - Details should not be communicated
 *  <p>    Y - Details should be communicated
 */
class Tag208EnuNotifyBrokerOfCreditTest {
    @Test
    void FIX0208Test() {
        FIX41 fixData = FIX41.FIX208_ENU_NOTIFY_BROKER_OF_CREDIT;
        assertEquals( "208", fixData.toFIXIDString());
        assertEquals( "NOTIFY_BROKER_OF_CREDIT", fixData.toFIXNameString());
        assertEquals( "NotifyBrokerOfCredit", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0208Test() {
        Tag208EnuNotifyBrokerOfCredit tagData;

        tagData = new Tag208EnuNotifyBrokerOfCredit(Enum208NotifyBrokerOfCredit.NO);
        assertEquals( MyBooleanType.NO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag208EnuNotifyBrokerOfCredit(Enum208NotifyBrokerOfCredit.YES);
        assertEquals( MyBooleanType.YES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag208EnuNotifyBrokerOfCredit tagData;

        // loop around the ENUM and process
        for (Enum208NotifyBrokerOfCredit oneEnum : Enum208NotifyBrokerOfCredit.values()) {
            tagData = new Tag208EnuNotifyBrokerOfCredit(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag208EnuNotifyBrokerOfCredit tagData;

        // loop around the ENUM and process
        for (Enum208NotifyBrokerOfCredit oneEnum : Enum208NotifyBrokerOfCredit.values()) {
            tagData = new Tag208EnuNotifyBrokerOfCredit(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag208EnuNotifyBrokerOfCredit tagData;

        // loop around the ENUM and process
        for (Enum208NotifyBrokerOfCredit oneEnum : Enum208NotifyBrokerOfCredit.values()) {
            tagData = new Tag208EnuNotifyBrokerOfCredit(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag208EnuNotifyBrokerOfCredit tagData;

        // loop around the ENUM and process
        for (Enum208NotifyBrokerOfCredit oneEnum : Enum208NotifyBrokerOfCredit.values()) {
            tagData = new Tag208EnuNotifyBrokerOfCredit(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag208EnuNotifyBrokerOfCredit tagData;

        // loop around the ENUM and process
        for (Enum208NotifyBrokerOfCredit oneEnum : Enum208NotifyBrokerOfCredit.values()) {
            tagData = new Tag208EnuNotifyBrokerOfCredit(oneEnum);
            assertEquals( "Tag208EnuNotifyBrokerOfCredit\n" +
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