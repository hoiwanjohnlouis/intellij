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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.EnumBoolean;

public class Tag328InViewOfCommon extends TagTypeAbstract {
    private final EnumBoolean dataValue;

    public final static EnumBoolean TESTA_IN_VIEW_OF_COMMON = EnumBoolean.NO ;
                                    // N - Halt was not related to a halt of the common stock
    public final static EnumBoolean TESTB_IN_VIEW_OF_COMMON = EnumBoolean.YES;
                                    // Y - Half was due to common stock being halted

    public Tag328InViewOfCommon(EnumBoolean dataValue) {
        setFixType(FIXType.FIX328_IN_VIEW_OF_COMMON);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    public static void main(String[] args) {
        Tag328InViewOfCommon tagData = new Tag328InViewOfCommon(TESTA_IN_VIEW_OF_COMMON);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
