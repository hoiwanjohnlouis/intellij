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

public class Tag31LastPx extends TagTypeAbstract {
    private final String dataValue;

    public final static double TESTA_SYMBOL_LAST_PX = 123.45;
    public final static double TESTB_SYMBOL_LAST_PX = 67.89;

    public Tag31LastPx(String dataValue) {
        setFixType(FIXType.FIX31_LAST_PX);
        setDataValue(dataValue);
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag31LastPx tagType = new Tag31LastPx("JohnWick-43");
        System.out.println(tagType);
        System.out.println(tagType.toLogStringVerbose());
        System.out.println(tagType.toFixTagValuePairString());
    }
}

