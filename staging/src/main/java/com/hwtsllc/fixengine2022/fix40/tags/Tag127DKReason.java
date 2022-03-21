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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix40.enums.Enum127DKReason;

public class Tag127DKReason extends TagTypeAbstract {
    private final Enum127DKReason dataValue;

    public final static Enum127DKReason TESTA_DK_REASON = Enum127DKReason.UNKNOWN_SYMBOL; // fake data
    public final static Enum127DKReason TESTB_DK_REASON = Enum127DKReason.OTHER;

    public Tag127DKReason(Enum127DKReason dataValue) {
        setFixType(FIXType.FIX127_DK_REASON);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag127DKReason tagData = new Tag127DKReason(TESTA_DK_REASON);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
