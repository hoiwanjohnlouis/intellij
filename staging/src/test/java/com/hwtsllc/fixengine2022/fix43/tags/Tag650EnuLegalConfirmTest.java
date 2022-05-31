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
import com.hwtsllc.fixengine2022.fix43.enums.Enum650LegalConfirm;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  650
 *  LegalConfirm
 *  Boolean
 *  <p>
 *  Indicates that this message is to serve as the final and legal confirmation.
 *  <p>
 *  Valid values:
 *  <p>    N - Does not constitute a Legal Confirm
 *  <p>    Y - Legal Confirm
 */
class Tag650EnuLegalConfirmTest {
    @Test
    void FIX0650Test() {
        FIX43 fixData = FIX43.FIX650_ENU_LEGAL_CONFIRM;
        assertEquals( "650", fixData.toFIXIDString());
        assertEquals( "LEGAL_CONFIRM", fixData.toFIXNameString());
        assertEquals( "LegalConfirm", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0650Test() {
        Tag650EnuLegalConfirm tagData;

        tagData = new Tag650EnuLegalConfirm(Enum650LegalConfirm.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag650EnuLegalConfirm(Enum650LegalConfirm.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}