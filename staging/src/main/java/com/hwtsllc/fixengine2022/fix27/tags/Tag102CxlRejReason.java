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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum102CxlRejReason;

public class Tag102CxlRejReason extends TagTypeAbstract {
    private Enum102CxlRejReason dataValue;

    public final static Enum102CxlRejReason TESTA_CXL_REJ_REASON = Enum102CxlRejReason.TOO_LATE_TO_CANCEL;
    public final static Enum102CxlRejReason TESTB_CXL_REJ_REASON = Enum102CxlRejReason.OTHER;

    public Tag102CxlRejReason(Enum102CxlRejReason dataValue) {
        setFixType(FIXType.FIX102_CXL_REJ_REASON);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag102CxlRejReason tagData = new Tag102CxlRejReason(TESTA_CXL_REJ_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
