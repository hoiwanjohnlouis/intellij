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

import com.hwtsllc.fixengine2022.fix41.enums.Enum204CustomerOrFirm;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  204
 *  CustomerOrFirm
 *  int
 *  <p></p>
 *  Deprecated in FIX.4.2
 *  <p></p>
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
    void PrintFIXTagTest() {
        Tag204EnuCustomerOrFirm tagData;

        // loop around the ENUM and process
        for (Enum204CustomerOrFirm oneEnum : Enum204CustomerOrFirm.values()) {
            tagData = new Tag204EnuCustomerOrFirm(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXTest() {
        Tag204EnuCustomerOrFirm tagData;

        // loop around the ENUM and process
        for (Enum204CustomerOrFirm oneEnum : Enum204CustomerOrFirm.values()) {
            tagData = new Tag204EnuCustomerOrFirm(oneEnum);
            assertEquals( "FIX204_ENU_CUSTOMER_OR_FIRM", tagData.toEnumLabelString());
            assertEquals( "204", tagData.toEnumIDString());
            assertEquals( "CUSTOMER_OR_FIRM", tagData.toEnumNameString());
            assertEquals( "CustomerOrFirm (replaced)", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag204EnuCustomerOrFirm tagData;

        tagData = new Tag204EnuCustomerOrFirm(Enum204CustomerOrFirm.CUSTOMER);
        assertEquals( Enum204CustomerOrFirm.CUSTOMER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag204EnuCustomerOrFirm(Enum204CustomerOrFirm.FIRM);
        assertEquals( Enum204CustomerOrFirm.FIRM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum204CustomerOrFirm oneEnum : Enum204CustomerOrFirm.values()) {
            tagData = new Tag204EnuCustomerOrFirm(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag204EnuCustomerOrFirm tagData;

        // loop around the ENUM and process
        for (Enum204CustomerOrFirm oneEnum : Enum204CustomerOrFirm.values()) {
            tagData = new Tag204EnuCustomerOrFirm(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}