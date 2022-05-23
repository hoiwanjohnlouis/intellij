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
import com.hwtsllc.fixengine2022.fix41.enums.Enum204CustomerOrFirm;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  204
 *  CustomerOrFirm
 *  int
 *  <p>
 *  Deprecated in FIX.4.2
 *  <p>
 *  Used for options when delivering the order to an execution system
 *  or an exchange to specify if the order is for a  customer or the firm placing the order itself.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Customer
 *  <p>    1 - Firm
 */
// @Deprecated
class Tag204EnuCustomerOrFirmTest {
    @Test
    void FIX0204Test() {
        FIX41 fixData = FIX41.FIX204_ENU_CUSTOMER_OR_FIRM;
        assertEquals( "204", fixData.toFIXIDString());
        assertEquals( "CUSTOMER_OR_FIRM", fixData.toFIXNameString());
        assertEquals( "CustomerOrFirm (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0204Test() {
        Tag204EnuCustomerOrFirm tagData;

        tagData = new Tag204EnuCustomerOrFirm(Enum204CustomerOrFirm.CUSTOMER);
        assertEquals( Enum204CustomerOrFirm.CUSTOMER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag204EnuCustomerOrFirm(Enum204CustomerOrFirm.FIRM);
        assertEquals( Enum204CustomerOrFirm.FIRM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag204EnuCustomerOrFirm tagData;

        // loop around the ENUM and process
        for (Enum204CustomerOrFirm oneEnum : Enum204CustomerOrFirm.values()) {
            tagData = new Tag204EnuCustomerOrFirm(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag204EnuCustomerOrFirm tagData;

        // loop around the ENUM and process
        for (Enum204CustomerOrFirm oneEnum : Enum204CustomerOrFirm.values()) {
            tagData = new Tag204EnuCustomerOrFirm(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag204EnuCustomerOrFirm tagData;

        // loop around the ENUM and process
        for (Enum204CustomerOrFirm oneEnum : Enum204CustomerOrFirm.values()) {
            tagData = new Tag204EnuCustomerOrFirm(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag204EnuCustomerOrFirm tagData;

        // loop around the ENUM and process
        for (Enum204CustomerOrFirm oneEnum : Enum204CustomerOrFirm.values()) {
            tagData = new Tag204EnuCustomerOrFirm(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag204EnuCustomerOrFirm tagData;

        // loop around the ENUM and process
        for (Enum204CustomerOrFirm oneEnum : Enum204CustomerOrFirm.values()) {
            tagData = new Tag204EnuCustomerOrFirm(oneEnum);
            assertEquals( "Tag204EnuCustomerOrFirm\n" +
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