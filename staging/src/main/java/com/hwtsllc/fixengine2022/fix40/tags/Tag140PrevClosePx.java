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

public class Tag140PrevClosePx extends TagTypeAbstract {
    private final String dataValue;

    public final static String TESTA_PREV_CLOSE_PX = "BilboBaggins-140PrevClosePx"; // fake data
    public final static String TESTB_PREV_CLOSE_PX = "Gandalf-140PrevClosePx";

    public Tag140PrevClosePx(String dataValue) {
        setFixType(FIXType.FIX140_PREV_CLOSE_PX);
        setDataValue(dataValue);
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag140PrevClosePx tagData = new Tag140PrevClosePx(TESTA_PREV_CLOSE_PX);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}

