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

public class Tag137MiscFeeAmt extends TagTypeAbstract {
    private final String dataValue;

    public final static String TESTA_MISC_FEE_AMT = "BilboBaggins-137MiscFeeAmt"; // fake data
    public final static String TESTB_MISC_FEE_AMT = "Gandalf-137MiscFeeAmt";

    public Tag137MiscFeeAmt(String dataValue) {
        setFixType(FIXType.FIX137_MISC_FEE_AMT);
        setDataValue(dataValue);
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag137MiscFeeAmt tagData = new Tag137MiscFeeAmt(TESTA_MISC_FEE_AMT);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
