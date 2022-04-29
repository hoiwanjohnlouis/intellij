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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.fix42.enums.Enum434CxlRejResponseTo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag434EnuCxlRejResponseToTest {
    @Test
    void FIX0434Test() {
        FIX42 fixData = FIX42.FIX434_ENU_CXL_REJ_RESPONSE_TO;
        assertEquals( "434", fixData.getID());
        assertEquals( "CXL_REJ_RESPONSE_TO", fixData.getName());
        assertEquals( "CxlRejResponseTo", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }
    /**
     *  Tag434
     *  Enu
     *  CxlRejResponseTo
     *
     *      1-2 msg types
     *      ORDER_CANCEL_REQUEST( "1", "ORDER_CANCEL_REQUEST", "1 - Order cancel request" ),
     *      ORDER_MODIFICATION_REQUEST( "2", "ORDER_MODIFICATION_REQUEST", "2 - Order cancel/replace request" ),
     */
    @Test
    void Tag0434Test() {
        Tag434EnuCxlRejResponseTo tagData;

        /**
         * 1-2 msg types
         */
        tagData = new Tag434EnuCxlRejResponseTo(Enum434CxlRejResponseTo.ORDER_CANCEL_REQUEST);
        assertEquals( Enum434CxlRejResponseTo.ORDER_CANCEL_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag434EnuCxlRejResponseTo(Enum434CxlRejResponseTo.ORDER_MODIFICATION_REQUEST);
        assertEquals( Enum434CxlRejResponseTo.ORDER_MODIFICATION_REQUEST.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}