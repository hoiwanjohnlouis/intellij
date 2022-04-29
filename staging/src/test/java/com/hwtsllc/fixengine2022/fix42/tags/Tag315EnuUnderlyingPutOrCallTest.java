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
import com.hwtsllc.fixengine2022.fix42.enums.Enum315PutOrCall;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

// @Deprecated
class Tag315EnuUnderlyingPutOrCallTest {
    @Test
    void FIX0315Test() {
        FIX42 fixData = FIX42.FIX315_ENU_UNDERLYING_PUT_OR_CALL;
        assertEquals( "315", fixData.getID());
        assertEquals( "UNDERLYING_PUT_OR_CALL", fixData.getName());
        assertEquals( "UnderlyingPutOrCall", fixData.getDescription());
        assertNotEquals( FIX42.JUNK_ID, fixData.getID());
        assertNotEquals( FIX42.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, fixData.getDescription());
    }

    /**
     *  315 (same as 201, 315)
     *  UnderlyingPutOrCall
     *
     *      PUT( "0", "PUT", "0 - Put" ),
     *      CALL( "1", "CALL", "1 - Call" ),
     */
    @Test
    void Tag0315Test() {
        Tag315EnuUnderlyingPutOrCall tagData;

        tagData = new Tag315EnuUnderlyingPutOrCall(Enum315PutOrCall.CALL);
        assertEquals( Enum315PutOrCall.CALL.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag315EnuUnderlyingPutOrCall(Enum315PutOrCall.PUT);
        assertEquals( Enum315PutOrCall.PUT.getID(), tagData.getDataValue());
        assertNotEquals( FIX42.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}