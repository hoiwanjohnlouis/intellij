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
 *  129
 *  DeliverToSubID
 *  String
 *  Assigned value used to identify specific message recipient
 *  (i.e. trader) if the message is delivered by a third party
 */
class Tag129StrDeliverToSubIDTest {
    @Test
    void FIX0129Test() {
        FIX40 fixData = FIX40.FIX129_STR_DELIVER_TO_SUB_ID;
        assertEquals( "DELIVER_TO_SUB_ID", fixData.toFIXNameString());
        assertEquals( "129", fixData.toFIXIDString());
        assertEquals( "DeliverToSubID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0129Test() {
        Tag129StrDeliverToSubID tagData;

        tagData = new Tag129StrDeliverToSubID(new MyStringType("HanHyoJoo-129DeliverToSubID") );
        assertEquals( "HanHyoJoo-129DeliverToSubID", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}