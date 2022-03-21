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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.EnumBoolean;

public class Tag141ResetSeqNumFlag extends TagTypeAbstract {
    private final EnumBoolean dataValue;

    public final static EnumBoolean TESTA_RESET_SEQ_NUM_FLAG = EnumBoolean.NO ; // N - No
    public final static EnumBoolean TESTB_RESET_SEQ_NUM_FLAG = EnumBoolean.YES; // Y - Yes, reset sequence numbers

    public Tag141ResetSeqNumFlag(EnumBoolean dataValue) {
        setFixType(FIXType.FIX141_RESET_SEQ_NUM_FLAG);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag141ResetSeqNumFlag tagData = new Tag141ResetSeqNumFlag(TESTA_RESET_SEQ_NUM_FLAG);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
