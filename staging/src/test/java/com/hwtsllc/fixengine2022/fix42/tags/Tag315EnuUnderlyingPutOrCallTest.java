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
import com.hwtsllc.fixengine2022.datatypes.MyEnumPutOrCall;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  201 (same as 201, 315)
 *  PutOrCall
 *  int
 *  <p>
 *  Deprecated in FIX.4.2 Indicates whether an Option is for a put or call
 *  <p></p>
 *  315
 *  UnderlyingPutOrCall
 *  int
 *  <p>
 *  Deprecated in FIX.4.2 Underlying security's PutOrCall. See PutOrCall field for description
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Put
 *  <p>    1 - Call
 */
// @Deprecated
class Tag315EnuUnderlyingPutOrCallTest {
    @Test
    void FIX0315Test() {
        FIX42 fixData = FIX42.FIX315_ENU_UNDERLYING_PUT_OR_CALL;
        assertEquals( "315", fixData.getID());
        assertEquals( "UNDERLYING_PUT_OR_CALL", fixData.getName());
        assertEquals( "UnderlyingPutOrCall", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }

    @Test
    void Tag0315Test() {
        Log315EnuUnderlyingPutOrCall tagData;

        tagData = new Log315EnuUnderlyingPutOrCall(MyEnumPutOrCall.CALL);
        assertEquals( MyEnumPutOrCall.CALL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log315EnuUnderlyingPutOrCall(MyEnumPutOrCall.PUT);
        assertEquals( MyEnumPutOrCall.PUT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}